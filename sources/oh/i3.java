package oh;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.pk0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class i3 implements pk0 {
    public final /* synthetic */ f4 a;

    public i3(f4 f4Var) {
        this.a = f4Var;
    }

    @Override // org.telegram.ui.Components.pk0
    public final /* synthetic */ boolean g() {
        return true;
    }

    @Override // org.telegram.ui.Components.pk0
    public final boolean h() {
        ((z8) this.a.N1).b(false);
        return false;
    }

    @Override // org.telegram.ui.Components.pk0
    public final void o(View view, ng.q0 q0Var, boolean z4, boolean z10) {
        mh.p6 p6Var = new mh.p6(this, q0Var, view, 4);
        if (z4) {
            p6Var.run();
        } else {
            this.a.n0(p6Var);
        }
    }

    @Override // org.telegram.ui.Components.pk0
    public final /* synthetic */ boolean t() {
        return false;
    }

    @Override // org.telegram.ui.Components.pk0
    public final /* synthetic */ void m() {
    }

    @Override // org.telegram.ui.Components.pk0
    public final /* synthetic */ void j(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i10, boolean z4) {
    }
}
