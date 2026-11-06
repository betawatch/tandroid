package a8;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class v1 extends a implements x3 {
    public final z0 X0(a7.b bVar, y6 y6Var) {
        z0 z0Var;
        Parcel P0 = P0();
        int i7 = g0.a;
        P0.writeStrongBinder(bVar);
        P0.writeInt(1);
        y6Var.writeToParcel(P0, 0);
        Parcel R0 = R0(P0, 1);
        IBinder readStrongBinder = R0.readStrongBinder();
        if (readStrongBinder == null) {
            z0Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.vision.label.internal.client.INativeImageLabeler");
            z0Var = queryLocalInterface instanceof z0 ? (z0) queryLocalInterface : new z0(readStrongBinder, "com.google.android.gms.vision.label.internal.client.INativeImageLabeler", 0);
        }
        R0.recycle();
        return z0Var;
    }
}
