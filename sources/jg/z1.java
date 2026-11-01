package jg;

import android.view.ViewGroup;
import org.telegram.messenger.dd;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.tk0;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class z1 extends tk0 {
    @Override // org.telegram.ui.Components.tk0
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override // s4.g0
    public final int b() {
        return ig.h0.c().size();
    }

    @Override // s4.g0
    public final void t(s4.c1 c1Var, int i10) {
        s1 s1Var = (s1) c1Var.a;
        ig.h0 h0Var = (ig.h0) ig.h0.c().get(i10);
        s1Var.getClass();
        s1Var.setTypeface(h0Var.d());
        String str = h0Var.c;
        if (str == null) {
            str = dd.M0(h0Var.b);
        }
        s1Var.setText(str);
    }

    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        s1 s1Var = new s1(viewGroup.getContext());
        s1Var.setLayoutParams(new s4.o0(-1, -2));
        return new dk0(s1Var);
    }
}
