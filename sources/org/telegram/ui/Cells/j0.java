package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.ui.Components.ic;
import org.telegram.ui.uw0;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class j0 extends ic {
    public final /* synthetic */ int k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j0(q1 q1Var, q1 q1Var2, int i7) {
        super(q1Var);
        this.k = i7;
        this.l = q1Var2;
    }

    @Override // org.telegram.ui.Components.ic
    public final void b() {
        switch (this.k) {
            case 0:
                ((q1) this.l).p2();
                break;
            case 1:
                ((q1) this.l).p2();
                break;
            default:
                ((uw0) this.l).invalidateSelf();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(uw0 uw0Var) {
        super((View) null);
        this.k = 2;
        this.l = uw0Var;
    }
}
