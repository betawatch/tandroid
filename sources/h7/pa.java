package h7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class pa extends b7.a implements ra {
    public final oa U0(h6.b bVar, ta taVar) {
        oa oaVar;
        Parcel M0 = M0();
        int i9 = c0.a;
        M0.writeStrongBinder(bVar);
        M0.writeInt(1);
        taVar.writeToParcel(M0, 0);
        Parcel O0 = O0(M0, 1);
        IBinder readStrongBinder = O0.readStrongBinder();
        if (readStrongBinder == null) {
            oaVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.mlkit.vision.label.aidls.IImageLabeler");
            oaVar = queryLocalInterface instanceof oa ? (oa) queryLocalInterface : new oa(readStrongBinder, "com.google.mlkit.vision.label.aidls.IImageLabeler", 5);
        }
        O0.recycle();
        return oaVar;
    }
}
