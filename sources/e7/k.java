package e7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class k extends l {
    public static final Parcelable.Creator<k> CREATOR = new r0(21);
    public final r a;
    public final String b;
    public final int c;

    public k(int i3, int i10, String str) {
        try {
            this.a = r.a(i3);
            this.b = str;
            this.c = i10;
        } catch (q e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return p6.m.k(this.a, kVar.a) && p6.m.k(this.b, kVar.b) && p6.m.k(Integer.valueOf(this.c), Integer.valueOf(kVar.c));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(this.c)});
    }

    public final String toString() {
        p7.d dVar = new p7.d(getClass().getSimpleName(), 1);
        String valueOf = String.valueOf(this.a.a);
        p7.c cVar = new p7.c(0, false);
        ((p7.d) dVar.d).c = cVar;
        dVar.d = cVar;
        cVar.d = valueOf;
        cVar.b = "errorCode";
        String str = this.b;
        if (str != null) {
            dVar.I(str, "errorMessage");
        }
        return dVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        int i10 = this.a.a;
        j8.a.r(parcel, 2, 4);
        parcel.writeInt(i10);
        j8.a.m(parcel, 3, this.b);
        j8.a.r(parcel, 4, 4);
        parcel.writeInt(this.c);
        j8.a.t(parcel, s6);
    }
}
