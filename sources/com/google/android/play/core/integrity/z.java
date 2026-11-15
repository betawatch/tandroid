package com.google.android.play.core.integrity;

import android.content.Context;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
