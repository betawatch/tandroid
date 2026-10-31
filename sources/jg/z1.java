package jg;

import android.view.ViewGroup;
import org.telegram.messenger.cd;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.sk0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class z1 extends sk0 {
    @Override // org.telegram.ui.Components.sk0
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
            str = cd.M0(h0Var.b);
        }
        s1Var.setText(str);
    }

    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        s1 s1Var = new s1(viewGroup.getContext());
        s1Var.setLayoutParams(new s4.o0(-1, -2));
        return new ck0(s1Var);
    }
}
