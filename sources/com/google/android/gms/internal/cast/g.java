package com.google.android.gms.internal.cast;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class g extends c7.a {
    public final n5.r U0(n5.b bVar, i6.a aVar, n5.k kVar) {
        n5.r pVar;
        Parcel M0 = M0();
        t.c(M0, bVar);
        t.d(M0, aVar);
        t.d(M0, kVar);
        Parcel O0 = O0(M0, 3);
        IBinder readStrongBinder = O0.readStrongBinder();
        int i10 = n5.q.b;
        if (readStrongBinder == null) {
            pVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.ICastSession");
            pVar = queryLocalInterface instanceof n5.r ? (n5.r) queryLocalInterface : new n5.p(readStrongBinder, "com.google.android.gms.cast.framework.ICastSession", 1);
        }
        O0.recycle();
        return pVar;
    }

    public final n5.v V0(i6.b bVar, i6.a aVar, i6.a aVar2) {
        n5.v tVar;
        Parcel M0 = M0();
        t.d(M0, bVar);
        t.d(M0, aVar);
        t.d(M0, aVar2);
        Parcel O0 = O0(M0, 5);
        IBinder readStrongBinder = O0.readStrongBinder();
        int i10 = n5.u.b;
        if (readStrongBinder == null) {
            tVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.IReconnectionService");
            tVar = queryLocalInterface instanceof n5.v ? (n5.v) queryLocalInterface : new n5.t(readStrongBinder, "com.google.android.gms.cast.framework.IReconnectionService", 1);
        }
        O0.recycle();
        return tVar;
    }

    public final n5.y W0(String str, String str2, n5.k kVar) {
        n5.y wVar;
        Parcel M0 = M0();
        M0.writeString(str);
        M0.writeString(str2);
        t.d(M0, kVar);
        Parcel O0 = O0(M0, 2);
        IBinder readStrongBinder = O0.readStrongBinder();
        int i10 = n5.x.b;
        if (readStrongBinder == null) {
            wVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.ISession");
            wVar = queryLocalInterface instanceof n5.y ? (n5.y) queryLocalInterface : new n5.w(readStrongBinder, "com.google.android.gms.cast.framework.ISession", 1);
        }
        O0.recycle();
        return wVar;
    }

    public final p5.e X0(i6.b bVar, n5.k kVar, int i10, int i11) {
        p5.e cVar;
        Parcel M0 = M0();
        t.d(M0, bVar);
        t.d(M0, kVar);
        M0.writeInt(i10);
        M0.writeInt(i11);
        M0.writeInt(0);
        M0.writeLong(2097152L);
        M0.writeInt(5);
        M0.writeInt(333);
        M0.writeInt(10000);
        Parcel O0 = O0(M0, 6);
        IBinder readStrongBinder = O0.readStrongBinder();
        int i12 = p5.d.b;
        if (readStrongBinder == null) {
            cVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask");
            cVar = queryLocalInterface instanceof p5.e ? (p5.e) queryLocalInterface : new p5.c(readStrongBinder, "com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask", 1);
        }
        O0.recycle();
        return cVar;
    }

    public final p5.e Y0(i6.b bVar, i6.b bVar2, n5.k kVar, int i10, int i11) {
        p5.e cVar;
        Parcel M0 = M0();
        t.d(M0, bVar);
        t.d(M0, bVar2);
        t.d(M0, kVar);
        M0.writeInt(i10);
        M0.writeInt(i11);
        M0.writeInt(0);
        M0.writeLong(2097152L);
        M0.writeInt(5);
        M0.writeInt(333);
        M0.writeInt(10000);
        Parcel O0 = O0(M0, 7);
        IBinder readStrongBinder = O0.readStrongBinder();
        int i12 = p5.d.b;
        if (readStrongBinder == null) {
            cVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask");
            cVar = queryLocalInterface instanceof p5.e ? (p5.e) queryLocalInterface : new p5.c(readStrongBinder, "com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask", 1);
        }
        O0.recycle();
        return cVar;
    }
}
