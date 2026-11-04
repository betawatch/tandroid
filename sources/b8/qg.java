package b8;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class qg extends q6.a {
    public static final Parcelable.Creator<qg> CREATOR = new sg(0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final long e;

    public qg(int i3, int i10, int i11, long j10, int i12) {
        this.a = i3;
        this.b = i10;
        this.c = i11;
        this.d = i12;
        this.e = j10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.r(parcel, 1, 4);
        parcel.writeInt(this.a);
        j8.a.r(parcel, 2, 4);
        parcel.writeInt(this.b);
        j8.a.r(parcel, 3, 4);
        parcel.writeInt(this.c);
        j8.a.r(parcel, 4, 4);
        parcel.writeInt(this.d);
        j8.a.r(parcel, 5, 8);
        parcel.writeLong(this.e);
        j8.a.t(parcel, s6);
    }
}
