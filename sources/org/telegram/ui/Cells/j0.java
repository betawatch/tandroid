package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.ui.Components.gc;
import org.telegram.ui.mw0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class j0 extends gc {
    public final /* synthetic */ int k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j0(q1 q1Var, q1 q1Var2, int i3) {
        super(q1Var);
        this.k = i3;
        this.l = q1Var2;
    }

    @Override // org.telegram.ui.Components.gc
    public final void b() {
        switch (this.k) {
            case 0:
                ((q1) this.l).p2();
                break;
            case 1:
                ((q1) this.l).p2();
                break;
            default:
                ((mw0) this.l).invalidateSelf();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(mw0 mw0Var) {
        super((View) null);
        this.k = 2;
        this.l = mw0Var;
    }
}
