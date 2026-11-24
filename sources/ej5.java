// default package

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public abstract class ej5 extends dzc {
    public ej5() {
        super("com.google.android.gms.common.api.internal.IStatusCallback", (byte) 1);
    }

    public abstract void T(Status status);

    @Override // dzc
    public final boolean b(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        Status status = (Status) e2d.a(parcel, Status.CREATOR);
        e2d.d(parcel);
        T(status);
        return true;
    }
}
