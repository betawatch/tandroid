package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.ui.Components.pc;
import org.telegram.ui.g01;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class l0 extends pc {
    public final /* synthetic */ int j;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l0(t1 t1Var, t1 t1Var2, int i9) {
        super(t1Var);
        this.j = i9;
        this.k = t1Var2;
    }

    @Override // org.telegram.ui.Components.pc
    public final void b() {
        switch (this.j) {
            case 0:
                ((t1) this.k).a3();
                break;
            case 1:
                ((t1) this.k).a3();
                break;
            default:
                ((g01) this.k).invalidateSelf();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(g01 g01Var) {
        super((View) null);
        this.j = 2;
        this.k = g01Var;
    }
}
