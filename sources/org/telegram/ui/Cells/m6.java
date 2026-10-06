package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.ui.Components.co;
import org.telegram.ui.Components.zl0;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
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
                org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                if (R != null) {
                    R.getOrCreateStoryViewer().getClass();
                    R.getOrCreateStoryViewer().D(zaVar.getContext(), j3, ai.u9.a((zl0) zaVar.getParent()));
                    break;
                }
                break;
            default:
                co coVar = (co) this.T;
                coVar.H.getOrCreateStoryViewer().D(coVar.getContext(), j3, new org.telegram.ui.Components.s(this, 25));
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m6(za zaVar) {
        super(null, false);
        this.T = zaVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m6(co coVar) {
        super(null, true);
        this.T = coVar;
    }
}
