package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.zn;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class l6 extends ai.ca {
    public final /* synthetic */ int S = 1;
    public final /* synthetic */ View T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l6(n6 n6Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(f6Var, false);
        this.T = n6Var;
    }

    @Override // ai.ca
    public final void f(long j3) {
        switch (this.S) {
            case 0:
                ((n6) this.T).b(j3);
                break;
            case 1:
                ab abVar = (ab) this.T;
                org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                if (R != null) {
                    R.getOrCreateStoryViewer().getClass();
                    R.getOrCreateStoryViewer().D(abVar.getContext(), j3, ai.u9.a((ml0) abVar.getParent()));
                    break;
                }
                break;
            default:
                zn znVar = (zn) this.T;
                znVar.H.getOrCreateStoryViewer().D(znVar.getContext(), j3, new org.telegram.ui.Components.s(this, 25));
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l6(ab abVar) {
        super(null, false);
        this.T = abVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l6(zn znVar) {
        super(null, true);
        this.T = znVar;
    }
}
