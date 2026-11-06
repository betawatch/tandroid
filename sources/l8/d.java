package l8;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class d extends a8.a {
    public final a X0() {
        a aVar;
        Parcel O0 = O0(P0(), 4);
        IBinder readStrongBinder = O0.readStrongBinder();
        if (readStrongBinder == null) {
            aVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            aVar = queryLocalInterface instanceof a ? (a) queryLocalInterface : new a(readStrongBinder, "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate", 11);
        }
        O0.recycle();
        return aVar;
    }

    public final f Y0(a7.b bVar) {
        f fVar;
        Parcel P0 = P0();
        v7.b.c(P0, bVar);
        P0.writeInt(0);
        Parcel O0 = O0(P0, 3);
        IBinder readStrongBinder = O0.readStrongBinder();
        if (readStrongBinder == null) {
            fVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
            fVar = queryLocalInterface instanceof f ? (f) queryLocalInterface : new f(readStrongBinder, "com.google.android.gms.maps.internal.IMapViewDelegate", 11);
        }
        O0.recycle();
        return fVar;
    }

    public final v7.e Z0() {
        v7.e cVar;
        Parcel O0 = O0(P0(), 5);
        IBinder readStrongBinder = O0.readStrongBinder();
        int i7 = v7.d.b;
        if (readStrongBinder == null) {
            cVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
            cVar = queryLocalInterface instanceof v7.e ? (v7.e) queryLocalInterface : new v7.c(readStrongBinder, "com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate", 11);
        }
        O0.recycle();
        return cVar;
    }
}
