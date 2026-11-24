// default package

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ipd extends b4 {
    public static final Parcelable.Creator<ipd> CREATOR = new urd((byte) 15);
    public final long a;
    public final le5[] b;
    public final int c;
    public final boolean d;

    public ipd(long j, le5[] le5VarArr, int i, boolean z) {
        this.a = j;
        this.b = le5VarArr;
        this.d = z;
        if (z) {
            this.c = i;
        } else {
            this.c = -1;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.q(parcel, 2, 8);
        parcel.writeLong(this.a);
        mve.o(parcel, 3, this.b, i);
        mve.q(parcel, 4, 4);
        parcel.writeInt(this.c);
        mve.q(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        mve.s(parcel, r);
    }
}
