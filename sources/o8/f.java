package o8;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class f extends q6.a {
    public static final Parcelable.Creator<f> CREATOR = new n8.g(5);
    public final long a;
    public final a[] b;
    public final int c;
    public final boolean d;

    public f(long j10, a[] aVarArr, int i3, boolean z10) {
        this.a = j10;
        this.b = aVarArr;
        this.d = z10;
        if (z10) {
            this.c = i3;
        } else {
            this.c = -1;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.r(parcel, 2, 8);
        parcel.writeLong(this.a);
        j8.a.p(parcel, 3, this.b, i3);
        j8.a.r(parcel, 4, 4);
        parcel.writeInt(this.c);
        j8.a.r(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        j8.a.t(parcel, s6);
    }
}
