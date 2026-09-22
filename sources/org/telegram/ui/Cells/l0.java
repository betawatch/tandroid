package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.ui.Components.yc;
import org.telegram.ui.k11;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class l0 extends yc {
    public final /* synthetic */ int j;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l0(u1 u1Var, u1 u1Var2, int i10) {
        super(u1Var);
        this.j = i10;
        this.k = u1Var2;
    }

    @Override // org.telegram.ui.Components.yc
    public final void b() {
        switch (this.j) {
            case 0:
                ((u1) this.k).a3();
                break;
            case 1:
                ((u1) this.k).a3();
                break;
            default:
                ((k11) this.k).invalidateSelf();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(k11 k11Var) {
        super((View) null);
        this.j = 2;
        this.k = k11Var;
    }
}
