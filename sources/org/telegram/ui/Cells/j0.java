package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.ui.Components.dc;
import org.telegram.ui.hy0;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class j0 extends dc {
    public final /* synthetic */ int k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j0(q1 q1Var, q1 q1Var2, int i10) {
        super(q1Var);
        this.k = i10;
        this.l = q1Var2;
    }

    @Override // org.telegram.ui.Components.dc
    public final void b() {
        switch (this.k) {
            case 0:
                ((q1) this.l).n2();
                break;
            case 1:
                ((q1) this.l).n2();
                break;
            default:
                ((hy0) this.l).invalidateSelf();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(hy0 hy0Var) {
        super((View) null);
        this.k = 2;
        this.l = hy0Var;
    }
}
