package m5;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;
import java.util.Arrays;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class c extends z5.a {
    public final long a;
    public final long b;
    public final String c;
    public final String d;
    public final long e;
    public static final r5.b f = new r5.b("AdBreakStatus", null);
    public static final Parcelable.Creator<c> CREATOR = new w(9);

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
        return this.a == cVar.a && this.b == cVar.b && r5.a.d(this.c, cVar.c) && r5.a.d(this.d, cVar.d) && this.e == cVar.e;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Long.valueOf(this.b), this.c, this.d, Long.valueOf(this.e)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = r8.q(parcel, 20293);
        r8.s(parcel, 2, 8);
        parcel.writeLong(this.a);
        r8.s(parcel, 3, 8);
        parcel.writeLong(this.b);
        r8.l(parcel, 4, this.c);
        r8.l(parcel, 5, this.d);
        r8.s(parcel, 6, 8);
        parcel.writeLong(this.e);
        r8.r(parcel, q6);
    }
}
