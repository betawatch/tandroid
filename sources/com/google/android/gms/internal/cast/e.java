package com.google.android.gms.internal.cast;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.HashMap;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public abstract class e {
    public static final g6.b a = new g6.b("CastDynamiteModule", null);

    public static d6.n a(Context context, d6.b bVar, r rVar, HashMap hashMap) {
        d6.n lVar;
        g b10 = b(context);
        x6.b bVar2 = new x6.b(context.getApplicationContext());
        Parcel N0 = b10.N0();
        v.d(N0, bVar2);
        v.c(N0, bVar);
        v.d(N0, rVar);
        N0.writeMap(hashMap);
        Parcel P0 = b10.P0(N0, 1);
        IBinder readStrongBinder = P0.readStrongBinder();
        int i10 = d6.m.b;
        if (readStrongBinder == null) {
            lVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.ICastContext");
            lVar = queryLocalInterface instanceof d6.n ? (d6.n) queryLocalInterface : new d6.l(readStrongBinder, "com.google.android.gms.cast.framework.ICastContext", 1);
        }
        P0.recycle();
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
        } catch (y6.b e7) {
            throw new d6.d(e7);
        }
    }
}
