package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class h71 extends s4.s0 {
    public final /* synthetic */ k71 a;

    public h71(k71 k71Var) {
        this.a = k71Var;
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        k71 k71Var = this.a;
        if (k71Var.d.K1) {
            AndroidUtilities.hideKeyboard(k71Var.c0);
        }
        k71.S(k71Var);
    }
}
