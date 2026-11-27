package com.google.android.play.core.integrity;

import android.content.Context;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
final class ax {
    private static aw a;

    public static synchronized aw a(Context context) {
        aw awVar;
        synchronized (ax.class) {
            awVar = a;
            if (awVar == null) {
                u uVar = new u(null);
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    context = applicationContext;
                }
                uVar.a(context);
                awVar = uVar.b();
                a = awVar;
            }
        }
        return awVar;
    }
}
