package com.google.android.gms.internal.cast;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import org.telegram.messenger.qs;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class f extends a8.a {
    public final g6.q X0(g6.b bVar, a7.a aVar, g6.j jVar) {
        g6.q oVar;
        Parcel P0 = P0();
        t.c(P0, bVar);
        t.d(P0, aVar);
        t.d(P0, jVar);
        Parcel R0 = R0(P0, 3);
        IBinder readStrongBinder = R0.readStrongBinder();
        int i7 = g6.p.b;
        if (readStrongBinder == null) {
            oVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.ICastSession");
            oVar = queryLocalInterface instanceof g6.q ? (g6.q) queryLocalInterface : new g6.o(readStrongBinder, "com.google.android.gms.cast.framework.ICastSession", 2);
        }
        R0.recycle();
        return oVar;
    }

    public final g6.u Y0(a7.b bVar, a7.a aVar, a7.a aVar2) {
        g6.u sVar;
        Parcel P0 = P0();
        t.d(P0, bVar);
        t.d(P0, aVar);
        t.d(P0, aVar2);
        Parcel R0 = R0(P0, 5);
        IBinder readStrongBinder = R0.readStrongBinder();
        int i7 = g6.t.b;
        if (readStrongBinder == null) {
            sVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.IReconnectionService");
            sVar = queryLocalInterface instanceof g6.u ? (g6.u) queryLocalInterface : new g6.s(readStrongBinder, "com.google.android.gms.cast.framework.IReconnectionService", 2);
        }
        R0.recycle();
        return sVar;
    }

    public final g6.x Z0(String str, String str2, g6.j jVar) {
        g6.x vVar;
        Parcel P0 = P0();
        P0.writeString(str);
        P0.writeString(str2);
        t.d(P0, jVar);
        Parcel R0 = R0(P0, 2);
        IBinder readStrongBinder = R0.readStrongBinder();
        int i7 = g6.w.b;
        if (readStrongBinder == null) {
            vVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.ISession");
            vVar = queryLocalInterface instanceof g6.x ? (g6.x) queryLocalInterface : new g6.v(readStrongBinder, "com.google.android.gms.cast.framework.ISession", 2);
        }
        R0.recycle();
        return vVar;
    }

    public final i6.e a1(a7.b bVar, g6.j jVar, int i7, int i10) {
        i6.e cVar;
        Parcel P0 = P0();
        t.d(P0, bVar);
        t.d(P0, jVar);
        P0.writeInt(i7);
        P0.writeInt(i10);
        P0.writeInt(0);
        P0.writeLong(2097152L);
        P0.writeInt(5);
        P0.writeInt(qs.E5);
        P0.writeInt(10000);
        Parcel R0 = R0(P0, 6);
        IBinder readStrongBinder = R0.readStrongBinder();
        int i11 = i6.d.b;
        if (readStrongBinder == null) {
            cVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask");
            cVar = queryLocalInterface instanceof i6.e ? (i6.e) queryLocalInterface : new i6.c(readStrongBinder, "com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask", 2);
        }
        R0.recycle();
        return cVar;
    }

    public final i6.e b1(a7.b bVar, a7.b bVar2, g6.j jVar, int i7, int i10) {
        i6.e cVar;
        Parcel P0 = P0();
        t.d(P0, bVar);
        t.d(P0, bVar2);
        t.d(P0, jVar);
        P0.writeInt(i7);
        P0.writeInt(i10);
        P0.writeInt(0);
        P0.writeLong(2097152L);
        P0.writeInt(5);
        P0.writeInt(qs.E5);
        P0.writeInt(10000);
        Parcel R0 = R0(P0, 7);
        IBinder readStrongBinder = R0.readStrongBinder();
        int i11 = i6.d.b;
        if (readStrongBinder == null) {
            cVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask");
            cVar = queryLocalInterface instanceof i6.e ? (i6.e) queryLocalInterface : new i6.c(readStrongBinder, "com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask", 2);
        }
        R0.recycle();
        return cVar;
    }
}
