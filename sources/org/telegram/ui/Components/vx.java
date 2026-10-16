package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class vx extends s4.s {
    public final /* synthetic */ wz Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vx(wz wzVar) {
        super(8);
        this.Q = wzVar;
    }

    @Override // s4.b0, s4.n0
    public final void v0(RecyclerView recyclerView, s4.y0 y0Var, int i10) {
        try {
            di.l1 l1Var = new di.l1(this, recyclerView.getContext(), 2);
            l1Var.a = i10;
            w0(l1Var);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
