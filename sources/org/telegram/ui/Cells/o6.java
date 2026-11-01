package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.ui.Components.on;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class o6 extends th.t5 {
    public final /* synthetic */ int S = 1;
    public final /* synthetic */ View T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o6(pa paVar) {
        super(null, false);
        this.T = paVar;
    }

    @Override // th.t5
    public final void f(long j10) {
        switch (this.S) {
            case 0:
                ((q6) this.T).b(j10);
                break;
            case 1:
                pa paVar = (pa) this.T;
                org.telegram.ui.ActionBar.k2 Q = LaunchActivity.Q();
                if (Q != null) {
                    Q.getOrCreateStoryViewer().getClass();
                    Q.getOrCreateStoryViewer().R(paVar.getContext(), j10, th.n5.a((uk0) paVar.getParent()));
                    break;
                }
                break;
            default:
                on onVar = (on) this.T;
                onVar.H.getOrCreateStoryViewer().R(onVar.getContext(), j10, new org.telegram.ui.Components.t(this, 25));
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o6(q6 q6Var, org.telegram.ui.ActionBar.p6 p6Var) {
        super(p6Var, false);
        this.T = q6Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o6(on onVar) {
        super(null, true);
        this.T = onVar;
    }
}
