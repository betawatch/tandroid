package com.google.android.gms.internal.clearcut;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import j$.util.concurrent.ConcurrentHashMap;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class a2 {
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

    public a2(Context context) {
        this.a = context;
        if (context != null) {
            d.b(context);
        }
    }

    public static long a(long j10, String str) {
        if (str == null || str.isEmpty()) {
            return l1.h(ByteBuffer.allocate(8).putLong(j10).array());
        }
        byte[] bytes = str.getBytes(b);
        ByteBuffer allocate = ByteBuffer.allocate(bytes.length + 8);
        allocate.put(bytes);
        allocate.putLong(j10);
        return l1.h(allocate.array());
    }

    public static boolean b(long j10, long j11, long j12) {
        if (j11 < 0 || j12 <= 0) {
            return true;
        }
        if (j10 < 0) {
            j10 = ((j10 & Long.MAX_VALUE) % j12) + (Long.MAX_VALUE % j12) + 1;
        }
        return j10 % j12 < j11;
    }

    public static boolean c(Context context) {
        if (g == null) {
            g = Boolean.valueOf(((Context) x6.b.a(context).a).checkCallingOrSelfPermission("com.google.android.providers.gsf.permission.READ_GSERVICES") == 0);
        }
        return g.booleanValue();
    }

    public static long d(Context context) {
        Object obj;
        long j10 = 0;
        if (h == null) {
            if (context == null) {
                return 0L;
            }
            if (c(context)) {
                ContentResolver contentResolver = context.getContentResolver();
                Uri uri = d2.a;
                synchronized (d2.class) {
                    d2.c(contentResolver);
                    obj = d2.k;
                }
                HashMap hashMap = d2.i;
                Long l4 = (Long) d2.a(hashMap, "android_id", 0L);
                if (l4 != null) {
                    j10 = l4.longValue();
                } else {
                    String b10 = d2.b(contentResolver, "android_id");
                    if (b10 != null) {
                        try {
                            long parseLong = Long.parseLong(b10);
                            l4 = Long.valueOf(parseLong);
                            j10 = parseLong;
                        } catch (NumberFormatException unused) {
                        }
                    }
                    d2.e(obj, hashMap, "android_id", l4);
                }
                h = Long.valueOf(j10);
            } else {
                h = 0L;
            }
        }
        return h.longValue();
    }
}
