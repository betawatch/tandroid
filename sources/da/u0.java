package da;

import java.util.List;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class u0 {
    public i2 a;
    public List b;
    public List c;
    public Boolean d;
    public j2 e;
    public List f;
    public int g;
    public byte h;

    public final v0 a() {
        i2 i2Var;
        if (this.h == 1 && (i2Var = this.a) != null) {
            return new v0(i2Var, this.b, this.c, this.d, this.e, this.f, this.g);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.a == null) {
            sb2.append(" execution");
        }
        if ((1 & this.h) == 0) {
            sb2.append(" uiOrientation");
        }
        throw new IllegalStateException(a8.p0.q("Missing required properties:", sb2));
    }
}
