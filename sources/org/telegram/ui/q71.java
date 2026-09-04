package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class q71 extends s4.s0 {
    public final /* synthetic */ t71 a;

    public q71(t71 t71Var) {
        this.a = t71Var;
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        t71 t71Var = this.a;
        if (t71Var.d.K1) {
            AndroidUtilities.hideKeyboard(t71Var.c0);
        }
        t71.S(t71Var);
    }
}
