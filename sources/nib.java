// default package

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class nib extends b4 {
    public static final Parcelable.Creator<nib> CREATOR = new d3d((byte) 0);
    public final int a;
    public List b;

    public nib(int i, List list) {
        this.a = i;
        this.b = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.q(parcel, 1, 4);
        parcel.writeInt(this.a);
        mve.p(parcel, 2, this.b);
        mve.s(parcel, r);
    }
}
