package k8;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class r0 extends a6.a {
    public static final Parcelable.Creator<r0> CREATOR = new p0(2);
    public final int a;
    public final String b;

    public r0(int i10, String str) {
        this.a = i10;
        this.b = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.s(parcel, 2, 4);
        parcel.writeInt(this.a);
        com.google.android.gms.internal.cast.o.l(parcel, 3, this.b);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
