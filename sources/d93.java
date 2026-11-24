// default package

import android.text.TextUtils;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class d93 {
    public final String a;
    public final fm4 b;
    public final fm4 c;
    public final byte d;
    public final int e;

    /* JADX WARN: Multi-variable type inference failed */
    public d93(String str, fm4 fm4Var, fm4 fm4Var2, int i, int i2) {
        gre.f(i == 0 || i2 == 0);
        gre.f(!TextUtils.isEmpty(str));
        this.a = str;
        fm4Var.getClass();
        this.b = fm4Var;
        fm4Var2.getClass();
        this.c = fm4Var2;
        this.d = i;
        this.e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d93.class != obj.getClass()) {
            return false;
        }
        d93 d93Var = (d93) obj;
        return this.d == d93Var.d && this.e == d93Var.e && this.a.equals(d93Var.a) && this.b.equals(d93Var.b) && this.c.equals(d93Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + ir2.j((((527 + this.d) * 31) + this.e) * 31, 31, this.a)) * 31);
    }
}
