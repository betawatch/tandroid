package l7;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class ag extends a6.a {
    public static final Parcelable.Creator<ag> CREATOR = new cg(0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final long e;

    public ag(int i10, int i11, int i12, long j10, int i13) {
        this.a = i10;
        this.b = i11;
        this.c = i12;
        this.d = i13;
        this.e = j10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        com.google.android.gms.internal.cast.o.s(parcel, 2, 4);
        parcel.writeInt(this.b);
        com.google.android.gms.internal.cast.o.s(parcel, 3, 4);
        parcel.writeInt(this.c);
        com.google.android.gms.internal.cast.o.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        com.google.android.gms.internal.cast.o.s(parcel, 5, 8);
        parcel.writeLong(this.e);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
