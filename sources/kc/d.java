package kc;

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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class d {
    public final ja.c a;
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

    public d(k kVar, ja.c cVar, InputStream inputStream, OutputStream outputStream, InetAddress inetAddress) {
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

    public static int d(int i10, byte[] bArr) {
        int i11;
        int i12 = 0;
        while (true) {
            int i13 = i12 + 1;
            if (i13 >= i10) {
                return 0;
            }
            byte b10 = bArr[i12];
            if (b10 == 13 && bArr[i13] == 10 && (i11 = i12 + 3) < i10 && bArr[i12 + 2] == 13 && bArr[i11] == 10) {
                return i12 + 4;
            }
            if (b10 == 10 && bArr[i13] == 10) {
                return i12 + 2;
            }
            i12 = i13;
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
        } catch (IOException e) {
            throw new i("SERVER INTERNAL ERROR: IOException: " + e.getMessage(), e);
        }
    }

    public final void c() {
        g gVar = g.n;
        k kVar = this.m;
        ja.c cVar = this.a;
        BufferedInputStream bufferedInputStream = this.c;
        OutputStream outputStream = this.b;
        try {
            try {
                try {
                    try {
                        byte[] bArr = new byte[8192];
                        boolean z4 = false;
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
                                int i10 = this.e + read;
                                this.e = i10;
                                int d = d(i10, bArr);
                                this.d = d;
                                if (d > 0) {
                                    break;
                                }
                                int i11 = this.e;
                                read = bufferedInputStream.read(bArr, i11, 8192 - i11);
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
                            boolean z10 = "HTTP/1.1".equals(this.l) && (str2 == null || !str2.matches("(?i).*close.*"));
                            h e = kVar.e(this);
                            String str3 = (String) this.i.get("accept-encoding");
                            this.j.i();
                            e.i(this.g);
                            if (k.g(e) && str3 != null && str3.contains("gzip")) {
                                z4 = true;
                            }
                            e.g(z4);
                            e.h(z10);
                            e.d(outputStream);
                            if (!z10 || e.b()) {
                                throw new SocketException("NanoHttpd Shutdown");
                            }
                            k.d(e);
                            cVar.d();
                        } catch (SSLException e6) {
                            throw e6;
                        } catch (IOException unused) {
                            k.d(bufferedInputStream);
                            k.d(outputStream);
                            throw new SocketException("NanoHttpd Shutdown");
                        }
                    } catch (i e10) {
                        k.c(e10.a(), "text/plain", e10.getMessage()).d(outputStream);
                        k.d(outputStream);
                        k.d(null);
                        cVar.d();
                    }
                } catch (SSLException e11) {
                    k.c(gVar, "text/plain", "SSL PROTOCOL FAILURE: " + e11.getMessage()).d(outputStream);
                    k.d(outputStream);
                    k.d(null);
                    cVar.d();
                } catch (IOException e12) {
                    k.c(gVar, "text/plain", "SERVER INTERNAL ERROR: IOException: " + e12.getMessage()).d(outputStream);
                    k.d(outputStream);
                    k.d(null);
                    cVar.d();
                }
            } catch (SocketException e13) {
                throw e13;
            } catch (SocketTimeoutException e14) {
                throw e14;
            }
        } catch (Throwable th2) {
            k.d(null);
            cVar.d();
            throw th2;
        }
    }
}
