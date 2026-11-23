package c8;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public abstract class s9 {
    public static v7.e a;

    public static hi.u0 a(Bitmap bitmap) {
        try {
            v7.e eVar = a;
            q6.m.i(eVar, "IBitmapDescriptorFactory is not initialized");
            v7.c cVar = (v7.c) eVar;
            Parcel p12 = cVar.p1();
            v7.b.b(p12, bitmap);
            Parcel o12 = cVar.o1(p12, 6);
            a7.a m12 = a7.b.m1(o12.readStrongBinder());
            o12.recycle();
            return new hi.u0(m12);
        } catch (RemoteException e10) {
            throw new androidx.car.app.j(e10);
        }
    }

    public static hi.u0 b(int i7) {
        try {
            v7.e eVar = a;
            q6.m.i(eVar, "IBitmapDescriptorFactory is not initialized");
            v7.c cVar = (v7.c) eVar;
            Parcel p12 = cVar.p1();
            p12.writeInt(i7);
            Parcel o12 = cVar.o1(p12, 1);
            a7.a m12 = a7.b.m1(o12.readStrongBinder());
            o12.recycle();
            return new hi.u0(m12);
        } catch (RemoteException e10) {
            throw new androidx.car.app.j(e10);
        }
    }
}
