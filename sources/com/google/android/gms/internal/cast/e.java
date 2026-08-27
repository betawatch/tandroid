package com.google.android.gms.internal.cast;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.HashMap;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public abstract class e {
    public static final r5.b a = new r5.b("CastDynamiteModule", null);

    public static n5.o a(Context context, n5.b bVar, p pVar, HashMap hashMap) {
        n5.o mVar;
        g b10 = b(context);
        i6.b bVar2 = new i6.b(context.getApplicationContext());
        Parcel M0 = b10.M0();
        t.d(M0, bVar2);
        t.c(M0, bVar);
        t.d(M0, pVar);
        M0.writeMap(hashMap);
        Parcel O0 = b10.O0(M0, 1);
        IBinder readStrongBinder = O0.readStrongBinder();
        int i10 = n5.n.b;
        if (readStrongBinder == null) {
            mVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.ICastContext");
            mVar = queryLocalInterface instanceof n5.o ? (n5.o) queryLocalInterface : new n5.m(readStrongBinder, "com.google.android.gms.cast.framework.ICastContext", 1);
        }
        O0.recycle();
        return mVar;
    }

    public static g b(Context context) {
        try {
            IBinder b10 = j6.e.c(context, j6.e.b, "com.google.android.gms.cast.framework.dynamite").b("com.google.android.gms.cast.framework.internal.CastDynamiteModuleImpl");
            if (b10 == null) {
                return null;
            }
            IInterface queryLocalInterface = b10.queryLocalInterface("com.google.android.gms.cast.framework.internal.ICastDynamiteModule");
            return queryLocalInterface instanceof g ? (g) queryLocalInterface : new g(b10, "com.google.android.gms.cast.framework.internal.ICastDynamiteModule", 1);
        } catch (j6.b e9) {
            throw new n5.d(e9);
        }
    }
}
