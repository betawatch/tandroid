package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.ui.Components.fn;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class j6 extends ei.o7 {
    public final /* synthetic */ int S = 0;
    public final /* synthetic */ View T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j6(pa paVar) {
        super(null, false);
        this.T = paVar;
    }

    @Override // ei.o7
    public final void f(long j10) {
        switch (this.S) {
            case 0:
                ((l6) this.T).b(j10);
                break;
            case 1:
                pa paVar = (pa) this.T;
                org.telegram.ui.ActionBar.d2 Q = LaunchActivity.Q();
                if (Q != null) {
                    Q.getOrCreateStoryViewer().getClass();
                    Q.getOrCreateStoryViewer().R(paVar.getContext(), j10, ei.i7.a((tj0) paVar.getParent()));
                    break;
                }
                break;
            default:
                fn fnVar = (fn) this.T;
                fnVar.I.getOrCreateStoryViewer().R(fnVar.getContext(), j10, new org.telegram.ui.Components.t(this, 25));
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j6(l6 l6Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(e6Var, false);
        this.T = l6Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j6(fn fnVar) {
        super(null, true);
        this.T = fnVar;
    }
}
