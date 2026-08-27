package n6;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;
import java.util.Arrays;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class m extends z5.a {
    public static final Parcelable.Creator<m> CREATOR = new o0(29);
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
            } catch (b | d0 | t0 e9) {
                throw new IllegalArgumentException(e9);
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
        return y5.l.l(this.a, mVar.a) && y5.l.l(this.b, mVar.b) && y5.l.l(this.c, mVar.c) && y5.l.l(b(), mVar.b());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, b()});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.c);
        String valueOf3 = String.valueOf(this.d);
        StringBuilder r10 = a9.p.r("AuthenticatorSelectionCriteria{\n attachment=", valueOf, ", \n requireResidentKey=");
        r10.append(this.b);
        r10.append(", \n requireUserVerification=");
        r10.append(valueOf2);
        r10.append(", \n residentKeyRequirement=");
        return a9.p.p(r10, valueOf3, "\n }");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = r8.q(parcel, 20293);
        c cVar = this.a;
        r8.l(parcel, 2, cVar == null ? null : cVar.a);
        r8.a(parcel, 3, this.b);
        j0 j0Var = this.c;
        r8.l(parcel, 4, j0Var == null ? null : j0Var.a);
        e0 b10 = b();
        r8.l(parcel, 5, b10 != null ? b10.a : null);
        r8.r(parcel, q6);
    }
}
