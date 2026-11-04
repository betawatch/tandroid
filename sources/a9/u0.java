package a9;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class u0 extends q6.a {
    public static final Parcelable.Creator<u0> CREATOR = new n0(7);
    public final int a;
    public final long b;
    public final List c;

    public u0(int i3, long j10, ArrayList arrayList) {
        this.a = i3;
        this.b = j10;
        this.c = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.r(parcel, 2, 4);
        parcel.writeInt(this.a);
        j8.a.r(parcel, 3, 8);
        parcel.writeLong(this.b);
        j8.a.q(parcel, 4, this.c);
        j8.a.t(parcel, s6);
    }
}
