package d8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.cast.o;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class g extends a6.a {
    public static final Parcelable.Creator<g> CREATOR = new d6.d(9);
    public double a;
    public double b;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = o.q(parcel, 20293);
        double d = this.a;
        o.s(parcel, 2, 8);
        parcel.writeDouble(d);
        double d10 = this.b;
        o.s(parcel, 3, 8);
        parcel.writeDouble(d10);
        o.r(parcel, q6);
    }
}
