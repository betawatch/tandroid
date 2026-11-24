// default package

import android.content.Context;
import android.graphics.Canvas;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class e39 extends bf0 {
    public boolean H;
    public vm I;
    public xm J;
    public boolean K;
    public final /* synthetic */ g39 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e39(g39 g39Var, Context context) {
        super(context);
        this.L = g39Var;
        getImageReceiver().T(3);
    }

    @Override // bf0, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.K = true;
        vm vmVar = this.I;
        if (vmVar != null) {
            vmVar.b(this);
        }
        xm xmVar = this.J;
        if (xmVar != null) {
            xmVar.f(this);
        }
    }

    @Override // bf0, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.K = false;
        vm vmVar = this.I;
        if (vmVar != null) {
            vmVar.o(this);
        }
        xm xmVar = this.J;
        if (xmVar != null) {
            xmVar.d(this);
        }
    }

    @Override // bf0, android.view.View
    public final void onDraw(Canvas canvas) {
        vm vmVar = this.I;
        if (vmVar != null) {
            vmVar.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            this.I.setAlpha(nm7.d4);
            this.I.draw(canvas);
            this.H = true;
            return;
        }
        xm xmVar = this.J;
        if (xmVar != null) {
            xmVar.e(0, 0, getMeasuredWidth(), getMeasuredHeight());
            this.J.b(canvas);
            this.H = true;
            return;
        }
        if (getImageReceiver().y() != null && getImageReceiver().y().l0) {
            this.H = true;
        }
        if (!this.H && getImageReceiver().y() != null && !getImageReceiver().y().l0) {
            g39 g39Var = this.L;
            if (g39Var.a != 2 || g39Var.z) {
                getImageReceiver().y().I(0, false, false);
                getImageReceiver().y().start();
            } else {
                getImageReceiver().y().I(getImageReceiver().y().e[0] - 1, false, false);
            }
        }
        super.onDraw(canvas);
    }
}
