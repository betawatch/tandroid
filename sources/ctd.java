// default package

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ctd extends b4 {
    public static final Parcelable.Creator<ctd> CREATOR = new urd((byte) 3);
    public final int a;
    public final rad b;

    public ctd(int i, rad radVar) {
        this.a = i;
        this.b = radVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.q(parcel, 2, 4);
        parcel.writeInt(this.a);
        mve.k(parcel, 3, this.b, i);
        mve.s(parcel, r);
    }
}
