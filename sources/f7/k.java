package f7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import java.util.Arrays;
import org.telegram.ui.ld0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
        return q6.m.k(this.a, kVar.a) && q6.m.k(this.b, kVar.b) && q6.m.k(Integer.valueOf(this.c), Integer.valueOf(kVar.c));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(this.c)});
    }

    public final String toString() {
        ld0 ld0Var = new ld0(getClass().getSimpleName(), 10);
        String valueOf = String.valueOf(this.a.a);
        q7.c cVar = new q7.c(9, false);
        ((ld0) ld0Var.c).c = cVar;
        ld0Var.c = cVar;
        cVar.b = valueOf;
        cVar.d = "errorCode";
        String str = this.b;
        if (str != null) {
            ld0Var.L(str, "errorMessage");
        }
        return ld0Var.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        int i10 = this.a.a;
        yb.q(parcel, 2, 4);
        parcel.writeInt(i10);
        yb.l(parcel, 3, this.b);
        yb.q(parcel, 4, 4);
        parcel.writeInt(this.c);
        yb.s(parcel, r10);
    }
}
