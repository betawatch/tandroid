// default package

import android.view.View;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class da5 implements oo4, ed, no7 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qa5 b;

    public /* synthetic */ da5(qa5 qa5Var, byte b) {
        this.a = b;
        this.b = qa5Var;
    }

    @Override // no7
    public final vxc W(View view, vxc vxcVar) {
        int i = gl.H0(vxcVar, false).d;
        qa5 qa5Var = this.b;
        qa5Var.n0 = i;
        eb0 eb0Var = qa5Var.G;
        if (eb0Var != null) {
            eb0Var.setPadding(0, 0, 0, i);
        }
        qa5Var.k0();
        qa5Var.i0();
        return vxc.b;
    }

    @Override // oo4
    public final void a(int i) {
        this.b.b.a(Math.min(i, r1.d0));
    }

    @Override // ed
    public final void u(hd hdVar, int i) {
        byte b = this.a;
        qa5 qa5Var = this.b;
        switch (b) {
            case 1:
                qa5Var.r0();
                break;
            default:
                qa5Var.finishFragment();
                break;
        }
    }
}
