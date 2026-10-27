package com.google.android.gms.internal.cast;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class f extends a8.a {
    public final e6.q V0(e6.b bVar, y6.a aVar, e6.j jVar) {
        e6.q oVar;
        Parcel N0 = N0();
        t.c(N0, bVar);
        t.d(N0, aVar);
        t.d(N0, jVar);
        Parcel P0 = P0(N0, 3);
        IBinder readStrongBinder = P0.readStrongBinder();
        int i10 = e6.p.b;
        if (readStrongBinder == null) {
            oVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.ICastSession");
            oVar = queryLocalInterface instanceof e6.q ? (e6.q) queryLocalInterface : new e6.o(readStrongBinder, "com.google.android.gms.cast.framework.ICastSession", 2);
        }
        P0.recycle();
        return oVar;
    }

    public final e6.u W0(y6.b bVar, y6.a aVar, y6.a aVar2) {
        e6.u sVar;
        Parcel N0 = N0();
        t.d(N0, bVar);
        t.d(N0, aVar);
        t.d(N0, aVar2);
        Parcel P0 = P0(N0, 5);
        IBinder readStrongBinder = P0.readStrongBinder();
        int i10 = e6.t.b;
        if (readStrongBinder == null) {
            sVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.IReconnectionService");
            sVar = queryLocalInterface instanceof e6.u ? (e6.u) queryLocalInterface : new e6.s(readStrongBinder, "com.google.android.gms.cast.framework.IReconnectionService", 2);
        }
        P0.recycle();
        return sVar;
    }

    public final e6.x X0(String str, String str2, e6.j jVar) {
        e6.x vVar;
        Parcel N0 = N0();
        N0.writeString(str);
        N0.writeString(str2);
        t.d(N0, jVar);
        Parcel P0 = P0(N0, 2);
        IBinder readStrongBinder = P0.readStrongBinder();
        int i10 = e6.w.b;
        if (readStrongBinder == null) {
            vVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.ISession");
            vVar = queryLocalInterface instanceof e6.x ? (e6.x) queryLocalInterface : new e6.v(readStrongBinder, "com.google.android.gms.cast.framework.ISession", 2);
        }
        P0.recycle();
        return vVar;
    }

    public final g6.e Y0(y6.b bVar, e6.j jVar, int i10, int i11) {
        g6.e cVar;
        Parcel N0 = N0();
        t.d(N0, bVar);
        t.d(N0, jVar);
        N0.writeInt(i10);
        N0.writeInt(i11);
        N0.writeInt(0);
        N0.writeLong(2097152L);
        N0.writeInt(5);
        N0.writeInt(333);
        N0.writeInt(10000);
        Parcel P0 = P0(N0, 6);
        IBinder readStrongBinder = P0.readStrongBinder();
        int i12 = g6.d.b;
        if (readStrongBinder == null) {
            cVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask");
            cVar = queryLocalInterface instanceof g6.e ? (g6.e) queryLocalInterface : new g6.c(readStrongBinder, "com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask", 2);
        }
        P0.recycle();
        return cVar;
    }

    public final g6.e Z0(y6.b bVar, y6.b bVar2, e6.j jVar, int i10, int i11) {
        g6.e cVar;
        Parcel N0 = N0();
        t.d(N0, bVar);
        t.d(N0, bVar2);
        t.d(N0, jVar);
        N0.writeInt(i10);
        N0.writeInt(i11);
        N0.writeInt(0);
        N0.writeLong(2097152L);
        N0.writeInt(5);
        N0.writeInt(333);
        N0.writeInt(10000);
        Parcel P0 = P0(N0, 7);
        IBinder readStrongBinder = P0.readStrongBinder();
        int i12 = g6.d.b;
        if (readStrongBinder == null) {
            cVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask");
            cVar = queryLocalInterface instanceof g6.e ? (g6.e) queryLocalInterface : new g6.c(readStrongBinder, "com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask", 2);
        }
        P0.recycle();
        return cVar;
    }
}
