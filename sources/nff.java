// default package

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class nff extends ezc implements pff {
    public final lff Z(bo7 bo7Var, vff vffVar) {
        lff lffVar;
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.c);
        int i = wgd.a;
        obtain.writeStrongBinder(bo7Var);
        obtain.writeInt(1);
        vffVar.writeToParcel(obtain, 0);
        Parcel T = T(obtain, 1);
        IBinder readStrongBinder = T.readStrongBinder();
        if (readStrongBinder == null) {
            lffVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.mlkit.vision.segmentation.subject.aidls.ISubjectSegmenter");
            lffVar = queryLocalInterface instanceof lff ? (lff) queryLocalInterface : new lff(readStrongBinder, "com.google.mlkit.vision.segmentation.subject.aidls.ISubjectSegmenter", (byte) 8);
        }
        T.recycle();
        return lffVar;
    }
}
