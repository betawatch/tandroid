package fi;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import di.ga;
import org.telegram.ui.Components.ui0;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class b3 implements ui0 {
    public final /* synthetic */ z3 a;

    public b3(z3 z3Var) {
        this.a = z3Var;
    }

    @Override // org.telegram.ui.Components.ui0
    public final /* synthetic */ boolean E() {
        return false;
    }

    @Override // org.telegram.ui.Components.ui0
    public final void g(View view, ch.p0 p0Var, boolean z10, boolean z11) {
        ga gaVar = new ga(this, p0Var, view, 1);
        if (z10) {
            gaVar.run();
        } else {
            this.a.l0(gaVar);
        }
    }

    @Override // org.telegram.ui.Components.ui0
    public final /* synthetic */ boolean o() {
        return true;
    }

    @Override // org.telegram.ui.Components.ui0
    public final boolean q() {
        ((w8) this.a.A1).b(false);
        return false;
    }

    @Override // org.telegram.ui.Components.ui0
    public final /* synthetic */ void z() {
    }

    @Override // org.telegram.ui.Components.ui0
    public final /* synthetic */ void x(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i7, boolean z10) {
    }
}
