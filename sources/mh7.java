// default package

import j$.util.Objects;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class mh7 implements lf7 {
    public final float a;
    public final lh7 b;
    public final lh7 c;

    public mh7(float f, lh7 lh7Var, lh7 lh7Var2) {
        this.a = f;
        this.b = lh7Var;
        this.c = lh7Var2;
    }

    @Override // lf7
    public final go4 a() {
        return null;
    }

    @Override // lf7
    public final byte[] c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof mh7)) {
            return false;
        }
        mh7 mh7Var = (mh7) obj;
        return Float.compare(this.a, mh7Var.a) == 0 && Objects.equals(this.b, mh7Var.b) && Objects.equals(this.c, mh7Var.c);
    }

    public final int hashCode() {
        int floatToIntBits = Float.floatToIntBits(this.a) * 31;
        lh7 lh7Var = this.b;
        int hashCode = (floatToIntBits + (lh7Var != null ? lh7Var.hashCode() : 0)) * 31;
        lh7 lh7Var2 = this.c;
        return hashCode + (lh7Var2 != null ? lh7Var2.hashCode() : 0);
    }

    public final String toString() {
        return "ReplayGain Xing/Info: peak=" + this.a + ", field 1=" + this.b + ", field 2=" + this.c;
    }

    @Override // lf7
    public final void b(ht6 ht6Var) {
    }
}
