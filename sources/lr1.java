// default package

import android.content.Context;
import android.text.TextUtils;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class lr1 extends vs9 {
    public final /* synthetic */ mu1 J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lr1(mu1 mu1Var, Context context, mu1 mu1Var2, int i, long j, wjb wjbVar) {
        super(context, mu1Var2, i, j, wjbVar);
        this.J = mu1Var;
    }

    @Override // vs9
    public final void b(boolean z) {
        mu1 mu1Var = this.J;
        mu1Var.y5();
        mu1Var.w5();
        sr1 sr1Var = mu1Var.Bb;
        if (sr1Var != null) {
            sr1Var.setTranslationY(mu1Var.T9 + getCurrentHeight());
        }
        if (z) {
            mu1Var.aa = true;
            mu1Var.Dc();
        }
    }

    @Override // vs9
    public final boolean f(h19 h19Var) {
        int i;
        mu1 mu1Var = this.J;
        mu1Var.F3 = h19Var;
        mu1Var.G3 = h19Var != null;
        if (h19Var == null) {
            hq6 mediaDataController = mu1Var.getMediaDataController();
            mediaDataController.Z0.clear();
            mediaDataController.a1.clear();
            mediaDataController.b1.clear();
            mu1Var.wb(false);
            mu1Var.Zc(0, 0, -1);
        }
        mu1Var.cd();
        mu1Var.Pc();
        mu1Var.I3 = mu1Var.k0.getSearchField().getText().toString();
        hq6 mediaDataController2 = mu1Var.getMediaDataController();
        String str = mu1Var.I3;
        long j = mu1Var.l6;
        long j2 = mu1Var.d7;
        i = ((d) mu1Var).classGuid;
        mediaDataController2.Z1(str, j, j2, i, 0, mu1Var.s4, false, mu1Var.D3, mu1Var.E3, (TextUtils.isEmpty(mu1Var.I3) && mu1Var.F3 == null) ? false : true, mu1Var.F3);
        gl.t1(mu1Var.k0.getSearchField());
        return true;
    }

    @Override // vs9
    public final void h(boolean z) {
        super.h(z);
        mu1 mu1Var = this.J;
        r7 r7Var = mu1Var.k0;
        g(r7Var != null && r7Var.w() && a() && mu1Var.J3 == null);
    }
}
