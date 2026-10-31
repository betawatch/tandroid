package i8;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class e extends a9.a {
    public final a X0() {
        a aVar;
        Parcel O0 = O0(P0(), 4);
        IBinder readStrongBinder = O0.readStrongBinder();
        if (readStrongBinder == null) {
            aVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            aVar = queryLocalInterface instanceof a ? (a) queryLocalInterface : new a(readStrongBinder, "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate", 9);
        }
        O0.recycle();
        return aVar;
    }

    public final g Y0(x6.b bVar) {
        g gVar;
        Parcel P0 = P0();
        s7.b.c(P0, bVar);
        P0.writeInt(0);
        Parcel O0 = O0(P0, 3);
        IBinder readStrongBinder = O0.readStrongBinder();
        if (readStrongBinder == null) {
            gVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
            gVar = queryLocalInterface instanceof g ? (g) queryLocalInterface : new g(readStrongBinder, "com.google.android.gms.maps.internal.IMapViewDelegate", 9);
        }
        O0.recycle();
        return gVar;
    }

    public final s7.e Z0() {
        s7.e cVar;
        Parcel O0 = O0(P0(), 5);
        IBinder readStrongBinder = O0.readStrongBinder();
        int i10 = s7.d.b;
        if (readStrongBinder == null) {
            cVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
            cVar = queryLocalInterface instanceof s7.e ? (s7.e) queryLocalInterface : new s7.c(readStrongBinder, "com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate", 9);
        }
        O0.recycle();
        return cVar;
    }
}
