package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class hp0 extends s4.u0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ np0 b;

    public hp0(np0 np0Var, int i10) {
        this.b = np0Var;
        this.a = i10;
    }

    @Override // s4.u0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        np0 np0Var = this.b;
        tp0 tp0Var = np0Var.p0;
        np0Var.h();
        if (np0Var.K != null) {
            if (np0Var.J == null || !np0Var.c()) {
                return;
            }
            np0Var.J.g(false);
            return;
        }
        bi.t9 t9Var = this.a == 1 ? tp0Var.c : tp0Var.b;
        if (t9Var == null || !np0Var.c()) {
            return;
        }
        t9Var.b();
    }
}
