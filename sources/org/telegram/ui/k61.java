package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class k61 extends f2.a1 {
    public final /* synthetic */ n61 a;

    public k61(n61 n61Var) {
        this.a = n61Var;
    }

    @Override // f2.a1
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        n61 n61Var = this.a;
        if (n61Var.d.G1) {
            AndroidUtilities.hideKeyboard(n61Var.Y);
        }
        n61.S(n61Var);
    }
}
