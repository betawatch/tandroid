package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.ui.Components.ao;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class m6 extends ai.ca {
    public final /* synthetic */ int S = 0;
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
                za zaVar = (za) this.T;
                org.telegram.ui.ActionBar.m2 R = LaunchActivity.R();
                if (R != null) {
                    R.getOrCreateStoryViewer().getClass();
                    R.getOrCreateStoryViewer().D(zaVar.getContext(), j3, ai.u9.a((wl0) zaVar.getParent()));
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
    public m6(za zaVar) {
        super(null, false);
        this.T = zaVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m6(ao aoVar) {
        super(null, true);
        this.T = aoVar;
    }
}
