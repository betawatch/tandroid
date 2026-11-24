// default package

import android.net.TrafficStats;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ic3 extends qg0 {
    public final boolean a;
    public final int b;
    public final int c;
    public final String d;
    public final wm4 e;
    public final wm4 f;
    public g83 h;
    public HttpURLConnection n;
    public InputStream r;
    public boolean s;
    public int w;
    public long x;
    public long y;

    public ic3(String str, int i, int i2, boolean z, wm4 wm4Var) {
        super(true);
        this.d = str;
        this.b = i;
        this.c = i2;
        this.a = z;
        this.e = wm4Var;
        this.f = new wm4();
    }

    public final void a() {
        HttpURLConnection httpURLConnection = this.n;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                ncd.d("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a83
    public final void close() {
        try {
            InputStream inputStream = this.r;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    String str = hac.a;
                    throw new ii5(e, 2000, 3);
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

    public final URL e(URL url, String str) {
        if (str == null) {
            throw new ii5("Null location redirect", 2001);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!"https".equals(protocol) && !"http".equals(protocol)) {
                throw new ii5(b10.h("Unsupported protocol redirect: ", protocol), 2001);
            }
            if (this.a || protocol.equals(url.getProtocol())) {
                return url2;
            }
            throw new ii5("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")", 2001);
        } catch (MalformedURLException e) {
            throw new ii5(e, 2001, 1);
        }
    }

    @Override // qg0, a83
    public final Map getResponseHeaders() {
        HttpURLConnection httpURLConnection = this.n;
        return httpURLConnection == null ? d89.h : new hc3(httpURLConnection.getHeaderFields());
    }

    @Override // a83
    public final Uri getUri() {
        HttpURLConnection httpURLConnection = this.n;
        if (httpURLConnection != null) {
            return Uri.parse(httpURLConnection.getURL().toString());
        }
        g83 g83Var = this.h;
        if (g83Var != null) {
            return g83Var.a;
        }
        return null;
    }

    public final HttpURLConnection h(g83 g83Var) {
        HttpURLConnection j;
        URL url = new URL(g83Var.a.toString());
        byte b = g83Var.b;
        byte[] bArr = g83Var.c;
        long j2 = g83Var.e;
        long j3 = g83Var.f;
        byte b2 = 1;
        int i = 0;
        boolean z = (g83Var.h & 1) == 1;
        if (!this.a) {
            return j(url, b, bArr, j2, j3, z, true, g83Var.d);
        }
        while (true) {
            int i2 = i + 1;
            if (i > 20) {
                throw new ii5(new NoRouteToHostException(hg9.j(i2, "Too many redirects: ")), 2001, 1);
            }
            j = j(url, b, bArr, j2, j3, z, false, g83Var.d);
            int responseCode = j.getResponseCode();
            String headerField = j.getHeaderField("Location");
            if ((b == b2 || b == 3) && (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308)) {
                j.disconnect();
                url = e(url, headerField);
            } else {
                if (b != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                    break;
                }
                j.disconnect();
                url = e(url, headerField);
                bArr = null;
                b = 1;
            }
            i = i2;
            b2 = 1;
        }
        return j;
    }

    public final HttpURLConnection j(URL url, int i, byte[] bArr, long j, long j2, boolean z, boolean z2, Map map) {
        String sb;
        String str;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.b);
        httpURLConnection.setReadTimeout(this.c);
        HashMap hashMap = new HashMap();
        hashMap.putAll(this.e.Y());
        hashMap.putAll(this.f.Y());
        hashMap.putAll(map);
        for (Map.Entry entry : hashMap.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        Pattern pattern = ni5.a;
        if (j == 0 && j2 == -1) {
            sb = null;
        } else {
            StringBuilder o = wi8.o(j, "bytes=", "-");
            if (j2 != -1) {
                o.append((j + j2) - 1);
            }
            sb = o.toString();
        }
        if (sb != null) {
            httpURLConnection.setRequestProperty("Range", sb);
        }
        String str2 = this.d;
        if (str2 != null) {
            httpURLConnection.setRequestProperty("User-Agent", str2);
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", z ? "gzip" : "identity");
        httpURLConnection.setInstanceFollowRedirects(z2);
        httpURLConnection.setDoOutput(bArr != null);
        int i2 = g83.i;
        if (i == 1) {
            str = "GET";
        } else if (i == 2) {
            str = "POST";
        } else {
            if (i != 3) {
                rjb.h();
                return null;
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

    public final void l(long j) {
        if (j != 0) {
            byte[] bArr = new byte[TLObject.FLAG_12];
            while (j > 0) {
                int min = (int) Math.min(j, 4096L);
                InputStream inputStream = this.r;
                String str = hac.a;
                int read = inputStream.read(bArr, 0, min);
                if (Thread.currentThread().isInterrupted()) {
                    throw new ii5(new InterruptedIOException(), 2000, 1);
                }
                if (read == -1) {
                    throw new ii5();
                }
                j -= read;
                bytesTransferred(read);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x012e A[Catch: IOException -> 0x0155, TRY_LEAVE, TryCatch #0 {IOException -> 0x0155, blocks: (B:22:0x0126, B:24:0x012e), top: B:21:0x0126 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x011c  */
    @Override // a83
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long open(g83 g83Var) {
        boolean z;
        long j;
        HttpURLConnection httpURLConnection;
        long j2;
        this.h = g83Var;
        this.y = 0L;
        this.x = 0L;
        transferInitializing(g83Var);
        try {
            Thread currentThread = Thread.currentThread();
            TrafficStats.setThreadStatsTag((int) (Build.VERSION.SDK_INT < 36 ? currentThread.getId() : currentThread.threadId()));
            HttpURLConnection h = h(g83Var);
            long j3 = g83Var.f;
            long j4 = g83Var.e;
            this.n = h;
            this.w = h.getResponseCode();
            h.getResponseMessage();
            int i = this.w;
            long j5 = -1;
            if (i < 200 || i > 299) {
                Map<String, List<String>> headerFields = h.getHeaderFields();
                if (this.w == 416) {
                    String headerField = h.getHeaderField("Content-Range");
                    Pattern pattern = ni5.a;
                    if (TextUtils.isEmpty(headerField)) {
                        j = -1;
                        z = true;
                    } else {
                        Matcher matcher = ni5.b.matcher(headerField);
                        z = true;
                        if (matcher.matches()) {
                            String group = matcher.group(1);
                            group.getClass();
                            j = Long.parseLong(group);
                        } else {
                            j = -1;
                        }
                    }
                    if (j4 == j) {
                        this.s = z;
                        transferStarted(g83Var);
                        if (j3 != -1) {
                            return j3;
                        }
                        return 0L;
                    }
                }
                InputStream errorStream = h.getErrorStream();
                try {
                    if (errorStream != null) {
                        i61.b(errorStream);
                    } else {
                        String str = hac.a;
                    }
                } catch (IOException unused) {
                    String str2 = hac.a;
                }
                a();
                throw new ki5(this.w, this.w == 416 ? new d83(2008) : null, headerFields);
            }
            h.getContentType();
            if (this.w != 200 || j4 == 0) {
                j4 = 0;
            }
            boolean equalsIgnoreCase = "gzip".equalsIgnoreCase(h.getHeaderField("Content-Encoding"));
            if (equalsIgnoreCase) {
                httpURLConnection = h;
                this.x = j3;
            } else if (j3 != -1) {
                this.x = j3;
                httpURLConnection = h;
            } else {
                String headerField2 = h.getHeaderField("Content-Length");
                String headerField3 = h.getHeaderField("Content-Range");
                Pattern pattern2 = ni5.a;
                if (!TextUtils.isEmpty(headerField2)) {
                    try {
                        j2 = -1;
                        j5 = Long.parseLong(headerField2);
                    } catch (NumberFormatException unused2) {
                        ncd.c("HttpUtil", "Unexpected Content-Length [" + headerField2 + "]");
                    }
                    if (!TextUtils.isEmpty(headerField3)) {
                        Matcher matcher2 = ni5.a.matcher(headerField3);
                        if (matcher2.matches()) {
                            try {
                                String group2 = matcher2.group(2);
                                group2.getClass();
                                long parseLong = Long.parseLong(group2);
                                String group3 = matcher2.group(1);
                                group3.getClass();
                                httpURLConnection = h;
                                long parseLong2 = (parseLong - Long.parseLong(group3)) + 1;
                                if (j5 < 0) {
                                    j5 = parseLong2;
                                } else if (j5 != parseLong2) {
                                    try {
                                        ncd.f("HttpUtil", "Inconsistent headers [" + headerField2 + "] [" + headerField3 + "]");
                                        j5 = Math.max(j5, parseLong2);
                                    } catch (NumberFormatException unused3) {
                                        ncd.c("HttpUtil", "Unexpected Content-Range [" + headerField3 + "]");
                                        this.x = j5 == j2 ? j5 - j4 : j2;
                                        this.r = httpURLConnection.getInputStream();
                                        if (equalsIgnoreCase) {
                                        }
                                        this.s = true;
                                        transferStarted(g83Var);
                                        l(j4);
                                        return this.x;
                                    }
                                }
                            } catch (NumberFormatException unused4) {
                                httpURLConnection = h;
                            }
                            this.x = j5 == j2 ? j5 - j4 : j2;
                        }
                    }
                    httpURLConnection = h;
                    this.x = j5 == j2 ? j5 - j4 : j2;
                }
                j2 = -1;
                if (!TextUtils.isEmpty(headerField3)) {
                }
                httpURLConnection = h;
                this.x = j5 == j2 ? j5 - j4 : j2;
            }
            try {
                this.r = httpURLConnection.getInputStream();
                if (equalsIgnoreCase) {
                    this.r = new GZIPInputStream(this.r);
                }
                this.s = true;
                transferStarted(g83Var);
                try {
                    l(j4);
                    return this.x;
                } catch (IOException e) {
                    a();
                    if (e instanceof ii5) {
                        throw ((ii5) e);
                    }
                    throw new ii5(e, 2000, 1);
                }
            } catch (IOException e2) {
                a();
                throw new ii5(e2, 2000, 1);
            }
        } catch (IOException e3) {
            a();
            throw ii5.a(e3, 1);
        }
    }

    @Override // s73
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        try {
            long j = this.x;
            if (j != -1) {
                long j2 = j - this.y;
                if (j2 != 0) {
                    i2 = (int) Math.min(i2, j2);
                }
                return -1;
            }
            InputStream inputStream = this.r;
            String str = hac.a;
            int read = inputStream.read(bArr, i, i2);
            if (read != -1) {
                this.y += read;
                bytesTransferred(read);
                return read;
            }
            return -1;
        } catch (IOException e) {
            String str2 = hac.a;
            throw ii5.a(e, 2);
        }
    }
}
