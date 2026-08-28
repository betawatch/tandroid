package m6;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
import java.util.Arrays;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class m extends y5.a {
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
            } catch (b | d0 | t0 e10) {
                throw new IllegalArgumentException(e10);
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
        return x5.l.l(this.a, mVar.a) && x5.l.l(this.b, mVar.b) && x5.l.l(this.c, mVar.c) && x5.l.l(b(), mVar.b());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, b()});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.c);
        String valueOf3 = String.valueOf(this.d);
        StringBuilder t10 = aa.d.t("AuthenticatorSelectionCriteria{\n attachment=", valueOf, ", \n requireResidentKey=");
        t10.append(this.b);
        t10.append(", \n requireUserVerification=");
        t10.append(valueOf2);
        t10.append(", \n residentKeyRequirement=");
        return aa.d.r(t10, valueOf3, "\n }");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        c cVar = this.a;
        p8.l(parcel, 2, cVar == null ? null : cVar.a);
        p8.a(parcel, 3, this.b);
        j0 j0Var = this.c;
        p8.l(parcel, 4, j0Var == null ? null : j0Var.a);
        e0 b10 = b();
        p8.l(parcel, 5, b10 != null ? b10.a : null);
        p8.r(parcel, q10);
    }
}
