// default package

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class d50 extends b4 {
    public static final Parcelable.Creator<d50> CREATOR = new c0f(2);
    public final ay a;
    public final Boolean b;
    public final u7c c;
    public final ba9 d;

    public d50(String str, Boolean bool, String str2, String str3) {
        ay a;
        if (str == null) {
            a = null;
        } else {
            try {
                a = ay.a(str);
            } catch (aa9 | ecd | zx e) {
                throw new IllegalArgumentException(e);
            }
        }
        this.a = a;
        this.b = bool;
        this.c = str2 == null ? null : u7c.a(str2);
        this.d = str3 != null ? ba9.a(str3) : null;
    }

    public final ba9 b() {
        ba9 ba9Var = this.d;
        if (ba9Var == null) {
            ba9Var = null;
            Boolean bool = this.b;
            if (bool != null) {
                if (bool.booleanValue()) {
                    return ba9.b;
                }
                return null;
            }
        }
        return ba9Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d50)) {
            return false;
        }
        d50 d50Var = (d50) obj;
        return cqe.a(this.a, d50Var.a) && cqe.a(this.b, d50Var.b) && cqe.a(this.c, d50Var.c) && cqe.a(b(), d50Var.b());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, b()});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.c);
        String valueOf3 = String.valueOf(this.d);
        StringBuilder p = ug8.p("AuthenticatorSelectionCriteria{\n attachment=", valueOf, ", \n requireResidentKey=");
        p.append(this.b);
        p.append(", \n requireUserVerification=");
        p.append(valueOf2);
        p.append(", \n residentKeyRequirement=");
        return b00.j(p, valueOf3, "\n }");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        ay ayVar = this.a;
        jte.l(parcel, 2, ayVar == null ? null : ayVar.a);
        jte.a(parcel, 3, this.b);
        u7c u7cVar = this.c;
        jte.l(parcel, 4, u7cVar == null ? null : u7cVar.a);
        ba9 b = b();
        jte.l(parcel, 5, b != null ? b.a : null);
        jte.s(parcel, r);
    }
}
