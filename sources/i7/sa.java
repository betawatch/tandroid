package i7;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class sa extends z5.a {
    public static final Parcelable.Creator<sa> CREATOR = new s5(2);
    public final String a;
    public final float b;
    public final String c;
    public final int d;

    public sa(float f10, int i10, String str, String str2) {
        this.a = str;
        this.b = f10;
        this.c = str2;
        this.d = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h7.r8.q(parcel, 20293);
        h7.r8.l(parcel, 1, this.a);
        h7.r8.s(parcel, 2, 4);
        parcel.writeFloat(this.b);
        h7.r8.l(parcel, 3, this.c);
        h7.r8.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        h7.r8.r(parcel, q6);
    }
}
