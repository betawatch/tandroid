package com.google.android.gms.internal.cast;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.HashMap;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public abstract class d {
    public static final h6.b a = new h6.b("CastDynamiteModule", null);

    public static e6.n a(Context context, e6.b bVar, p pVar, HashMap hashMap) {
        e6.n lVar;
        f b10 = b(context);
        y6.b bVar2 = new y6.b(context.getApplicationContext());
        Parcel N0 = b10.N0();
        t.d(N0, bVar2);
        t.c(N0, bVar);
        t.d(N0, pVar);
        N0.writeMap(hashMap);
        Parcel P0 = b10.P0(N0, 1);
        IBinder readStrongBinder = P0.readStrongBinder();
        int i10 = e6.m.b;
        if (readStrongBinder == null) {
            lVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.ICastContext");
            lVar = queryLocalInterface instanceof e6.n ? (e6.n) queryLocalInterface : new e6.l(readStrongBinder, "com.google.android.gms.cast.framework.ICastContext", 2);
        }
        P0.recycle();
        return lVar;
    }

    public static f b(Context context) {
        try {
            IBinder b10 = z6.e.c(context, z6.e.b, "com.google.android.gms.cast.framework.dynamite").b("com.google.android.gms.cast.framework.internal.CastDynamiteModuleImpl");
            if (b10 == null) {
                return null;
            }
            IInterface queryLocalInterface = b10.queryLocalInterface("com.google.android.gms.cast.framework.internal.ICastDynamiteModule");
            return queryLocalInterface instanceof f ? (f) queryLocalInterface : new f(b10, "com.google.android.gms.cast.framework.internal.ICastDynamiteModule", 2);
        } catch (z6.b e) {
            throw new e6.d(e);
        }
    }
}
