package hc;

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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class i implements Closeable {
    public final h a;
    public final String b;
    public final InputStream c;
    public final long d;
    public final f e = new f(this, 0);
    public final HashMap f = new HashMap();
    public int h;
    public boolean n;
    public boolean r;
    public boolean s;

    public i(h hVar, String str, InputStream inputStream, long j10) {
        this.a = hVar;
        this.b = str;
        this.c = inputStream;
        this.d = j10;
        this.n = j10 < 0;
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
        String str = this.b;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("E, d MMM yyyy HH:mm:ss 'GMT'", Locale.US);
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("GMT"));
        h hVar = this.a;
        try {
            if (hVar == null) {
                throw new Error("sendResponse(): Status can't be null.");
            }
            String str2 = new b(str).c;
            if (str2 == null) {
                str2 = "US-ASCII";
            }
            PrintWriter printWriter = new PrintWriter((Writer) new BufferedWriter(new OutputStreamWriter(outputStream, str2)), false);
            printWriter.append("HTTP/1.1 ").append("" + hVar.a + " " + hVar.b).append(" \r\n");
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
            long j10 = inputStream != null ? this.d : 0L;
            if (this.h != 5 && this.n) {
                c(printWriter, "Transfer-Encoding", "chunked");
            } else if (!this.r) {
                j10 = f(printWriter, j10);
            }
            printWriter.append("\r\n");
            printWriter.flush();
            if (this.h != 5 && this.n) {
                g gVar = new g(outputStream);
                if (this.r) {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(gVar);
                    e(gZIPOutputStream, -1L);
                    gZIPOutputStream.finish();
                } else {
                    e(gVar, -1L);
                }
                gVar.a();
            } else if (this.r) {
                GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(outputStream);
                e(gZIPOutputStream2, -1L);
                gZIPOutputStream2.finish();
            } else {
                e(outputStream, j10);
            }
            outputStream.flush();
            l.d(inputStream);
        } catch (IOException e9) {
            l.d.log(Level.SEVERE, "Could not send response to the client", (Throwable) e9);
        }
    }

    public final void e(OutputStream outputStream, long j10) {
        byte[] bArr = new byte[(int) 16384];
        boolean z10 = j10 == -1;
        while (true) {
            if (j10 <= 0 && !z10) {
                return;
            }
            int read = this.c.read(bArr, 0, (int) (z10 ? 16384L : Math.min(j10, 16384L)));
            if (read <= 0) {
                return;
            }
            outputStream.write(bArr, 0, read);
            if (!z10) {
                j10 -= read;
            }
        }
    }

    public final long f(PrintWriter printWriter, long j10) {
        String a2 = a("content-length");
        if (a2 != null) {
            try {
                j10 = Long.parseLong(a2);
            } catch (NumberFormatException unused) {
                l.d.severe("content-length was no number ".concat(a2));
            }
        }
        printWriter.print("Content-Length: " + j10 + "\r\n");
        return j10;
    }

    public final void g(boolean z10) {
        this.r = z10;
    }

    public final void h(boolean z10) {
        this.s = z10;
    }

    public final void i(int i10) {
        this.h = i10;
    }
}
