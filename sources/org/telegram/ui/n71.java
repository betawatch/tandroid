package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
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
