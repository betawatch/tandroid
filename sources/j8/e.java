package j8;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class e extends a8.a {
    public final a V0() {
        a aVar;
        Parcel M0 = M0(N0(), 4);
        IBinder readStrongBinder = M0.readStrongBinder();
        if (readStrongBinder == null) {
            aVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            aVar = queryLocalInterface instanceof a ? (a) queryLocalInterface : new a(readStrongBinder, "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate", 10);
        }
        M0.recycle();
        return aVar;
    }

    public final g W0(y6.b bVar) {
        g gVar;
        Parcel N0 = N0();
        t7.b.c(N0, bVar);
        N0.writeInt(0);
        Parcel M0 = M0(N0, 3);
        IBinder readStrongBinder = M0.readStrongBinder();
        if (readStrongBinder == null) {
            gVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
            gVar = queryLocalInterface instanceof g ? (g) queryLocalInterface : new g(readStrongBinder, "com.google.android.gms.maps.internal.IMapViewDelegate", 10);
        }
        M0.recycle();
        return gVar;
    }

    public final t7.e X0() {
        t7.e cVar;
        Parcel M0 = M0(N0(), 5);
        IBinder readStrongBinder = M0.readStrongBinder();
        int i10 = t7.d.b;
        if (readStrongBinder == null) {
            cVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
            cVar = queryLocalInterface instanceof t7.e ? (t7.e) queryLocalInterface : new t7.c(readStrongBinder, "com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate", 10);
        }
        M0.recycle();
        return cVar;
    }
}
