package l8;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class d extends a8.a {
    public final a x1() {
        a aVar;
        Parcel o12 = o1(p1(), 4);
        IBinder readStrongBinder = o12.readStrongBinder();
        if (readStrongBinder == null) {
            aVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            aVar = queryLocalInterface instanceof a ? (a) queryLocalInterface : new a(readStrongBinder, "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate", 11);
        }
        o12.recycle();
        return aVar;
    }

    public final f y1(a7.b bVar) {
        f fVar;
        Parcel p12 = p1();
        v7.b.c(p12, bVar);
        p12.writeInt(0);
        Parcel o12 = o1(p12, 3);
        IBinder readStrongBinder = o12.readStrongBinder();
        if (readStrongBinder == null) {
            fVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
            fVar = queryLocalInterface instanceof f ? (f) queryLocalInterface : new f(readStrongBinder, "com.google.android.gms.maps.internal.IMapViewDelegate", 11);
        }
        o12.recycle();
        return fVar;
    }

    public final v7.e z1() {
        v7.e cVar;
        Parcel o12 = o1(p1(), 5);
        IBinder readStrongBinder = o12.readStrongBinder();
        int i7 = v7.d.b;
        if (readStrongBinder == null) {
            cVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
            cVar = queryLocalInterface instanceof v7.e ? (v7.e) queryLocalInterface : new v7.c(readStrongBinder, "com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate", 11);
        }
        o12.recycle();
        return cVar;
    }
}
