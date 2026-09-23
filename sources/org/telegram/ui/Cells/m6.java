package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.ui.Components.ao;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class m6 extends ai.ca {
    public final /* synthetic */ int S = 1;
    public final /* synthetic */ View T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m6(o6 o6Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(d6Var, false);
        this.T = o6Var;
    }

    @Override // ai.ca
    public final void f(long j3) {
        switch (this.S) {
            case 0:
                ((o6) this.T).b(j3);
                break;
            case 1:
                bb bbVar = (bb) this.T;
                org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                if (R != null) {
                    R.getOrCreateStoryViewer().getClass();
                    R.getOrCreateStoryViewer().D(bbVar.getContext(), j3, ai.u9.a((ml0) bbVar.getParent()));
                    break;
                }
                break;
            default:
                ao aoVar = (ao) this.T;
                aoVar.H.getOrCreateStoryViewer().D(aoVar.getContext(), j3, new org.telegram.ui.Components.s(this, 25));
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m6(bb bbVar) {
        super(null, false);
        this.T = bbVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m6(ao aoVar) {
        super(null, true);
        this.T = aoVar;
    }
}
