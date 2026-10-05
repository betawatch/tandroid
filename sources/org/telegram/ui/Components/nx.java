package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class nx extends s4.s {
    public final /* synthetic */ nz Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nx(nz nzVar) {
        super(8);
        this.Q = nzVar;
    }

    @Override // s4.c0, s4.o0
    public final void v0(RecyclerView recyclerView, s4.z0 z0Var, int i10) {
        try {
            ci.m1 m1Var = new ci.m1(this, recyclerView.getContext(), 2);
            m1Var.a = i10;
            w0(m1Var);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }
}
