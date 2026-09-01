package l7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class qa extends a7.a implements sa {
    public final pa U0(l6.b bVar, ua uaVar) {
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
            paVar = queryLocalInterface instanceof pa ? (pa) queryLocalInterface : new pa(readStrongBinder, "com.google.mlkit.vision.label.aidls.IImageLabeler", 6);
        }
        O0.recycle();
        return paVar;
    }
}
