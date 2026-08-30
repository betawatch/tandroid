package com.google.android.gms.internal.cast;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class f extends a7.a {
    public final r5.q U0(r5.b bVar, l6.a aVar, r5.j jVar) {
        r5.q oVar;
        Parcel M0 = M0();
        t.c(M0, bVar);
        t.d(M0, aVar);
        t.d(M0, jVar);
        Parcel O0 = O0(M0, 3);
        IBinder readStrongBinder = O0.readStrongBinder();
        int i10 = r5.p.b;
        if (readStrongBinder == null) {
            oVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.ICastSession");
            oVar = queryLocalInterface instanceof r5.q ? (r5.q) queryLocalInterface : new r5.o(readStrongBinder, "com.google.android.gms.cast.framework.ICastSession", 1);
        }
        O0.recycle();
        return oVar;
    }

    public final r5.u V0(l6.b bVar, l6.a aVar, l6.a aVar2) {
        r5.u sVar;
        Parcel M0 = M0();
        t.d(M0, bVar);
        t.d(M0, aVar);
        t.d(M0, aVar2);
        Parcel O0 = O0(M0, 5);
        IBinder readStrongBinder = O0.readStrongBinder();
        int i10 = r5.t.b;
        if (readStrongBinder == null) {
            sVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.IReconnectionService");
            sVar = queryLocalInterface instanceof r5.u ? (r5.u) queryLocalInterface : new r5.s(readStrongBinder, "com.google.android.gms.cast.framework.IReconnectionService", 1);
        }
        O0.recycle();
        return sVar;
    }

    public final r5.x W0(String str, String str2, r5.j jVar) {
        r5.x vVar;
        Parcel M0 = M0();
        M0.writeString(str);
        M0.writeString(str2);
        t.d(M0, jVar);
        Parcel O0 = O0(M0, 2);
        IBinder readStrongBinder = O0.readStrongBinder();
        int i10 = r5.w.b;
        if (readStrongBinder == null) {
            vVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.ISession");
            vVar = queryLocalInterface instanceof r5.x ? (r5.x) queryLocalInterface : new r5.v(readStrongBinder, "com.google.android.gms.cast.framework.ISession", 1);
        }
        O0.recycle();
        return vVar;
    }

    public final t5.e X0(l6.b bVar, r5.j jVar, int i10, int i11) {
        t5.e cVar;
        Parcel M0 = M0();
        t.d(M0, bVar);
        t.d(M0, jVar);
        M0.writeInt(i10);
        M0.writeInt(i11);
        M0.writeInt(0);
        M0.writeLong(2097152L);
        M0.writeInt(5);
        M0.writeInt(333);
        M0.writeInt(10000);
        Parcel O0 = O0(M0, 6);
        IBinder readStrongBinder = O0.readStrongBinder();
        int i12 = t5.d.b;
        if (readStrongBinder == null) {
            cVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask");
            cVar = queryLocalInterface instanceof t5.e ? (t5.e) queryLocalInterface : new t5.c(readStrongBinder, "com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask", 1);
        }
        O0.recycle();
        return cVar;
    }

    public final t5.e Y0(l6.b bVar, l6.b bVar2, r5.j jVar, int i10, int i11) {
        t5.e cVar;
        Parcel M0 = M0();
        t.d(M0, bVar);
        t.d(M0, bVar2);
        t.d(M0, jVar);
        M0.writeInt(i10);
        M0.writeInt(i11);
        M0.writeInt(0);
        M0.writeLong(2097152L);
        M0.writeInt(5);
        M0.writeInt(333);
        M0.writeInt(10000);
        Parcel O0 = O0(M0, 7);
        IBinder readStrongBinder = O0.readStrongBinder();
        int i12 = t5.d.b;
        if (readStrongBinder == null) {
            cVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask");
            cVar = queryLocalInterface instanceof t5.e ? (t5.e) queryLocalInterface : new t5.c(readStrongBinder, "com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask", 1);
        }
        O0.recycle();
        return cVar;
    }
}
