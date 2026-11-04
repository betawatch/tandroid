package i2;

import android.net.TrafficStats;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import g2.n0;
import g9.x1;
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
import k2.p1;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class s extends c {
    public final boolean a;
    public final int b;
    public final int c;
    public final String d;
    public final p4.q e;
    public final p4.q f;
    public n h;
    public HttpURLConnection n;
    public InputStream r;
    public boolean s;
    public int w;
    public long x;
    public long y;

    public s(String str, int i3, int i10, boolean z10, p4.q qVar) {
        super(true);
        this.d = str;
        this.b = i3;
        this.c = i10;
        this.a = z10;
        this.e = qVar;
        this.f = new p4.q(23);
    }

    public final void a() {
        HttpURLConnection httpURLConnection = this.n;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e10) {
                g2.a.d("DefaultHttpDataSource", "Unexpected error while disconnecting", e10);
            }
        }
    }

    public final URL b(URL url, String str) {
        if (str == null) {
            throw new w("Null location redirect", 2001);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!"https".equals(protocol) && !"http".equals(protocol)) {
                throw new w(t4.c.f("Unsupported protocol redirect: ", protocol), 2001);
            }
            if (this.a || protocol.equals(url.getProtocol())) {
                return url2;
            }
            throw new w("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")", 2001);
        } catch (MalformedURLException e10) {
            throw new w(e10, 2001, 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // i2.h
    public final void close() {
        try {
            InputStream inputStream = this.r;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e10) {
                    String str = n0.a;
                    throw new w(e10, 2000, 3);
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

    public final HttpURLConnection f(n nVar) {
        HttpURLConnection i3;
        URL url = new URL(nVar.a.toString());
        int i10 = nVar.b;
        byte[] bArr = nVar.c;
        long j10 = nVar.e;
        long j11 = nVar.f;
        int i11 = 1;
        int i12 = 0;
        boolean z10 = (nVar.h & 1) == 1;
        if (!this.a) {
            return i(url, i10, bArr, j10, j11, z10, true, nVar.d);
        }
        while (true) {
            int i13 = i12 + 1;
            if (i12 > 20) {
                throw new w(new NoRouteToHostException(p1.i(i13, "Too many redirects: ")), 2001, 1);
            }
            i3 = i(url, i10, bArr, j10, j11, z10, false, nVar.d);
            int responseCode = i3.getResponseCode();
            String headerField = i3.getHeaderField("Location");
            if ((i10 == i11 || i10 == 3) && (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308)) {
                i3.disconnect();
                url = b(url, headerField);
            } else {
                if (i10 != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                    break;
                }
                i3.disconnect();
                url = b(url, headerField);
                bArr = null;
                i10 = 1;
            }
            i12 = i13;
            i11 = 1;
        }
        return i3;
    }

    @Override // i2.c, i2.h
    public final Map getResponseHeaders() {
        HttpURLConnection httpURLConnection = this.n;
        return httpURLConnection == null ? x1.h : new r(httpURLConnection.getHeaderFields());
    }

    @Override // i2.h
    public final Uri getUri() {
        HttpURLConnection httpURLConnection = this.n;
        if (httpURLConnection != null) {
            return Uri.parse(httpURLConnection.getURL().toString());
        }
        n nVar = this.h;
        if (nVar != null) {
            return nVar.a;
        }
        return null;
    }

    public final HttpURLConnection i(URL url, int i3, byte[] bArr, long j10, long j11, boolean z10, boolean z11, Map map) {
        String sb2;
        String str;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.b);
        httpURLConnection.setReadTimeout(this.c);
        HashMap hashMap = new HashMap();
        p4.q qVar = this.e;
        if (qVar != null) {
            hashMap.putAll(qVar.w());
        }
        hashMap.putAll(this.f.w());
        hashMap.putAll(map);
        for (Map.Entry entry : hashMap.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        Pattern pattern = z.a;
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
        int i10 = n.i;
        if (i3 == 1) {
            str = "GET";
        } else if (i3 == 2) {
            str = "POST";
        } else {
            if (i3 != 3) {
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

    public final void j(long j10) {
        if (j10 == 0) {
            return;
        }
        byte[] bArr = new byte[TLObject.FLAG_12];
        while (j10 > 0) {
            int min = (int) Math.min(j10, TLObject.FLAG_12);
            InputStream inputStream = this.r;
            String str = n0.a;
            int read = inputStream.read(bArr, 0, min);
            if (Thread.currentThread().isInterrupted()) {
                throw new w(new InterruptedIOException(), 2000, 1);
            }
            if (read == -1) {
                throw new w();
            }
            j10 -= read;
            bytesTransferred(read);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0136 A[Catch: IOException -> 0x0141, TRY_LEAVE, TryCatch #4 {IOException -> 0x0141, blocks: (B:22:0x012e, B:24:0x0136), top: B:21:0x012e }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0124  */
    @Override // i2.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long open(n nVar) {
        boolean z10;
        long j10;
        HttpURLConnection httpURLConnection;
        long j11;
        this.h = nVar;
        this.y = 0L;
        this.x = 0L;
        transferInitializing(nVar);
        try {
            Thread currentThread = Thread.currentThread();
            TrafficStats.setThreadStatsTag((int) (Build.VERSION.SDK_INT < 36 ? currentThread.getId() : currentThread.threadId()));
            HttpURLConnection f10 = f(nVar);
            long j12 = nVar.e;
            long j13 = nVar.f;
            this.n = f10;
            this.w = f10.getResponseCode();
            f10.getResponseMessage();
            int i3 = this.w;
            long j14 = -1;
            if (i3 < 200 || i3 > 299) {
                Map<String, List<String>> headerFields = f10.getHeaderFields();
                if (this.w == 416) {
                    String headerField = f10.getHeaderField("Content-Range");
                    Pattern pattern = z.a;
                    if (TextUtils.isEmpty(headerField)) {
                        j10 = -1;
                        z10 = true;
                    } else {
                        Matcher matcher = z.b.matcher(headerField);
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
                        transferStarted(nVar);
                        if (j13 != -1) {
                            return j13;
                        }
                        return 0L;
                    }
                }
                InputStream errorStream = f10.getErrorStream();
                try {
                    if (errorStream != null) {
                        h9.f.b(errorStream);
                    } else {
                        String str = n0.a;
                    }
                } catch (IOException unused) {
                    String str2 = n0.a;
                }
                a();
                throw new y(this.w, this.w == 416 ? new k(2008) : null, headerFields);
            }
            f10.getContentType();
            if (this.w != 200 || j12 == 0) {
                j12 = 0;
            }
            boolean equalsIgnoreCase = "gzip".equalsIgnoreCase(f10.getHeaderField("Content-Encoding"));
            if (equalsIgnoreCase) {
                httpURLConnection = f10;
                this.x = j13;
            } else if (j13 != -1) {
                this.x = j13;
                httpURLConnection = f10;
            } else {
                String headerField2 = f10.getHeaderField("Content-Length");
                String headerField3 = f10.getHeaderField("Content-Range");
                Pattern pattern2 = z.a;
                if (!TextUtils.isEmpty(headerField2)) {
                    try {
                        j11 = -1;
                        j14 = Long.parseLong(headerField2);
                    } catch (NumberFormatException unused2) {
                        g2.a.c("HttpUtil", "Unexpected Content-Length [" + headerField2 + "]");
                    }
                    if (!TextUtils.isEmpty(headerField3)) {
                        Matcher matcher2 = z.a.matcher(headerField3);
                        if (matcher2.matches()) {
                            try {
                                String group2 = matcher2.group(2);
                                group2.getClass();
                                long parseLong = Long.parseLong(group2);
                                String group3 = matcher2.group(1);
                                group3.getClass();
                                httpURLConnection = f10;
                                long parseLong2 = (parseLong - Long.parseLong(group3)) + 1;
                                if (j14 < 0) {
                                    j14 = parseLong2;
                                } else if (j14 != parseLong2) {
                                    try {
                                        g2.a.l("HttpUtil", "Inconsistent headers [" + headerField2 + "] [" + headerField3 + "]");
                                        j14 = Math.max(j14, parseLong2);
                                    } catch (NumberFormatException unused3) {
                                        g2.a.c("HttpUtil", "Unexpected Content-Range [" + headerField3 + "]");
                                        this.x = j14 == j11 ? j14 - j12 : j11;
                                        this.r = httpURLConnection.getInputStream();
                                        if (equalsIgnoreCase) {
                                        }
                                        this.s = true;
                                        transferStarted(nVar);
                                        j(j12);
                                        return this.x;
                                    }
                                }
                            } catch (NumberFormatException unused4) {
                                httpURLConnection = f10;
                            }
                            this.x = j14 == j11 ? j14 - j12 : j11;
                        }
                    }
                    httpURLConnection = f10;
                    this.x = j14 == j11 ? j14 - j12 : j11;
                }
                j11 = -1;
                if (!TextUtils.isEmpty(headerField3)) {
                }
                httpURLConnection = f10;
                this.x = j14 == j11 ? j14 - j12 : j11;
            }
            try {
                this.r = httpURLConnection.getInputStream();
                if (equalsIgnoreCase) {
                    this.r = new GZIPInputStream(this.r);
                }
                this.s = true;
                transferStarted(nVar);
                try {
                    j(j12);
                    return this.x;
                } catch (IOException e10) {
                    a();
                    if (e10 instanceof w) {
                        throw ((w) e10);
                    }
                    throw new w(e10, 2000, 1);
                }
            } catch (IOException e11) {
                a();
                throw new w(e11, 2000, 1);
            }
        } catch (IOException e12) {
            a();
            throw w.a(e12, 1);
        }
    }

    @Override // d2.o
    public final int read(byte[] bArr, int i3, int i10) {
        if (i10 == 0) {
            return 0;
        }
        try {
            long j10 = this.x;
            if (j10 != -1) {
                long j11 = j10 - this.y;
                if (j11 == 0) {
                    return -1;
                }
                i10 = (int) Math.min(i10, j11);
            }
            InputStream inputStream = this.r;
            String str = n0.a;
            int read = inputStream.read(bArr, i3, i10);
            if (read != -1) {
                this.y += read;
                bytesTransferred(read);
                return read;
            }
            return -1;
        } catch (IOException e10) {
            String str2 = n0.a;
            throw w.a(e10, 2);
        }
    }
}
