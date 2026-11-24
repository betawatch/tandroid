// default package

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class jee extends b4 {
    public static final Parcelable.Creator<jee> CREATOR = new sje((byte) 1);
    public final int a;
    public final boolean b;

    public jee(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.q(parcel, 2, 4);
        parcel.writeInt(this.a);
        mve.q(parcel, 3, 4);
        parcel.writeInt(this.b ? 1 : 0);
        mve.s(parcel, r);
    }
}
