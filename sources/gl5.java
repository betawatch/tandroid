// default package

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
