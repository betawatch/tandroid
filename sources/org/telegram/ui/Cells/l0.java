package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.ui.Components.zc;
import org.telegram.ui.b11;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
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
