package k8;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class q0 extends a6.a {
    public static final Parcelable.Creator<q0> CREATOR = new p0(1);
    public final String a;
    public final String b;
    public final long c;

    public q0(long j10, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = j10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.l(parcel, 2, this.a);
        com.google.android.gms.internal.cast.o.l(parcel, 3, this.b);
        com.google.android.gms.internal.cast.o.s(parcel, 4, 8);
        parcel.writeLong(this.c);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
