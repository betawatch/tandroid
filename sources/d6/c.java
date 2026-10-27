package d6;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class c extends p6.a {
    public final long a;
    public final long b;
    public final String c;
    public final String d;
    public final long e;
    public static final h6.b f = new h6.b("AdBreakStatus", null);
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
        return this.a == cVar.a && this.b == cVar.b && h6.a.d(this.c, cVar.c) && h6.a.d(this.d, cVar.d) && this.e == cVar.e;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Long.valueOf(this.b), this.c, this.d, Long.valueOf(this.e)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.s(parcel, 2, 8);
        parcel.writeLong(this.a);
        df.s(parcel, 3, 8);
        parcel.writeLong(this.b);
        df.l(parcel, 4, this.c);
        df.l(parcel, 5, this.d);
        df.s(parcel, 6, 8);
        parcel.writeLong(this.e);
        df.r(parcel, q5);
    }
}
