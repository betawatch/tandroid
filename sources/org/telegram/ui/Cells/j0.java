package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.ui.Components.dc;
import org.telegram.ui.tw0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class j0 extends dc {
    public final /* synthetic */ int k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j0(q1 q1Var, q1 q1Var2, int i7) {
        super(q1Var);
        this.k = i7;
        this.l = q1Var2;
    }

    @Override // org.telegram.ui.Components.dc
    public final void b() {
        switch (this.k) {
            case 0:
                ((q1) this.l).q2();
                break;
            case 1:
                ((q1) this.l).q2();
                break;
            default:
                ((tw0) this.l).invalidateSelf();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(tw0 tw0Var) {
        super((View) null);
        this.k = 2;
        this.l = tw0Var;
    }
}
