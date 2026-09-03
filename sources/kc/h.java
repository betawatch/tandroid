package kc;

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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class h implements Closeable {
    public final g a;
    public final String b;
    public final InputStream c;
    public final long d;
    public final e e = new e(this, 0);
    public final HashMap f = new HashMap();
    public int h;
    public boolean n;
    public boolean r;
    public boolean s;

    public h(g gVar, String str, InputStream inputStream, long j10) {
        this.a = gVar;
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
        g gVar = this.a;
        try {
            if (gVar == null) {
                throw new Error("sendResponse(): Status can't be null.");
            }
            String str2 = new b(str).c;
            if (str2 == null) {
                str2 = "US-ASCII";
            }
            PrintWriter printWriter = new PrintWriter((Writer) new BufferedWriter(new OutputStreamWriter(outputStream, str2)), false);
            printWriter.append("HTTP/1.1 ").append("" + gVar.a + " " + gVar.b).append(" \r\n");
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
                f fVar = new f(outputStream);
                if (this.r) {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(fVar);
                    e(gZIPOutputStream, -1L);
                    gZIPOutputStream.finish();
                } else {
                    e(fVar, -1L);
                }
                fVar.a();
            } else if (this.r) {
                GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(outputStream);
                e(gZIPOutputStream2, -1L);
                gZIPOutputStream2.finish();
            } else {
                e(outputStream, j10);
            }
            outputStream.flush();
            k.d(inputStream);
        } catch (IOException e) {
            k.d.log(Level.SEVERE, "Could not send response to the client", (Throwable) e);
        }
    }

    public final void e(OutputStream outputStream, long j10) {
        byte[] bArr = new byte[(int) 16384];
        boolean z4 = j10 == -1;
        while (true) {
            if (j10 <= 0 && !z4) {
                return;
            }
            int read = this.c.read(bArr, 0, (int) (z4 ? 16384L : Math.min(j10, 16384L)));
            if (read <= 0) {
                return;
            }
            outputStream.write(bArr, 0, read);
            if (!z4) {
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
                k.d.severe("content-length was no number ".concat(a2));
            }
        }
        printWriter.print("Content-Length: " + j10 + "\r\n");
        return j10;
    }

    public final void g(boolean z4) {
        this.r = z4;
    }

    public final void h(boolean z4) {
        this.s = z4;
    }

    public final void i(int i10) {
        this.h = i10;
    }
}
