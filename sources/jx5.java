// default package

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class jx5 extends b4 {
    public static final Parcelable.Creator<jx5> CREATOR = new xff((byte) 2);
    public final long a;
    public final int b;
    public final boolean c;
    public final String d;
    public final bnd e;

    public jx5(long j, int i, boolean z, String str, bnd bndVar) {
        this.a = j;
        this.b = i;
        this.c = z;
        this.d = str;
        this.e = bndVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof jx5)) {
            return false;
        }
        jx5 jx5Var = (jx5) obj;
        return this.a == jx5Var.a && this.b == jx5Var.b && this.c == jx5Var.c && cqe.a(this.d, jx5Var.d) && cqe.a(this.e, jx5Var.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Integer.valueOf(this.b), Boolean.valueOf(this.c)});
    }

    public final String toString() {
        String str;
        StringBuilder r = tb4.r("LastLocationRequest[");
        long j = this.a;
        if (j != Long.MAX_VALUE) {
            r.append("maxAge=");
            spd.a(j, r);
        }
        int i = this.b;
        if (i != 0) {
            r.append(", ");
            if (i == 0) {
                str = "GRANULARITY_PERMISSION_LEVEL";
            } else if (i == 1) {
                str = "GRANULARITY_COARSE";
            } else {
                if (i != 2) {
                    sc8.e();
                    return null;
                }
                str = "GRANULARITY_FINE";
            }
            r.append(str);
        }
        if (this.c) {
            r.append(", bypass");
        }
        String str2 = this.d;
        if (str2 != null) {
            r.append(", moduleId=");
            r.append(str2);
        }
        bnd bndVar = this.e;
        if (bndVar != null) {
            r.append(", impersonation=");
            r.append(bndVar);
        }
        r.append(']');
        return r.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.q(parcel, 1, 8);
        parcel.writeLong(this.a);
        jte.q(parcel, 2, 4);
        parcel.writeInt(this.b);
        jte.q(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        jte.l(parcel, 4, this.d);
        jte.k(parcel, 5, this.e, i);
        jte.s(parcel, r);
    }
}
