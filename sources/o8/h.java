package o8;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class h extends q6.a {
    public static final Parcelable.Creator<h> CREATOR = new n8.g(7);
    public final int a;
    public final boolean b;

    public h(int i3, boolean z10) {
        this.a = i3;
        this.b = z10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.r(parcel, 2, 4);
        parcel.writeInt(this.a);
        j8.a.r(parcel, 3, 4);
        parcel.writeInt(this.b ? 1 : 0);
        j8.a.t(parcel, s6);
    }
}
