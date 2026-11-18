package c8;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public abstract class r9 {
    public static v7.e a;

    public static hi.u5 a(Bitmap bitmap) {
        try {
            v7.e eVar = a;
            q6.m.i(eVar, "IBitmapDescriptorFactory is not initialized");
            v7.c cVar = (v7.c) eVar;
            Parcel p12 = cVar.p1();
            v7.b.b(p12, bitmap);
            Parcel o12 = cVar.o1(p12, 6);
            a7.a m12 = a7.b.m1(o12.readStrongBinder());
            o12.recycle();
            return new hi.u5(m12);
        } catch (RemoteException e10) {
            throw new androidx.car.app.j(e10);
        }
    }

    public static hi.u5 b(int i7) {
        try {
            v7.e eVar = a;
            q6.m.i(eVar, "IBitmapDescriptorFactory is not initialized");
            v7.c cVar = (v7.c) eVar;
            Parcel p12 = cVar.p1();
            p12.writeInt(i7);
            Parcel o12 = cVar.o1(p12, 1);
            a7.a m12 = a7.b.m1(o12.readStrongBinder());
            o12.recycle();
            return new hi.u5(m12);
        } catch (RemoteException e10) {
            throw new androidx.car.app.j(e10);
        }
    }
}
