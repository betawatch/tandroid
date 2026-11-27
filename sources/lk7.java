// default package

import j$.util.DesugarTimeZone;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Level;
import java.util.zip.GZIPOutputStream;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class lk7 implements Closeable {
    public final int a;
    public final String b;
    public final InputStream c;
    public final long d;
    public final fz1 e = new fz1(this, (byte) 1);
    public final HashMap f = new HashMap();
    public int h;
    public boolean n;
    public boolean r;
    public boolean s;

    public lk7(int i, String str, InputStream inputStream, long j) {
        this.a = i;
        this.b = str;
        this.c = inputStream;
        this.d = j;
        this.n = j < 0;
        this.s = true;
    }

    public static void c(PrintWriter printWriter, String str, String str2) {
        printWriter.append((CharSequence) str).append(": ").append((CharSequence) str2).append("\r\n");
    }

    public final String a(String str) {
        return (String) this.f.get(str.toLowerCase());
    }

    public final boolean b() {
        return "close".equals(a("connection"));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        InputStream inputStream = this.c;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    public final void d(OutputStream outputStream) {
        int i;
        String str = this.b;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("E, d MMM yyyy HH:mm:ss 'GMT'", Locale.US);
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("GMT"));
        int i2 = this.a;
        try {
            if (i2 == 0) {
                throw new Error("sendResponse(): Status can't be null.");
            }
            String str2 = new hk7(str).b;
            if (str2 == null) {
                str2 = "US-ASCII";
            }
            PrintWriter printWriter = new PrintWriter((Writer) new BufferedWriter(new OutputStreamWriter(outputStream, str2)), false);
            PrintWriter append = printWriter.append("HTTP/1.1 ");
            StringBuilder sb = new StringBuilder("");
            switch (i2) {
                case 1:
                    i = 101;
                    break;
                case 2:
                    i = jn7.d3;
                    break;
                case 3:
                    i = jn7.e3;
                    break;
                case 4:
                    i = jn7.f3;
                    break;
                case 5:
                    i = jn7.h3;
                    break;
                case 6:
                    i = jn7.j3;
                    break;
                case 7:
                    i = jn7.k3;
                    break;
                case 8:
                    i = jn7.X4;
                    break;
                case 9:
                    i = jn7.Y4;
                    break;
                case 10:
                    i = jn7.Z4;
                    break;
                case 11:
                    i = jn7.a5;
                    break;
                case 12:
                    i = jn7.d5;
                    break;
                case 13:
                    i = 400;
                    break;
                case 14:
                    i = 401;
                    break;
                case 15:
                    i = 403;
                    break;
                case 16:
                    i = 404;
                    break;
                case 17:
                    i = 405;
                    break;
                case 18:
                    i = 406;
                    break;
                case 19:
                    i = 408;
                    break;
                case 20:
                    i = 409;
                    break;
                case 21:
                    i = 410;
                    break;
                case 22:
                    i = 411;
                    break;
                case 23:
                    i = 412;
                    break;
                case 24:
                    i = 413;
                    break;
                case 25:
                    i = 415;
                    break;
                case 26:
                    i = 416;
                    break;
                case 27:
                    i = 417;
                    break;
                case 28:
                    i = 429;
                    break;
                case 29:
                    i = 500;
                    break;
                case jn7.S /* 30 */:
                    i = 501;
                    break;
                case 31:
                    i = 503;
                    break;
                case 32:
                    i = 505;
                    break;
                default:
                    throw null;
            }
            sb.append(i);
            sb.append(" ");
            sb.append(qu6.b(i2));
            append.append(sb.toString()).append(" \r\n");
            if (str != null) {
                c(printWriter, "Content-Type", str);
            }
            if (a("date") == null) {
                c(printWriter, "Date", simpleDateFormat.format(new Date()));
            }
            for (Map.Entry entry : this.e.entrySet()) {
                c(printWriter, (String) entry.getKey(), (String) entry.getValue());
            }
            if (a("connection") == null) {
                c(printWriter, "Connection", this.s ? "keep-alive" : "close");
            }
            if (a("content-length") != null) {
                this.r = false;
            }
            if (this.r) {
                c(printWriter, "Content-Encoding", "gzip");
                this.n = true;
            }
            InputStream inputStream = this.c;
            long j = inputStream != null ? this.d : 0L;
            if (this.h != 5 && this.n) {
                c(printWriter, "Transfer-Encoding", "chunked");
            } else if (!this.r) {
                j = f(printWriter, j);
            }
            printWriter.append("\r\n");
            printWriter.flush();
            if (this.h != 5 && this.n) {
                kk7 kk7Var = new kk7(outputStream);
                if (this.r) {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(kk7Var);
                    e(gZIPOutputStream, -1L);
                    gZIPOutputStream.finish();
                } else {
                    e(kk7Var, -1L);
                }
                kk7Var.a();
            } else if (this.r) {
                GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(outputStream);
                e(gZIPOutputStream2, -1L);
                gZIPOutputStream2.finish();
            } else {
                e(outputStream, j);
            }
            outputStream.flush();
            nk7.c(inputStream);
        } catch (IOException e) {
            nk7.d.log(Level.SEVERE, "Could not send response to the client", (Throwable) e);
        }
    }

    public final void e(OutputStream outputStream, long j) {
        byte[] bArr = new byte[TLObject.FLAG_14];
        boolean z = j == -1;
        while (true) {
            if (j <= 0 && !z) {
                return;
            }
            int read = this.c.read(bArr, 0, (int) (z ? 16384L : Math.min(j, 16384L)));
            if (read <= 0) {
                return;
            }
            outputStream.write(bArr, 0, read);
            if (!z) {
                j -= read;
            }
        }
    }

    public final long f(PrintWriter printWriter, long j) {
        String a = a("content-length");
        if (a != null) {
            try {
                j = Long.parseLong(a);
            } catch (NumberFormatException unused) {
                nk7.d.severe("content-length was no number ".concat(a));
            }
        }
        printWriter.print("Content-Length: " + j + "\r\n");
        return j;
    }
}
