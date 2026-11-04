package e7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class m extends q6.a {
    public static final Parcelable.Creator<m> CREATOR = new r0(22);
    public final c a;
    public final Boolean b;
    public final j0 c;
    public final e0 d;

    public m(String str, Boolean bool, String str2, String str3) {
        c a10;
        e0 e0Var = null;
        if (str == null) {
            a10 = null;
        } else {
            try {
                a10 = c.a(str);
            } catch (b | d0 | t0 e10) {
                throw new IllegalArgumentException(e10);
            }
        }
        this.a = a10;
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
        return p6.m.k(this.a, mVar.a) && p6.m.k(this.b, mVar.b) && p6.m.k(this.c, mVar.c) && p6.m.k(b(), mVar.b());
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
        return a1.g.s(u10, valueOf3, "\n }");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        c cVar = this.a;
        j8.a.m(parcel, 2, cVar == null ? null : cVar.a);
        j8.a.b(parcel, 3, this.b);
        j0 j0Var = this.c;
        j8.a.m(parcel, 4, j0Var == null ? null : j0Var.a);
        e0 b10 = b();
        j8.a.m(parcel, 5, b10 != null ? b10.a : null);
        j8.a.t(parcel, s6);
    }
}
