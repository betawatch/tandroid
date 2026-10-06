package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
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
        k71.Q(k71Var);
    }
}
