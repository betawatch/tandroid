package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.ui.Components.qm0;
import org.telegram.ui.Components.qo;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class m6 extends ai.da {
    public final /* synthetic */ int S = 0;
    public final /* synthetic */ View T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m6(o6 o6Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(e6Var, false);
        this.T = o6Var;
    }

    @Override // ai.da
    public final void f(long j3) {
        switch (this.S) {
            case 0:
                ((o6) this.T).b(j3);
                break;
            case 1:
                xa xaVar = (xa) this.T;
                org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                if (R != null) {
                    R.getOrCreateStoryViewer().getClass();
                    R.getOrCreateStoryViewer().D(xaVar.getContext(), j3, ai.v9.a((qm0) xaVar.getParent()));
                    break;
                }
                break;
            default:
                qo qoVar = (qo) this.T;
                qoVar.H.getOrCreateStoryViewer().D(qoVar.getContext(), j3, new org.telegram.ui.Components.s(this, 25));
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m6(xa xaVar) {
        super(null, false);
        this.T = xaVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m6(qo qoVar) {
        super(null, true);
        this.T = qoVar;
    }
}
