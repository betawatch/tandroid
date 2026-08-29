package h8;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class n extends a6.a {
    public static final Parcelable.Creator<n> CREATOR = new g8.b(15);
    public int a;
    public String b;
    public String c;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        int i11 = this.a;
        com.google.android.gms.internal.cast.o.s(parcel, 1, 4);
        parcel.writeInt(i11);
        com.google.android.gms.internal.cast.o.l(parcel, 2, this.b);
        com.google.android.gms.internal.cast.o.l(parcel, 3, this.c);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
