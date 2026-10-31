package com.google.android.gms.internal.cast;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import org.telegram.messenger.zs;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class f extends a9.a {
    public final d6.q X0(d6.b bVar, x6.a aVar, d6.j jVar) {
        d6.q oVar;
        Parcel P0 = P0();
        u.c(P0, bVar);
        u.d(P0, aVar);
        u.d(P0, jVar);
        Parcel R0 = R0(P0, 3);
        IBinder readStrongBinder = R0.readStrongBinder();
        int i10 = d6.p.b;
        if (readStrongBinder == null) {
            oVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.ICastSession");
            oVar = queryLocalInterface instanceof d6.q ? (d6.q) queryLocalInterface : new d6.o(readStrongBinder, "com.google.android.gms.cast.framework.ICastSession", 1);
        }
        R0.recycle();
        return oVar;
    }

    public final d6.u Y0(x6.b bVar, x6.a aVar, x6.a aVar2) {
        d6.u sVar;
        Parcel P0 = P0();
        u.d(P0, bVar);
        u.d(P0, aVar);
        u.d(P0, aVar2);
        Parcel R0 = R0(P0, 5);
        IBinder readStrongBinder = R0.readStrongBinder();
        int i10 = d6.t.b;
        if (readStrongBinder == null) {
            sVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.IReconnectionService");
            sVar = queryLocalInterface instanceof d6.u ? (d6.u) queryLocalInterface : new d6.s(readStrongBinder, "com.google.android.gms.cast.framework.IReconnectionService", 1);
        }
        R0.recycle();
        return sVar;
    }

    public final d6.x Z0(String str, String str2, d6.j jVar) {
        d6.x vVar;
        Parcel P0 = P0();
        P0.writeString(str);
        P0.writeString(str2);
        u.d(P0, jVar);
        Parcel R0 = R0(P0, 2);
        IBinder readStrongBinder = R0.readStrongBinder();
        int i10 = d6.w.b;
        if (readStrongBinder == null) {
            vVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.ISession");
            vVar = queryLocalInterface instanceof d6.x ? (d6.x) queryLocalInterface : new d6.v(readStrongBinder, "com.google.android.gms.cast.framework.ISession", 1);
        }
        R0.recycle();
        return vVar;
    }

    public final f6.e a1(x6.b bVar, d6.j jVar, int i10, int i11) {
        f6.e cVar;
        Parcel P0 = P0();
        u.d(P0, bVar);
        u.d(P0, jVar);
        P0.writeInt(i10);
        P0.writeInt(i11);
        P0.writeInt(0);
        P0.writeLong(2097152L);
        P0.writeInt(5);
        P0.writeInt(zs.E5);
        P0.writeInt(10000);
        Parcel R0 = R0(P0, 6);
        IBinder readStrongBinder = R0.readStrongBinder();
        int i12 = f6.d.b;
        if (readStrongBinder == null) {
            cVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask");
            cVar = queryLocalInterface instanceof f6.e ? (f6.e) queryLocalInterface : new f6.c(readStrongBinder, "com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask", 1);
        }
        R0.recycle();
        return cVar;
    }

    public final f6.e b1(x6.b bVar, x6.b bVar2, d6.j jVar, int i10, int i11) {
        f6.e cVar;
        Parcel P0 = P0();
        u.d(P0, bVar);
        u.d(P0, bVar2);
        u.d(P0, jVar);
        P0.writeInt(i10);
        P0.writeInt(i11);
        P0.writeInt(0);
        P0.writeLong(2097152L);
        P0.writeInt(5);
        P0.writeInt(zs.E5);
        P0.writeInt(10000);
        Parcel R0 = R0(P0, 7);
        IBinder readStrongBinder = R0.readStrongBinder();
        int i12 = f6.d.b;
        if (readStrongBinder == null) {
            cVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask");
            cVar = queryLocalInterface instanceof f6.e ? (f6.e) queryLocalInterface : new f6.c(readStrongBinder, "com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask", 1);
        }
        R0.recycle();
        return cVar;
    }
}
