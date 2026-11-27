// default package

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class maf extends v3d implements raf {
    public final kaf Z(br7 br7Var, zaf zafVar) {
        kaf kafVar;
        Parcel R = R();
        int i = mld.a;
        R.writeStrongBinder(br7Var);
        R.writeInt(1);
        zafVar.writeToParcel(R, 0);
        Parcel T = T(R, 1);
        IBinder readStrongBinder = T.readStrongBinder();
        if (readStrongBinder == null) {
            kafVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.mlkit.vision.label.aidls.IImageLabeler");
            kafVar = queryLocalInterface instanceof kaf ? (kaf) queryLocalInterface : new kaf(readStrongBinder, "com.google.mlkit.vision.label.aidls.IImageLabeler", (byte) 7);
        }
        T.recycle();
        return kafVar;
    }
}
