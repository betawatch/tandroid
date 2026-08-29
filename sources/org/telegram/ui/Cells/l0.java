package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.ui.Components.uc;
import org.telegram.ui.h01;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class l0 extends uc {
    public final /* synthetic */ int j;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l0(s1 s1Var, s1 s1Var2, int i10) {
        super(s1Var);
        this.j = i10;
        this.k = s1Var2;
    }

    @Override // org.telegram.ui.Components.uc
    public final void b() {
        switch (this.j) {
            case 0:
                ((s1) this.k).a3();
                break;
            case 1:
                ((s1) this.k).a3();
                break;
            default:
                ((h01) this.k).invalidateSelf();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(h01 h01Var) {
        super((View) null);
        this.j = 2;
        this.k = h01Var;
    }
}
