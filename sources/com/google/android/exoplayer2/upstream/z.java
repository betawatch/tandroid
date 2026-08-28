package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import android.text.TextUtils;
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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class z extends g {
    public final boolean a;
    public final int b;
    public final int c;
    public final String d;
    public final we.b e;
    public final we.b f;
    public HttpURLConnection h;
    public InputStream n;
    public boolean r;
    public int s;
    public long v;
    public long w;

    public z(String str, int i9, int i10, boolean z10, we.b bVar, int i11) {
        super(true);
        this.d = str;
        this.b = i9;
        this.c = i10;
        this.a = z10;
        this.e = bVar;
        this.f = new we.b(13, (byte) 0);
    }

    public static void i(HttpURLConnection httpURLConnection, long j10) {
        int i9;
        if (httpURLConnection == null || (i9 = d5.f0.a) < 19 || i9 > 20) {
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

    public final void a() {
        HttpURLConnection httpURLConnection = this.h;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e10) {
                d5.a.p("DefaultHttpDataSource", "Unexpected error while disconnecting", e10);
            }
            this.h = null;
        }
    }

    public final URL b(URL url, String str) {
        if (str == null) {
            throw new f0("Null location redirect", 2001);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!"https".equals(protocol) && !"http".equals(protocol)) {
                throw new f0(ta.b.d("Unsupported protocol redirect: ", protocol), 2001);
            }
            if (this.a || protocol.equals(url.getProtocol())) {
                return url2;
            }
            throw new f0("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")", 2001);
        } catch (MalformedURLException e10) {
            throw new f0(e10, 2001, 1);
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
                i(this.h, j11);
                try {
                    inputStream.close();
                } catch (IOException e10) {
                    int i9 = d5.f0.a;
                    throw new f0(e10, 2000, 3);
                }
            }
        } finally {
            this.n = null;
            a();
            if (this.r) {
                this.r = false;
                transferEnded();
            }
        }
    }

    public final HttpURLConnection f(q qVar) {
        HttpURLConnection h;
        URL url = new URL(qVar.a.toString());
        int i9 = qVar.b;
        byte[] bArr = qVar.c;
        long j10 = qVar.e;
        long j11 = qVar.f;
        int i10 = 1;
        int i11 = 0;
        boolean z10 = (qVar.h & 1) == 1;
        if (!this.a) {
            return h(url, i9, bArr, j10, j11, z10, true, qVar.d);
        }
        while (true) {
            int i12 = i11 + 1;
            if (i11 > 20) {
                throw new f0(new NoRouteToHostException(j3.r0.l(i12, "Too many redirects: ")), 2001, 1);
            }
            h = h(url, i9, bArr, j10, j11, z10, false, qVar.d);
            int responseCode = h.getResponseCode();
            String headerField = h.getHeaderField("Location");
            if ((i9 == i10 || i9 == 3) && (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308)) {
                h.disconnect();
                url = b(url, headerField);
            } else {
                if (i9 != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                    break;
                }
                h.disconnect();
                url = b(url, headerField);
                bArr = null;
                i9 = 1;
            }
            i11 = i12;
            i10 = 1;
        }
        return h;
    }

    @Override // com.google.android.exoplayer2.upstream.g, com.google.android.exoplayer2.upstream.m
    public final Map getResponseHeaders() {
        HttpURLConnection httpURLConnection = this.h;
        return httpURLConnection == null ? o8.q0.h : new y(httpURLConnection.getHeaderFields());
    }

    @Override // com.google.android.exoplayer2.upstream.m
    public final Uri getUri() {
        HttpURLConnection httpURLConnection = this.h;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    public final HttpURLConnection h(URL url, int i9, byte[] bArr, long j10, long j11, boolean z10, boolean z11, Map map) {
        String sb2;
        String str;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.b);
        httpURLConnection.setReadTimeout(this.c);
        HashMap hashMap = new HashMap();
        we.b bVar = this.e;
        if (bVar != null) {
            hashMap.putAll(bVar.D());
        }
        hashMap.putAll(this.f.D());
        hashMap.putAll(map);
        for (Map.Entry entry : hashMap.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        Pattern pattern = i0.a;
        if (j10 == 0 && j11 == -1) {
            sb2 = null;
        } else {
            StringBuilder s10 = aa.d.s(j10, "bytes=", "-");
            if (j11 != -1) {
                s10.append((j10 + j11) - 1);
            }
            sb2 = s10.toString();
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
        int i10 = q.i;
        if (i9 == 1) {
            str = "GET";
        } else if (i9 == 2) {
            str = "POST";
        } else {
            if (i9 != 3) {
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
        byte[] bArr = new byte[4096];
        while (j10 > 0) {
            int min = (int) Math.min(j10, 4096);
            InputStream inputStream = this.n;
            int i9 = d5.f0.a;
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
            HttpURLConnection f10 = f(qVar);
            long j12 = qVar.e;
            long j13 = qVar.f;
            this.h = f10;
            this.s = f10.getResponseCode();
            f10.getResponseMessage();
            int i9 = this.s;
            long j14 = -1;
            if (i9 < 200 || i9 > 299) {
                Map<String, List<String>> headerFields = f10.getHeaderFields();
                if (this.s == 416) {
                    String headerField = f10.getHeaderField("Content-Range");
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
                InputStream errorStream = f10.getErrorStream();
                try {
                    if (errorStream != null) {
                        d5.f0.R(errorStream);
                    } else {
                        int i10 = d5.f0.a;
                    }
                } catch (IOException unused) {
                    int i11 = d5.f0.a;
                }
                a();
                throw new h0(this.s, this.s == 416 ? new n(2008) : null, headerFields);
            }
            f10.getContentType();
            if (this.s != 200 || j12 == 0) {
                j12 = 0;
            }
            boolean equalsIgnoreCase = "gzip".equalsIgnoreCase(f10.getHeaderField("Content-Encoding"));
            if (equalsIgnoreCase) {
                httpURLConnection = f10;
                this.v = j13;
            } else if (j13 != -1) {
                this.v = j13;
                httpURLConnection = f10;
            } else {
                String headerField2 = f10.getHeaderField("Content-Length");
                String headerField3 = f10.getHeaderField("Content-Range");
                Pattern pattern2 = i0.a;
                if (!TextUtils.isEmpty(headerField2)) {
                    try {
                        j11 = -1;
                        j14 = Long.parseLong(headerField2);
                    } catch (NumberFormatException unused2) {
                        d5.a.o("HttpUtil", "Unexpected Content-Length [" + headerField2 + "]");
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
                                httpURLConnection = f10;
                                long parseLong2 = (parseLong - Long.parseLong(group3)) + 1;
                                if (j14 < 0) {
                                    j14 = parseLong2;
                                } else if (j14 != parseLong2) {
                                    try {
                                        d5.a.K("HttpUtil", "Inconsistent headers [" + headerField2 + "] [" + headerField3 + "]");
                                        j14 = Math.max(j14, parseLong2);
                                    } catch (NumberFormatException unused3) {
                                        d5.a.o("HttpUtil", "Unexpected Content-Range [" + headerField3 + "]");
                                        this.v = j14 == j11 ? j14 - j12 : j11;
                                        this.n = httpURLConnection.getInputStream();
                                        if (equalsIgnoreCase) {
                                        }
                                        this.r = true;
                                        transferStarted(qVar);
                                        j(j12);
                                        return this.v;
                                    }
                                }
                            } catch (NumberFormatException unused4) {
                                httpURLConnection = f10;
                            }
                            this.v = j14 == j11 ? j14 - j12 : j11;
                        }
                    }
                    httpURLConnection = f10;
                    this.v = j14 == j11 ? j14 - j12 : j11;
                }
                j11 = -1;
                if (!TextUtils.isEmpty(headerField3)) {
                }
                httpURLConnection = f10;
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
                    j(j12);
                    return this.v;
                } catch (IOException e10) {
                    a();
                    if (e10 instanceof f0) {
                        throw ((f0) e10);
                    }
                    throw new f0(e10, 2000, 1);
                }
            } catch (IOException e11) {
                a();
                throw new f0(e11, 2000, 1);
            }
        } catch (IOException e12) {
            a();
            throw f0.a(e12, 1);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.j
    public final int read(byte[] bArr, int i9, int i10) {
        if (i10 == 0) {
            return 0;
        }
        try {
            long j10 = this.v;
            if (j10 != -1) {
                long j11 = j10 - this.w;
                if (j11 == 0) {
                    return -1;
                }
                i10 = (int) Math.min(i10, j11);
            }
            InputStream inputStream = this.n;
            int i11 = d5.f0.a;
            int read = inputStream.read(bArr, i9, i10);
            if (read != -1) {
                this.w += read;
                bytesTransferred(read);
                return read;
            }
            return -1;
        } catch (IOException e10) {
            int i12 = d5.f0.a;
            throw f0.a(e10, 2);
        }
    }
}
