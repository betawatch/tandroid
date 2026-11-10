package a8;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class db extends a implements fb {
    public final cb x1(a7.b bVar, hb hbVar) {
        cb cbVar;
        Parcel p12 = p1();
        int i7 = g0.a;
        p12.writeStrongBinder(bVar);
        p12.writeInt(1);
        hbVar.writeToParcel(p12, 0);
        Parcel r12 = r1(p12, 1);
        IBinder readStrongBinder = r12.readStrongBinder();
        if (readStrongBinder == null) {
            cbVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.mlkit.vision.label.aidls.IImageLabeler");
            cbVar = queryLocalInterface instanceof cb ? (cb) queryLocalInterface : new cb(readStrongBinder, "com.google.mlkit.vision.label.aidls.IImageLabeler", 0);
        }
        r12.recycle();
        return cbVar;
    }
}
