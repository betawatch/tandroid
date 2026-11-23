package a8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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
        int r10 = bc.r(parcel, 20293);
        bc.q(parcel, 2, 4);
        parcel.writeInt(1);
        bc.q(parcel, 3, 4);
        parcel.writeInt(this.a);
        bc.q(parcel, 4, 4);
        parcel.writeFloat(this.b);
        bc.q(parcel, 5, 4);
        parcel.writeInt(this.c);
        bc.s(parcel, r10);
    }
}
