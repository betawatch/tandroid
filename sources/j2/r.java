package j2;

import a8.p0;
import android.net.TrafficStats;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import h2.l0;
import h9.x1;
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
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class r extends c {
    public final boolean a;
    public final int b;
    public final int c;
    public final String d;
    public final q4.q e;
    public final q4.q f;
    public m h;
    public HttpURLConnection n;
    public InputStream r;
    public boolean s;
    public int w;
    public long x;
    public long y;

    public r(String str, int i7, int i10, boolean z10, q4.q qVar) {
        super(true);
        this.d = str;
        this.b = i7;
        this.c = i10;
        this.a = z10;
        this.e = qVar;
        this.f = new q4.q(29);
    }

    public final void a() {
        HttpURLConnection httpURLConnection = this.n;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e10) {
                h2.a.d("DefaultHttpDataSource", "Unexpected error while disconnecting", e10);
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
                throw new v(p5.c.k("Unsupported protocol redirect: ", protocol), 2001);
            }
            if (this.a || protocol.equals(url.getProtocol())) {
                return url2;
            }
            throw new v("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")", 2001);
        } catch (MalformedURLException e10) {
            throw new v(e10, 2001, 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j2.h
    public final void close() {
        try {
            InputStream inputStream = this.r;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e10) {
                    String str = l0.a;
                    throw new v(e10, 2000, 3);
                }
            }
        } finally {
            this.r = null;
            a();
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
        HttpURLConnection f10;
        URL url = new URL(mVar.a.toString());
        int i7 = mVar.b;
        byte[] bArr = mVar.c;
        long j3 = mVar.e;
        long j10 = mVar.f;
        int i10 = 1;
        int i11 = 0;
        boolean z10 = (mVar.h & 1) == 1;
        if (!this.a) {
            return f(url, i7, bArr, j3, j10, z10, true, mVar.d);
        }
        while (true) {
            int i12 = i11 + 1;
            if (i11 > 20) {
                throw new v(new NoRouteToHostException(i5.c.i(i12, "Too many redirects: ")), 2001, 1);
            }
            f10 = f(url, i7, bArr, j3, j10, z10, false, mVar.d);
            int responseCode = f10.getResponseCode();
            String headerField = f10.getHeaderField("Location");
            if ((i7 == i10 || i7 == 3) && (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308)) {
                f10.disconnect();
                url = c(url, headerField);
            } else {
                if (i7 != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                    break;
                }
                f10.disconnect();
                url = c(url, headerField);
                bArr = null;
                i7 = 1;
            }
            i11 = i12;
            i10 = 1;
        }
        return f10;
    }

    public final HttpURLConnection f(URL url, int i7, byte[] bArr, long j3, long j10, boolean z10, boolean z11, Map map) {
        String sb2;
        String str;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.b);
        httpURLConnection.setReadTimeout(this.c);
        HashMap hashMap = new HashMap();
        q4.q qVar = this.e;
        if (qVar != null) {
            hashMap.putAll(qVar.b());
        }
        hashMap.putAll(this.f.b());
        hashMap.putAll(map);
        for (Map.Entry entry : hashMap.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        Pattern pattern = y.a;
        if (j3 == 0 && j10 == -1) {
            sb2 = null;
        } else {
            StringBuilder t6 = p0.t(j3, "bytes=", "-");
            if (j10 != -1) {
                t6.append((j3 + j10) - 1);
            }
            sb2 = t6.toString();
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
        int i10 = m.i;
        if (i7 == 1) {
            str = "GET";
        } else if (i7 == 2) {
            str = "POST";
        } else {
            if (i7 != 3) {
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

    public final void g(long j3) {
        if (j3 == 0) {
            return;
        }
        byte[] bArr = new byte[TLObject.FLAG_12];
        while (j3 > 0) {
            int min = (int) Math.min(j3, TLObject.FLAG_12);
            InputStream inputStream = this.r;
            String str = l0.a;
            int read = inputStream.read(bArr, 0, min);
            if (Thread.currentThread().isInterrupted()) {
                throw new v(new InterruptedIOException(), 2000, 1);
            }
            if (read == -1) {
                throw new v();
            }
            j3 -= read;
            bytesTransferred(read);
        }
    }

    @Override // j2.c, j2.h
    public final Map getResponseHeaders() {
        HttpURLConnection httpURLConnection = this.n;
        return httpURLConnection == null ? x1.h : new q(httpURLConnection.getHeaderFields());
    }

    @Override // j2.h
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
    @Override // j2.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long open(m mVar) {
        boolean z10;
        long j3;
        HttpURLConnection httpURLConnection;
        long j10;
        this.h = mVar;
        this.y = 0L;
        this.x = 0L;
        transferInitializing(mVar);
        try {
            Thread currentThread = Thread.currentThread();
            TrafficStats.setThreadStatsTag((int) (Build.VERSION.SDK_INT < 36 ? currentThread.getId() : currentThread.threadId()));
            HttpURLConnection e10 = e(mVar);
            long j11 = mVar.e;
            long j12 = mVar.f;
            this.n = e10;
            this.w = e10.getResponseCode();
            e10.getResponseMessage();
            int i7 = this.w;
            long j13 = -1;
            if (i7 < 200 || i7 > 299) {
                Map<String, List<String>> headerFields = e10.getHeaderFields();
                if (this.w == 416) {
                    String headerField = e10.getHeaderField("Content-Range");
                    Pattern pattern = y.a;
                    if (TextUtils.isEmpty(headerField)) {
                        j3 = -1;
                        z10 = true;
                    } else {
                        Matcher matcher = y.b.matcher(headerField);
                        z10 = true;
                        if (matcher.matches()) {
                            String group = matcher.group(1);
                            group.getClass();
                            j3 = Long.parseLong(group);
                        } else {
                            j3 = -1;
                        }
                    }
                    if (j11 == j3) {
                        this.s = z10;
                        transferStarted(mVar);
                        if (j12 != -1) {
                            return j12;
                        }
                        return 0L;
                    }
                }
                InputStream errorStream = e10.getErrorStream();
                try {
                    if (errorStream != null) {
                        i9.f.b(errorStream);
                    } else {
                        String str = l0.a;
                    }
                } catch (IOException unused) {
                    String str2 = l0.a;
                }
                a();
                throw new x(this.w, this.w == 416 ? new j(2008) : null, headerFields);
            }
            e10.getContentType();
            if (this.w != 200 || j11 == 0) {
                j11 = 0;
            }
            boolean equalsIgnoreCase = "gzip".equalsIgnoreCase(e10.getHeaderField("Content-Encoding"));
            if (equalsIgnoreCase) {
                httpURLConnection = e10;
                this.x = j12;
            } else if (j12 != -1) {
                this.x = j12;
                httpURLConnection = e10;
            } else {
                String headerField2 = e10.getHeaderField("Content-Length");
                String headerField3 = e10.getHeaderField("Content-Range");
                Pattern pattern2 = y.a;
                if (!TextUtils.isEmpty(headerField2)) {
                    try {
                        j10 = -1;
                        j13 = Long.parseLong(headerField2);
                    } catch (NumberFormatException unused2) {
                        h2.a.c("HttpUtil", "Unexpected Content-Length [" + headerField2 + "]");
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
                                httpURLConnection = e10;
                                long parseLong2 = (parseLong - Long.parseLong(group3)) + 1;
                                if (j13 < 0) {
                                    j13 = parseLong2;
                                } else if (j13 != parseLong2) {
                                    try {
                                        h2.a.l("HttpUtil", "Inconsistent headers [" + headerField2 + "] [" + headerField3 + "]");
                                        j13 = Math.max(j13, parseLong2);
                                    } catch (NumberFormatException unused3) {
                                        h2.a.c("HttpUtil", "Unexpected Content-Range [" + headerField3 + "]");
                                        this.x = j13 == j10 ? j13 - j11 : j10;
                                        this.r = httpURLConnection.getInputStream();
                                        if (equalsIgnoreCase) {
                                        }
                                        this.s = true;
                                        transferStarted(mVar);
                                        g(j11);
                                        return this.x;
                                    }
                                }
                            } catch (NumberFormatException unused4) {
                                httpURLConnection = e10;
                            }
                            this.x = j13 == j10 ? j13 - j11 : j10;
                        }
                    }
                    httpURLConnection = e10;
                    this.x = j13 == j10 ? j13 - j11 : j10;
                }
                j10 = -1;
                if (!TextUtils.isEmpty(headerField3)) {
                }
                httpURLConnection = e10;
                this.x = j13 == j10 ? j13 - j11 : j10;
            }
            try {
                this.r = httpURLConnection.getInputStream();
                if (equalsIgnoreCase) {
                    this.r = new GZIPInputStream(this.r);
                }
                this.s = true;
                transferStarted(mVar);
                try {
                    g(j11);
                    return this.x;
                } catch (IOException e11) {
                    a();
                    if (e11 instanceof v) {
                        throw ((v) e11);
                    }
                    throw new v(e11, 2000, 1);
                }
            } catch (IOException e12) {
                a();
                throw new v(e12, 2000, 1);
            }
        } catch (IOException e13) {
            a();
            throw v.a(e13, 1);
        }
    }

    @Override // e2.n
    public final int read(byte[] bArr, int i7, int i10) {
        if (i10 == 0) {
            return 0;
        }
        try {
            long j3 = this.x;
            if (j3 != -1) {
                long j10 = j3 - this.y;
                if (j10 == 0) {
                    return -1;
                }
                i10 = (int) Math.min(i10, j10);
            }
            InputStream inputStream = this.r;
            String str = l0.a;
            int read = inputStream.read(bArr, i7, i10);
            if (read != -1) {
                this.y += read;
                bytesTransferred(read);
                return read;
            }
            return -1;
        } catch (IOException e10) {
            String str2 = l0.a;
            throw v.a(e10, 2);
        }
    }
}
