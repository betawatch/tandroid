package a8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
        int r10 = cc.r(parcel, 20293);
        cc.q(parcel, 2, 4);
        parcel.writeInt(1);
        cc.q(parcel, 3, 4);
        parcel.writeInt(this.a);
        cc.q(parcel, 4, 4);
        parcel.writeFloat(this.b);
        cc.q(parcel, 5, 4);
        parcel.writeInt(this.c);
        cc.s(parcel, r10);
    }
}
