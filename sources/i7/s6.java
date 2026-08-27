package i7;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class s6 extends z5.a {
    public static final Parcelable.Creator<s6> CREATOR = new s5(1);
    public final int a;
    public final float b;
    public final int c;

    public s6(int i10, int i11, float f10, int i12) {
        if (i10 != 1) {
            throw new IllegalArgumentException("Unknown language.");
        }
        this.a = i11;
        this.b = f10;
        this.c = i12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h7.r8.q(parcel, 20293);
        h7.r8.s(parcel, 2, 4);
        parcel.writeInt(1);
        h7.r8.s(parcel, 3, 4);
        parcel.writeInt(this.a);
        h7.r8.s(parcel, 4, 4);
        parcel.writeFloat(this.b);
        h7.r8.s(parcel, 5, 4);
        parcel.writeInt(this.c);
        h7.r8.r(parcel, q6);
    }
}
