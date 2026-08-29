package i7;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class h8 {
    public static e7.e a;

    public static org.telegram.ui.Components.n a(Bitmap bitmap) {
        z5.l.i(bitmap, "image must not be null");
        try {
            e7.e eVar = a;
            z5.l.i(eVar, "IBitmapDescriptorFactory is not initialized");
            e7.c cVar = (e7.c) eVar;
            Parcel M0 = cVar.M0();
            e7.b.b(M0, bitmap);
            Parcel L0 = cVar.L0(M0, 6);
            j6.a J0 = j6.b.J0(L0.readStrongBinder());
            L0.recycle();
            return new org.telegram.ui.Components.n(J0);
        } catch (RemoteException e10) {
            throw new a6.b(e10);
        }
    }

    public static org.telegram.ui.Components.n b(int i10) {
        try {
            e7.e eVar = a;
            z5.l.i(eVar, "IBitmapDescriptorFactory is not initialized");
            e7.c cVar = (e7.c) eVar;
            Parcel M0 = cVar.M0();
            M0.writeInt(i10);
            Parcel L0 = cVar.L0(M0, 1);
            j6.a J0 = j6.b.J0(L0.readStrongBinder());
            L0.recycle();
            return new org.telegram.ui.Components.n(J0);
        } catch (RemoteException e10) {
            throw new a6.b(e10);
        }
    }
}
