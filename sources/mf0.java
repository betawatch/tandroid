// default package

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class mf0 extends b4 {
    public static final Parcelable.Creator<mf0> CREATOR = new jid(20);
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public boolean h;
    public String n;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        int i2 = this.a;
        mve.q(parcel, 2, 4);
        parcel.writeInt(i2);
        int i3 = this.b;
        mve.q(parcel, 3, 4);
        parcel.writeInt(i3);
        int i4 = this.c;
        mve.q(parcel, 4, 4);
        parcel.writeInt(i4);
        int i5 = this.d;
        mve.q(parcel, 5, 4);
        parcel.writeInt(i5);
        int i6 = this.e;
        mve.q(parcel, 6, 4);
        parcel.writeInt(i6);
        int i7 = this.f;
        mve.q(parcel, 7, 4);
        parcel.writeInt(i7);
        boolean z = this.h;
        mve.q(parcel, 8, 4);
        parcel.writeInt(z ? 1 : 0);
        mve.l(parcel, 9, this.n);
        mve.s(parcel, r);
    }
}
