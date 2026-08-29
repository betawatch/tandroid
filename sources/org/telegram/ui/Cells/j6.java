package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.tn;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class j6 extends lh.h7 {
    public final /* synthetic */ int S = 0;
    public final /* synthetic */ View T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j6(l6 l6Var, org.telegram.ui.ActionBar.c6 c6Var) {
        super(c6Var, false);
        this.T = l6Var;
    }

    @Override // lh.h7
    public final void f(long j10) {
        switch (this.S) {
            case 0:
                ((l6) this.T).b(j10);
                break;
            case 1:
                sa saVar = (sa) this.T;
                org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                if (R != null) {
                    R.getOrCreateStoryViewer().getClass();
                    R.getOrCreateStoryViewer().D(saVar.getContext(), j10, lh.b7.a((jl0) saVar.getParent()));
                    break;
                }
                break;
            default:
                tn tnVar = (tn) this.T;
                tnVar.D.getOrCreateStoryViewer().D(tnVar.getContext(), j10, new org.telegram.ui.Components.u(this, 25));
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j6(sa saVar) {
        super(null, false);
        this.T = saVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j6(tn tnVar) {
        super(null, true);
        this.T = tnVar;
    }
}
