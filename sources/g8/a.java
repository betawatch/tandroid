package g8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import n6.l;
import r7.n;
import w7.h0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class a extends o6.a {
    public static final Parcelable.Creator<a> CREATOR = new g(2);
    public final long a;
    public final int b;
    public final boolean c;
    public final String d;
    public final r7.j e;

    public a(long j10, int i10, boolean z10, String str, r7.j jVar) {
        this.a = j10;
        this.b = i10;
        this.c = z10;
        this.d = str;
        this.e = jVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c && l.k(this.d, aVar.d) && l.k(this.e, aVar.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Integer.valueOf(this.b), Boolean.valueOf(this.c)});
    }

    public final String toString() {
        String str;
        StringBuilder t10 = a1.g.t("LastLocationRequest[");
        long j10 = this.a;
        if (j10 != Long.MAX_VALUE) {
            t10.append("maxAge=");
            n.a(j10, t10);
        }
        int i10 = this.b;
        if (i10 != 0) {
            t10.append(", ");
            if (i10 == 0) {
                str = "GRANULARITY_PERMISSION_LEVEL";
            } else if (i10 == 1) {
                str = "GRANULARITY_COARSE";
            } else {
                if (i10 != 2) {
                    throw new IllegalArgumentException();
                }
                str = "GRANULARITY_FINE";
            }
            t10.append(str);
        }
        if (this.c) {
            t10.append(", bypass");
        }
        String str2 = this.d;
        if (str2 != null) {
            t10.append(", moduleId=");
            t10.append(str2);
        }
        r7.j jVar = this.e;
        if (jVar != null) {
            t10.append(", impersonation=");
            t10.append(jVar);
        }
        t10.append(']');
        return t10.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.s(parcel, 1, 8);
        parcel.writeLong(this.a);
        h0.s(parcel, 2, 4);
        parcel.writeInt(this.b);
        h0.s(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        h0.l(parcel, 4, this.d);
        h0.k(parcel, 5, this.e, i10);
        h0.r(parcel, q6);
    }
}
