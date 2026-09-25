package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class lx extends s4.s {
    public final /* synthetic */ lz Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lx(lz lzVar) {
        super(8);
        this.Q = lzVar;
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
