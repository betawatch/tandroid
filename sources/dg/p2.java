package dg;

import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.el0;
import org.telegram.ui.Components.rl0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class p2 extends rl0 {
    @Override // org.telegram.ui.Components.rl0
    public final boolean D(f2.l1 l1Var) {
        return true;
    }

    @Override // f2.o0
    public final int h() {
        return cg.t0.c().size();
    }

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        j2 j2Var = (j2) l1Var.a;
        cg.t0 t0Var = (cg.t0) cg.t0.c().get(i10);
        j2Var.getClass();
        j2Var.setTypeface(t0Var.d());
        String str = t0Var.c;
        if (str == null) {
            str = LocaleController.getString(t0Var.b);
        }
        j2Var.setText(str);
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        j2 j2Var = new j2(viewGroup.getContext());
        j2Var.setLayoutParams(new f2.w0(-1, -2));
        return new el0(j2Var);
    }
}
