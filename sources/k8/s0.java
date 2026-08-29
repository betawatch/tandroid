package k8;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class s0 extends a6.a {
    public static final Parcelable.Creator<s0> CREATOR = new p0(3);
    public final int a;
    public final m b;

    public s0(int i10, m mVar) {
        this.a = i10;
        this.b = mVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.s(parcel, 2, 4);
        parcel.writeInt(this.a);
        com.google.android.gms.internal.cast.o.k(parcel, 3, this.b, i10);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
