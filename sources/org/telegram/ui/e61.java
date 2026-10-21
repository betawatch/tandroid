package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class e61 extends s4.r0 {
    public final /* synthetic */ h61 a;

    public e61(h61 h61Var) {
        this.a = h61Var;
    }

    @Override // s4.r0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        h61 h61Var = this.a;
        if (h61Var.d.I1) {
            AndroidUtilities.hideKeyboard(h61Var.c0);
        }
        h61.T(h61Var);
    }
}
