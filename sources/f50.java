// default package

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class f50 extends c4 {
    public static final Parcelable.Creator<f50> CREATOR = new t4f(2);
    public final cy a;
    public final Boolean b;
    public final ubc c;
    public final pd9 d;

    public f50(String str, Boolean bool, String str2, String str3) {
        cy a;
        if (str == null) {
            a = null;
        } else {
            try {
                a = cy.a(str);
            } catch (ay | od9 | xgd e) {
                throw new IllegalArgumentException(e);
            }
        }
        this.a = a;
        this.b = bool;
        this.c = str2 == null ? null : ubc.a(str2);
        this.d = str3 != null ? pd9.a(str3) : null;
    }

    public final pd9 b() {
        pd9 pd9Var = this.d;
        if (pd9Var == null) {
            pd9Var = null;
            Boolean bool = this.b;
            if (bool != null) {
                if (bool.booleanValue()) {
                    return pd9.b;
                }
                return null;
            }
        }
        return pd9Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f50)) {
            return false;
        }
        f50 f50Var = (f50) obj;
        return vue.a(this.a, f50Var.a) && vue.a(this.b, f50Var.b) && vue.a(this.c, f50Var.c) && vue.a(b(), f50Var.b());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, b()});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.c);
        String valueOf3 = String.valueOf(this.d);
        StringBuilder p = ik8.p("AuthenticatorSelectionCriteria{\n attachment=", valueOf, ", \n requireResidentKey=");
        p.append(this.b);
        p.append(", \n requireUserVerification=");
        p.append(valueOf2);
        p.append(", \n residentKeyRequirement=");
        return c00.k(p, valueOf3, "\n }");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = bye.r(parcel, 20293);
        cy cyVar = this.a;
        bye.l(parcel, 2, cyVar == null ? null : cyVar.a);
        bye.a(parcel, 3, this.b);
        ubc ubcVar = this.c;
        bye.l(parcel, 4, ubcVar == null ? null : ubcVar.a);
        pd9 b = b();
        bye.l(parcel, 5, b != null ? b.a : null);
        bye.s(parcel, r);
    }
}
