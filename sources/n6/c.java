package n6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
import java.util.Arrays;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class c extends r6.a {
    public static final Parcelable.Creator<c> CREATOR = new m6.e(10);
    public final String a;
    public final int b;
    public final long c;
    public final boolean d;

    public c(String str, int i7, long j3, boolean z9) {
        this.a = str;
        this.b = i7;
        this.c = j3;
        this.d = z9;
    }

    public final long b() {
        long j3 = this.c;
        return j3 == -1 ? this.b : j3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (q6.m.k(this.a, cVar.a) && b() == cVar.b() && this.d == cVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Long.valueOf(b()), Boolean.valueOf(this.d)});
    }

    public final String toString() {
        j2.n nVar = new j2.n(this);
        nVar.X(this.a, "name");
        nVar.X(Long.valueOf(b()), "version");
        nVar.X(Boolean.valueOf(this.d), "is_fully_rolled_out");
        return nVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.l(parcel, 1, this.a);
        wb.q(parcel, 2, 4);
        parcel.writeInt(this.b);
        long b10 = b();
        wb.q(parcel, 3, 8);
        parcel.writeLong(b10);
        wb.q(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        wb.s(parcel, r10);
    }

    public c(String str, long j3) {
        this(str, -1, j3, false);
    }
}
