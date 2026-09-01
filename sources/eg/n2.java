package eg;

import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.fl0;
import org.telegram.ui.Components.sl0;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class n2 extends sl0 {
    @Override // org.telegram.ui.Components.sl0
    public final boolean D(f2.m1 m1Var) {
        return true;
    }

    @Override // f2.p0
    public final int h() {
        return dg.s0.c().size();
    }

    @Override // f2.p0
    public final void v(f2.m1 m1Var, int i10) {
        h2 h2Var = (h2) m1Var.a;
        dg.s0 s0Var = (dg.s0) dg.s0.c().get(i10);
        h2Var.getClass();
        h2Var.setTypeface(s0Var.d());
        String str = s0Var.c;
        if (str == null) {
            str = LocaleController.getString(s0Var.b);
        }
        h2Var.setText(str);
    }

    @Override // f2.p0
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        h2 h2Var = new h2(viewGroup.getContext());
        h2Var.setLayoutParams(new f2.x0(-1, -2));
        return new fl0(h2Var);
    }
}
