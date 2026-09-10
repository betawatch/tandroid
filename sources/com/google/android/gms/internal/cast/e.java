package com.google.android.gms.internal.cast;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.HashMap;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public abstract class e {
    public static final g6.b a = new g6.b("CastDynamiteModule", null);

    public static d6.n a(Context context, d6.b bVar, r rVar, HashMap hashMap) {
        d6.n lVar;
        g b10 = b(context);
        x6.b bVar2 = new x6.b(context.getApplicationContext());
        Parcel O0 = b10.O0();
        v.d(O0, bVar2);
        v.c(O0, bVar);
        v.d(O0, rVar);
        O0.writeMap(hashMap);
        Parcel Q0 = b10.Q0(O0, 1);
        IBinder readStrongBinder = Q0.readStrongBinder();
        int i10 = d6.m.b;
        if (readStrongBinder == null) {
            lVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.ICastContext");
            lVar = queryLocalInterface instanceof d6.n ? (d6.n) queryLocalInterface : new d6.l(readStrongBinder, "com.google.android.gms.cast.framework.ICastContext", 1);
        }
        Q0.recycle();
        return lVar;
    }

    public static g b(Context context) {
        try {
            IBinder b10 = y6.e.c(context, y6.e.b, "com.google.android.gms.cast.framework.dynamite").b("com.google.android.gms.cast.framework.internal.CastDynamiteModuleImpl");
            if (b10 == null) {
                return null;
            }
            IInterface queryLocalInterface = b10.queryLocalInterface("com.google.android.gms.cast.framework.internal.ICastDynamiteModule");
            return queryLocalInterface instanceof g ? (g) queryLocalInterface : new g(b10, "com.google.android.gms.cast.framework.internal.ICastDynamiteModule", 1);
        } catch (y6.b e) {
            throw new d6.d(e);
        }
    }
}
