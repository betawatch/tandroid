// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
