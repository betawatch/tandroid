package com.google.android.play.core.integrity;

import android.content.Context;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
