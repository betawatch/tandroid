package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
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
