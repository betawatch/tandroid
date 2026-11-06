package a8;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class db extends a implements fb {
    public final cb X0(a7.b bVar, hb hbVar) {
        cb cbVar;
        Parcel P0 = P0();
        int i7 = g0.a;
        P0.writeStrongBinder(bVar);
        P0.writeInt(1);
        hbVar.writeToParcel(P0, 0);
        Parcel R0 = R0(P0, 1);
        IBinder readStrongBinder = R0.readStrongBinder();
        if (readStrongBinder == null) {
            cbVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.mlkit.vision.label.aidls.IImageLabeler");
            cbVar = queryLocalInterface instanceof cb ? (cb) queryLocalInterface : new cb(readStrongBinder, "com.google.mlkit.vision.label.aidls.IImageLabeler", 0);
        }
        R0.recycle();
        return cbVar;
    }
}
