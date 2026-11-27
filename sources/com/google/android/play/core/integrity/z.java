package com.google.android.play.core.integrity;

import android.content.Context;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
final class z {
    private static s a;

    public static synchronized s a(Context context) {
        s sVar;
        synchronized (z.class) {
            sVar = a;
            if (sVar == null) {
                q qVar = new q(null);
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    context = applicationContext;
                }
                qVar.a(context);
                sVar = qVar.b();
                a = sVar;
            }
        }
        return sVar;
    }
}
