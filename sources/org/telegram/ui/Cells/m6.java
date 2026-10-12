package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.no;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class m6 extends bi.m9 {
    public final /* synthetic */ int S = 0;
    public final /* synthetic */ View T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m6(o6 o6Var, org.telegram.ui.ActionBar.c6 c6Var) {
        super(c6Var, false);
        this.T = o6Var;
    }

    @Override // bi.m9
    public final void f(long j10) {
        switch (this.S) {
            case 0:
                ((o6) this.T).b(j10);
                break;
            case 1:
                xa xaVar = (xa) this.T;
                org.telegram.ui.ActionBar.m2 R = LaunchActivity.R();
                if (R != null) {
                    R.getOrCreateStoryViewer().getClass();
                    R.getOrCreateStoryViewer().D(xaVar.getContext(), j10, bi.g9.a((mm0) xaVar.getParent()));
                    break;
                }
                break;
            default:
                no noVar = (no) this.T;
                noVar.H.getOrCreateStoryViewer().D(noVar.getContext(), j10, new org.telegram.ui.Components.s(this, 25));
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m6(xa xaVar) {
        super(null, false);
        this.T = xaVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m6(no noVar) {
        super(null, true);
        this.T = noVar;
    }
}
