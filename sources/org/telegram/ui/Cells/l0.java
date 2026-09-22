package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.ui.Components.wc;
import org.telegram.ui.l11;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class l0 extends wc {
    public final /* synthetic */ int j;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l0(t1 t1Var, t1 t1Var2, int i10) {
        super(t1Var);
        this.j = i10;
        this.k = t1Var2;
    }

    @Override // org.telegram.ui.Components.wc
    public final void b() {
        switch (this.j) {
            case 0:
                ((t1) this.k).a3();
                break;
            case 1:
                ((t1) this.k).a3();
                break;
            default:
                ((l11) this.k).invalidateSelf();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(l11 l11Var) {
        super((View) null);
        this.j = 2;
        this.k = l11Var;
    }
}
