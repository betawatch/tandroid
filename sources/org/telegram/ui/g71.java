package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class g71 extends s4.s0 {
    public final /* synthetic */ j71 a;

    public g71(j71 j71Var) {
        this.a = j71Var;
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        j71 j71Var = this.a;
        if (j71Var.d.K1) {
            AndroidUtilities.hideKeyboard(j71Var.c0);
        }
        j71.S(j71Var);
    }
}
