package e6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class c extends q6.a {
    public final long a;
    public final long b;
    public final String c;
    public final String d;
    public final long e;
    public static final i6.b f = new i6.b("AdBreakStatus", null);
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
        return this.a == cVar.a && this.b == cVar.b && i6.a.d(this.c, cVar.c) && i6.a.d(this.d, cVar.d) && this.e == cVar.e;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Long.valueOf(this.b), this.c, this.d, Long.valueOf(this.e)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.r(parcel, 2, 8);
        parcel.writeLong(this.a);
        j8.a.r(parcel, 3, 8);
        parcel.writeLong(this.b);
        j8.a.m(parcel, 4, this.c);
        j8.a.m(parcel, 5, this.d);
        j8.a.r(parcel, 6, 8);
        parcel.writeLong(this.e);
        j8.a.t(parcel, s6);
    }
}
