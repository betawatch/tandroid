// default package

import sun.misc.Unsafe;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class cv5 extends ov5 {
    public final boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cv5() {
        super(true);
        boolean z = true;
        y(null);
        Unsafe unsafe = fy.a;
        long j = ov5.a;
        th2 th2Var = (th2) unsafe.getObjectVolatile(this, j);
        uh2 uh2Var = th2Var instanceof uh2 ? (uh2) th2Var : null;
        if (uh2Var != null) {
            ov5 j2 = uh2Var.j();
            while (!j2.s()) {
                th2 th2Var2 = (th2) fy.a.getObjectVolatile(j2, j);
                uh2 uh2Var2 = th2Var2 instanceof uh2 ? (uh2) th2Var2 : null;
                if (uh2Var2 != null) {
                    j2 = uh2Var2.j();
                }
            }
            this.d = z;
        }
        z = false;
        this.d = z;
    }

    @Override // ov5
    public final boolean s() {
        return this.d;
    }

    @Override // ov5
    public final boolean t() {
        return true;
    }
}
