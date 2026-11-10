package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.ui.Components.fn;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class k6 extends di.o7 {
    public final /* synthetic */ int S = 0;
    public final /* synthetic */ View T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k6(pa paVar) {
        super(null, false);
        this.T = paVar;
    }

    @Override // di.o7
    public final void f(long j3) {
        switch (this.S) {
            case 0:
                ((m6) this.T).b(j3);
                break;
            case 1:
                pa paVar = (pa) this.T;
                org.telegram.ui.ActionBar.f2 Q = LaunchActivity.Q();
                if (Q != null) {
                    Q.getOrCreateStoryViewer().getClass();
                    Q.getOrCreateStoryViewer().J(paVar.getContext(), j3, di.i7.a((pj0) paVar.getParent()));
                    break;
                }
                break;
            default:
                fn fnVar = (fn) this.T;
                fnVar.H.getOrCreateStoryViewer().J(fnVar.getContext(), j3, new org.telegram.ui.Components.t(this, 25));
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k6(m6 m6Var, org.telegram.ui.ActionBar.h6 h6Var) {
        super(h6Var, false);
        this.T = m6Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k6(fn fnVar) {
        super(null, true);
        this.T = fnVar;
    }
}
