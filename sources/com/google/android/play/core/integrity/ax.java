package com.google.android.play.core.integrity;

import android.content.Context;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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
