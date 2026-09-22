package org.telegram.ui;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class op0 extends s4.s0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ up0 b;

    public op0(up0 up0Var, int i10) {
        this.b = up0Var;
        this.a = i10;
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ah.h hVar;
        up0 up0Var = this.b;
        aq0 aq0Var = up0Var.p0;
        if (i11 != 0) {
            aq0Var.D0(1);
        }
        if (Build.VERSION.SDK_INT >= 31 && (hVar = aq0Var.f0) != null) {
            hVar.f(i10, i11);
        }
        up0Var.h();
        if (up0Var.K != null) {
            if (up0Var.J == null || !up0Var.c()) {
                return;
            }
            up0Var.J.g(false);
            return;
        }
        yh.m5 m5Var = this.a == 1 ? aq0Var.c : aq0Var.b;
        if (m5Var == null || !up0Var.c()) {
            return;
        }
        m5Var.a();
    }
}
