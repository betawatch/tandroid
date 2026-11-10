package c8;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class cg extends a8.a implements eg {
    public final bg x1(a7.b bVar, hg hgVar) {
        bg bgVar;
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.c);
        int i7 = t.a;
        obtain.writeStrongBinder(bVar);
        obtain.writeInt(1);
        hgVar.writeToParcel(obtain, 0);
        Parcel r12 = r1(obtain, 1);
        IBinder readStrongBinder = r12.readStrongBinder();
        if (readStrongBinder == null) {
            bgVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.mlkit.vision.segmentation.subject.aidls.ISubjectSegmenter");
            bgVar = queryLocalInterface instanceof bg ? (bg) queryLocalInterface : new bg(readStrongBinder, "com.google.mlkit.vision.segmentation.subject.aidls.ISubjectSegmenter", 1);
        }
        r12.recycle();
        return bgVar;
    }
}
