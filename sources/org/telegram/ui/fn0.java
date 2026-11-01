package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class fn0 extends s4.s0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ln0 b;

    public fn0(ln0 ln0Var, int i10) {
        this.b = ln0Var;
        this.a = i10;
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ln0 ln0Var = this.b;
        rn0 rn0Var = ln0Var.p0;
        ln0Var.h();
        if (ln0Var.K != null) {
            if (ln0Var.J == null || !ln0Var.c()) {
                return;
            }
            ln0Var.J.g(false);
            return;
        }
        rh.v5 v5Var = this.a == 1 ? rn0Var.c : rn0Var.b;
        if (v5Var == null || !ln0Var.c()) {
            return;
        }
        v5Var.b();
    }
}
