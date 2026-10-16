package e2;

import android.media.MediaFormat;
import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public abstract class a {
    public static ExecutorService a;
    public static final Object b = new Object();

    public static String a(String str, Throwable th2) {
        String replace;
        if (th2 != null) {
            synchronized (b) {
                Throwable th3 = th2;
                while (true) {
                    if (th3 == null) {
                        replace = Log.getStackTraceString(th2).trim().replace("\t", "    ");
                        break;
                    }
                    try {
                        if (th3 instanceof UnknownHostException) {
                            replace = "UnknownHostException (no network)";
                        } else {
                            th3 = th3.getCause();
                        }
                    } finally {
                    }
                }
            }
        } else {
            replace = null;
        }
        if (TextUtils.isEmpty(replace)) {
            return str;
        }
        StringBuilder i10 = t8.b.i(str, "\n  ");
        i10.append(replace.replace("\n", "\n  "));
        i10.append('\n');
        return i10.toString();
    }

    public static void b(String str, String str2) {
        synchronized (b) {
            Log.d(str, a(str2, null));
        }
    }

    public static void c(String str, String str2) {
        synchronized (b) {
            Log.e(str, a(str2, null));
        }
    }

    public static void d(String str, String str2, Throwable th2) {
        synchronized (b) {
            Log.e(str, a(str2, th2));
        }
    }

    public static synchronized Executor e() {
        ExecutorService executorService;
        synchronized (a.class) {
            try {
                if (a == null) {
                    String str = m0.a;
                    a = Executors.newSingleThreadExecutor(new androidx.emoji2.text.a("ExoPlayer:BackgroundExecutor", 1));
                }
                executorService = a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return executorService;
    }

    public static String f(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            if (xmlPullParser.getAttributeName(i10).equals(str)) {
                return xmlPullParser.getAttributeValue(i10);
            }
        }
        return null;
    }

    public static void g(String str, String str2) {
        synchronized (b) {
            Log.i(str, a(str2, null));
        }
    }

    public static boolean h(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals(str);
    }

    public static boolean i(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals(str);
    }

    public static void j(MediaFormat mediaFormat, String str, int i10) {
        if (i10 != -1) {
            mediaFormat.setInteger(str, i10);
        }
    }

    public static void k(MediaFormat mediaFormat, List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            mediaFormat.setByteBuffer(i2.d.j(i10, "csd-"), ByteBuffer.wrap((byte[]) list.get(i10)));
        }
    }

    public static void l(String str, String str2) {
        synchronized (b) {
            Log.w(str, a(str2, null));
        }
    }

    public static void m(String str, String str2, Throwable th2) {
        synchronized (b) {
            Log.w(str, a(str2, th2));
        }
    }
}
