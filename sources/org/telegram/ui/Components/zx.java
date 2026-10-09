package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class zx extends s4.s {
    public final /* synthetic */ a00 Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zx(a00 a00Var) {
        super(8);
        this.Q = a00Var;
    }

    @Override // s4.d0, s4.p0
    public final void v0(RecyclerView recyclerView, s4.a1 a1Var, int i10) {
        try {
            ci.l1 l1Var = new ci.l1(this, recyclerView.getContext(), 2);
            l1Var.a = i10;
            w0(l1Var);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }
}
