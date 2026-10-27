package a8;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class xg extends a implements zg {
    public final wg V0(y6.b bVar, ch chVar) {
        wg wgVar;
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.c);
        int i10 = a0.a;
        obtain.writeStrongBinder(bVar);
        obtain.writeInt(1);
        chVar.writeToParcel(obtain, 0);
        Parcel P0 = P0(obtain, 1);
        IBinder readStrongBinder = P0.readStrongBinder();
        if (readStrongBinder == null) {
            wgVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.mlkit.vision.segmentation.subject.aidls.ISubjectSegmenter");
            wgVar = queryLocalInterface instanceof wg ? (wg) queryLocalInterface : new wg(readStrongBinder, "com.google.mlkit.vision.segmentation.subject.aidls.ISubjectSegmenter", 0);
        }
        P0.recycle();
        return wgVar;
    }
}
