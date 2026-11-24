package com.google.android.play.core.integrity;

import android.content.Context;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
