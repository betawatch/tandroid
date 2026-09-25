package g2;

import android.net.Uri;
import android.text.TextUtils;
import e9.f1;
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

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public final class r extends c {
    public final boolean a;
    public final int b;
    public final int c;
    public final String d;
    public final n4.y e;
    public final n4.y f;
    public m h;
    public HttpURLConnection n;
    public InputStream r;
    public boolean s;
    public int v;
    public long w;
    public long x;

    public r(String str, int i10, int i11, boolean z10, n4.y yVar) {
        super(true);
        this.d = str;
        this.b = i10;
        this.c = i11;
        this.a = z10;
        this.e = yVar;
        this.f = new n4.y(15);
    }

    public final void b() {
        HttpURLConnection httpURLConnection = this.n;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                e2.a.f("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
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
                throw new v(v7.j.g("Unsupported protocol redirect: ", protocol), 2001);
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
                    String str = e2.d0.a;
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
        }
    }

    public final HttpURLConnection f(m mVar) {
        HttpURLConnection j3;
        URL url = new URL(mVar.a.toString());
        int i10 = mVar.b;
        byte[] bArr = mVar.c;
        long j10 = mVar.e;
        long j11 = mVar.f;
        int i11 = 1;
        int i12 = 0;
        boolean z10 = (mVar.h & 1) == 1;
        if (!this.a) {
            return j(url, i10, bArr, j10, j11, z10, true, mVar.d);
        }
        while (true) {
            int i13 = i12 + 1;
            if (i12 > 20) {
                throw new v(new NoRouteToHostException(hg.c.h(i13, "Too many redirects: ")), 2001, 1);
            }
            j3 = j(url, i10, bArr, j10, j11, z10, false, mVar.d);
            int responseCode = j3.getResponseCode();
            String headerField = j3.getHeaderField("Location");
            if ((i10 == i11 || i10 == 3) && (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308)) {
                j3.disconnect();
                url = c(url, headerField);
            } else {
                if (i10 != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                    break;
                }
                j3.disconnect();
                url = c(url, headerField);
                bArr = null;
                i10 = 1;
            }
            i12 = i13;
            i11 = 1;
        }
        return j3;
    }

    @Override // g2.c, g2.h
    public final Map getResponseHeaders() {
        HttpURLConnection httpURLConnection = this.n;
        return httpURLConnection == null ? f1.h : new q(httpURLConnection.getHeaderFields());
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

    public final HttpURLConnection j(URL url, int i10, byte[] bArr, long j3, long j10, boolean z10, boolean z11, Map map) {
        String sb2;
        String str;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.b);
        httpURLConnection.setReadTimeout(this.c);
        HashMap hashMap = new HashMap();
        n4.y yVar = this.e;
        if (yVar != null) {
            hashMap.putAll(yVar.Q());
        }
        hashMap.putAll(this.f.Q());
        hashMap.putAll(map);
        for (Map.Entry entry : hashMap.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        Pattern pattern = y.a;
        if (j3 == 0 && j10 == -1) {
            sb2 = null;
        } else {
            StringBuilder u10 = a4.a.u(j3, "bytes=", "-");
            if (j10 != -1) {
                u10.append((j3 + j10) - 1);
            }
            sb2 = u10.toString();
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

    public final void k(long j3) {
        if (j3 == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j3 > 0) {
            int min = (int) Math.min(j3, 4096);
            InputStream inputStream = this.r;
            String str = e2.d0.a;
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

    /* JADX WARN: Removed duplicated region for block: B:21:0x011f A[Catch: IOException -> 0x012a, TRY_LEAVE, TryCatch #0 {IOException -> 0x012a, blocks: (B:19:0x0117, B:21:0x011f), top: B:18:0x0117 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x010d  */
    @Override // g2.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long open(m mVar) {
        boolean z10;
        long j3;
        HttpURLConnection httpURLConnection;
        long j10;
        this.h = mVar;
        this.x = 0L;
        this.w = 0L;
        transferInitializing(mVar);
        try {
            HttpURLConnection f7 = f(mVar);
            long j11 = mVar.e;
            long j12 = mVar.f;
            this.n = f7;
            this.v = f7.getResponseCode();
            f7.getResponseMessage();
            int i10 = this.v;
            long j13 = -1;
            if (i10 < 200 || i10 > 299) {
                Map<String, List<String>> headerFields = f7.getHeaderFields();
                if (this.v == 416) {
                    String headerField = f7.getHeaderField("Content-Range");
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
                InputStream errorStream = f7.getErrorStream();
                try {
                    if (errorStream != null) {
                        f9.b.b(errorStream);
                    } else {
                        String str = e2.d0.a;
                    }
                } catch (IOException unused) {
                    String str2 = e2.d0.a;
                }
                b();
                throw new x(this.v, this.v == 416 ? new j(2008) : null, headerFields);
            }
            f7.getContentType();
            if (this.v != 200 || j11 == 0) {
                j11 = 0;
            }
            boolean equalsIgnoreCase = "gzip".equalsIgnoreCase(f7.getHeaderField("Content-Encoding"));
            if (equalsIgnoreCase) {
                httpURLConnection = f7;
                this.w = j12;
            } else if (j12 != -1) {
                this.w = j12;
                httpURLConnection = f7;
            } else {
                String headerField2 = f7.getHeaderField("Content-Length");
                String headerField3 = f7.getHeaderField("Content-Range");
                Pattern pattern2 = y.a;
                if (!TextUtils.isEmpty(headerField2)) {
                    try {
                        j10 = -1;
                        j13 = Long.parseLong(headerField2);
                    } catch (NumberFormatException unused2) {
                        e2.a.e("HttpUtil", "Unexpected Content-Length [" + headerField2 + "]");
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
                                httpURLConnection = f7;
                                long parseLong2 = (parseLong - Long.parseLong(group3)) + 1;
                                if (j13 < 0) {
                                    j13 = parseLong2;
                                } else if (j13 != parseLong2) {
                                    try {
                                        e2.a.n("HttpUtil", "Inconsistent headers [" + headerField2 + "] [" + headerField3 + "]");
                                        j13 = Math.max(j13, parseLong2);
                                    } catch (NumberFormatException unused3) {
                                        e2.a.e("HttpUtil", "Unexpected Content-Range [" + headerField3 + "]");
                                        this.w = j13 == j10 ? j13 - j11 : j10;
                                        this.r = httpURLConnection.getInputStream();
                                        if (equalsIgnoreCase) {
                                        }
                                        this.s = true;
                                        transferStarted(mVar);
                                        k(j11);
                                        return this.w;
                                    }
                                }
                            } catch (NumberFormatException unused4) {
                                httpURLConnection = f7;
                            }
                            this.w = j13 == j10 ? j13 - j11 : j10;
                        }
                    }
                    httpURLConnection = f7;
                    this.w = j13 == j10 ? j13 - j11 : j10;
                }
                j10 = -1;
                if (!TextUtils.isEmpty(headerField3)) {
                }
                httpURLConnection = f7;
                this.w = j13 == j10 ? j13 - j11 : j10;
            }
            try {
                this.r = httpURLConnection.getInputStream();
                if (equalsIgnoreCase) {
                    this.r = new GZIPInputStream(this.r);
                }
                this.s = true;
                transferStarted(mVar);
                try {
                    k(j11);
                    return this.w;
                } catch (IOException e) {
                    b();
                    if (e instanceof v) {
                        throw ((v) e);
                    }
                    throw new v(e, 2000, 1);
                }
            } catch (IOException e7) {
                b();
                throw new v(e7, 2000, 1);
            }
        } catch (IOException e10) {
            b();
            throw v.a(e10, 1);
        }
    }

    @Override // b2.k
    public final int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        try {
            long j3 = this.w;
            if (j3 != -1) {
                long j10 = j3 - this.x;
                if (j10 == 0) {
                    return -1;
                }
                i11 = (int) Math.min(i11, j10);
            }
            InputStream inputStream = this.r;
            String str = e2.d0.a;
            int read = inputStream.read(bArr, i10, i11);
            if (read != -1) {
                this.x += read;
                bytesTransferred(read);
                return read;
            }
            return -1;
        } catch (IOException e) {
            String str2 = e2.d0.a;
            throw v.a(e, 2);
        }
    }
}
