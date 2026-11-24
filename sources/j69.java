// default package

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class j69 extends b4 {
    public static final Parcelable.Creator<j69> CREATOR = new hv6((byte) 17);
    public final Bundle a;
    public ps b;

    public j69(Bundle bundle) {
        this.a = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.b(parcel, 2, this.a);
        jte.s(parcel, r);
    }
}
