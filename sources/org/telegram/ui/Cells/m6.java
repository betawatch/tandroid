package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.zn;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class m6 extends ai.ca {
    public final /* synthetic */ int S = 1;
    public final /* synthetic */ View T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m6(o6 o6Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(e6Var, false);
        this.T = o6Var;
    }

    @Override // ai.ca
    public final void f(long j3) {
        switch (this.S) {
            case 0:
                ((o6) this.T).b(j3);
                break;
            case 1:
                ab abVar = (ab) this.T;
                org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                if (R != null) {
                    R.getOrCreateStoryViewer().getClass();
                    R.getOrCreateStoryViewer().D(abVar.getContext(), j3, ai.u9.a((ll0) abVar.getParent()));
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
    public m6(ab abVar) {
        super(null, false);
        this.T = abVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m6(zn znVar) {
        super(null, true);
        this.T = znVar;
    }
}
