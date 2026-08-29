package d8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.cast.o;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class f extends a6.a {
    public static final Parcelable.Creator<f> CREATOR = new d6.d(6);
    public int a;
    public String b;
    public String c;
    public String d;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = o.q(parcel, 20293);
        int i11 = this.a;
        o.s(parcel, 2, 4);
        parcel.writeInt(i11);
        o.l(parcel, 3, this.b);
        o.l(parcel, 4, this.c);
        o.l(parcel, 5, this.d);
        o.r(parcel, q6);
    }
}
