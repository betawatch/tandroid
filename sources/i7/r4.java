package i7;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class r4 extends z5.a {
    public static final Parcelable.Creator<r4> CREATOR = new s5(0);
    public final String a;
    public final String b;
    public final float c;
    public final int d;

    public r4(float f10, int i10, String str, String str2) {
        this.b = str2;
        this.c = f10;
        this.a = str;
        this.d = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h7.r8.q(parcel, 20293);
        h7.r8.l(parcel, 2, this.b);
        h7.r8.s(parcel, 3, 4);
        parcel.writeFloat(this.c);
        h7.r8.l(parcel, 4, this.a);
        h7.r8.s(parcel, 5, 4);
        parcel.writeInt(this.d);
        h7.r8.r(parcel, q6);
    }
}
