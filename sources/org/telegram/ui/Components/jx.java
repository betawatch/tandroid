package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class jx extends s4.s {
    public final /* synthetic */ kz Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jx(kz kzVar) {
        super(8);
        this.Q = kzVar;
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
