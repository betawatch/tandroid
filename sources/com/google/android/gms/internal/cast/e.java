package com.google.android.gms.internal.cast;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.HashMap;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class e {
    public static final s5.b a = new s5.b("CastDynamiteModule", null);

    public static p5.n a(Context context, p5.b bVar, q qVar, HashMap hashMap) {
        p5.n lVar;
        g b10 = b(context);
        j6.b bVar2 = new j6.b(context.getApplicationContext());
        Parcel M0 = b10.M0();
        u.d(M0, bVar2);
        u.c(M0, bVar);
        u.d(M0, qVar);
        M0.writeMap(hashMap);
        Parcel O0 = b10.O0(M0, 1);
        IBinder readStrongBinder = O0.readStrongBinder();
        int i10 = p5.m.b;
        if (readStrongBinder == null) {
            lVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.ICastContext");
            lVar = queryLocalInterface instanceof p5.n ? (p5.n) queryLocalInterface : new p5.l(readStrongBinder, "com.google.android.gms.cast.framework.ICastContext", 0);
        }
        O0.recycle();
        return lVar;
    }

    public static g b(Context context) {
        try {
            IBinder b10 = k6.e.c(context, k6.e.b, "com.google.android.gms.cast.framework.dynamite").b("com.google.android.gms.cast.framework.internal.CastDynamiteModuleImpl");
            if (b10 == null) {
                return null;
            }
            IInterface queryLocalInterface = b10.queryLocalInterface("com.google.android.gms.cast.framework.internal.ICastDynamiteModule");
            return queryLocalInterface instanceof g ? (g) queryLocalInterface : new g(b10, "com.google.android.gms.cast.framework.internal.ICastDynamiteModule", 0);
        } catch (k6.b e10) {
            throw new p5.d(e10);
        }
    }
}
