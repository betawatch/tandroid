package f8;

import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class g extends c6.a {
    public static final Parcelable.Creator<g> CREATOR = new b9.e(28);
    public double a;
    public double b;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        double d = this.a;
        g5.s(parcel, 2, 8);
        parcel.writeDouble(d);
        double d10 = this.b;
        g5.s(parcel, 3, 8);
        parcel.writeDouble(d10);
        g5.r(parcel, q10);
    }
}
