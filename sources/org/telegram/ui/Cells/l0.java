package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.ui.Components.yc;
import org.telegram.ui.b11;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
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
                ((b11) this.k).invalidateSelf();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(b11 b11Var) {
        super((View) null);
        this.j = 2;
        this.k = b11Var;
    }
}
