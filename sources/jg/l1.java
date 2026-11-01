package jg;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.ui.Components.dk0;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class l1 extends s4.g0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ n1 d;

    public l1(n1 n1Var, Context context) {
        this.d = n1Var;
        this.c = context;
    }

    @Override // s4.g0
    public final int b() {
        return 14;
    }

    @Override // s4.g0
    public final void t(s4.c1 c1Var, int i10) {
        m1 m1Var = (m1) c1Var.a;
        ViewGroup.LayoutParams layoutParams = m1Var.getLayoutParams();
        n1 n1Var = this.d;
        layoutParams.height = ((n1Var.getHeight() - n1Var.getPaddingTop()) - n1Var.getPaddingBottom()) / 2;
        ig.s0 s0Var = n1Var.h3;
        if (s0Var != null) {
            m1Var.a = s0Var.b(i10);
            m1Var.invalidate();
            m1Var.b = n1Var.g3 == i10 ? 1.0f : 0.0f;
            m1Var.invalidate();
        }
    }

    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        return new dk0(new m1(this.d, this.c));
    }
}
