package ah;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.ui.Components.q5;
import org.telegram.ui.Components.x9;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class c1 extends x9 {
    public boolean G;
    public q5 H;
    public e I;
    public boolean J;
    public final /* synthetic */ e1 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(e1 e1Var, Context context) {
        super(context);
        this.K = e1Var;
        getImageReceiver().setFileLoadingPriority(3);
    }

    @Override // org.telegram.ui.Components.x9, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.J = true;
        q5 q5Var = this.H;
        if (q5Var != null) {
            q5Var.a(this);
        }
        e eVar = this.I;
        if (eVar != null) {
            eVar.f(this);
        }
    }

    @Override // org.telegram.ui.Components.x9, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.J = false;
        q5 q5Var = this.H;
        if (q5Var != null) {
            q5Var.o(this);
        }
        e eVar = this.I;
        if (eVar != null) {
            eVar.d(this);
        }
    }

    @Override // org.telegram.ui.Components.x9, android.view.View
    public final void onDraw(Canvas canvas) {
        q5 q5Var = this.H;
        if (q5Var != null) {
            q5Var.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
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
        if (getImageReceiver().getLottieAnimation() != null && getImageReceiver().getLottieAnimation().l0) {
            this.G = true;
        }
        if (!this.G && getImageReceiver().getLottieAnimation() != null && !getImageReceiver().getLottieAnimation().l0) {
            e1 e1Var = this.K;
            if (e1Var.a != 2 || e1Var.z) {
                getImageReceiver().getLottieAnimation().L(0, false, false);
                getImageReceiver().getLottieAnimation().start();
            } else {
                getImageReceiver().getLottieAnimation().L(getImageReceiver().getLottieAnimation().e[0] - 1, false, false);
            }
        }
        super.onDraw(canvas);
    }
}
