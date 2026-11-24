// default package

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ld6 extends b4 {
    public static final Parcelable.Creator<ld6> CREATOR = new v6d((byte) 8);
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public ld6(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.q(parcel, 1, 4);
        parcel.writeInt(this.a ? 1 : 0);
        mve.q(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        mve.q(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        mve.q(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        mve.q(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        mve.q(parcel, 6, 4);
        parcel.writeInt(this.f ? 1 : 0);
        mve.s(parcel, r);
    }
}
