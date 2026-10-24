package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.ui.Components.ko;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class m6 extends ci.x7 {
    public final /* synthetic */ int S = 0;
    public final /* synthetic */ View T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m6(wa waVar) {
        super(null, false);
        this.T = waVar;
    }

    @Override // ci.x7
    public final void f(long j10) {
        switch (this.S) {
            case 0:
                ((o6) this.T).b(j10);
                break;
            case 1:
                wa waVar = (wa) this.T;
                org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                if (R != null) {
                    R.getOrCreateStoryViewer().getClass();
                    R.getOrCreateStoryViewer().D(waVar.getContext(), j10, ci.q7.a((mm0) waVar.getParent()));
                    break;
                }
                break;
            default:
                ko koVar = (ko) this.T;
                koVar.H.getOrCreateStoryViewer().D(koVar.getContext(), j10, new org.telegram.ui.Components.s(this, 25));
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m6(o6 o6Var, org.telegram.ui.ActionBar.g6 g6Var) {
        super(g6Var, false);
        this.T = o6Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m6(ko koVar) {
        super(null, true);
        this.T = koVar;
    }
}
