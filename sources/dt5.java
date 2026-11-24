// default package

import sun.misc.Unsafe;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public class dt5 extends pt5 {
    public final boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dt5() {
        super(true);
        boolean z = true;
        y(null);
        Unsafe unsafe = ex.a;
        long j = pt5.a;
        fg2 fg2Var = (fg2) unsafe.getObjectVolatile(this, j);
        gg2 gg2Var = fg2Var instanceof gg2 ? (gg2) fg2Var : null;
        if (gg2Var != null) {
            pt5 j2 = gg2Var.j();
            while (!j2.s()) {
                fg2 fg2Var2 = (fg2) ex.a.getObjectVolatile(j2, j);
                gg2 gg2Var2 = fg2Var2 instanceof gg2 ? (gg2) fg2Var2 : null;
                if (gg2Var2 != null) {
                    j2 = gg2Var2.j();
                }
            }
            this.d = z;
        }
        z = false;
        this.d = z;
    }

    @Override // pt5
    public final boolean s() {
        return this.d;
    }

    @Override // pt5
    public final boolean t() {
        return true;
    }
}
