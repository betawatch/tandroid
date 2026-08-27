package k7;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class ag extends z5.a {
    public static final Parcelable.Creator<ag> CREATOR = new cg(0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final long e;

    public ag(int i10, int i11, int i12, long j10, int i13) {
        this.a = i10;
        this.b = i11;
        this.c = i12;
        this.d = i13;
        this.e = j10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h7.r8.q(parcel, 20293);
        h7.r8.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        h7.r8.s(parcel, 2, 4);
        parcel.writeInt(this.b);
        h7.r8.s(parcel, 3, 4);
        parcel.writeInt(this.c);
        h7.r8.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        h7.r8.s(parcel, 5, 8);
        parcel.writeLong(this.e);
        h7.r8.r(parcel, q6);
    }
}
