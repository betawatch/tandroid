package f6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
import java.util.Arrays;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class c extends r6.a {
    public final long a;
    public final long b;
    public final String c;
    public final String d;
    public final long e;
    public static final j6.b f = new j6.b("AdBreakStatus", null);
    public static final Parcelable.Creator<c> CREATOR = new v(9);

    public c(long j3, long j10, String str, String str2, long j11) {
        this.a = j3;
        this.b = j10;
        this.c = str;
        this.d = str2;
        this.e = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.a == cVar.a && this.b == cVar.b && j6.a.d(this.c, cVar.c) && j6.a.d(this.d, cVar.d) && this.e == cVar.e;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Long.valueOf(this.b), this.c, this.d, Long.valueOf(this.e)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.q(parcel, 2, 8);
        parcel.writeLong(this.a);
        wb.q(parcel, 3, 8);
        parcel.writeLong(this.b);
        wb.l(parcel, 4, this.c);
        wb.l(parcel, 5, this.d);
        wb.q(parcel, 6, 8);
        parcel.writeLong(this.e);
        wb.s(parcel, r10);
    }
}
