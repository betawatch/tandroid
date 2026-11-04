package a9;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class y extends q6.a {
    public static final Parcelable.Creator<y> CREATOR = new c(22);
    public final int a;
    public final String b;

    public y(int i3, String str) {
        this.a = i3;
        this.b = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.r(parcel, 2, 4);
        parcel.writeInt(this.a);
        j8.a.m(parcel, 3, this.b);
        j8.a.t(parcel, s6);
    }
}
