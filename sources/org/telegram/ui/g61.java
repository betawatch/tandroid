package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class g61 extends s4.r0 {
    public final /* synthetic */ j61 a;

    public g61(j61 j61Var) {
        this.a = j61Var;
    }

    @Override // s4.r0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        j61 j61Var = this.a;
        if (j61Var.d.I1) {
            AndroidUtilities.hideKeyboard(j61Var.c0);
        }
        j61.T(j61Var);
    }
}
