package org.telegram.ui;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class ip0 extends s4.s0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ op0 b;

    public ip0(op0 op0Var, int i10) {
        this.b = op0Var;
        this.a = i10;
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ah.h hVar;
        op0 op0Var = this.b;
        up0 up0Var = op0Var.p0;
        if (i11 != 0) {
            up0Var.D0(1);
        }
        if (Build.VERSION.SDK_INT >= 31 && (hVar = up0Var.f0) != null) {
            hVar.f(i10, i11);
        }
        op0Var.h();
        if (op0Var.K != null) {
            if (op0Var.J == null || !op0Var.c()) {
                return;
            }
            op0Var.J.g(false);
            return;
        }
        yh.l5 l5Var = this.a == 1 ? up0Var.c : up0Var.b;
        if (l5Var == null || !op0Var.c()) {
            return;
        }
        l5Var.a();
    }
}
