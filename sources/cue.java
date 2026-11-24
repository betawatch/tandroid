// default package

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class cue extends b4 {
    public static final Parcelable.Creator<cue> CREATOR = new sje((byte) 5);
    public int a;
    public boolean b;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        int i2 = this.a;
        mve.q(parcel, 2, 4);
        parcel.writeInt(i2);
        boolean z = this.b;
        mve.q(parcel, 3, 4);
        parcel.writeInt(z ? 1 : 0);
        mve.s(parcel, r);
    }
}
