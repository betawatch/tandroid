package o6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class m extends a6.a {
    public static final Parcelable.Creator<m> CREATOR = new w0(0);
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
        return z5.l.l(this.a, mVar.a) && z5.l.l(this.b, mVar.b) && z5.l.l(this.c, mVar.c) && z5.l.l(b(), mVar.b());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, b()});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.c);
        String valueOf3 = String.valueOf(this.d);
        StringBuilder s10 = a4.w.s("AuthenticatorSelectionCriteria{\n attachment=", valueOf, ", \n requireResidentKey=");
        s10.append(this.b);
        s10.append(", \n requireUserVerification=");
        s10.append(valueOf2);
        s10.append(", \n residentKeyRequirement=");
        return a4.w.q(s10, valueOf3, "\n }");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        c cVar = this.a;
        com.google.android.gms.internal.cast.o.l(parcel, 2, cVar == null ? null : cVar.a);
        com.google.android.gms.internal.cast.o.a(parcel, 3, this.b);
        j0 j0Var = this.c;
        com.google.android.gms.internal.cast.o.l(parcel, 4, j0Var == null ? null : j0Var.a);
        e0 b10 = b();
        com.google.android.gms.internal.cast.o.l(parcel, 5, b10 != null ? b10.a : null);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
