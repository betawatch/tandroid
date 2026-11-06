package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.ui.Components.gn;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class k6 extends di.n7 {
    public final /* synthetic */ int S = 0;
    public final /* synthetic */ View T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k6(pa paVar) {
        super(null, false);
        this.T = paVar;
    }

    @Override // di.n7
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
                    Q.getOrCreateStoryViewer().J(paVar.getContext(), j3, di.h7.a((pj0) paVar.getParent()));
                    break;
                }
                break;
            default:
                gn gnVar = (gn) this.T;
                gnVar.H.getOrCreateStoryViewer().J(gnVar.getContext(), j3, new org.telegram.ui.Components.u(this, 25));
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k6(m6 m6Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(f6Var, false);
        this.T = m6Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k6(gn gnVar) {
        super(null, true);
        this.T = gnVar;
    }
}
