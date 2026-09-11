package i8;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class e extends a9.a {
    public final a W0() {
        a aVar;
        Parcel N0 = N0(O0(), 4);
        IBinder readStrongBinder = N0.readStrongBinder();
        if (readStrongBinder == null) {
            aVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            aVar = queryLocalInterface instanceof a ? (a) queryLocalInterface : new a(readStrongBinder, "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate", 9);
        }
        N0.recycle();
        return aVar;
    }

    public final g X0(x6.b bVar) {
        g gVar;
        Parcel O0 = O0();
        s7.b.c(O0, bVar);
        O0.writeInt(0);
        Parcel N0 = N0(O0, 3);
        IBinder readStrongBinder = N0.readStrongBinder();
        if (readStrongBinder == null) {
            gVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
            gVar = queryLocalInterface instanceof g ? (g) queryLocalInterface : new g(readStrongBinder, "com.google.android.gms.maps.internal.IMapViewDelegate", 9);
        }
        N0.recycle();
        return gVar;
    }

    public final s7.e Y0() {
        s7.e cVar;
        Parcel N0 = N0(O0(), 5);
        IBinder readStrongBinder = N0.readStrongBinder();
        int i10 = s7.d.b;
        if (readStrongBinder == null) {
            cVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
            cVar = queryLocalInterface instanceof s7.e ? (s7.e) queryLocalInterface : new s7.c(readStrongBinder, "com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate", 9);
        }
        N0.recycle();
        return cVar;
    }
}
