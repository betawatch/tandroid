// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class fy2 extends c2 implements ay2 {
    public static final ey2 b = new ey2(jk2.b, new dy2((byte) 0));

    public fy2() {
        super(jk2.b);
    }

    public void c(cy2 cy2Var, Runnable runnable) {
        jc3.d.c(cy2Var, runnable);
    }

    public boolean d(cy2 cy2Var) {
        return !(this instanceof q6c);
    }

    public fy2 e(int i) {
        upe.a(i);
        return new j46(this, i);
    }

    @Override // c2, cy2
    public final ay2 get(by2 by2Var) {
        ay2 ay2Var;
        by2Var.getClass();
        if (!(by2Var instanceof ey2)) {
            if (jk2.b == by2Var) {
                return this;
            }
            return null;
        }
        ey2 ey2Var = (ey2) by2Var;
        by2 by2Var2 = this.a;
        if ((by2Var2 == ey2Var || ey2Var.b == by2Var2) && (ay2Var = (ay2) ey2Var.a.invoke(this)) != null) {
            return ay2Var;
        }
        return null;
    }

    @Override // c2, cy2
    public final cy2 minusKey(by2 by2Var) {
        by2Var.getClass();
        if (by2Var instanceof ey2) {
            ey2 ey2Var = (ey2) by2Var;
            by2 by2Var2 = this.a;
            if (by2Var2 != ey2Var && ey2Var.b != by2Var2) {
                return this;
            }
            if (((ay2) ey2Var.a.invoke(this)) == null) {
                return this;
            }
        } else if (jk2.b != by2Var) {
            return this;
        }
        return k34.a;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + ea3.a(this);
    }
}
