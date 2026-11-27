// default package

import android.view.View;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ec5 implements sq4, fd, nr7 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rc5 b;

    public /* synthetic */ ec5(rc5 rc5Var, byte b) {
        this.a = b;
        this.b = rc5Var;
    }

    @Override // nr7
    public final l2d S(View view, l2d l2dVar) {
        int i = hl.H0(l2dVar, false).d;
        rc5 rc5Var = this.b;
        rc5Var.n0 = i;
        gb0 gb0Var = rc5Var.G;
        if (gb0Var != null) {
            gb0Var.setPadding(0, 0, 0, i);
        }
        rc5Var.k0();
        rc5Var.i0();
        return l2d.b;
    }

    @Override // sq4
    public final void a(int i) {
        this.b.b.a(Math.min(i, r1.d0));
    }

    @Override // fd
    public final void w(id idVar, int i) {
        byte b = this.a;
        rc5 rc5Var = this.b;
        switch (b) {
            case 1:
                rc5Var.r0();
                break;
            default:
                rc5Var.finishFragment();
                break;
        }
    }
}
