package g6;

import android.os.Parcel;
import android.os.Parcelable;
import f6.c0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class d extends q6.a {
    public static final Parcelable.Creator<d> CREATOR = new c0(5);
    public final String a;
    public final int b;
    public final String c;

    public d(String str, int i3, String str2) {
        this.a = str;
        this.b = i3;
        this.c = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.m(parcel, 2, this.a);
        j8.a.r(parcel, 3, 4);
        parcel.writeInt(this.b);
        j8.a.m(parcel, 4, this.c);
        j8.a.t(parcel, s6);
    }
}
