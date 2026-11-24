// default package

import j$.util.Objects;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class jf7 implements jd7 {
    public final float a;
    public final if7 b;
    public final if7 c;

    public jf7(float f, if7 if7Var, if7 if7Var2) {
        this.a = f;
        this.b = if7Var;
        this.c = if7Var2;
    }

    @Override // jd7
    public final fm4 a() {
        return null;
    }

    @Override // jd7
    public final byte[] c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof jf7)) {
            return false;
        }
        jf7 jf7Var = (jf7) obj;
        return Float.compare(this.a, jf7Var.a) == 0 && Objects.equals(this.b, jf7Var.b) && Objects.equals(this.c, jf7Var.c);
    }

    public final int hashCode() {
        int floatToIntBits = Float.floatToIntBits(this.a) * 31;
        if7 if7Var = this.b;
        int hashCode = (floatToIntBits + (if7Var != null ? if7Var.hashCode() : 0)) * 31;
        if7 if7Var2 = this.c;
        return hashCode + (if7Var2 != null ? if7Var2.hashCode() : 0);
    }

    public final String toString() {
        return "ReplayGain Xing/Info: peak=" + this.a + ", field 1=" + this.b + ", field 2=" + this.c;
    }

    @Override // jd7
    public final void b(hr6 hr6Var) {
    }
}
