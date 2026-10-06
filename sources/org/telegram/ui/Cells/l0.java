package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.ui.Components.zc;
import org.telegram.ui.d11;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class l0 extends zc {
    public final /* synthetic */ int j;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l0(u1 u1Var, u1 u1Var2, int i10) {
        super(u1Var);
        this.j = i10;
        this.k = u1Var2;
    }

    @Override // org.telegram.ui.Components.zc
    public final void b() {
        switch (this.j) {
            case 0:
                ((u1) this.k).a3();
                break;
            case 1:
                ((u1) this.k).a3();
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
