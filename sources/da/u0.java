package da;

import java.util.List;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
