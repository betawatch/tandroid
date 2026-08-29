package kg;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.t9;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class k0 extends t9 {
    public boolean C;
    public p5 D;
    public d E;
    public boolean F;
    public final /* synthetic */ m0 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(m0 m0Var, Context context) {
        super(context);
        this.G = m0Var;
        getImageReceiver().setFileLoadingPriority(3);
    }

    @Override // org.telegram.ui.Components.t9, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.F = true;
        p5 p5Var = this.D;
        if (p5Var != null) {
            p5Var.a(this);
        }
        d dVar = this.E;
        if (dVar != null) {
            dVar.f(this);
        }
    }

    @Override // org.telegram.ui.Components.t9, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.F = false;
        p5 p5Var = this.D;
        if (p5Var != null) {
            p5Var.o(this);
        }
        d dVar = this.E;
        if (dVar != null) {
            dVar.d(this);
        }
    }

    @Override // org.telegram.ui.Components.t9, android.view.View
    public final void onDraw(Canvas canvas) {
        p5 p5Var = this.D;
        if (p5Var != null) {
            p5Var.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            this.D.setAlpha(255);
            this.D.draw(canvas);
            this.C = true;
            return;
        }
        d dVar = this.E;
        if (dVar != null) {
            dVar.e(0, 0, getMeasuredWidth(), getMeasuredHeight());
            this.E.b(canvas);
            this.C = true;
            return;
        }
        if (getImageReceiver().getLottieAnimation() != null && getImageReceiver().getLottieAnimation().h0) {
            this.C = true;
        }
        if (!this.C && getImageReceiver().getLottieAnimation() != null && !getImageReceiver().getLottieAnimation().h0) {
            m0 m0Var = this.G;
            if (m0Var.a != 2 || m0Var.z) {
                getImageReceiver().getLottieAnimation().L(0, false, false);
                getImageReceiver().getLottieAnimation().start();
            } else {
                getImageReceiver().getLottieAnimation().L(getImageReceiver().getLottieAnimation().e[0] - 1, false, false);
            }
        }
        super.onDraw(canvas);
    }
}
