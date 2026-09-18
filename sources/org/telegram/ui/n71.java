package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class n71 extends s4.s0 {
    public final /* synthetic */ q71 a;

    public n71(q71 q71Var) {
        this.a = q71Var;
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        q71 q71Var = this.a;
        if (q71Var.d.K1) {
            AndroidUtilities.hideKeyboard(q71Var.c0);
        }
        q71.S(q71Var);
    }
}
