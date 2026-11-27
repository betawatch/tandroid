// default package

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public abstract class gl5 extends u3d {
    public gl5() {
        super("com.google.android.gms.common.api.internal.IStatusCallback", (byte) 1);
    }

    public abstract void T(Status status);

    @Override // u3d
    public final boolean b(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        Status status = (Status) v6d.a(parcel, Status.CREATOR);
        v6d.d(parcel);
        T(status);
        return true;
    }
}
