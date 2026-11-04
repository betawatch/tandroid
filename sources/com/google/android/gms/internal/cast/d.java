package com.google.android.gms.internal.cast;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.HashMap;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class d {
    public static final i6.b a = new i6.b("CastDynamiteModule", null);

    public static f6.n a(Context context, f6.b bVar, q qVar, HashMap hashMap) {
        f6.n lVar;
        f b10 = b(context);
        z6.b bVar2 = new z6.b(context.getApplicationContext());
        Parcel P0 = b10.P0();
        u.d(P0, bVar2);
        u.c(P0, bVar);
        u.d(P0, qVar);
        P0.writeMap(hashMap);
        Parcel R0 = b10.R0(P0, 1);
        IBinder readStrongBinder = R0.readStrongBinder();
        int i3 = f6.m.b;
        if (readStrongBinder == null) {
            lVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.ICastContext");
            lVar = queryLocalInterface instanceof f6.n ? (f6.n) queryLocalInterface : new f6.l(readStrongBinder, "com.google.android.gms.cast.framework.ICastContext", 2);
        }
        R0.recycle();
        return lVar;
    }

    public static f b(Context context) {
        try {
            IBinder b10 = a7.f.c(context, a7.f.b, "com.google.android.gms.cast.framework.dynamite").b("com.google.android.gms.cast.framework.internal.CastDynamiteModuleImpl");
            if (b10 == null) {
                return null;
            }
            IInterface queryLocalInterface = b10.queryLocalInterface("com.google.android.gms.cast.framework.internal.ICastDynamiteModule");
            return queryLocalInterface instanceof f ? (f) queryLocalInterface : new f(b10, "com.google.android.gms.cast.framework.internal.ICastDynamiteModule", 2);
        } catch (a7.b e10) {
            throw new f6.d(e10);
        }
    }
}
