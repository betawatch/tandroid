package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class m extends o6.a {
    public static final Parcelable.Creator<m> CREATOR = new r0(18);
    public final c a;
    public final Boolean b;
    public final j0 c;
    public final e0 d;

    public m(String str, Boolean bool, String str2, String str3) {
        c a2;
        e0 e0Var = null;
        if (str == null) {
            a2 = null;
        } else {
            try {
                a2 = c.a(str);
            } catch (b | d0 | t0 e) {
                throw new IllegalArgumentException(e);
            }
        }
        this.a = a2;
        this.b = bool;
        this.c = str2 == null ? null : j0.a(str2);
        if (str3 != null) {
            e0Var = e0.a(str3);
        }
        this.d = e0Var;
    }

    public final e0 b() {
        e0 e0Var = this.d;
        if (e0Var != null) {
            return e0Var;
        }
        Boolean bool = this.b;
        if (bool == null || !bool.booleanValue()) {
            return null;
        }
        return e0.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return n6.l.k(this.a, mVar.a) && n6.l.k(this.b, mVar.b) && n6.l.k(this.c, mVar.c) && n6.l.k(b(), mVar.b());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, b()});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.c);
        String valueOf3 = String.valueOf(this.d);
        StringBuilder u10 = a1.g.u("AuthenticatorSelectionCriteria{\n attachment=", valueOf, ", \n requireResidentKey=");
        u10.append(this.b);
        u10.append(", \n requireUserVerification=");
        u10.append(valueOf2);
        u10.append(", \n residentKeyRequirement=");
        return a1.g.r(u10, valueOf3, "\n }");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.h0.q(parcel, 20293);
        c cVar = this.a;
        w7.h0.l(parcel, 2, cVar == null ? null : cVar.a);
        w7.h0.a(parcel, 3, this.b);
        j0 j0Var = this.c;
        w7.h0.l(parcel, 4, j0Var == null ? null : j0Var.a);
        e0 b10 = b();
        w7.h0.l(parcel, 5, b10 != null ? b10.a : null);
        w7.h0.r(parcel, q6);
    }
}
