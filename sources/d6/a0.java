package d6;

import android.os.Parcel;
import android.os.Parcelable;
import c7.r0;
import w7.h0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class a0 extends o6.a {
    public static final Parcelable.Creator<a0> CREATOR = new r0(25);
    public final boolean a;

    public a0(boolean z10) {
        this.a = z10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.s(parcel, 2, 4);
        parcel.writeInt(this.a ? 1 : 0);
        h0.r(parcel, q6);
    }
}
