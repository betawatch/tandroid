package l7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class p1 extends a7.a implements r3 {
    public final r0 U0(l6.b bVar, t6 t6Var) {
        r0 r0Var;
        Parcel M0 = M0();
        int i10 = c0.a;
        M0.writeStrongBinder(bVar);
        M0.writeInt(1);
        t6Var.writeToParcel(M0, 0);
        Parcel O0 = O0(M0, 1);
        IBinder readStrongBinder = O0.readStrongBinder();
        if (readStrongBinder == null) {
            r0Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.vision.label.internal.client.INativeImageLabeler");
            r0Var = queryLocalInterface instanceof r0 ? (r0) queryLocalInterface : new r0(readStrongBinder, "com.google.android.gms.vision.label.internal.client.INativeImageLabeler", 6);
        }
        O0.recycle();
        return r0Var;
    }
}
