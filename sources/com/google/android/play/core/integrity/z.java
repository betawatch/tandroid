package com.google.android.play.core.integrity;

import android.content.Context;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
final class z {
    private static s a;

    public static synchronized s a(Context context) {
        s sVar;
        synchronized (z.class) {
            try {
                if (a == null) {
                    q qVar = new q(null);
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                    qVar.a(context);
                    a = qVar.b();
                }
                sVar = a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return sVar;
    }
}
