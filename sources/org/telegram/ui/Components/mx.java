package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class mx extends s4.s {
    public final /* synthetic */ mz Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mx(mz mzVar) {
        super(8);
        this.Q = mzVar;
    }

    @Override // s4.c0, s4.o0
    public final void v0(RecyclerView recyclerView, s4.z0 z0Var, int i10) {
        try {
            ci.m1 m1Var = new ci.m1(this, recyclerView.getContext(), 2);
            m1Var.a = i10;
            w0(m1Var);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
