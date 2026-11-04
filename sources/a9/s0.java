package a9;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class s0 extends q6.a {
    public static final Parcelable.Creator<s0> CREATOR = new n0(5);
    public final int a;
    public final int b;
    public final byte[] c;

    public s0(int i3, int i10, byte[] bArr) {
        this.a = i3;
        this.b = i10;
        this.c = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.r(parcel, 1, 4);
        parcel.writeInt(this.a);
        j8.a.r(parcel, 2, 4);
        parcel.writeInt(this.b);
        j8.a.d(parcel, 3, this.c);
        j8.a.t(parcel, s6);
    }
}
