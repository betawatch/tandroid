package a8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class y6 extends r6.a {
    public static final Parcelable.Creator<y6> CREATOR = new z5(1);
    public final int a;
    public final float b;
    public final int c;

    public y6(int i7, int i10, float f10, int i11) {
        if (i7 != 1) {
            throw new IllegalArgumentException("Unknown language.");
        }
        this.a = i10;
        this.b = f10;
        this.c = i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.q(parcel, 2, 4);
        parcel.writeInt(1);
        xb.q(parcel, 3, 4);
        parcel.writeInt(this.a);
        xb.q(parcel, 4, 4);
        parcel.writeFloat(this.b);
        xb.q(parcel, 5, 4);
        parcel.writeInt(this.c);
        xb.s(parcel, r10);
    }
}
