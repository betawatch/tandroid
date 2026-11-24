// default package

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ohf extends f1d implements qhf {
    public final mhf Z(eq7 eq7Var, whf whfVar) {
        mhf mhfVar;
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.c);
        int i = xid.a;
        obtain.writeStrongBinder(eq7Var);
        obtain.writeInt(1);
        whfVar.writeToParcel(obtain, 0);
        Parcel T = T(obtain, 1);
        IBinder readStrongBinder = T.readStrongBinder();
        if (readStrongBinder == null) {
            mhfVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.mlkit.vision.segmentation.subject.aidls.ISubjectSegmenter");
            mhfVar = queryLocalInterface instanceof mhf ? (mhf) queryLocalInterface : new mhf(readStrongBinder, "com.google.mlkit.vision.segmentation.subject.aidls.ISubjectSegmenter", (byte) 8);
        }
        T.recycle();
        return mhfVar;
    }
}
