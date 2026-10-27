package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class m61 extends s4.u0 {
    public final /* synthetic */ p61 a;

    public m61(p61 p61Var) {
        this.a = p61Var;
    }

    @Override // s4.u0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        p61 p61Var = this.a;
        if (p61Var.d.I1) {
            AndroidUtilities.hideKeyboard(p61Var.c0);
        }
        p61.S(p61Var);
    }
}
