package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.ui.Components.lo;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
                    R.getOrCreateStoryViewer().D(abVar.getContext(), j10, di.q7.a((mm0) abVar.getParent()));
                    break;
                }
                break;
            default:
                lo loVar = (lo) this.T;
                loVar.H.getOrCreateStoryViewer().D(loVar.getContext(), j10, new org.telegram.ui.Components.s(this, 25));
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
