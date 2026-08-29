package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ex extends f2.w {
    public final /* synthetic */ fz Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ex(fz fzVar) {
        super(8);
        this.Q = fzVar;
    }

    @Override // f2.j0, f2.w0
    public final void v0(RecyclerView recyclerView, f2.k1 k1Var, int i10) {
        try {
            nh.k1 k1Var2 = new nh.k1(this, recyclerView.getContext(), 2);
            k1Var2.a = i10;
            w0(k1Var2);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }
}
