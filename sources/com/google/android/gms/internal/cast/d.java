package com.google.android.gms.internal.cast;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.HashMap;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public abstract class d {
    public static final j6.b a = new j6.b("CastDynamiteModule", null);

    public static g6.n a(Context context, g6.b bVar, p pVar, HashMap hashMap) {
        g6.n lVar;
        f b10 = b(context);
        a7.b bVar2 = new a7.b(context.getApplicationContext());
        Parcel P0 = b10.P0();
        t.d(P0, bVar2);
        t.c(P0, bVar);
        t.d(P0, pVar);
        P0.writeMap(hashMap);
        Parcel R0 = b10.R0(P0, 1);
        IBinder readStrongBinder = R0.readStrongBinder();
        int i7 = g6.m.b;
        if (readStrongBinder == null) {
            lVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.ICastContext");
            lVar = queryLocalInterface instanceof g6.n ? (g6.n) queryLocalInterface : new g6.l(readStrongBinder, "com.google.android.gms.cast.framework.ICastContext", 2);
        }
        R0.recycle();
        return lVar;
    }

    public static f b(Context context) {
        try {
            IBinder b10 = b7.f.c(context, b7.f.b, "com.google.android.gms.cast.framework.dynamite").b("com.google.android.gms.cast.framework.internal.CastDynamiteModuleImpl");
            if (b10 == null) {
                return null;
            }
            IInterface queryLocalInterface = b10.queryLocalInterface("com.google.android.gms.cast.framework.internal.ICastDynamiteModule");
            return queryLocalInterface instanceof f ? (f) queryLocalInterface : new f(b10, "com.google.android.gms.cast.framework.internal.ICastDynamiteModule", 2);
        } catch (b7.b e10) {
            throw new g6.d(e10);
        }
    }
}
