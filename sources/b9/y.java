package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class y extends r6.a {
    public static final Parcelable.Creator<y> CREATOR = new c(22);
    public final int a;
    public final String b;

    public y(int i7, String str) {
        this.a = i7;
        this.b = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.q(parcel, 2, 4);
        parcel.writeInt(this.a);
        xb.l(parcel, 3, this.b);
        xb.s(parcel, r10);
    }
}
