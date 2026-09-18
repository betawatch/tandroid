package com.google.android.gms.internal.clearcut;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import j$.util.concurrent.ConcurrentHashMap;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class c2 {
    public static final Charset b = Charset.forName("UTF-8");
    public static final i c;
    public static final i d;
    public static final ConcurrentHashMap e;
    public static final HashMap f;
    public static Boolean g;
    public static Long h;
    public static final f i;
    public final Context a;

    static {
        String valueOf = String.valueOf(Uri.encode("com.google.android.gms.clearcut.public"));
        i iVar = new i(Uri.parse(valueOf.length() != 0 ? "content://com.google.android.gms.phenotype/".concat(valueOf) : new String("content://com.google.android.gms.phenotype/")), "gms:playlog:service:samplingrules_", "LogSamplingRules__");
        c = iVar;
        String valueOf2 = String.valueOf(Uri.encode("com.google.android.gms.clearcut.public"));
        d = new i(Uri.parse(valueOf2.length() != 0 ? "content://com.google.android.gms.phenotype/".concat(valueOf2) : new String("content://com.google.android.gms.phenotype/")), "gms:playlog:service:sampling_", "LogSampling__");
        e = new ConcurrentHashMap();
        f = new HashMap();
        g = null;
        h = null;
        i = new f(iVar, "enable_log_sampling_rules", Boolean.FALSE, 0);
    }

    public c2(Context context) {
        this.a = context;
        if (context != null) {
            d.b(context);
        }
    }

    public static long a(long j3, String str) {
        if (str == null || str.isEmpty()) {
            return n1.h(ByteBuffer.allocate(8).putLong(j3).array());
        }
        byte[] bytes = str.getBytes(b);
        ByteBuffer allocate = ByteBuffer.allocate(bytes.length + 8);
        allocate.put(bytes);
        allocate.putLong(j3);
        return n1.h(allocate.array());
    }

    public static boolean b(long j3, long j10, long j11) {
        if (j10 < 0 || j11 <= 0) {
            return true;
        }
        if (j3 < 0) {
            j3 = ((j3 & Long.MAX_VALUE) % j11) + (Long.MAX_VALUE % j11) + 1;
        }
        return j3 % j11 < j10;
    }

    public static boolean c(Context context) {
        if (g == null) {
            g = Boolean.valueOf(w6.b.a(context).a.checkCallingOrSelfPermission("com.google.android.providers.gsf.permission.READ_GSERVICES") == 0);
        }
        return g.booleanValue();
    }

    public static long d(Context context) {
        Object obj;
        long j3 = 0;
        if (h == null) {
            if (context == null) {
                return 0L;
            }
            if (c(context)) {
                ContentResolver contentResolver = context.getContentResolver();
                Uri uri = f2.a;
                synchronized (f2.class) {
                    f2.c(contentResolver);
                    obj = f2.k;
                }
                HashMap hashMap = f2.i;
                Long l4 = (Long) f2.a(hashMap, "android_id", 0L);
                if (l4 != null) {
                    j3 = l4.longValue();
                } else {
                    String b10 = f2.b(contentResolver, "android_id");
                    if (b10 != null) {
                        try {
                            long parseLong = Long.parseLong(b10);
                            l4 = Long.valueOf(parseLong);
                            j3 = parseLong;
                        } catch (NumberFormatException unused) {
                        }
                    }
                    f2.e(obj, hashMap, "android_id", l4);
                }
                h = Long.valueOf(j3);
            } else {
                h = 0L;
            }
        }
        return h.longValue();
    }
}
