package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class i61 extends s4.r0 {
    public final /* synthetic */ l61 a;

    public i61(l61 l61Var) {
        this.a = l61Var;
    }

    @Override // s4.r0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        l61 l61Var = this.a;
        if (l61Var.d.I1) {
            AndroidUtilities.hideKeyboard(l61Var.c0);
        }
        l61.S(l61Var);
    }
}
