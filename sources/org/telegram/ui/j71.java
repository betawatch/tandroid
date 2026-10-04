package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class j71 extends s4.s0 {
    public final /* synthetic */ m71 a;

    public j71(m71 m71Var) {
        this.a = m71Var;
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        m71 m71Var = this.a;
        if (m71Var.d.K1) {
            AndroidUtilities.hideKeyboard(m71Var.c0);
        }
        m71.Q(m71Var);
    }
}
