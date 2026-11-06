package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.ui.Components.ic;
import org.telegram.ui.uw0;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class j0 extends ic {
    public final /* synthetic */ int k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j0(q1 q1Var, q1 q1Var2, int i7) {
        super(q1Var);
        this.k = i7;
        this.l = q1Var2;
    }

    @Override // org.telegram.ui.Components.ic
    public final void b() {
        switch (this.k) {
            case 0:
                ((q1) this.l).p2();
                break;
            case 1:
                ((q1) this.l).p2();
                break;
            default:
                ((uw0) this.l).invalidateSelf();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(uw0 uw0Var) {
        super((View) null);
        this.k = 2;
        this.l = uw0Var;
    }
}
