// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public class ju9 extends c2 implements wx2 {
    public final zw2 e;

    public ju9(zw2 zw2Var, mx2 mx2Var) {
        super(mx2Var, true);
        this.e = zw2Var;
    }

    @Override // sv5
    public final boolean A() {
        return true;
    }

    @Override // sv5
    public void f(Object obj) {
        q7c.c(xpe.a(this.e), pxd.a(obj));
    }

    @Override // sv5
    public void g(Object obj) {
        this.e.resumeWith(pxd.a(obj));
    }

    @Override // wx2
    public final wx2 getCallerFrame() {
        zw2 zw2Var = this.e;
        if (zw2Var instanceof wx2) {
            return (wx2) zw2Var;
        }
        return null;
    }
}
