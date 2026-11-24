// default package

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class og7 extends b4 {
    public static final Parcelable.Creator<og7> CREATOR = new hx6((byte) 29);
    public final boolean a;
    public final int b;

    public og7(int i, boolean z) {
        this.a = z;
        this.b = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.q(parcel, 1, 4);
        parcel.writeInt(this.a ? 1 : 0);
        mve.q(parcel, 2, 4);
        parcel.writeInt(this.b);
        mve.s(parcel, r);
    }
}
