package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.ui.Components.lo;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class q6 extends di.w7 {
    public final /* synthetic */ int S = 1;
    public final /* synthetic */ View T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q6(ab abVar) {
        super(null, false);
        this.T = abVar;
    }

    @Override // di.w7
    public final void f(long j10) {
        switch (this.S) {
            case 0:
                ((s6) this.T).b(j10);
                break;
            case 1:
                ab abVar = (ab) this.T;
                org.telegram.ui.ActionBar.r2 R = LaunchActivity.R();
                if (R != null) {
                    R.getOrCreateStoryViewer().getClass();
                    R.getOrCreateStoryViewer().E(abVar.getContext(), j10, di.q7.a((nm0) abVar.getParent()));
                    break;
                }
                break;
            default:
                lo loVar = (lo) this.T;
                loVar.H.getOrCreateStoryViewer().E(loVar.getContext(), j10, new org.telegram.ui.Components.s(this, 25));
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q6(s6 s6Var, org.telegram.ui.ActionBar.u6 u6Var) {
        super(u6Var, false);
        this.T = s6Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q6(lo loVar) {
        super(null, true);
        this.T = loVar;
    }
}
