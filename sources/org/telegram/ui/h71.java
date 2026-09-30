package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
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
