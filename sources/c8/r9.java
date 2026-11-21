package c8;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public abstract class r9 {
    public static v7.e a;

    public static hi.t5 a(Bitmap bitmap) {
        try {
            v7.e eVar = a;
            q6.m.i(eVar, "IBitmapDescriptorFactory is not initialized");
            v7.c cVar = (v7.c) eVar;
            Parcel p12 = cVar.p1();
            v7.b.b(p12, bitmap);
            Parcel o12 = cVar.o1(p12, 6);
            a7.a m12 = a7.b.m1(o12.readStrongBinder());
            o12.recycle();
            return new hi.t5(m12);
        } catch (RemoteException e10) {
            throw new androidx.car.app.j(e10);
        }
    }

    public static hi.t5 b(int i7) {
        try {
            v7.e eVar = a;
            q6.m.i(eVar, "IBitmapDescriptorFactory is not initialized");
            v7.c cVar = (v7.c) eVar;
            Parcel p12 = cVar.p1();
            p12.writeInt(i7);
            Parcel o12 = cVar.o1(p12, 1);
            a7.a m12 = a7.b.m1(o12.readStrongBinder());
            o12.recycle();
            return new hi.t5(m12);
        } catch (RemoteException e10) {
            throw new androidx.car.app.j(e10);
        }
    }
}
