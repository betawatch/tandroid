package o5;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;
import n6.w0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class d extends z5.a {
    public static final Parcelable.Creator<d> CREATOR = new w0(9);
    public final String a;
    public final int b;
    public final String c;

    public d(String str, int i10, String str2) {
        this.a = str;
        this.b = i10;
        this.c = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = r8.q(parcel, 20293);
        r8.l(parcel, 2, this.a);
        r8.s(parcel, 3, 4);
        parcel.writeInt(this.b);
        r8.l(parcel, 4, this.c);
        r8.r(parcel, q6);
    }
}
