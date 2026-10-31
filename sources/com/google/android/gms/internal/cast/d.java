package com.google.android.gms.internal.cast;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.HashMap;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class d {
    public static final g6.b a = new g6.b("CastDynamiteModule", null);

    public static d6.n a(Context context, d6.b bVar, q qVar, HashMap hashMap) {
        d6.n lVar;
        f b10 = b(context);
        x6.b bVar2 = new x6.b(context.getApplicationContext());
        Parcel P0 = b10.P0();
        u.d(P0, bVar2);
        u.c(P0, bVar);
        u.d(P0, qVar);
        P0.writeMap(hashMap);
        Parcel R0 = b10.R0(P0, 1);
        IBinder readStrongBinder = R0.readStrongBinder();
        int i10 = d6.m.b;
        if (readStrongBinder == null) {
            lVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.ICastContext");
            lVar = queryLocalInterface instanceof d6.n ? (d6.n) queryLocalInterface : new d6.l(readStrongBinder, "com.google.android.gms.cast.framework.ICastContext", 1);
        }
        R0.recycle();
        return lVar;
    }

    public static f b(Context context) {
        try {
            IBinder b10 = y6.e.c(context, y6.e.b, "com.google.android.gms.cast.framework.dynamite").b("com.google.android.gms.cast.framework.internal.CastDynamiteModuleImpl");
            if (b10 == null) {
                return null;
            }
            IInterface queryLocalInterface = b10.queryLocalInterface("com.google.android.gms.cast.framework.internal.ICastDynamiteModule");
            return queryLocalInterface instanceof f ? (f) queryLocalInterface : new f(b10, "com.google.android.gms.cast.framework.internal.ICastDynamiteModule", 1);
        } catch (y6.b e) {
            throw new d6.d(e);
        }
    }
}
