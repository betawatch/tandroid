package gc;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.logging.Level;
import javax.net.ssl.SSLException;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class d {
    public final android.support.v4.media.c a;
    public final OutputStream b;
    public final BufferedInputStream c;
    public int d;
    public int e;
    public String f;
    public int g;
    public HashMap h;
    public HashMap i;
    public c j;
    public final String k;
    public String l;
    public final /* synthetic */ k m;

    public d(k kVar, android.support.v4.media.c cVar, InputStream inputStream, OutputStream outputStream, InetAddress inetAddress) {
        this.m = kVar;
        this.a = cVar;
        this.c = new BufferedInputStream(inputStream, 8192);
        this.b = outputStream;
        this.k = (inetAddress.isLoopbackAddress() || inetAddress.isAnyLocalAddress()) ? "127.0.0.1" : inetAddress.getHostAddress().toString();
        if (!inetAddress.isLoopbackAddress() && !inetAddress.isAnyLocalAddress()) {
            inetAddress.getHostName().getClass();
        }
        this.i = new HashMap();
    }

    public static void b(String str, Map map) {
        String trim;
        String str2;
        if (str == null) {
            return;
        }
        StringTokenizer stringTokenizer = new StringTokenizer(str, "&");
        while (stringTokenizer.hasMoreTokens()) {
            String nextToken = stringTokenizer.nextToken();
            int indexOf = nextToken.indexOf(61);
            if (indexOf >= 0) {
                trim = k.b(nextToken.substring(0, indexOf)).trim();
                str2 = k.b(nextToken.substring(indexOf + 1));
            } else {
                trim = k.b(nextToken).trim();
                str2 = "";
            }
            List list = (List) map.get(trim);
            if (list == null) {
                list = new ArrayList();
                map.put(trim, list);
            }
            list.add(str2);
        }
    }

    public static int d(int i9, byte[] bArr) {
        int i10;
        int i11 = 0;
        while (true) {
            int i12 = i11 + 1;
            if (i12 >= i9) {
                return 0;
            }
            byte b10 = bArr[i11];
            if (b10 == 13 && bArr[i12] == 10 && (i10 = i11 + 3) < i9 && bArr[i11 + 2] == 13 && bArr[i10] == 10) {
                return i11 + 4;
            }
            if (b10 == 10 && bArr[i12] == 10) {
                return i11 + 2;
            }
            i11 = i12;
        }
    }

    public final void a(BufferedReader bufferedReader, HashMap hashMap, HashMap hashMap2, HashMap hashMap3) {
        String b10;
        try {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                return;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(readLine);
            if (!stringTokenizer.hasMoreTokens()) {
                throw new i("BAD REQUEST: Syntax error. Usage: GET /example/file.html");
            }
            hashMap.put("method", stringTokenizer.nextToken());
            if (!stringTokenizer.hasMoreTokens()) {
                throw new i("BAD REQUEST: Missing URI. Usage: GET /example/file.html");
            }
            String nextToken = stringTokenizer.nextToken();
            int indexOf = nextToken.indexOf(63);
            if (indexOf >= 0) {
                b(nextToken.substring(indexOf + 1), hashMap2);
                b10 = k.b(nextToken.substring(0, indexOf));
            } else {
                b10 = k.b(nextToken);
            }
            if (stringTokenizer.hasMoreTokens()) {
                this.l = stringTokenizer.nextToken();
            } else {
                this.l = "HTTP/1.1";
                k.d.log(Level.FINE, "no protocol version specified, strange. Assuming HTTP/1.1.");
            }
            String readLine2 = bufferedReader.readLine();
            while (readLine2 != null && !readLine2.trim().isEmpty()) {
                int indexOf2 = readLine2.indexOf(58);
                if (indexOf2 >= 0) {
                    hashMap3.put(readLine2.substring(0, indexOf2).trim().toLowerCase(Locale.US), readLine2.substring(indexOf2 + 1).trim());
                }
                readLine2 = bufferedReader.readLine();
            }
            hashMap.put("uri", b10);
        } catch (IOException e10) {
            throw new i("SERVER INTERNAL ERROR: IOException: " + e10.getMessage(), e10);
        }
    }

    public final void c() {
        g gVar = g.n;
        k kVar = this.m;
        android.support.v4.media.c cVar = this.a;
        BufferedInputStream bufferedInputStream = this.c;
        OutputStream outputStream = this.b;
        try {
            try {
                try {
                    try {
                        byte[] bArr = new byte[8192];
                        boolean z10 = false;
                        this.d = 0;
                        this.e = 0;
                        bufferedInputStream.mark(8192);
                        try {
                            int read = bufferedInputStream.read(bArr, 0, 8192);
                            if (read == -1) {
                                k.d(bufferedInputStream);
                                k.d(outputStream);
                                throw new SocketException("NanoHttpd Shutdown");
                            }
                            while (read > 0) {
                                int i9 = this.e + read;
                                this.e = i9;
                                int d = d(i9, bArr);
                                this.d = d;
                                if (d > 0) {
                                    break;
                                }
                                int i10 = this.e;
                                read = bufferedInputStream.read(bArr, i10, 8192 - i10);
                            }
                            if (this.d < this.e) {
                                bufferedInputStream.reset();
                                bufferedInputStream.skip(this.d);
                            }
                            this.h = new HashMap();
                            HashMap hashMap = this.i;
                            if (hashMap == null) {
                                this.i = new HashMap();
                            } else {
                                hashMap.clear();
                            }
                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(bArr, 0, this.e)));
                            HashMap hashMap2 = new HashMap();
                            a(bufferedReader, hashMap2, this.h, this.i);
                            String str = this.k;
                            if (str != null) {
                                this.i.put("remote-addr", str);
                                this.i.put("http-client-ip", str);
                            }
                            int a2 = e2.c.a((String) hashMap2.get("method"));
                            this.g = a2;
                            if (a2 == 0) {
                                throw new i("BAD REQUEST: Syntax error. HTTP verb " + ((String) hashMap2.get("method")) + " unhandled.");
                            }
                            this.f = (String) hashMap2.get("uri");
                            this.j = new c(this.i);
                            String str2 = (String) this.i.get("connection");
                            boolean z11 = "HTTP/1.1".equals(this.l) && (str2 == null || !str2.matches("(?i).*close.*"));
                            h e10 = kVar.e(this);
                            String str3 = (String) this.i.get("accept-encoding");
                            this.j.i();
                            e10.i(this.g);
                            if (k.g(e10) && str3 != null && str3.contains("gzip")) {
                                z10 = true;
                            }
                            e10.g(z10);
                            e10.h(z11);
                            e10.d(outputStream);
                            if (!z11 || e10.b()) {
                                throw new SocketException("NanoHttpd Shutdown");
                            }
                            k.d(e10);
                            cVar.C();
                        } catch (SSLException e11) {
                            throw e11;
                        } catch (IOException unused) {
                            k.d(bufferedInputStream);
                            k.d(outputStream);
                            throw new SocketException("NanoHttpd Shutdown");
                        }
                    } catch (i e12) {
                        k.c(e12.a(), "text/plain", e12.getMessage()).d(outputStream);
                        k.d(outputStream);
                        k.d(null);
                        cVar.C();
                    }
                } catch (SSLException e13) {
                    k.c(gVar, "text/plain", "SSL PROTOCOL FAILURE: " + e13.getMessage()).d(outputStream);
                    k.d(outputStream);
                    k.d(null);
                    cVar.C();
                } catch (IOException e14) {
                    k.c(gVar, "text/plain", "SERVER INTERNAL ERROR: IOException: " + e14.getMessage()).d(outputStream);
                    k.d(outputStream);
                    k.d(null);
                    cVar.C();
                }
            } catch (SocketException e15) {
                throw e15;
            } catch (SocketTimeoutException e16) {
                throw e16;
            }
        } catch (Throwable th) {
            k.d(null);
            cVar.C();
            throw th;
        }
    }
}
