// default package

import j$.util.Objects;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class hb0 {
    public int a;
    public boolean b;
    public int c;
    public int d;
    public int e;
    public int f;

    public final hb0 a() {
        hb0 hb0Var = new hb0();
        hb0Var.c = this.c;
        hb0Var.d = this.d;
        hb0Var.e = this.e;
        hb0Var.f = this.f;
        hb0Var.b = this.b;
        return hb0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hb0)) {
            return false;
        }
        hb0 hb0Var = (hb0) obj;
        return this.c == hb0Var.c && this.d == hb0Var.d && this.e == hb0Var.e && this.f == hb0Var.f;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.c), Integer.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(this.f));
    }
}
