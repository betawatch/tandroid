package j7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class qa extends com.google.android.gms.internal.cast.a implements sa {
    public final pa U0(j6.b bVar, ua uaVar) {
        pa paVar;
        Parcel M0 = M0();
        int i10 = c0.a;
        M0.writeStrongBinder(bVar);
        M0.writeInt(1);
        uaVar.writeToParcel(M0, 0);
        Parcel O0 = O0(M0, 1);
        IBinder readStrongBinder = O0.readStrongBinder();
        if (readStrongBinder == null) {
            paVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.mlkit.vision.label.aidls.IImageLabeler");
            paVar = queryLocalInterface instanceof pa ? (pa) queryLocalInterface : new pa(readStrongBinder, "com.google.mlkit.vision.label.aidls.IImageLabeler", 5);
        }
        O0.recycle();
        return paVar;
    }
}
