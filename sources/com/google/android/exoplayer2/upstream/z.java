package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import android.text.TextUtils;
import j7.l1;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class z extends g {
    public final boolean a;
    public final int b;
    public final int c;
    public final String d;
    public final ze.b e;
    public final ze.b f;
    public HttpURLConnection h;
    public InputStream n;
    public boolean r;
    public int s;
    public long v;
    public long w;

    public z(String str, int i10, int i11, boolean z10, ze.b bVar, int i12) {
        super(true);
        this.d = str;
        this.b = i10;
        this.c = i11;
        this.a = z10;
        this.e = bVar;
        this.f = new ze.b(14, false);
    }

    public static void k(HttpURLConnection httpURLConnection, long j10) {
        int i10;
        if (httpURLConnection == null || (i10 = f5.d0.a) < 19 || i10 > 20) {
            return;
        }
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            if (j10 == -1) {
                if (inputStream.read() == -1) {
                    return;
                }
            } else if (j10 <= 2048) {
                return;
            }
            String name = inputStream.getClass().getName();
            if ("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) || "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                Class<? super Object> superclass = inputStream.getClass().getSuperclass();
                superclass.getClass();
                Method declaredMethod = superclass.getDeclaredMethod("unexpectedEndOfInput", null);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(inputStream, null);
            }
        } catch (Exception unused) {
        }
    }

    public final void b() {
        HttpURLConnection httpURLConnection = this.h;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e10) {
                f5.a.p("DefaultHttpDataSource", "Unexpected error while disconnecting", e10);
            }
            this.h = null;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.m
    public final void close() {
        try {
            InputStream inputStream = this.n;
            if (inputStream != null) {
                long j10 = this.v;
                long j11 = -1;
                if (j10 != -1) {
                    j11 = j10 - this.w;
                }
                k(this.h, j11);
                try {
                    inputStream.close();
                } catch (IOException e10) {
                    int i10 = f5.d0.a;
                    throw new f0(e10, 2000, 3);
                }
            }
        } finally {
            this.n = null;
            b();
            if (this.r) {
                this.r = false;
                transferEnded();
            }
        }
    }

    public final URL e(URL url, String str) {
        if (str == null) {
            throw new f0("Null location redirect", 2001);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!"https".equals(protocol) && !"http".equals(protocol)) {
                throw new f0(u3.c.e("Unsupported protocol redirect: ", protocol), 2001);
            }
            if (this.a || protocol.equals(url.getProtocol())) {
                return url2;
            }
            throw new f0("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")", 2001);
        } catch (MalformedURLException e10) {
            throw new f0(e10, 2001, 1);
        }
    }

    public final HttpURLConnection g(q qVar) {
        HttpURLConnection j10;
        URL url = new URL(qVar.a.toString());
        int i10 = qVar.b;
        byte[] bArr = qVar.c;
        long j11 = qVar.e;
        long j12 = qVar.f;
        int i11 = 1;
        int i12 = 0;
        boolean z10 = (qVar.h & 1) == 1;
        if (!this.a) {
            return j(url, i10, bArr, j11, j12, z10, true, qVar.d);
        }
        while (true) {
            int i13 = i12 + 1;
            if (i12 > 20) {
                throw new f0(new NoRouteToHostException(l1.k(i13, "Too many redirects: ")), 2001, 1);
            }
            j10 = j(url, i10, bArr, j11, j12, z10, false, qVar.d);
            int responseCode = j10.getResponseCode();
            String headerField = j10.getHeaderField("Location");
            if ((i10 == i11 || i10 == 3) && (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308)) {
                j10.disconnect();
                url = e(url, headerField);
            } else {
                if (i10 != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                    break;
                }
                j10.disconnect();
                url = e(url, headerField);
                bArr = null;
                i10 = 1;
            }
            i12 = i13;
            i11 = 1;
        }
        return j10;
    }

    @Override // com.google.android.exoplayer2.upstream.g, com.google.android.exoplayer2.upstream.m
    public final Map getResponseHeaders() {
        HttpURLConnection httpURLConnection = this.h;
        return httpURLConnection == null ? q8.q0.h : new y(httpURLConnection.getHeaderFields());
    }

    @Override // com.google.android.exoplayer2.upstream.m
    public final Uri getUri() {
        HttpURLConnection httpURLConnection = this.h;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    public final HttpURLConnection j(URL url, int i10, byte[] bArr, long j10, long j11, boolean z10, boolean z11, Map map) {
        String sb2;
        String str;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.b);
        httpURLConnection.setReadTimeout(this.c);
        HashMap hashMap = new HashMap();
        ze.b bVar = this.e;
        if (bVar != null) {
            hashMap.putAll(bVar.I());
        }
        hashMap.putAll(this.f.I());
        hashMap.putAll(map);
        for (Map.Entry entry : hashMap.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        Pattern pattern = i0.a;
        if (j10 == 0 && j11 == -1) {
            sb2 = null;
        } else {
            StringBuilder r6 = a4.w.r(j10, "bytes=", "-");
            if (j11 != -1) {
                r6.append((j10 + j11) - 1);
            }
            sb2 = r6.toString();
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
        int i11 = q.i;
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

    public final void l(long j10) {
        if (j10 == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j10 > 0) {
            int min = (int) Math.min(j10, 4096);
            InputStream inputStream = this.n;
            int i10 = f5.d0.a;
            int read = inputStream.read(bArr, 0, min);
            if (Thread.currentThread().isInterrupted()) {
                throw new f0(new InterruptedIOException(), 2000, 1);
            }
            if (read == -1) {
                throw new f0();
            }
            j10 -= read;
            bytesTransferred(read);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x011d A[Catch: IOException -> 0x0128, TRY_LEAVE, TryCatch #0 {IOException -> 0x0128, blocks: (B:19:0x0115, B:21:0x011d), top: B:18:0x0115 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x010b  */
    @Override // com.google.android.exoplayer2.upstream.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long open(q qVar) {
        boolean z10;
        long j10;
        HttpURLConnection httpURLConnection;
        long j11;
        this.w = 0L;
        this.v = 0L;
        transferInitializing(qVar);
        try {
            HttpURLConnection g10 = g(qVar);
            long j12 = qVar.e;
            long j13 = qVar.f;
            this.h = g10;
            this.s = g10.getResponseCode();
            g10.getResponseMessage();
            int i10 = this.s;
            long j14 = -1;
            if (i10 < 200 || i10 > 299) {
                Map<String, List<String>> headerFields = g10.getHeaderFields();
                if (this.s == 416) {
                    String headerField = g10.getHeaderField("Content-Range");
                    Pattern pattern = i0.a;
                    if (TextUtils.isEmpty(headerField)) {
                        j10 = -1;
                        z10 = true;
                    } else {
                        Matcher matcher = i0.b.matcher(headerField);
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
                        this.r = z10;
                        transferStarted(qVar);
                        if (j13 != -1) {
                            return j13;
                        }
                        return 0L;
                    }
                }
                InputStream errorStream = g10.getErrorStream();
                try {
                    if (errorStream != null) {
                        f5.d0.R(errorStream);
                    } else {
                        int i11 = f5.d0.a;
                    }
                } catch (IOException unused) {
                    int i12 = f5.d0.a;
                }
                b();
                throw new h0(this.s, this.s == 416 ? new n(2008) : null, headerFields);
            }
            g10.getContentType();
            if (this.s != 200 || j12 == 0) {
                j12 = 0;
            }
            boolean equalsIgnoreCase = "gzip".equalsIgnoreCase(g10.getHeaderField("Content-Encoding"));
            if (equalsIgnoreCase) {
                httpURLConnection = g10;
                this.v = j13;
            } else if (j13 != -1) {
                this.v = j13;
                httpURLConnection = g10;
            } else {
                String headerField2 = g10.getHeaderField("Content-Length");
                String headerField3 = g10.getHeaderField("Content-Range");
                Pattern pattern2 = i0.a;
                if (!TextUtils.isEmpty(headerField2)) {
                    try {
                        j11 = -1;
                        j14 = Long.parseLong(headerField2);
                    } catch (NumberFormatException unused2) {
                        f5.a.o("HttpUtil", "Unexpected Content-Length [" + headerField2 + "]");
                    }
                    if (!TextUtils.isEmpty(headerField3)) {
                        Matcher matcher2 = i0.a.matcher(headerField3);
                        if (matcher2.matches()) {
                            try {
                                String group2 = matcher2.group(2);
                                group2.getClass();
                                long parseLong = Long.parseLong(group2);
                                String group3 = matcher2.group(1);
                                group3.getClass();
                                httpURLConnection = g10;
                                long parseLong2 = (parseLong - Long.parseLong(group3)) + 1;
                                if (j14 < 0) {
                                    j14 = parseLong2;
                                } else if (j14 != parseLong2) {
                                    try {
                                        f5.a.K("HttpUtil", "Inconsistent headers [" + headerField2 + "] [" + headerField3 + "]");
                                        j14 = Math.max(j14, parseLong2);
                                    } catch (NumberFormatException unused3) {
                                        f5.a.o("HttpUtil", "Unexpected Content-Range [" + headerField3 + "]");
                                        this.v = j14 == j11 ? j14 - j12 : j11;
                                        this.n = httpURLConnection.getInputStream();
                                        if (equalsIgnoreCase) {
                                        }
                                        this.r = true;
                                        transferStarted(qVar);
                                        l(j12);
                                        return this.v;
                                    }
                                }
                            } catch (NumberFormatException unused4) {
                                httpURLConnection = g10;
                            }
                            this.v = j14 == j11 ? j14 - j12 : j11;
                        }
                    }
                    httpURLConnection = g10;
                    this.v = j14 == j11 ? j14 - j12 : j11;
                }
                j11 = -1;
                if (!TextUtils.isEmpty(headerField3)) {
                }
                httpURLConnection = g10;
                this.v = j14 == j11 ? j14 - j12 : j11;
            }
            try {
                this.n = httpURLConnection.getInputStream();
                if (equalsIgnoreCase) {
                    this.n = new GZIPInputStream(this.n);
                }
                this.r = true;
                transferStarted(qVar);
                try {
                    l(j12);
                    return this.v;
                } catch (IOException e10) {
                    b();
                    if (e10 instanceof f0) {
                        throw ((f0) e10);
                    }
                    throw new f0(e10, 2000, 1);
                }
            } catch (IOException e11) {
                b();
                throw new f0(e11, 2000, 1);
            }
        } catch (IOException e12) {
            b();
            throw f0.a(e12, 1);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.j
    public final int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        try {
            long j10 = this.v;
            if (j10 != -1) {
                long j11 = j10 - this.w;
                if (j11 == 0) {
                    return -1;
                }
                i11 = (int) Math.min(i11, j11);
            }
            InputStream inputStream = this.n;
            int i12 = f5.d0.a;
            int read = inputStream.read(bArr, i10, i11);
            if (read != -1) {
                this.w += read;
                bytesTransferred(read);
                return read;
            }
            return -1;
        } catch (IOException e10) {
            int i13 = f5.d0.a;
            throw f0.a(e10, 2);
        }
    }
}
