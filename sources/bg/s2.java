package bg;

import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.vk0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class s2 extends il0 {
    @Override // org.telegram.ui.Components.il0
    public final boolean D(f2.n1 n1Var) {
        return true;
    }

    @Override // f2.p0
    public final int h() {
        return ag.u0.c().size();
    }

    @Override // f2.p0
    public final void v(f2.n1 n1Var, int i10) {
        m2 m2Var = (m2) n1Var.a;
        ag.u0 u0Var = (ag.u0) ag.u0.c().get(i10);
        m2Var.getClass();
        m2Var.setTypeface(u0Var.d());
        String str = u0Var.c;
        if (str == null) {
            str = LocaleController.getString(u0Var.b);
        }
        m2Var.setText(str);
    }

    @Override // f2.p0
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        m2 m2Var = new m2(viewGroup.getContext());
        m2Var.setLayoutParams(new f2.x0(-1, -2));
        return new vk0(m2Var);
    }
}
