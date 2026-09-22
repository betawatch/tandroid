package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class o71 extends s4.s0 {
    public final /* synthetic */ r71 a;

    public o71(r71 r71Var) {
        this.a = r71Var;
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        r71 r71Var = this.a;
        if (r71Var.d.K1) {
            AndroidUtilities.hideKeyboard(r71Var.c0);
        }
        r71.S(r71Var);
    }
}
