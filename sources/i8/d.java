package i8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.cast.o;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class d extends a6.a {
    public static final Parcelable.Creator<d> CREATOR = new i4.g(5);
    public int a;
    public String b;
    public double c;
    public String d;
    public long e;
    public int f;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = o.q(parcel, 20293);
        int i11 = this.a;
        o.s(parcel, 2, 4);
        parcel.writeInt(i11);
        o.l(parcel, 3, this.b);
        double d = this.c;
        o.s(parcel, 4, 8);
        parcel.writeDouble(d);
        o.l(parcel, 5, this.d);
        long j10 = this.e;
        o.s(parcel, 6, 8);
        parcel.writeLong(j10);
        int i12 = this.f;
        o.s(parcel, 7, 4);
        parcel.writeInt(i12);
        o.r(parcel, q6);
    }
}
