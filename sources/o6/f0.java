package o6;

import a8.df;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class f0 extends p6.a {
    public static final Parcelable.Creator<f0> CREATOR = new n4.x(17);
    public Bundle a;
    public l6.c[] b;
    public int c;
    public e d;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.b(parcel, 1, this.a);
        df.o(parcel, 2, this.b, i10);
        int i11 = this.c;
        df.s(parcel, 3, 4);
        parcel.writeInt(i11);
        df.k(parcel, 4, this.d, i10);
        df.r(parcel, q5);
    }
}
