// default package

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class gtd extends ezc implements y5e {
    public final cnd Z(bo7 bo7Var, qme qmeVar) {
        cnd cndVar;
        Parcel R = R();
        int i = vgd.a;
        R.writeStrongBinder(bo7Var);
        R.writeInt(1);
        qmeVar.writeToParcel(R, 0);
        Parcel T = T(R, 1);
        IBinder readStrongBinder = T.readStrongBinder();
        if (readStrongBinder == null) {
            cndVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.vision.label.internal.client.INativeImageLabeler");
            cndVar = queryLocalInterface instanceof cnd ? (cnd) queryLocalInterface : new cnd(readStrongBinder, "com.google.android.gms.vision.label.internal.client.INativeImageLabeler", (byte) 7);
        }
        T.recycle();
        return cndVar;
    }
}
