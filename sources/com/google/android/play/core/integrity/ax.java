package com.google.android.play.core.integrity;

import android.content.Context;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
final class ax {
    private static aw a;

    public static synchronized aw a(Context context) {
        aw awVar;
        synchronized (ax.class) {
            try {
                if (a == null) {
                    u uVar = new u(null);
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                    uVar.a(context);
                    a = uVar.b();
                }
                awVar = a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return awVar;
    }
}
