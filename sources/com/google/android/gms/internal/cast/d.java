package com.google.android.gms.internal.cast;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.HashMap;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public abstract class d {
    public static final u5.b a = new u5.b("CastDynamiteModule", null);

    public static r5.n a(Context context, r5.b bVar, p pVar, HashMap hashMap) {
        r5.n lVar;
        f b10 = b(context);
        l6.b bVar2 = new l6.b(context.getApplicationContext());
        Parcel M0 = b10.M0();
        t.d(M0, bVar2);
        t.c(M0, bVar);
        t.d(M0, pVar);
        M0.writeMap(hashMap);
        Parcel O0 = b10.O0(M0, 1);
        IBinder readStrongBinder = O0.readStrongBinder();
        int i10 = r5.m.b;
        if (readStrongBinder == null) {
            lVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.ICastContext");
            lVar = queryLocalInterface instanceof r5.n ? (r5.n) queryLocalInterface : new r5.l(readStrongBinder, "com.google.android.gms.cast.framework.ICastContext", 1);
        }
        O0.recycle();
        return lVar;
    }

    public static f b(Context context) {
        try {
            IBinder b10 = m6.e.c(context, m6.e.b, "com.google.android.gms.cast.framework.dynamite").b("com.google.android.gms.cast.framework.internal.CastDynamiteModuleImpl");
            if (b10 == null) {
                return null;
            }
            IInterface queryLocalInterface = b10.queryLocalInterface("com.google.android.gms.cast.framework.internal.ICastDynamiteModule");
            return queryLocalInterface instanceof f ? (f) queryLocalInterface : new f(b10, "com.google.android.gms.cast.framework.internal.ICastDynamiteModule", 1);
        } catch (m6.b e) {
            throw new r5.d(e);
        }
    }
}
