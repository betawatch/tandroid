package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.ui.Components.yc;
import org.telegram.ui.n01;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class l0 extends yc {
    public final /* synthetic */ int k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l0(u1 u1Var, u1 u1Var2, int i10) {
        super(u1Var);
        this.k = i10;
        this.l = u1Var2;
    }

    @Override // org.telegram.ui.Components.yc
    public final void b() {
        switch (this.k) {
            case 0:
                ((u1) this.l).a3();
                break;
            case 1:
                ((u1) this.l).a3();
                break;
            default:
                ((n01) this.l).invalidateSelf();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(n01 n01Var) {
        super((View) null);
        this.k = 2;
        this.l = n01Var;
    }
}
