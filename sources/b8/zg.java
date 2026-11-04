package b8;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class zg extends q6.a {
    public static final Parcelable.Creator<zg> CREATOR = new sg(3);
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public zg(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        this.a = z10;
        this.b = z11;
        this.c = z12;
        this.d = z13;
        this.e = z14;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.r(parcel, 1, 4);
        parcel.writeInt(this.a ? 1 : 0);
        j8.a.r(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        j8.a.r(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        j8.a.r(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        j8.a.r(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        j8.a.t(parcel, s6);
    }
}
