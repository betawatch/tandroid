// default package

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class dkf extends v3d implements fkf {
    public final bkf Z(br7 br7Var, lkf lkfVar) {
        bkf bkfVar;
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.c);
        int i = nld.a;
        obtain.writeStrongBinder(br7Var);
        obtain.writeInt(1);
        lkfVar.writeToParcel(obtain, 0);
        Parcel T = T(obtain, 1);
        IBinder readStrongBinder = T.readStrongBinder();
        if (readStrongBinder == null) {
            bkfVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.mlkit.vision.segmentation.subject.aidls.ISubjectSegmenter");
            bkfVar = queryLocalInterface instanceof bkf ? (bkf) queryLocalInterface : new bkf(readStrongBinder, "com.google.mlkit.vision.segmentation.subject.aidls.ISubjectSegmenter", (byte) 8);
        }
        T.recycle();
        return bkfVar;
    }
}
