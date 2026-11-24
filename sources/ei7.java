// default package

import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URLDecoder;
import java.nio.charset.Charset;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public abstract class ei7 {
    public static final Logger d;
    public volatile ServerSocket a;
    public Thread b;
    public hg2 c;

    static {
        Pattern.compile("([ |\t]*Content-Disposition[ |\t]*:)(.*)", 2);
        Pattern.compile("([ |\t]*content-type[ |\t]*:)(.*)", 2);
        Pattern.compile("[ |\t]*([a-zA-Z]*)[ |\t]*=[ |\t]*['|\"]([^\"^']*)['|\"]");
        d = Logger.getLogger(ei7.class.getName());
    }

    public static String a(String str) {
        try {
            return URLDecoder.decode(str, "UTF8");
        } catch (UnsupportedEncodingException e) {
            d.log(Level.WARNING, "Encoding not supported, ignored", (Throwable) e);
            return null;
        }
    }

    public static ci7 b(int i, String str, String str2) {
        byte[] bArr;
        yh7 yh7Var = new yh7(str);
        if (str2 == null) {
            return new ci7(i, str, new ByteArrayInputStream(new byte[0]), 0L);
        }
        String str3 = yh7Var.b;
        try {
            if (!Charset.forName(str3 == null ? "US-ASCII" : str3).newEncoder().canEncode(str2) && str3 == null) {
                yh7Var = new yh7(str + "; charset=UTF-8");
            }
            String str4 = yh7Var.b;
            bArr = str2.getBytes(str4 != null ? str4 : "US-ASCII");
        } catch (UnsupportedEncodingException e) {
            d.log(Level.SEVERE, "encoding problem, responding nothing", (Throwable) e);
            bArr = new byte[0];
        }
        return new ci7(i, yh7Var.a, new ByteArrayInputStream(bArr), bArr.length);
    }

    public static final void c(Object obj) {
        if (obj != null) {
            try {
                if (obj instanceof Closeable) {
                    ((Closeable) obj).close();
                } else if (obj instanceof Socket) {
                    ((Socket) obj).close();
                } else {
                    if (!(obj instanceof ServerSocket)) {
                        throw new IllegalArgumentException("Unknown object to close");
                    }
                    ((ServerSocket) obj).close();
                }
            } catch (IOException e) {
                d.log(Level.SEVERE, "Could not close", (Throwable) e);
            }
        }
    }

    public static boolean f(ci7 ci7Var) {
        String str = ci7Var.b;
        if (str != null) {
            return str.toLowerCase().contains("text/") || str.toLowerCase().contains("/json");
        }
        return false;
    }

    public abstract ci7 d(ai7 ai7Var);

    public final void e() {
        this.a = new ServerSocket();
        this.a.setReuseAddress(true);
        p6 p6Var = new p6(this);
        Thread thread = new Thread(p6Var);
        this.b = thread;
        thread.setDaemon(true);
        this.b.setName("NanoHttpd Main Listener");
        this.b.start();
        while (!p6Var.b && ((IOException) p6Var.c) == null) {
            try {
                Thread.sleep(10L);
            } catch (Throwable unused) {
            }
        }
        IOException iOException = (IOException) p6Var.c;
        if (iOException != null) {
            throw iOException;
        }
    }
}
