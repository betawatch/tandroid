// default package

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class e5d extends b4 {
    public static final Parcelable.Creator<e5d> CREATOR = new d3d((byte) 12);
    public final int a;
    public final ot2 b;
    public final n5d c;

    public e5d(int i, ot2 ot2Var, n5d n5dVar) {
        this.a = i;
        this.b = ot2Var;
        this.c = n5dVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.q(parcel, 1, 4);
        parcel.writeInt(this.a);
        mve.k(parcel, 2, this.b, i);
        mve.k(parcel, 3, this.c, i);
        mve.s(parcel, r);
    }
}
