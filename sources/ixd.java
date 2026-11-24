// default package

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ixd extends b4 {
    public static final Parcelable.Creator<ixd> CREATOR = new urd((byte) 23);
    public final int a;
    public final ArrayList b;

    public ixd(int i, ArrayList arrayList) {
        this.a = i;
        this.b = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.q(parcel, 2, 4);
        parcel.writeInt(this.a);
        mve.p(parcel, 3, this.b);
        mve.s(parcel, r);
    }
}
