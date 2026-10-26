package e6;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import d7.r0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class b0 extends p6.a {
    public static final Parcelable.Creator<b0> CREATOR = new r0(27);
    public final int a;

    public b0(int i10) {
        this.a = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.s(parcel, 2, 4);
        parcel.writeInt(this.a);
        df.r(parcel, q5);
    }
}
