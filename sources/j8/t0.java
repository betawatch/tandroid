package j8;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class t0 extends z5.a {
    public static final Parcelable.Creator<t0> CREATOR = new o0(5);
    public final int a;
    public final int b;
    public final byte[] c;

    public t0(int i10, int i11, byte[] bArr) {
        this.a = i10;
        this.b = i11;
        this.c = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = r8.q(parcel, 20293);
        r8.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        r8.s(parcel, 2, 4);
        parcel.writeInt(this.b);
        r8.c(parcel, 3, this.c);
        r8.r(parcel, q6);
    }
}
