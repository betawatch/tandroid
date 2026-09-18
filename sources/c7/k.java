package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes.dex */
public final class k extends l {
    public static final Parcelable.Creator<k> CREATOR = new r0(17);
    public final r a;
    public final String b;
    public final int c;

    public k(int i10, int i11, String str) {
        try {
            this.a = r.a(i10);
            this.b = str;
            this.c = i11;
        } catch (q e) {
            throw new IllegalArgumentException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return n6.l.l(this.a, kVar.a) && n6.l.l(this.b, kVar.b) && n6.l.l(Integer.valueOf(this.c), Integer.valueOf(kVar.c));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(this.c)});
    }

    public final String toString() {
        lf.i iVar = new lf.i(getClass().getSimpleName());
        String valueOf = String.valueOf(this.a.a);
        n7.c cVar = new n7.c(7, false);
        ((lf.i) iVar.d).d = cVar;
        iVar.d = cVar;
        cVar.c = valueOf;
        cVar.b = "errorCode";
        String str = this.b;
        if (str != null) {
            iVar.Z(str, "errorMessage");
        }
        return iVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        int i11 = this.a.a;
        w7.f0.s(parcel, 2, 4);
        parcel.writeInt(i11);
        w7.f0.l(parcel, 3, this.b);
        w7.f0.s(parcel, 4, 4);
        parcel.writeInt(this.c);
        w7.f0.r(parcel, q6);
    }
}
