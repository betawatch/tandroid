package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.ui.Components.ad;
import org.telegram.ui.q11;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class m0 extends ad {
    public final /* synthetic */ int k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m0(u1 u1Var, u1 u1Var2, int i10) {
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
    public m0(q11 q11Var) {
        super((View) null);
        this.k = 2;
        this.l = q11Var;
    }
}
