package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class p71 extends s4.s0 {
    public final /* synthetic */ s71 a;

    public p71(s71 s71Var) {
        this.a = s71Var;
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        s71 s71Var = this.a;
        if (s71Var.d.K1) {
            AndroidUtilities.hideKeyboard(s71Var.c0);
        }
        s71.S(s71Var);
    }
}
