package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.ui.Components.bd;
import org.telegram.ui.j11;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class l0 extends bd {
    public final /* synthetic */ int k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l0(u1 u1Var, u1 u1Var2, int i10) {
        super(u1Var);
        this.k = i10;
        this.l = u1Var2;
    }

    @Override // org.telegram.ui.Components.bd
    public final void b() {
        switch (this.k) {
            case 0:
                ((u1) this.l).a3();
                break;
            case 1:
                ((u1) this.l).a3();
                break;
            default:
                ((j11) this.l).invalidateSelf();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(j11 j11Var) {
        super((View) null);
        this.k = 2;
        this.l = j11Var;
    }
}
