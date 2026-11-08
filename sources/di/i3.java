package di;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.hi0;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class i3 implements hi0 {
    public final /* synthetic */ i4 a;

    public i3(i4 i4Var) {
        this.a = i4Var;
    }

    @Override // org.telegram.ui.Components.hi0
    public final boolean E() {
        ((g9) this.a.z1).b(false);
        return false;
    }

    @Override // org.telegram.ui.Components.hi0
    public final /* synthetic */ boolean U() {
        return false;
    }

    @Override // org.telegram.ui.Components.hi0
    public final void i(View view, ch.o0 o0Var, boolean z9, boolean z10) {
        aa.s sVar = new aa.s(this, o0Var, view, 22);
        if (z9) {
            sVar.run();
        } else {
            this.a.l0(sVar);
        }
    }

    @Override // org.telegram.ui.Components.hi0
    public final /* synthetic */ boolean v() {
        return true;
    }

    @Override // org.telegram.ui.Components.hi0
    public final /* synthetic */ void M() {
    }

    @Override // org.telegram.ui.Components.hi0
    public final /* synthetic */ void L(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i7, boolean z9) {
    }
}
