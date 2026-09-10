package com.google.android.gms.internal.cast;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class g extends a9.a {
    public final d6.q W0(d6.b bVar, x6.a aVar, d6.j jVar) {
        d6.q oVar;
        Parcel O0 = O0();
        v.c(O0, bVar);
        v.d(O0, aVar);
        v.d(O0, jVar);
        Parcel Q0 = Q0(O0, 3);
        IBinder readStrongBinder = Q0.readStrongBinder();
        int i10 = d6.p.b;
        if (readStrongBinder == null) {
            oVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.ICastSession");
            oVar = queryLocalInterface instanceof d6.q ? (d6.q) queryLocalInterface : new d6.o(readStrongBinder, "com.google.android.gms.cast.framework.ICastSession", 1);
        }
        Q0.recycle();
        return oVar;
    }

    public final d6.u X0(x6.b bVar, x6.a aVar, x6.a aVar2) {
        d6.u sVar;
        Parcel O0 = O0();
        v.d(O0, bVar);
        v.d(O0, aVar);
        v.d(O0, aVar2);
        Parcel Q0 = Q0(O0, 5);
        IBinder readStrongBinder = Q0.readStrongBinder();
        int i10 = d6.t.b;
        if (readStrongBinder == null) {
            sVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.IReconnectionService");
            sVar = queryLocalInterface instanceof d6.u ? (d6.u) queryLocalInterface : new d6.s(readStrongBinder, "com.google.android.gms.cast.framework.IReconnectionService", 1);
        }
        Q0.recycle();
        return sVar;
    }

    public final d6.x Y0(String str, String str2, d6.j jVar) {
        d6.x vVar;
        Parcel O0 = O0();
        O0.writeString(str);
        O0.writeString(str2);
        v.d(O0, jVar);
        Parcel Q0 = Q0(O0, 2);
        IBinder readStrongBinder = Q0.readStrongBinder();
        int i10 = d6.w.b;
        if (readStrongBinder == null) {
            vVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.ISession");
            vVar = queryLocalInterface instanceof d6.x ? (d6.x) queryLocalInterface : new d6.v(readStrongBinder, "com.google.android.gms.cast.framework.ISession", 1);
        }
        Q0.recycle();
        return vVar;
    }

    public final f6.e Z0(x6.b bVar, d6.j jVar, int i10, int i11) {
        f6.e cVar;
        Parcel O0 = O0();
        v.d(O0, bVar);
        v.d(O0, jVar);
        O0.writeInt(i10);
        O0.writeInt(i11);
        O0.writeInt(0);
        O0.writeLong(2097152L);
        O0.writeInt(5);
        O0.writeInt(333);
        O0.writeInt(10000);
        Parcel Q0 = Q0(O0, 6);
        IBinder readStrongBinder = Q0.readStrongBinder();
        int i12 = f6.d.b;
        if (readStrongBinder == null) {
            cVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask");
            cVar = queryLocalInterface instanceof f6.e ? (f6.e) queryLocalInterface : new f6.c(readStrongBinder, "com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask", 1);
        }
        Q0.recycle();
        return cVar;
    }

    public final f6.e a1(x6.b bVar, x6.b bVar2, d6.j jVar, int i10, int i11) {
        f6.e cVar;
        Parcel O0 = O0();
        v.d(O0, bVar);
        v.d(O0, bVar2);
        v.d(O0, jVar);
        O0.writeInt(i10);
        O0.writeInt(i11);
        O0.writeInt(0);
        O0.writeLong(2097152L);
        O0.writeInt(5);
        O0.writeInt(333);
        O0.writeInt(10000);
        Parcel Q0 = Q0(O0, 7);
        IBinder readStrongBinder = Q0.readStrongBinder();
        int i12 = f6.d.b;
        if (readStrongBinder == null) {
            cVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask");
            cVar = queryLocalInterface instanceof f6.e ? (f6.e) queryLocalInterface : new f6.c(readStrongBinder, "com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask", 1);
        }
        Q0.recycle();
        return cVar;
    }
}
