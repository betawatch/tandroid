package k7;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class jg extends z5.a {
    public static final Parcelable.Creator<jg> CREATOR = new cg(3);
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public jg(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        this.a = z10;
        this.b = z11;
        this.c = z12;
        this.d = z13;
        this.e = z14;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h7.r8.q(parcel, 20293);
        h7.r8.s(parcel, 1, 4);
        parcel.writeInt(this.a ? 1 : 0);
        h7.r8.s(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        h7.r8.s(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        h7.r8.s(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        h7.r8.s(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        h7.r8.r(parcel, q6);
    }
}
