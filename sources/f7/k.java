package f7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
import java.util.Arrays;
import org.telegram.ui.hy0;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
        hy0 hy0Var = new hy0(getClass().getSimpleName(), 9);
        String valueOf = String.valueOf(this.a.a);
        q7.c cVar = new q7.c(8, false);
        ((hy0) hy0Var.d).d = cVar;
        hy0Var.d = cVar;
        cVar.c = valueOf;
        cVar.b = "errorCode";
        String str = this.b;
        if (str != null) {
            hy0Var.N(str, "errorMessage");
        }
        return hy0Var.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        int i10 = this.a.a;
        wb.q(parcel, 2, 4);
        parcel.writeInt(i10);
        wb.l(parcel, 3, this.b);
        wb.q(parcel, 4, 4);
        parcel.writeInt(this.c);
        wb.s(parcel, r10);
    }
}
