package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class rx extends s4.s {
    public final /* synthetic */ tz Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rx(tz tzVar) {
        super(8);
        this.Q = tzVar;
    }

    @Override // s4.b0, s4.n0
    public final void v0(RecyclerView recyclerView, s4.y0 y0Var, int i10) {
        try {
            ei.l1 l1Var = new ei.l1(this, recyclerView.getContext(), 2);
            l1Var.a = i10;
            w0(l1Var);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
