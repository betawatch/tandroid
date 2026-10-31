package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class l31 extends s4.g0 {
    public Context c;
    public View d;
    public int e;

    public final void D(View view) {
        if (this.d == view) {
            return;
        }
        this.e++;
        this.d = view;
        g(1);
    }

    @Override // s4.g0
    public final int b() {
        return 2;
    }

    @Override // s4.g0
    public final int d(int i10) {
        if (i10 == 0) {
            return 0;
        }
        return this.e;
    }

    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        return i10 == 0 ? new ck0(new bn(this.c, 9)) : new ck0(this.d);
    }

    @Override // s4.g0
    public final void t(s4.c1 c1Var, int i10) {
    }
}
