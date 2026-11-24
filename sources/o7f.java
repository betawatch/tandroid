// default package

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import j$.util.concurrent.ConcurrentHashMap;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class o7f {
    public static final Charset b = Charset.forName("UTF-8");
    public static final vk9 c;
    public static final vk9 d;
    public static final ConcurrentHashMap e;
    public static final HashMap f;
    public static Boolean g;
    public static Long h;
    public static final p7d i;
    public final Context a;

    static {
        vk9 vk9Var = new vk9(Uri.parse("content://com.google.android.gms.phenotype/com.google.android.gms.clearcut.public"), "gms:playlog:service:samplingrules_", "LogSamplingRules__", (byte) 20);
        c = vk9Var;
        d = new vk9(Uri.parse("content://com.google.android.gms.phenotype/com.google.android.gms.clearcut.public"), "gms:playlog:service:sampling_", "LogSampling__", (byte) 20);
        e = new ConcurrentHashMap();
        f = new HashMap();
        g = null;
        h = null;
        i = new p7d(vk9Var, "enable_log_sampling_rules", Boolean.FALSE, (byte) 0);
    }

    public o7f(Context context) {
        this.a = context;
        if (context != null) {
            g6d.b(context);
        }
    }

    public static long a(long j, String str) {
        if (str == null || str.isEmpty()) {
            return s2f.c(ByteBuffer.allocate(8).putLong(j).array());
        }
        byte[] bytes = str.getBytes(b);
        ByteBuffer allocate = ByteBuffer.allocate(bytes.length + 8);
        allocate.put(bytes);
        allocate.putLong(j);
        return s2f.c(allocate.array());
    }

    public static boolean b(long j, long j2, long j3) {
        if (j2 < 0 || j3 <= 0) {
            return true;
        }
        if (j < 0) {
            j = ((j & Long.MAX_VALUE) % j3) + (Long.MAX_VALUE % j3) + 1;
        }
        return j % j3 < j2;
    }

    public static boolean c(Context context) {
        Boolean bool = g;
        if (bool == null) {
            bool = Boolean.valueOf(ryc.a(context).a.checkCallingOrSelfPermission("com.google.android.providers.gsf.permission.READ_GSERVICES") == 0);
            g = bool;
        }
        return bool.booleanValue();
    }

    public static long d(Context context) {
        Object obj;
        long j = 0;
        Long l = 0L;
        Long l2 = h;
        if (l2 != null) {
            l = l2;
        } else {
            if (context == null) {
                return 0L;
            }
            if (c(context)) {
                ContentResolver contentResolver = context.getContentResolver();
                Uri uri = qhf.a;
                synchronized (qhf.class) {
                    qhf.c(contentResolver);
                    obj = qhf.k;
                }
                HashMap hashMap = qhf.i;
                Long l3 = (Long) qhf.a(hashMap, "android_id", l);
                if (l3 != null) {
                    j = l3.longValue();
                } else {
                    String b2 = qhf.b(contentResolver, "android_id");
                    if (b2 != null) {
                        try {
                            long parseLong = Long.parseLong(b2);
                            l3 = Long.valueOf(parseLong);
                            j = parseLong;
                        } catch (NumberFormatException unused) {
                        }
                    }
                    qhf.e(obj, hashMap, "android_id", l3);
                }
                l = Long.valueOf(j);
            }
            h = l;
        }
        return l.longValue();
    }
}
