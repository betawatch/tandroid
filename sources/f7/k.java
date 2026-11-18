package f7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import java.util.Arrays;
import org.telegram.ui.md0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class k extends l {
    public static final Parcelable.Creator<k> CREATOR = new t0(6);
    public final r a;
    public final String b;
    public final int c;

    public k(int i7, int i10, String str) {
        try {
            this.a = r.a(i7);
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
        return q6.m.l(this.a, kVar.a) && q6.m.l(this.b, kVar.b) && q6.m.l(Integer.valueOf(this.c), Integer.valueOf(kVar.c));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(this.c)});
    }

    public final String toString() {
        md0 md0Var = new md0(getClass().getSimpleName(), 10);
        String valueOf = String.valueOf(this.a.a);
        q7.c cVar = new q7.c(9, false);
        ((md0) md0Var.c).c = cVar;
        md0Var.c = cVar;
        cVar.b = valueOf;
        cVar.d = "errorCode";
        String str = this.b;
        if (str != null) {
            md0Var.L(str, "errorMessage");
        }
        return md0Var.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        int i10 = this.a.a;
        bc.q(parcel, 2, 4);
        parcel.writeInt(i10);
        bc.l(parcel, 3, this.b);
        bc.q(parcel, 4, 4);
        parcel.writeInt(this.c);
        bc.s(parcel, r10);
    }
}
