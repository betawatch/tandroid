package g2;

import android.net.TrafficStats;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import e2.m0;
import e9.c2;
import i2.o1;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;
import si.o0;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class r extends c {
    public final boolean a;
    public final int b;
    public final int c;
    public final String d;
    public final n4.s e;
    public final n4.s f;
    public m h;
    public HttpURLConnection n;
    public InputStream r;
    public boolean s;
    public int v;
    public long w;
    public long x;

    public r(String str, int i10, int i11, boolean z10, n4.s sVar) {
        super(true);
        this.d = str;
        this.b = i10;
        this.c = i11;
        this.a = z10;
        this.e = sVar;
        this.f = new n4.s(19);
    }

    public final void b() {
        HttpURLConnection httpURLConnection = this.n;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                e2.a.d("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
        }
    }

    public final URL c(URL url, String str) {
        if (str == null) {
            throw new v("Null location redirect", 2001);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!"https".equals(protocol) && !"http".equals(protocol)) {
                throw new v(o0.h("Unsupported protocol redirect: ", protocol), 2001);
            }
            if (this.a || protocol.equals(url.getProtocol())) {
                return url2;
            }
            throw new v("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")", 2001);
        } catch (MalformedURLException e) {
            throw new v(e, 2001, 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // g2.h
    public final void close() {
        try {
            InputStream inputStream = this.r;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    String str = m0.a;
                    throw new v(e, 2000, 3);
                }
            }
        } finally {
            this.r = null;
            b();
            if (this.s) {
                this.s = false;
                transferEnded();
            }
            this.n = null;
            this.h = null;
            TrafficStats.clearThreadStatsTag();
        }
    }

    public final HttpURLConnection e(m mVar) {
        HttpURLConnection f7;
        URL url = new URL(mVar.a.toString());
        int i10 = mVar.b;
        byte[] bArr = mVar.c;
        long j10 = mVar.e;
        long j11 = mVar.f;
        int i11 = 1;
        int i12 = 0;
        boolean z10 = (mVar.h & 1) == 1;
        if (!this.a) {
            return f(url, i10, bArr, j10, j11, z10, true, mVar.d);
        }
        while (true) {
            int i13 = i12 + 1;
            if (i12 > 20) {
                throw new v(new NoRouteToHostException(o1.k(i13, "Too many redirects: ")), 2001, 1);
            }
            f7 = f(url, i10, bArr, j10, j11, z10, false, mVar.d);
            int responseCode = f7.getResponseCode();
            String headerField = f7.getHeaderField("Location");
            if ((i10 == i11 || i10 == 3) && (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308)) {
                f7.disconnect();
                url = c(url, headerField);
            } else {
                if (i10 != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                    break;
                }
                f7.disconnect();
                url = c(url, headerField);
                bArr = null;
                i10 = 1;
            }
            i12 = i13;
            i11 = 1;
        }
        return f7;
    }

    public final HttpURLConnection f(URL url, int i10, byte[] bArr, long j10, long j11, boolean z10, boolean z11, Map map) {
        String sb2;
        String str;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.b);
        httpURLConnection.setReadTimeout(this.c);
        HashMap hashMap = new HashMap();
        n4.s sVar = this.e;
        if (sVar != null) {
            hashMap.putAll(sVar.u());
        }
        hashMap.putAll(this.f.u());
        hashMap.putAll(map);
        for (Map.Entry entry : hashMap.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        Pattern pattern = y.a;
        if (j10 == 0 && j11 == -1) {
            sb2 = null;
        } else {
            StringBuilder t10 = a1.g.t(j10, "bytes=", "-");
            if (j11 != -1) {
                t10.append((j10 + j11) - 1);
            }
            sb2 = t10.toString();
        }
        if (sb2 != null) {
            httpURLConnection.setRequestProperty("Range", sb2);
        }
        String str2 = this.d;
        if (str2 != null) {
            httpURLConnection.setRequestProperty("User-Agent", str2);
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", z10 ? "gzip" : "identity");
        httpURLConnection.setInstanceFollowRedirects(z11);
        httpURLConnection.setDoOutput(bArr != null);
        int i11 = m.i;
        if (i10 == 1) {
            str = "GET";
        } else if (i10 == 2) {
            str = "POST";
        } else {
            if (i10 != 3) {
                throw new IllegalStateException();
            }
            str = "HEAD";
        }
        httpURLConnection.setRequestMethod(str);
        if (bArr == null) {
            httpURLConnection.connect();
            return httpURLConnection;
        }
        httpURLConnection.setFixedLengthStreamingMode(bArr.length);
        httpURLConnection.connect();
        OutputStream outputStream = httpURLConnection.getOutputStream();
        outputStream.write(bArr);
        outputStream.close();
        return httpURLConnection;
    }

    public final void g(long j10) {
        if (j10 == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j10 > 0) {
            int min = (int) Math.min(j10, 4096);
            InputStream inputStream = this.r;
            String str = m0.a;
            int read = inputStream.read(bArr, 0, min);
            if (Thread.currentThread().isInterrupted()) {
                throw new v(new InterruptedIOException(), 2000, 1);
            }
            if (read == -1) {
                throw new v();
            }
            j10 -= read;
            bytesTransferred(read);
        }
    }

    @Override // g2.c, g2.h
    public final Map getResponseHeaders() {
        HttpURLConnection httpURLConnection = this.n;
        return httpURLConnection == null ? c2.h : new q(httpURLConnection.getHeaderFields());
    }

    @Override // g2.h
    public final Uri getUri() {
        HttpURLConnection httpURLConnection = this.n;
        if (httpURLConnection != null) {
            return Uri.parse(httpURLConnection.getURL().toString());
        }
        m mVar = this.h;
        if (mVar != null) {
            return mVar.a;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0136 A[Catch: IOException -> 0x0141, TRY_LEAVE, TryCatch #4 {IOException -> 0x0141, blocks: (B:22:0x012e, B:24:0x0136), top: B:21:0x012e }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0124  */
    @Override // g2.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long open(m mVar) {
        boolean z10;
        long j10;
        HttpURLConnection httpURLConnection;
        long j11;
        this.h = mVar;
        this.x = 0L;
        this.w = 0L;
        transferInitializing(mVar);
        try {
            Thread currentThread = Thread.currentThread();
            TrafficStats.setThreadStatsTag((int) (Build.VERSION.SDK_INT < 36 ? currentThread.getId() : currentThread.threadId()));
            HttpURLConnection e = e(mVar);
            long j12 = mVar.e;
            long j13 = mVar.f;
            this.n = e;
            this.v = e.getResponseCode();
            e.getResponseMessage();
            int i10 = this.v;
            long j14 = -1;
            if (i10 < 200 || i10 > 299) {
                Map<String, List<String>> headerFields = e.getHeaderFields();
                if (this.v == 416) {
                    String headerField = e.getHeaderField("Content-Range");
                    Pattern pattern = y.a;
                    if (TextUtils.isEmpty(headerField)) {
                        j10 = -1;
                        z10 = true;
                    } else {
                        Matcher matcher = y.b.matcher(headerField);
                        z10 = true;
                        if (matcher.matches()) {
                            String group = matcher.group(1);
                            group.getClass();
                            j10 = Long.parseLong(group);
                        } else {
                            j10 = -1;
                        }
                    }
                    if (j12 == j10) {
                        this.s = z10;
                        transferStarted(mVar);
                        if (j13 != -1) {
                            return j13;
                        }
                        return 0L;
                    }
                }
                InputStream errorStream = e.getErrorStream();
                try {
                    if (errorStream != null) {
                        f9.f.b(errorStream);
                    } else {
                        String str = m0.a;
                    }
                } catch (IOException unused) {
                    String str2 = m0.a;
                }
                b();
                throw new x(this.v, this.v == 416 ? new j(2008) : null, headerFields);
            }
            e.getContentType();
            if (this.v != 200 || j12 == 0) {
                j12 = 0;
            }
            boolean equalsIgnoreCase = "gzip".equalsIgnoreCase(e.getHeaderField("Content-Encoding"));
            if (equalsIgnoreCase) {
                httpURLConnection = e;
                this.w = j13;
            } else if (j13 != -1) {
                this.w = j13;
                httpURLConnection = e;
            } else {
                String headerField2 = e.getHeaderField("Content-Length");
                String headerField3 = e.getHeaderField("Content-Range");
                Pattern pattern2 = y.a;
                if (!TextUtils.isEmpty(headerField2)) {
                    try {
                        j11 = -1;
                        j14 = Long.parseLong(headerField2);
                    } catch (NumberFormatException unused2) {
                        e2.a.c("HttpUtil", "Unexpected Content-Length [" + headerField2 + "]");
                    }
                    if (!TextUtils.isEmpty(headerField3)) {
                        Matcher matcher2 = y.a.matcher(headerField3);
                        if (matcher2.matches()) {
                            try {
                                String group2 = matcher2.group(2);
                                group2.getClass();
                                long parseLong = Long.parseLong(group2);
                                String group3 = matcher2.group(1);
                                group3.getClass();
                                httpURLConnection = e;
                                long parseLong2 = (parseLong - Long.parseLong(group3)) + 1;
                                if (j14 < 0) {
                                    j14 = parseLong2;
                                } else if (j14 != parseLong2) {
                                    try {
                                        e2.a.l("HttpUtil", "Inconsistent headers [" + headerField2 + "] [" + headerField3 + "]");
                                        j14 = Math.max(j14, parseLong2);
                                    } catch (NumberFormatException unused3) {
                                        e2.a.c("HttpUtil", "Unexpected Content-Range [" + headerField3 + "]");
                                        this.w = j14 == j11 ? j14 - j12 : j11;
                                        this.r = httpURLConnection.getInputStream();
                                        if (equalsIgnoreCase) {
                                        }
                                        this.s = true;
                                        transferStarted(mVar);
                                        g(j12);
                                        return this.w;
                                    }
                                }
                            } catch (NumberFormatException unused4) {
                                httpURLConnection = e;
                            }
                            this.w = j14 == j11 ? j14 - j12 : j11;
                        }
                    }
                    httpURLConnection = e;
                    this.w = j14 == j11 ? j14 - j12 : j11;
                }
                j11 = -1;
                if (!TextUtils.isEmpty(headerField3)) {
                }
                httpURLConnection = e;
                this.w = j14 == j11 ? j14 - j12 : j11;
            }
            try {
                this.r = httpURLConnection.getInputStream();
                if (equalsIgnoreCase) {
                    this.r = new GZIPInputStream(this.r);
                }
                this.s = true;
                transferStarted(mVar);
                try {
                    g(j12);
                    return this.w;
                } catch (IOException e7) {
                    b();
                    if (e7 instanceof v) {
                        throw ((v) e7);
                    }
                    throw new v(e7, 2000, 1);
                }
            } catch (IOException e10) {
                b();
                throw new v(e10, 2000, 1);
            }
        } catch (IOException e11) {
            b();
            throw v.a(e11, 1);
        }
    }

    @Override // b2.o
    public final int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        try {
            long j10 = this.w;
            if (j10 != -1) {
                long j11 = j10 - this.x;
                if (j11 == 0) {
                    return -1;
                }
                i11 = (int) Math.min(i11, j11);
            }
            InputStream inputStream = this.r;
            String str = m0.a;
            int read = inputStream.read(bArr, i10, i11);
            if (read != -1) {
                this.x += read;
                bytesTransferred(read);
                return read;
            }
            return -1;
        } catch (IOException e) {
            String str2 = m0.a;
            throw v.a(e, 2);
        }
    }
}
