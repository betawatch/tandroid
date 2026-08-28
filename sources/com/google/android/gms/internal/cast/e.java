package com.google.android.gms.internal.cast;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.HashMap;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class e {
    public static final q5.b a = new q5.b("CastDynamiteModule", null);

    public static n5.n a(Context context, n5.b bVar, q qVar, HashMap hashMap) {
        n5.n lVar;
        g b10 = b(context);
        h6.b bVar2 = new h6.b(context.getApplicationContext());
        Parcel M0 = b10.M0();
        u.d(M0, bVar2);
        u.c(M0, bVar);
        u.d(M0, qVar);
        M0.writeMap(hashMap);
        Parcel O0 = b10.O0(M0, 1);
        IBinder readStrongBinder = O0.readStrongBinder();
        int i9 = n5.m.b;
        if (readStrongBinder == null) {
            lVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.ICastContext");
            lVar = queryLocalInterface instanceof n5.n ? (n5.n) queryLocalInterface : new n5.l(readStrongBinder, "com.google.android.gms.cast.framework.ICastContext", 2);
        }
        O0.recycle();
        return lVar;
    }

    public static g b(Context context) {
        try {
            IBinder b10 = i6.e.c(context, i6.e.b, "com.google.android.gms.cast.framework.dynamite").b("com.google.android.gms.cast.framework.internal.CastDynamiteModuleImpl");
            if (b10 == null) {
                return null;
            }
            IInterface queryLocalInterface = b10.queryLocalInterface("com.google.android.gms.cast.framework.internal.ICastDynamiteModule");
            return queryLocalInterface instanceof g ? (g) queryLocalInterface : new g(b10, "com.google.android.gms.cast.framework.internal.ICastDynamiteModule", 2);
        } catch (i6.b e10) {
            throw new n5.d(e10);
        }
    }
}
