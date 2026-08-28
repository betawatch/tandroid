package ih;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.tj0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class k3 implements tj0 {
    public final /* synthetic */ i4 a;

    public k3(i4 i4Var) {
        this.a = i4Var;
    }

    @Override // org.telegram.ui.Components.tj0
    public final void d(View view, hg.r0 r0Var, boolean z10, boolean z11) {
        h3 h3Var = new h3(this, r0Var, view, 0);
        if (z10) {
            h3Var.run();
        } else {
            this.a.n0(h3Var);
        }
    }

    @Override // org.telegram.ui.Components.tj0
    public final /* synthetic */ boolean n() {
        return true;
    }

    @Override // org.telegram.ui.Components.tj0
    public final boolean p() {
        ((d9) this.a.M1).b(false);
        return false;
    }

    @Override // org.telegram.ui.Components.tj0
    public final /* synthetic */ boolean u() {
        return false;
    }

    @Override // org.telegram.ui.Components.tj0
    public final /* synthetic */ void t() {
    }

    @Override // org.telegram.ui.Components.tj0
    public final /* synthetic */ void s(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i9, boolean z10) {
    }
}
