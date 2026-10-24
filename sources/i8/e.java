package i8;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final class e extends a9.a {
    public final a V0() {
        a aVar;
        Parcel M0 = M0(N0(), 4);
        IBinder readStrongBinder = M0.readStrongBinder();
        if (readStrongBinder == null) {
            aVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            aVar = queryLocalInterface instanceof a ? (a) queryLocalInterface : new a(readStrongBinder, "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate", 9);
        }
        M0.recycle();
        return aVar;
    }

    public final g W0(x6.b bVar) {
        g gVar;
        Parcel N0 = N0();
        s7.b.c(N0, bVar);
        N0.writeInt(0);
        Parcel M0 = M0(N0, 3);
        IBinder readStrongBinder = M0.readStrongBinder();
        if (readStrongBinder == null) {
            gVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
            gVar = queryLocalInterface instanceof g ? (g) queryLocalInterface : new g(readStrongBinder, "com.google.android.gms.maps.internal.IMapViewDelegate", 9);
        }
        M0.recycle();
        return gVar;
    }

    public final s7.e X0() {
        s7.e cVar;
        Parcel M0 = M0(N0(), 5);
        IBinder readStrongBinder = M0.readStrongBinder();
        int i10 = s7.d.b;
        if (readStrongBinder == null) {
            cVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
            cVar = queryLocalInterface instanceof s7.e ? (s7.e) queryLocalInterface : new s7.c(readStrongBinder, "com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate", 9);
        }
        M0.recycle();
        return cVar;
    }
}
