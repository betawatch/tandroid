package f8;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class b extends z5.a {
    public static final Parcelable.Creator<b> CREATOR = new f4.e(3);
    public int a;
    public int b;
    public int c;
    public boolean d;
    public boolean e;
    public float f;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = r8.q(parcel, 20293);
        int i11 = this.a;
        r8.s(parcel, 2, 4);
        parcel.writeInt(i11);
        int i12 = this.b;
        r8.s(parcel, 3, 4);
        parcel.writeInt(i12);
        int i13 = this.c;
        r8.s(parcel, 4, 4);
        parcel.writeInt(i13);
        boolean z10 = this.d;
        r8.s(parcel, 5, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.e;
        r8.s(parcel, 6, 4);
        parcel.writeInt(z11 ? 1 : 0);
        float f10 = this.f;
        r8.s(parcel, 7, 4);
        parcel.writeFloat(f10);
        r8.r(parcel, q6);
    }
}
