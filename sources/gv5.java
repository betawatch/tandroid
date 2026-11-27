// default package

import sun.misc.Unsafe;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public class gv5 extends sv5 {
    public final boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gv5() {
        super(true);
        boolean z = true;
        y(null);
        Unsafe unsafe = fx.a;
        long j = sv5.a;
        xg2 xg2Var = (xg2) unsafe.getObjectVolatile(this, j);
        yg2 yg2Var = xg2Var instanceof yg2 ? (yg2) xg2Var : null;
        if (yg2Var != null) {
            sv5 j2 = yg2Var.j();
            while (!j2.s()) {
                xg2 xg2Var2 = (xg2) fx.a.getObjectVolatile(j2, j);
                yg2 yg2Var2 = xg2Var2 instanceof yg2 ? (yg2) xg2Var2 : null;
                if (yg2Var2 != null) {
                    j2 = yg2Var2.j();
                }
            }
            this.d = z;
        }
        z = false;
        this.d = z;
    }

    @Override // sv5
    public final boolean s() {
        return this.d;
    }

    @Override // sv5
    public final boolean t() {
        return true;
    }
}
