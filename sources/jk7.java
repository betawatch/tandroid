// default package

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
import java.util.StringTokenizer;
import java.util.logging.Level;
import javax.net.ssl.SSLException;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class jk7 {
    public final jk4 a;
    public final OutputStream b;
    public final BufferedInputStream c;
    public int d;
    public int e;
    public String f;
    public int g;
    public HashMap h;
    public final HashMap i;
    public ik7 j;
    public final String k;
    public String l;
    public final /* synthetic */ nk7 m;

    public jk7(nk7 nk7Var, jk4 jk4Var, InputStream inputStream, OutputStream outputStream, InetAddress inetAddress) {
        this.m = nk7Var;
        this.a = jk4Var;
        this.c = new BufferedInputStream(inputStream, TLObject.FLAG_13);
        this.b = outputStream;
        this.k = (inetAddress.isLoopbackAddress() || inetAddress.isAnyLocalAddress()) ? "127.0.0.1" : inetAddress.getHostAddress().toString();
        if (!inetAddress.isLoopbackAddress() && !inetAddress.isAnyLocalAddress()) {
            inetAddress.getHostName().getClass();
        }
        this.i = new HashMap();
    }

    public static void b(String str, HashMap hashMap) {
        String trim;
        String str2;
        StringTokenizer stringTokenizer = new StringTokenizer(str, "&");
        while (stringTokenizer.hasMoreTokens()) {
            String nextToken = stringTokenizer.nextToken();
            int indexOf = nextToken.indexOf(61);
            if (indexOf >= 0) {
                trim = nk7.a(nextToken.substring(0, indexOf)).trim();
                str2 = nk7.a(nextToken.substring(indexOf + 1));
            } else {
                trim = nk7.a(nextToken).trim();
                str2 = "";
            }
            List list = (List) hashMap.get(trim);
            if (list == null) {
                list = new ArrayList();
                hashMap.put(trim, list);
            }
            list.add(str2);
        }
    }

    public static int d(int i, byte[] bArr) {
        int i2;
        int i3 = 0;
        while (true) {
            int i4 = i3 + 1;
            if (i4 >= i) {
                return 0;
            }
            byte b = bArr[i3];
            if (b == 13 && bArr[i4] == 10 && (i2 = i3 + 3) < i && bArr[i3 + 2] == 13 && bArr[i2] == 10) {
                return i3 + 4;
            }
            if (b == 10 && bArr[i4] == 10) {
                return i3 + 2;
            }
            i3 = i4;
        }
    }

    public final void a(BufferedReader bufferedReader, HashMap hashMap, HashMap hashMap2, HashMap hashMap3) {
        String a;
        try {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                return;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(readLine);
            if (!stringTokenizer.hasMoreTokens()) {
                throw new mk7("BAD REQUEST: Syntax error. Usage: GET /example/file.html");
            }
            hashMap.put("method", stringTokenizer.nextToken());
            if (!stringTokenizer.hasMoreTokens()) {
                throw new mk7("BAD REQUEST: Missing URI. Usage: GET /example/file.html");
            }
            String nextToken = stringTokenizer.nextToken();
            int indexOf = nextToken.indexOf(63);
            if (indexOf >= 0) {
                b(nextToken.substring(indexOf + 1), hashMap2);
                a = nk7.a(nextToken.substring(0, indexOf));
            } else {
                a = nk7.a(nextToken);
            }
            if (stringTokenizer.hasMoreTokens()) {
                this.l = stringTokenizer.nextToken();
            } else {
                this.l = "HTTP/1.1";
                nk7.d.log(Level.FINE, "no protocol version specified, strange. Assuming HTTP/1.1.");
            }
            String readLine2 = bufferedReader.readLine();
            while (readLine2 != null && !readLine2.trim().isEmpty()) {
                int indexOf2 = readLine2.indexOf(58);
                if (indexOf2 >= 0) {
                    hashMap3.put(readLine2.substring(0, indexOf2).trim().toLowerCase(Locale.US), readLine2.substring(indexOf2 + 1).trim());
                }
                readLine2 = bufferedReader.readLine();
            }
            hashMap.put("uri", a);
        } catch (IOException e) {
            throw new mk7("SERVER INTERNAL ERROR: IOException: " + e.getMessage(), e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0092 A[Catch: mk7 -> 0x0141, IOException -> 0x0153, SSLException -> 0x0174, SocketTimeoutException -> 0x019b, SocketException -> 0x019d, all -> 0x019f, TryCatch #4 {mk7 -> 0x0141, blocks: (B:4:0x0015, B:6:0x001f, B:10:0x0028, B:12:0x0035, B:14:0x003e, B:16:0x0044, B:17:0x004d, B:20:0x0076, B:21:0x0080, B:51:0x0088, B:24:0x008e, B:26:0x0092, B:29:0x00b8, B:32:0x00c3, B:35:0x00e0, B:38:0x00e9, B:40:0x00f2, B:45:0x00ff, B:46:0x0104, B:48:0x0105, B:49:0x0126, B:55:0x0127, B:56:0x0132, B:60:0x0133, B:61:0x013e, B:59:0x0140), top: B:3:0x0015, outer: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0105 A[Catch: mk7 -> 0x0141, IOException -> 0x0153, SSLException -> 0x0174, SocketTimeoutException -> 0x019b, SocketException -> 0x019d, all -> 0x019f, TryCatch #4 {mk7 -> 0x0141, blocks: (B:4:0x0015, B:6:0x001f, B:10:0x0028, B:12:0x0035, B:14:0x003e, B:16:0x0044, B:17:0x004d, B:20:0x0076, B:21:0x0080, B:51:0x0088, B:24:0x008e, B:26:0x0092, B:29:0x00b8, B:32:0x00c3, B:35:0x00e0, B:38:0x00e9, B:40:0x00f2, B:45:0x00ff, B:46:0x0104, B:48:0x0105, B:49:0x0126, B:55:0x0127, B:56:0x0132, B:60:0x0133, B:61:0x013e, B:59:0x0140), top: B:3:0x0015, outer: #8 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c() {
        int D;
        HashMap hashMap = this.i;
        nk7 nk7Var = this.m;
        jk4 jk4Var = this.a;
        BufferedInputStream bufferedInputStream = this.c;
        OutputStream outputStream = this.b;
        try {
            try {
                try {
                    try {
                        byte[] bArr = new byte[TLObject.FLAG_13];
                        boolean z = false;
                        this.d = 0;
                        this.e = 0;
                        bufferedInputStream.mark(TLObject.FLAG_13);
                        try {
                            int read = bufferedInputStream.read(bArr, 0, TLObject.FLAG_13);
                            if (read == -1) {
                                nk7.c(bufferedInputStream);
                                nk7.c(outputStream);
                                throw new SocketException("NanoHttpd Shutdown");
                            }
                            while (read > 0) {
                                int i = this.e + read;
                                this.e = i;
                                int d = d(i, bArr);
                                this.d = d;
                                if (d > 0) {
                                    break;
                                }
                                int i2 = this.e;
                                read = bufferedInputStream.read(bArr, i2, 8192 - i2);
                            }
                            if (this.d < this.e) {
                                bufferedInputStream.reset();
                                bufferedInputStream.skip(this.d);
                            }
                            this.h = new HashMap();
                            hashMap.clear();
                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(bArr, 0, this.e)));
                            HashMap hashMap2 = new HashMap();
                            a(bufferedReader, hashMap2, this.h, hashMap);
                            String str = this.k;
                            if (str != null) {
                                hashMap.put("remote-addr", str);
                                hashMap.put("http-client-ip", str);
                            }
                            String str2 = (String) hashMap2.get("method");
                            if (str2 != null) {
                                try {
                                    D = qu6.D(str2);
                                } catch (IllegalArgumentException unused) {
                                }
                                this.g = D;
                                if (D != 0) {
                                    throw new mk7("BAD REQUEST: Syntax error. HTTP verb " + ((String) hashMap2.get("method")) + " unhandled.");
                                }
                                this.f = (String) hashMap2.get("uri");
                                this.j = new ik7(hashMap);
                                String str3 = (String) hashMap.get("connection");
                                boolean z2 = "HTTP/1.1".equals(this.l) && (str3 == null || !str3.matches("(?i).*close.*"));
                                lk7 d2 = nk7Var.d(this);
                                String str4 = (String) hashMap.get("accept-encoding");
                                this.j.h();
                                d2.h = this.g;
                                if (nk7.f(d2) && str4 != null && str4.contains("gzip")) {
                                    z = true;
                                }
                                d2.r = z;
                                d2.s = z2;
                                d2.d(outputStream);
                                if (!z2 || d2.b()) {
                                    throw new SocketException("NanoHttpd Shutdown");
                                }
                                nk7.c(d2);
                                jk4Var.a();
                                return;
                            }
                            D = 0;
                            this.g = D;
                            if (D != 0) {
                            }
                        } catch (SSLException e) {
                            throw e;
                        } catch (IOException unused2) {
                            nk7.c(bufferedInputStream);
                            nk7.c(outputStream);
                            throw new SocketException("NanoHttpd Shutdown");
                        }
                    } catch (mk7 e2) {
                        nk7.b(e2.a, "text/plain", e2.getMessage()).d(outputStream);
                        nk7.c(outputStream);
                    }
                } catch (SSLException e3) {
                    nk7.b(29, "text/plain", "SSL PROTOCOL FAILURE: " + e3.getMessage()).d(outputStream);
                    nk7.c(outputStream);
                } catch (IOException e4) {
                    nk7.b(29, "text/plain", "SERVER INTERNAL ERROR: IOException: " + e4.getMessage()).d(outputStream);
                    nk7.c(outputStream);
                }
            } catch (SocketException e5) {
                throw e5;
            } catch (SocketTimeoutException e6) {
                throw e6;
            }
        } finally {
            nk7.c(null);
            jk4Var.a();
        }
    }
}
