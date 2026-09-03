package l7;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class t6 extends c6.a {
    public static final Parcelable.Creator<t6> CREATOR = new t5(1);
    public final int a;
    public final float b;
    public final int c;

    public t6(int i10, int i11, float f10, int i12) {
        if (i10 != 1) {
            throw new IllegalArgumentException("Unknown language.");
        }
        this.a = i11;
        this.b = f10;
        this.c = i12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = j7.f5.q(parcel, 20293);
        j7.f5.s(parcel, 2, 4);
        parcel.writeInt(1);
        j7.f5.s(parcel, 3, 4);
        parcel.writeInt(this.a);
        j7.f5.s(parcel, 4, 4);
        parcel.writeFloat(this.b);
        j7.f5.s(parcel, 5, 4);
        parcel.writeInt(this.c);
        j7.f5.r(parcel, q10);
    }
}
