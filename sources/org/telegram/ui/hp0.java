package org.telegram.ui;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class hp0 extends s4.s0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ np0 b;

    public hp0(np0 np0Var, int i10) {
        this.b = np0Var;
        this.a = i10;
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ah.h hVar;
        np0 np0Var = this.b;
        tp0 tp0Var = np0Var.p0;
        if (i11 != 0) {
            tp0Var.D0(1);
        }
        if (Build.VERSION.SDK_INT >= 31 && (hVar = tp0Var.f0) != null) {
            hVar.f(i10, i11);
        }
        np0Var.h();
        if (np0Var.K != null) {
            if (np0Var.J == null || !np0Var.c()) {
                return;
            }
            np0Var.J.g(false);
            return;
        }
        yh.k5 k5Var = this.a == 1 ? tp0Var.c : tp0Var.b;
        if (k5Var == null || !np0Var.c()) {
            return;
        }
        k5Var.a();
    }
}
