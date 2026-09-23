package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.ui.Components.yc;
import org.telegram.ui.d11;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class l0 extends yc {
    public final /* synthetic */ int j;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l0(t1 t1Var, t1 t1Var2, int i10) {
        super(t1Var);
        this.j = i10;
        this.k = t1Var2;
    }

    @Override // org.telegram.ui.Components.yc
    public final void b() {
        switch (this.j) {
            case 0:
                ((t1) this.k).a3();
                break;
            case 1:
                ((t1) this.k).a3();
                break;
            default:
                ((d11) this.k).invalidateSelf();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(d11 d11Var) {
        super((View) null);
        this.j = 2;
        this.k = d11Var;
    }
}
