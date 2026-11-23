package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.ui.Components.lc;
import org.telegram.ui.vw0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class k0 extends lc {
    public final /* synthetic */ int k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k0(r1 r1Var, r1 r1Var2, int i7) {
        super(r1Var);
        this.k = i7;
        this.l = r1Var2;
    }

    @Override // org.telegram.ui.Components.lc
    public final void b() {
        switch (this.k) {
            case 0:
                ((r1) this.l).q2();
                break;
            case 1:
                ((r1) this.l).q2();
                break;
            default:
                ((vw0) this.l).invalidateSelf();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(vw0 vw0Var) {
        super((View) null);
        this.k = 2;
        this.l = vw0Var;
    }
}
