package i7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class pa extends c7.a implements ra {
    public final oa U0(i6.b bVar, ta taVar) {
        oa oaVar;
        Parcel M0 = M0();
        int i10 = c0.a;
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
