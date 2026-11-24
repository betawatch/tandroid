// default package

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class em5 extends b4 {
    public static final Parcelable.Creator<em5> CREATOR = new t0e((byte) 21);
    public final int a;
    public final int b;
    public final int c;

    public em5(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.q(parcel, 2, 4);
        parcel.writeInt(this.a);
        mve.q(parcel, 3, 4);
        parcel.writeInt(this.b);
        mve.q(parcel, 4, 4);
        parcel.writeInt(this.c);
        mve.s(parcel, r);
    }
}
