package com.google.android.gms.internal.cast;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import org.telegram.messenger.hs;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class f extends b8.a {
    public final f6.q X0(f6.b bVar, z6.a aVar, f6.j jVar) {
        f6.q oVar;
        Parcel P0 = P0();
        u.c(P0, bVar);
        u.d(P0, aVar);
        u.d(P0, jVar);
        Parcel R0 = R0(P0, 3);
        IBinder readStrongBinder = R0.readStrongBinder();
        int i3 = f6.p.b;
        if (readStrongBinder == null) {
            oVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.ICastSession");
            oVar = queryLocalInterface instanceof f6.q ? (f6.q) queryLocalInterface : new f6.o(readStrongBinder, "com.google.android.gms.cast.framework.ICastSession", 2);
        }
        R0.recycle();
        return oVar;
    }

    public final f6.u Y0(z6.b bVar, z6.a aVar, z6.a aVar2) {
        f6.u sVar;
        Parcel P0 = P0();
        u.d(P0, bVar);
        u.d(P0, aVar);
        u.d(P0, aVar2);
        Parcel R0 = R0(P0, 5);
        IBinder readStrongBinder = R0.readStrongBinder();
        int i3 = f6.t.b;
        if (readStrongBinder == null) {
            sVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.IReconnectionService");
            sVar = queryLocalInterface instanceof f6.u ? (f6.u) queryLocalInterface : new f6.s(readStrongBinder, "com.google.android.gms.cast.framework.IReconnectionService", 2);
        }
        R0.recycle();
        return sVar;
    }

    public final f6.x Z0(String str, String str2, f6.j jVar) {
        f6.x vVar;
        Parcel P0 = P0();
        P0.writeString(str);
        P0.writeString(str2);
        u.d(P0, jVar);
        Parcel R0 = R0(P0, 2);
        IBinder readStrongBinder = R0.readStrongBinder();
        int i3 = f6.w.b;
        if (readStrongBinder == null) {
            vVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.ISession");
            vVar = queryLocalInterface instanceof f6.x ? (f6.x) queryLocalInterface : new f6.v(readStrongBinder, "com.google.android.gms.cast.framework.ISession", 2);
        }
        R0.recycle();
        return vVar;
    }

    public final h6.e a1(z6.b bVar, f6.j jVar, int i3, int i10) {
        h6.e cVar;
        Parcel P0 = P0();
        u.d(P0, bVar);
        u.d(P0, jVar);
        P0.writeInt(i3);
        P0.writeInt(i10);
        P0.writeInt(0);
        P0.writeLong(2097152L);
        P0.writeInt(5);
        P0.writeInt(hs.E5);
        P0.writeInt(10000);
        Parcel R0 = R0(P0, 6);
        IBinder readStrongBinder = R0.readStrongBinder();
        int i11 = h6.d.b;
        if (readStrongBinder == null) {
            cVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask");
            cVar = queryLocalInterface instanceof h6.e ? (h6.e) queryLocalInterface : new h6.c(readStrongBinder, "com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask", 2);
        }
        R0.recycle();
        return cVar;
    }

    public final h6.e b1(z6.b bVar, z6.b bVar2, f6.j jVar, int i3, int i10) {
        h6.e cVar;
        Parcel P0 = P0();
        u.d(P0, bVar);
        u.d(P0, bVar2);
        u.d(P0, jVar);
        P0.writeInt(i3);
        P0.writeInt(i10);
        P0.writeInt(0);
        P0.writeLong(2097152L);
        P0.writeInt(5);
        P0.writeInt(hs.E5);
        P0.writeInt(10000);
        Parcel R0 = R0(P0, 7);
        IBinder readStrongBinder = R0.readStrongBinder();
        int i11 = h6.d.b;
        if (readStrongBinder == null) {
            cVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask");
            cVar = queryLocalInterface instanceof h6.e ? (h6.e) queryLocalInterface : new h6.c(readStrongBinder, "com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask", 2);
        }
        R0.recycle();
        return cVar;
    }
}
