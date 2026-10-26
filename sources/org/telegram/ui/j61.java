package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class j61 extends s4.u0 {
    public final /* synthetic */ m61 a;

    public j61(m61 m61Var) {
        this.a = m61Var;
    }

    @Override // s4.u0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        m61 m61Var = this.a;
        if (m61Var.d.I1) {
            AndroidUtilities.hideKeyboard(m61Var.c0);
        }
        m61.S(m61Var);
    }
}
