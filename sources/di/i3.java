package di;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.ii0;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class i3 implements ii0 {
    public final /* synthetic */ j4 a;

    public i3(j4 j4Var) {
        this.a = j4Var;
    }

    @Override // org.telegram.ui.Components.ii0
    public final boolean E() {
        ((h9) this.a.z1).b(false);
        return false;
    }

    @Override // org.telegram.ui.Components.ii0
    public final /* synthetic */ boolean U() {
        return false;
    }

    @Override // org.telegram.ui.Components.ii0
    public final void i(View view, ch.o0 o0Var, boolean z9, boolean z10) {
        aa.s sVar = new aa.s(this, o0Var, view, 22);
        if (z9) {
            sVar.run();
        } else {
            this.a.l0(sVar);
        }
    }

    @Override // org.telegram.ui.Components.ii0
    public final /* synthetic */ boolean v() {
        return true;
    }

    @Override // org.telegram.ui.Components.ii0
    public final /* synthetic */ void M() {
    }

    @Override // org.telegram.ui.Components.ii0
    public final /* synthetic */ void L(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i7, boolean z9) {
    }
}
