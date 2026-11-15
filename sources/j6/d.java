package j6;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import f7.t0;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class d extends r6.a {
    public static final Parcelable.Creator<d> CREATOR = new t0(28);
    public double a;
    public boolean b;
    public int c;
    public f6.d d;
    public int e;
    public f6.x f;
    public double h;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.a == dVar.a && this.b == dVar.b && this.c == dVar.c && a.d(this.d, dVar.d) && this.e == dVar.e) {
            f6.x xVar = this.f;
            if (a.d(xVar, xVar) && this.h == dVar.h) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Double.valueOf(this.a), Boolean.valueOf(this.b), Integer.valueOf(this.c), this.d, Integer.valueOf(this.e), this.f, Double.valueOf(this.h)});
    }

    public final String toString() {
        return String.format(Locale.ROOT, "volume=%f", Double.valueOf(this.a));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        double d = this.a;
        yb.q(parcel, 2, 8);
        parcel.writeDouble(d);
        boolean z10 = this.b;
        yb.q(parcel, 3, 4);
        parcel.writeInt(z10 ? 1 : 0);
        int i10 = this.c;
        yb.q(parcel, 4, 4);
        parcel.writeInt(i10);
        yb.k(parcel, 5, this.d, i7);
        int i11 = this.e;
        yb.q(parcel, 6, 4);
        parcel.writeInt(i11);
        yb.k(parcel, 7, this.f, i7);
        double d2 = this.h;
        yb.q(parcel, 8, 8);
        parcel.writeDouble(d2);
        yb.s(parcel, r10);
    }
}
