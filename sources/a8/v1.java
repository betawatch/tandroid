package a8;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class v1 extends a implements x3 {
    public final z0 x1(a7.b bVar, y6 y6Var) {
        z0 z0Var;
        Parcel p12 = p1();
        int i7 = g0.a;
        p12.writeStrongBinder(bVar);
        p12.writeInt(1);
        y6Var.writeToParcel(p12, 0);
        Parcel r12 = r1(p12, 1);
        IBinder readStrongBinder = r12.readStrongBinder();
        if (readStrongBinder == null) {
            z0Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.vision.label.internal.client.INativeImageLabeler");
            z0Var = queryLocalInterface instanceof z0 ? (z0) queryLocalInterface : new z0(readStrongBinder, "com.google.android.gms.vision.label.internal.client.INativeImageLabeler", 0);
        }
        r12.recycle();
        return z0Var;
    }
}
