package ei;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.ki0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class l3 implements ki0 {
    public final /* synthetic */ j4 a;

    public l3(j4 j4Var) {
        this.a = j4Var;
    }

    @Override // org.telegram.ui.Components.ki0
    public final /* synthetic */ boolean O() {
        return false;
    }

    @Override // org.telegram.ui.Components.ki0
    public final /* synthetic */ boolean r() {
        return true;
    }

    @Override // org.telegram.ui.Components.ki0
    public final boolean v() {
        ((i9) this.a.A1).b(false);
        return false;
    }

    @Override // org.telegram.ui.Components.ki0
    public final void z(View view, dh.n0 n0Var, boolean z10, boolean z11) {
        ai.k3 k3Var = new ai.k3(this, n0Var, view, 24);
        if (z10) {
            k3Var.run();
        } else {
            this.a.l0(k3Var);
        }
    }

    @Override // org.telegram.ui.Components.ki0
    public final /* synthetic */ void J() {
    }

    @Override // org.telegram.ui.Components.ki0
    public final /* synthetic */ void E(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i3, boolean z10) {
    }
}
