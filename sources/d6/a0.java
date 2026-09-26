package d6;

import android.os.Parcel;
import android.os.Parcelable;
import c7.r0;
import w7.f0;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public final class a0 extends o6.a {
    public static final Parcelable.Creator<a0> CREATOR = new r0(26);
    public final boolean a;

    public a0(boolean z10) {
        this.a = z10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.s(parcel, 2, 4);
        parcel.writeInt(this.a ? 1 : 0);
        f0.r(parcel, q6);
    }
}
