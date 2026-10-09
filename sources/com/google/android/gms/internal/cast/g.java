package com.google.android.gms.internal.cast;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class g extends a9.a {
    public final d6.q V0(d6.b bVar, x6.a aVar, d6.j jVar) {
        d6.q oVar;
        Parcel N0 = N0();
        v.c(N0, bVar);
        v.d(N0, aVar);
        v.d(N0, jVar);
        Parcel P0 = P0(N0, 3);
        IBinder readStrongBinder = P0.readStrongBinder();
        int i10 = d6.p.b;
        if (readStrongBinder == null) {
            oVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.ICastSession");
            oVar = queryLocalInterface instanceof d6.q ? (d6.q) queryLocalInterface : new d6.o(readStrongBinder, "com.google.android.gms.cast.framework.ICastSession", 1);
        }
        P0.recycle();
        return oVar;
    }

    public final d6.u W0(x6.b bVar, x6.a aVar, x6.a aVar2) {
        d6.u sVar;
        Parcel N0 = N0();
        v.d(N0, bVar);
        v.d(N0, aVar);
        v.d(N0, aVar2);
        Parcel P0 = P0(N0, 5);
        IBinder readStrongBinder = P0.readStrongBinder();
        int i10 = d6.t.b;
        if (readStrongBinder == null) {
            sVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.IReconnectionService");
            sVar = queryLocalInterface instanceof d6.u ? (d6.u) queryLocalInterface : new d6.s(readStrongBinder, "com.google.android.gms.cast.framework.IReconnectionService", 1);
        }
        P0.recycle();
        return sVar;
    }

    public final d6.x X0(String str, String str2, d6.j jVar) {
        d6.x vVar;
        Parcel N0 = N0();
        N0.writeString(str);
        N0.writeString(str2);
        v.d(N0, jVar);
        Parcel P0 = P0(N0, 2);
        IBinder readStrongBinder = P0.readStrongBinder();
        int i10 = d6.w.b;
        if (readStrongBinder == null) {
            vVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.ISession");
            vVar = queryLocalInterface instanceof d6.x ? (d6.x) queryLocalInterface : new d6.v(readStrongBinder, "com.google.android.gms.cast.framework.ISession", 1);
        }
        P0.recycle();
        return vVar;
    }

    public final f6.e Y0(x6.b bVar, d6.j jVar, int i10, int i11) {
        f6.e cVar;
        Parcel N0 = N0();
        v.d(N0, bVar);
        v.d(N0, jVar);
        N0.writeInt(i10);
        N0.writeInt(i11);
        N0.writeInt(0);
        N0.writeLong(2097152L);
        N0.writeInt(5);
        N0.writeInt(333);
        N0.writeInt(10000);
        Parcel P0 = P0(N0, 6);
        IBinder readStrongBinder = P0.readStrongBinder();
        int i12 = f6.d.b;
        if (readStrongBinder == null) {
            cVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask");
            cVar = queryLocalInterface instanceof f6.e ? (f6.e) queryLocalInterface : new f6.c(readStrongBinder, "com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask", 1);
        }
        P0.recycle();
        return cVar;
    }

    public final f6.e Z0(x6.b bVar, x6.b bVar2, d6.j jVar, int i10, int i11) {
        f6.e cVar;
        Parcel N0 = N0();
        v.d(N0, bVar);
        v.d(N0, bVar2);
        v.d(N0, jVar);
        N0.writeInt(i10);
        N0.writeInt(i11);
        N0.writeInt(0);
        N0.writeLong(2097152L);
        N0.writeInt(5);
        N0.writeInt(333);
        N0.writeInt(10000);
        Parcel P0 = P0(N0, 7);
        IBinder readStrongBinder = P0.readStrongBinder();
        int i12 = f6.d.b;
        if (readStrongBinder == null) {
            cVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask");
            cVar = queryLocalInterface instanceof f6.e ? (f6.e) queryLocalInterface : new f6.c(readStrongBinder, "com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask", 1);
        }
        P0.recycle();
        return cVar;
    }
}
