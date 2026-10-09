package ai;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.jl0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class v4 implements jl0 {
    public final /* synthetic */ f6 a;

    public v4(f6 f6Var) {
        this.a = f6Var;
    }

    @Override // org.telegram.ui.Components.jl0
    public final void m(View view, zg.n0 n0Var, boolean z10, boolean z11) {
        f6 f6Var = this.a;
        if (z10) {
            org.telegram.ui.Components.g5.Z(f6Var.C2, 1, f6Var.B1, new u4(this, z10, n0Var, view));
        } else {
            f6Var.n0(new t4(this, view, n0Var, z10, z11));
        }
    }

    @Override // org.telegram.ui.Components.jl0
    public final /* synthetic */ boolean o() {
        return true;
    }

    @Override // org.telegram.ui.Components.jl0
    public final boolean q() {
        return this.a.N0();
    }

    @Override // org.telegram.ui.Components.jl0
    public final void r(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
        f6 f6Var = this.a;
        Paint paint = f6Var.n2;
        com.google.firebase.messaging.n nVar = f6Var.P1;
        float f12 = -f10;
        float f13 = -f11;
        nVar.z(f12, f13, f6Var.getMeasuredWidth() + f12, f6Var.getMeasuredHeight() + f13);
        if (f7 > 0.0f) {
            canvas.drawRoundRect(rectF, f7, f7, (Paint) nVar.a);
            canvas.drawRoundRect(rectF, f7, f7, paint);
        } else {
            canvas.drawRect(rectF, (Paint) nVar.a);
            canvas.drawRect(rectF, paint);
        }
    }

    @Override // org.telegram.ui.Components.jl0
    public final void s() {
        ((bc) this.a.Q1).b(false);
    }

    @Override // org.telegram.ui.Components.jl0
    public final /* synthetic */ boolean v() {
        return false;
    }
}
