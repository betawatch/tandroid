package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final class lx extends s4.s {
    public final /* synthetic */ kz Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lx(kz kzVar) {
        super(8);
        this.Q = kzVar;
    }

    @Override // s4.c0, s4.o0
    public final void v0(RecyclerView recyclerView, s4.z0 z0Var, int i10) {
        try {
            di.m1 m1Var = new di.m1(this, recyclerView.getContext(), 2);
            m1Var.a = i10;
            w0(m1Var);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }
}
