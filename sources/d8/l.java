package d8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.cast.o;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class l extends a6.a {
    public static final Parcelable.Creator<l> CREATOR = new d6.d(12);
    public String a;
    public String b;
    public int c;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = o.q(parcel, 20293);
        o.l(parcel, 2, this.a);
        o.l(parcel, 3, this.b);
        int i11 = this.c;
        o.s(parcel, 4, 4);
        parcel.writeInt(i11);
        o.r(parcel, q6);
    }
}
