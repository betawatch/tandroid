// default package

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class d60 extends b4 {
    public static final Parcelable.Creator<d60> CREATOR = new e2f(2);
    public final bz a;
    public final Boolean b;
    public final v9c c;
    public final bc9 d;

    public d60(String str, Boolean bool, String str2, String str3) {
        bz a;
        if (str == null) {
            a = null;
        } else {
            try {
                a = bz.a(str);
            } catch (ac9 | az | ged e) {
                throw new IllegalArgumentException(e);
            }
        }
        this.a = a;
        this.b = bool;
        this.c = str2 == null ? null : v9c.a(str2);
        this.d = str3 != null ? bc9.a(str3) : null;
    }

    public final bc9 b() {
        bc9 bc9Var = this.d;
        if (bc9Var == null) {
            bc9Var = null;
            Boolean bool = this.b;
            if (bool != null) {
                if (bool.booleanValue()) {
                    return bc9.b;
                }
                return null;
            }
        }
        return bc9Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d60)) {
            return false;
        }
        d60 d60Var = (d60) obj;
        return fse.a(this.a, d60Var.a) && fse.a(this.b, d60Var.b) && fse.a(this.c, d60Var.c) && fse.a(b(), d60Var.b());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, b()});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.c);
        String valueOf3 = String.valueOf(this.d);
        StringBuilder p = wi8.p("AuthenticatorSelectionCriteria{\n attachment=", valueOf, ", \n requireResidentKey=");
        p.append(this.b);
        p.append(", \n requireUserVerification=");
        p.append(valueOf2);
        p.append(", \n residentKeyRequirement=");
        return b10.j(p, valueOf3, "\n }");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        bz bzVar = this.a;
        mve.l(parcel, 2, bzVar == null ? null : bzVar.a);
        mve.a(parcel, 3, this.b);
        v9c v9cVar = this.c;
        mve.l(parcel, 4, v9cVar == null ? null : v9cVar.a);
        bc9 b = b();
        mve.l(parcel, 5, b != null ? b.a : null);
        mve.s(parcel, r);
    }
}
