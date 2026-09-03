package f8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class g extends c6.a {
    public static final Parcelable.Creator<g> CREATOR = new b9.e(28);
    public double a;
    public double b;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        double d = this.a;
        f5.s(parcel, 2, 8);
        parcel.writeDouble(d);
        double d10 = this.b;
        f5.s(parcel, 3, 8);
        parcel.writeDouble(d10);
        f5.r(parcel, q10);
    }
}
