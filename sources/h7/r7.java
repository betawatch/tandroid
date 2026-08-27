package h7;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public abstract class r7 {
    public static d7.e a;

    public static n2.b0 a(Bitmap bitmap) {
        y5.l.i(bitmap, "image must not be null");
        try {
            d7.e eVar = a;
            y5.l.i(eVar, "IBitmapDescriptorFactory is not initialized");
            d7.c cVar = (d7.c) eVar;
            Parcel M0 = cVar.M0();
            d7.b.b(M0, bitmap);
            Parcel L0 = cVar.L0(M0, 6);
            i6.a J0 = i6.b.J0(L0.readStrongBinder());
            L0.recycle();
            return new n2.b0(J0);
        } catch (RemoteException e9) {
            throw new a7.c(e9);
        }
    }

    public static n2.b0 b(int i10) {
        try {
            d7.e eVar = a;
            y5.l.i(eVar, "IBitmapDescriptorFactory is not initialized");
            d7.c cVar = (d7.c) eVar;
            Parcel M0 = cVar.M0();
            M0.writeInt(i10);
            Parcel L0 = cVar.L0(M0, 1);
            i6.a J0 = i6.b.J0(L0.readStrongBinder());
            L0.recycle();
            return new n2.b0(J0);
        } catch (RemoteException e9) {
            throw new a7.c(e9);
        }
    }
}
