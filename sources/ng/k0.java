package ng;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.ui.Components.l5;
import org.telegram.ui.Components.p9;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class k0 extends p9 {
    public boolean D;
    public l5 E;
    public d F;
    public boolean G;
    public final /* synthetic */ m0 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(m0 m0Var, Context context) {
        super(context);
        this.H = m0Var;
        getImageReceiver().setFileLoadingPriority(3);
    }

    @Override // org.telegram.ui.Components.p9, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.G = true;
        l5 l5Var = this.E;
        if (l5Var != null) {
            l5Var.a(this);
        }
        d dVar = this.F;
        if (dVar != null) {
            dVar.f(this);
        }
    }

    @Override // org.telegram.ui.Components.p9, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.G = false;
        l5 l5Var = this.E;
        if (l5Var != null) {
            l5Var.o(this);
        }
        d dVar = this.F;
        if (dVar != null) {
            dVar.d(this);
        }
    }

    @Override // org.telegram.ui.Components.p9, android.view.View
    public final void onDraw(Canvas canvas) {
        l5 l5Var = this.E;
        if (l5Var != null) {
            l5Var.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            this.E.setAlpha(255);
            this.E.draw(canvas);
            this.D = true;
            return;
        }
        d dVar = this.F;
        if (dVar != null) {
            dVar.e(0, 0, getMeasuredWidth(), getMeasuredHeight());
            this.F.b(canvas);
            this.D = true;
            return;
        }
        if (getImageReceiver().getLottieAnimation() != null && getImageReceiver().getLottieAnimation().i0) {
            this.D = true;
        }
        if (!this.D && getImageReceiver().getLottieAnimation() != null && !getImageReceiver().getLottieAnimation().i0) {
            m0 m0Var = this.H;
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
