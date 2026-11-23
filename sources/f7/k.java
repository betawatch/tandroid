package f7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.cc;
import java.util.Arrays;
import org.telegram.ui.Components.i61;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
        i61 i61Var = new i61(getClass().getSimpleName());
        String valueOf = String.valueOf(this.a.a);
        q7.c cVar = new q7.c(11, false);
        ((i61) i61Var.d).d = cVar;
        i61Var.d = cVar;
        cVar.c = valueOf;
        cVar.b = "errorCode";
        String str = this.b;
        if (str != null) {
            i61Var.R(str, "errorMessage");
        }
        return i61Var.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = cc.r(parcel, 20293);
        int i10 = this.a.a;
        cc.q(parcel, 2, 4);
        parcel.writeInt(i10);
        cc.l(parcel, 3, this.b);
        cc.q(parcel, 4, 4);
        parcel.writeInt(this.c);
        cc.s(parcel, r10);
    }
}
