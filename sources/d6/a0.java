package d6;

import android.os.Parcel;
import android.os.Parcelable;
import c7.r0;
import w7.g0;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes.dex */
public final class a0 extends o6.a {
    public static final Parcelable.Creator<a0> CREATOR = new r0(26);
    public final boolean a;

    public a0(boolean z10) {
        this.a = z10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.s(parcel, 2, 4);
        parcel.writeInt(this.a ? 1 : 0);
        g0.r(parcel, q6);
    }
}
