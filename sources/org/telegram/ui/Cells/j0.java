package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.ui.Components.hc;
import org.telegram.ui.zw0;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class j0 extends hc {
    public final /* synthetic */ int k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j0(q1 q1Var, q1 q1Var2, int i7) {
        super(q1Var);
        this.k = i7;
        this.l = q1Var2;
    }

    @Override // org.telegram.ui.Components.hc
    public final void b() {
        switch (this.k) {
            case 0:
                ((q1) this.l).p2();
                break;
            case 1:
                ((q1) this.l).p2();
                break;
            default:
                ((zw0) this.l).invalidateSelf();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(zw0 zw0Var) {
        super((View) null);
        this.k = 2;
        this.l = zw0Var;
    }
}
