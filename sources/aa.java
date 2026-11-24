// default package

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class aa extends b4 {
    public final long a;
    public final long b;
    public final String c;
    public final String d;
    public final long e;
    public static final dc6 f = new dc6("AdBreakStatus", null);
    public static final Parcelable.Creator<aa> CREATOR = new igd((byte) 8);

    public aa(long j, long j2, String str, String str2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = str;
        this.d = str2;
        this.e = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aa)) {
            return false;
        }
        aa aaVar = (aa) obj;
        return this.a == aaVar.a && this.b == aaVar.b && id1.d(this.c, aaVar.c) && id1.d(this.d, aaVar.d) && this.e == aaVar.e;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Long.valueOf(this.b), this.c, this.d, Long.valueOf(this.e)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.q(parcel, 2, 8);
        parcel.writeLong(this.a);
        jte.q(parcel, 3, 8);
        parcel.writeLong(this.b);
        jte.l(parcel, 4, this.c);
        jte.l(parcel, 5, this.d);
        jte.q(parcel, 6, 8);
        parcel.writeLong(this.e);
        jte.s(parcel, r);
    }
}
