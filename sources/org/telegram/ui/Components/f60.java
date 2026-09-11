package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class f60 extends s4.s0 {
    public final /* synthetic */ s4.c0 a;
    public final /* synthetic */ r60 b;

    public f60(r60 r60Var, s4.c0 c0Var) {
        this.b = r60Var;
        this.a = c0Var;
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        r60 r60Var = this.b;
        r60.O(r60Var);
        if (!r60Var.R || r60Var.Q) {
            return;
        }
        if (r60Var.S - this.a.N0() < 10) {
            r60Var.X();
        }
    }
}
