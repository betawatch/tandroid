package j7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class eg extends b7.a implements gg {
    public final dg U0(h6.b bVar, jg jgVar) {
        dg dgVar;
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.c);
        int i9 = t.a;
        obtain.writeStrongBinder(bVar);
        obtain.writeInt(1);
        jgVar.writeToParcel(obtain, 0);
        Parcel O0 = O0(obtain, 1);
        IBinder readStrongBinder = O0.readStrongBinder();
        if (readStrongBinder == null) {
            dgVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.mlkit.vision.segmentation.subject.aidls.ISubjectSegmenter");
            dgVar = queryLocalInterface instanceof dg ? (dg) queryLocalInterface : new dg(readStrongBinder, "com.google.mlkit.vision.segmentation.subject.aidls.ISubjectSegmenter", 6);
        }
        O0.recycle();
        return dgVar;
    }
}
