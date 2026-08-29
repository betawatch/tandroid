package o5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class c extends a6.a {
    public final long a;
    public final long b;
    public final String c;
    public final String d;
    public final long e;
    public static final s5.b f = new s5.b("AdBreakStatus", null);
    public static final Parcelable.Creator<c> CREATOR = new v(9);

    public c(long j10, long j11, String str, String str2, long j12) {
        this.a = j10;
        this.b = j11;
        this.c = str;
        this.d = str2;
        this.e = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.a == cVar.a && this.b == cVar.b && s5.a.d(this.c, cVar.c) && s5.a.d(this.d, cVar.d) && this.e == cVar.e;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Long.valueOf(this.b), this.c, this.d, Long.valueOf(this.e)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.s(parcel, 2, 8);
        parcel.writeLong(this.a);
        com.google.android.gms.internal.cast.o.s(parcel, 3, 8);
        parcel.writeLong(this.b);
        com.google.android.gms.internal.cast.o.l(parcel, 4, this.c);
        com.google.android.gms.internal.cast.o.l(parcel, 5, this.d);
        com.google.android.gms.internal.cast.o.s(parcel, 6, 8);
        parcel.writeLong(this.e);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
