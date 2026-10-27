package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.ui.Components.xc;
import org.telegram.ui.x01;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class k0 extends xc {
    public final /* synthetic */ int k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k0(s1 s1Var, s1 s1Var2, int i10) {
        super(s1Var);
        this.k = i10;
        this.l = s1Var2;
    }

    @Override // org.telegram.ui.Components.xc
    public final void b() {
        switch (this.k) {
            case 0:
                ((s1) this.l).a3();
                break;
            case 1:
                ((s1) this.l).a3();
                break;
            default:
                ((x01) this.l).invalidateSelf();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(x01 x01Var) {
        super((View) null);
        this.k = 2;
        this.l = x01Var;
    }
}
