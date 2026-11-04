package f6;

import android.os.Parcel;
import android.os.Parcelable;
import e7.r0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class a0 extends q6.a {
    public static final Parcelable.Creator<a0> CREATOR = new r0(29);
    public final boolean a;

    public a0(boolean z10) {
        this.a = z10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.r(parcel, 2, 4);
        parcel.writeInt(this.a ? 1 : 0);
        j8.a.t(parcel, s6);
    }
}
