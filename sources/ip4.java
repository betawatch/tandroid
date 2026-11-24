// default package

import java.util.Iterator;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.FragmentContextView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class ip4 implements m7, l99, ee, lia {
    public final /* synthetic */ FragmentContextView a;

    public /* synthetic */ ip4(FragmentContextView fragmentContextView) {
        this.a = fragmentContextView;
    }

    @Override // lia
    public final void d(cd6 cd6Var) {
        float[] fArr = FragmentContextView.W0;
        this.a.k(cd6Var);
    }

    @Override // l99
    public final void e(m99 m99Var) {
        float[] fArr = FragmentContextView.W0;
        FragmentContextView fragmentContextView = this.a;
        m99 m99Var2 = fragmentContextView.U0;
        float f = 1.0f - m99Var2.a.d.c.a;
        fragmentContextView.d.setAlpha(f);
        fragmentContextView.d.setScaleX(gm.R1(0.7f, 1.0f, f));
        fragmentContextView.d.setScaleY(gm.R1(0.7f, 1.0f, f));
        Iterator it = m99Var2.iterator();
        while (it.hasNext()) {
            u66 u66Var = (u66) it.next();
            float c = u66Var.c();
            Object obj = u66Var.a;
            float R1 = gm.R1(0.7f, 1.0f, c);
            sp4 sp4Var = (sp4) obj;
            s95 s95Var = sp4Var.b;
            s95 s95Var2 = sp4Var.b;
            s95Var.setAlpha(u66Var.c());
            s95Var2.setScaleX(R1);
            s95Var2.setScaleY(R1);
        }
    }

    @Override // m7
    public final void h(int i) {
        float[] fArr = FragmentContextView.W0;
        if (i >= 0) {
            float[] fArr2 = FragmentContextView.W0;
            if (i < 6) {
                MediaController w = MediaController.w();
                FragmentContextView fragmentContextView = this.a;
                float x = w.x(fragmentContextView.W);
                float f = fArr2[i];
                MediaController.w().l0(fragmentContextView.W, f);
                if (x != f) {
                    fragmentContextView.l(x, f, false);
                }
            }
        }
    }

    @Override // ee
    public final void r(he heVar, int i) {
        FragmentContextView fragmentContextView = this.a;
        float[] fArr = FragmentContextView.W0;
        d dVar = fragmentContextView.h;
        if (!(dVar instanceof nk3)) {
            dd6.f(dVar.getCurrentAccount()).k(fragmentContextView.n.a());
            return;
        }
        for (int i2 = 0; i2 < 4; i2++) {
            Utilities.d.c(new uc6(dd6.f(i2), (byte) 6));
        }
    }

    @Override // l99
    public final void c() {
    }
}
