package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class f61 extends s4.s {
    public final /* synthetic */ int Q;
    public final /* synthetic */ r71 R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f61(r71 r71Var, int i10) {
        super(40);
        this.Q = i10;
        this.R = r71Var;
    }

    @Override // s4.b0, s4.n0
    public final void v0(RecyclerView recyclerView, s4.y0 y0Var, int i10) {
        switch (this.Q) {
            case 0:
                try {
                    di.l1 l1Var = new di.l1(this, recyclerView.getContext(), 3);
                    l1Var.a = i10;
                    w0(l1Var);
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                }
            default:
                try {
                    di.l1 l1Var2 = new di.l1(this, recyclerView.getContext(), 5);
                    l1Var2.a = i10;
                    w0(l1Var2);
                    break;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
        }
    }
}
