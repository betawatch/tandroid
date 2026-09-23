package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class dk0 extends w9 {
    public final /* synthetic */ int G;
    public final /* synthetic */ ek0 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dk0(ek0 ek0Var, Context context, int i10) {
        super(context);
        this.G = i10;
        this.H = ek0Var;
    }

    @Override // org.telegram.ui.Components.w9
    public ImageReceiver c() {
        switch (this.G) {
            case 0:
                return new ck0(0, this);
            case 1:
                return new ck0(1, this);
            default:
                return super.c();
        }
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.G) {
            case 0:
                ek0 ek0Var = this.H;
                dk0 dk0Var = ek0Var.b;
                super.dispatchDraw(canvas);
                if (this.a.getLottieAnimation() != null && !ek0Var.E) {
                    this.a.getLottieAnimation().start();
                }
                if (ek0Var.s && !ek0Var.v && this.a.getLottieAnimation() != null && this.a.getLottieAnimation().A() && dk0Var.a.getLottieAnimation() != null && dk0Var.a.getLottieAnimation().u()) {
                    ek0Var.v = true;
                    dk0Var.a.getLottieAnimation().N(0, false, true);
                    dk0Var.setVisibility(0);
                    Runnable runnable = ek0Var.P.P0;
                    if (runnable != null) {
                        runnable.run();
                    }
                    AndroidUtilities.runOnUIThread(new ac0(this, 17));
                }
                invalidate();
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // android.view.View
    public void invalidate(Rect rect) {
        switch (this.G) {
            case 0:
                ek0 ek0Var = this.H;
                if (!zg.f0.c(this, ek0Var.P)) {
                    super.invalidate(rect);
                    ek0Var.P.invalidate();
                    break;
                }
                break;
            default:
                super.invalidate(rect);
                break;
        }
    }

    @Override // org.telegram.ui.Components.w9, android.view.View
    public void onDraw(Canvas canvas) {
        switch (this.G) {
            case 1:
                this.H.b();
                super.onDraw(canvas);
                break;
            case 2:
                q5 q5Var = this.e;
                ImageReceiver imageReceiver = q5Var != null ? q5Var.k : this.a;
                if (imageReceiver != null && imageReceiver.getLottieAnimation() != null) {
                    imageReceiver.getLottieAnimation().start();
                }
                super.onDraw(canvas);
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // android.view.View
    public void invalidate(int i10, int i11, int i12, int i13) {
        switch (this.G) {
            case 0:
                if (!zg.f0.c(this)) {
                    super.invalidate(i10, i11, i12, i13);
                    break;
                }
                break;
            case 1:
                if (!zg.f0.c(this)) {
                    super.invalidate(i10, i11, i12, i13);
                    break;
                }
                break;
            default:
                super.invalidate(i10, i11, i12, i13);
                break;
        }
    }

    @Override // android.view.View
    public final void invalidate() {
        int i10 = this.G;
        ek0 ek0Var = this.H;
        switch (i10) {
            case 0:
                if (!zg.f0.c(this, ek0Var.P)) {
                    super.invalidate();
                    ek0Var.P.invalidate();
                    break;
                }
                break;
            case 1:
                if (!zg.f0.c(this)) {
                    super.invalidate();
                    break;
                }
                break;
            default:
                super.invalidate();
                ek0Var.P.invalidate();
                break;
        }
    }
}
