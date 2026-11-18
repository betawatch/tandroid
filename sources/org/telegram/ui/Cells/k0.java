package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.ui.Components.mc;
import org.telegram.ui.xw0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class k0 extends mc {
    public final /* synthetic */ int k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k0(q1 q1Var, q1 q1Var2, int i7) {
        super(q1Var);
        this.k = i7;
        this.l = q1Var2;
    }

    @Override // org.telegram.ui.Components.mc
    public final void b() {
        switch (this.k) {
            case 0:
                ((q1) this.l).q2();
                break;
            case 1:
                ((q1) this.l).q2();
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
