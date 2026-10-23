package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.ui.Components.yc;
import org.telegram.ui.r01;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class k0 extends yc {
    public final /* synthetic */ int k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k0(t1 t1Var, t1 t1Var2, int i10) {
        super(t1Var);
        this.k = i10;
        this.l = t1Var2;
    }

    @Override // org.telegram.ui.Components.yc
    public final void b() {
        switch (this.k) {
            case 0:
                ((t1) this.l).Z2();
                break;
            case 1:
                ((t1) this.l).Z2();
                break;
            default:
                ((r01) this.l).invalidateSelf();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(r01 r01Var) {
        super((View) null);
        this.k = 2;
        this.l = r01Var;
    }
}
