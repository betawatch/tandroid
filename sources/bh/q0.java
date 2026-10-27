package bh;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.ui.Components.t5;
import org.telegram.ui.Components.y9;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class q0 extends y9 {
    public boolean G;
    public t5 H;
    public e I;
    public boolean J;
    public final /* synthetic */ s0 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(s0 s0Var, Context context) {
        super(context);
        this.K = s0Var;
        getImageReceiver().setFileLoadingPriority(3);
    }

    @Override // org.telegram.ui.Components.y9, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.J = true;
        t5 t5Var = this.H;
        if (t5Var != null) {
            t5Var.a(this);
        }
        e eVar = this.I;
        if (eVar != null) {
            eVar.f(this);
        }
    }

    @Override // org.telegram.ui.Components.y9, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.J = false;
        t5 t5Var = this.H;
        if (t5Var != null) {
            t5Var.o(this);
        }
        e eVar = this.I;
        if (eVar != null) {
            eVar.d(this);
        }
    }

    @Override // org.telegram.ui.Components.y9, android.view.View
    public final void onDraw(Canvas canvas) {
        t5 t5Var = this.H;
        if (t5Var != null) {
            t5Var.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            this.H.setAlpha(255);
            this.H.draw(canvas);
            this.G = true;
            return;
        }
        e eVar = this.I;
        if (eVar != null) {
            eVar.e(0, 0, getMeasuredWidth(), getMeasuredHeight());
            this.I.b(canvas);
            this.G = true;
            return;
        }
        if (getImageReceiver().getLottieAnimation() != null && getImageReceiver().getLottieAnimation().k0) {
            this.G = true;
        }
        if (!this.G && getImageReceiver().getLottieAnimation() != null && !getImageReceiver().getLottieAnimation().k0) {
            s0 s0Var = this.K;
            if (s0Var.a != 2 || s0Var.z) {
                getImageReceiver().getLottieAnimation().N(0, false, false);
                getImageReceiver().getLottieAnimation().start();
            } else {
                getImageReceiver().getLottieAnimation().N(getImageReceiver().getLottieAnimation().e[0] - 1, false, false);
            }
        }
        super.onDraw(canvas);
    }
}
