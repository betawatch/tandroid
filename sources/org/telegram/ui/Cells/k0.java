package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.ui.Components.mc;
import org.telegram.ui.xw0;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class k0 extends mc {
    public final /* synthetic */ int k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k0(r1 r1Var, r1 r1Var2, int i7) {
        super(r1Var);
        this.k = i7;
        this.l = r1Var2;
    }

    @Override // org.telegram.ui.Components.mc
    public final void b() {
        switch (this.k) {
            case 0:
                ((r1) this.l).q2();
                break;
            case 1:
                ((r1) this.l).q2();
                break;
            default:
                ((xw0) this.l).invalidateSelf();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(xw0 xw0Var) {
        super((View) null);
        this.k = 2;
        this.l = xw0Var;
    }
}
