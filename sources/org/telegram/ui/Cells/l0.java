package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.ui.Components.ad;
import org.telegram.ui.q11;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class l0 extends ad {
    public final /* synthetic */ int k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l0(u1 u1Var, u1 u1Var2, int i10) {
        super(u1Var);
        this.k = i10;
        this.l = u1Var2;
    }

    @Override // org.telegram.ui.Components.ad
    public final void b() {
        switch (this.k) {
            case 0:
                ((u1) this.l).a3();
                break;
            case 1:
                ((u1) this.l).a3();
                break;
            default:
                ((q11) this.l).invalidateSelf();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(q11 q11Var) {
        super((View) null);
        this.k = 2;
        this.l = q11Var;
    }
}
