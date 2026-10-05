package d6;

import android.os.Parcel;
import android.os.Parcelable;
import c7.r0;
import w7.g0;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public final class b0 extends o6.a {
    public static final Parcelable.Creator<b0> CREATOR = new r0(27);
    public final int a;

    public b0(int i10) {
        this.a = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = g0.q(parcel, 20293);
        g0.s(parcel, 2, 4);
        parcel.writeInt(this.a);
        g0.r(parcel, q6);
    }
}
