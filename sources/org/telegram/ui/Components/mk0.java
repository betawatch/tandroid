package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class mk0 extends w9 {
    public final /* synthetic */ int G;
    public final /* synthetic */ nk0 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mk0(nk0 nk0Var, Context context, int i10) {
        super(context);
        this.G = i10;
        this.H = nk0Var;
    }

    @Override // org.telegram.ui.Components.w9
    public ImageReceiver c() {
        switch (this.G) {
            case 0:
                return new lk0(0, this);
            case 1:
                return new lk0(1, this);
            default:
                return super.c();
        }
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.G) {
            case 0:
                nk0 nk0Var = this.H;
                mk0 mk0Var = nk0Var.b;
                super.dispatchDraw(canvas);
                if (this.a.getLottieAnimation() != null && !nk0Var.E) {
                    this.a.getLottieAnimation().start();
                }
                if (nk0Var.s && !nk0Var.v && this.a.getLottieAnimation() != null && this.a.getLottieAnimation().A() && mk0Var.a.getLottieAnimation() != null && mk0Var.a.getLottieAnimation().u()) {
                    nk0Var.v = true;
                    mk0Var.a.getLottieAnimation().N(0, false, true);
                    mk0Var.setVisibility(0);
                    Runnable runnable = nk0Var.P.P0;
                    if (runnable != null) {
                        runnable.run();
                    }
                    AndroidUtilities.runOnUIThread(new kc0(this, 17));
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
                nk0 nk0Var = this.H;
                if (!yg.f0.c(this, nk0Var.P)) {
                    super.invalidate(rect);
                    nk0Var.P.invalidate();
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
                p5 p5Var = this.e;
                ImageReceiver imageReceiver = p5Var != null ? p5Var.k : this.a;
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
                if (!yg.f0.c(this)) {
                    super.invalidate(i10, i11, i12, i13);
                    break;
                }
                break;
            case 1:
                if (!yg.f0.c(this)) {
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
        nk0 nk0Var = this.H;
        switch (i10) {
            case 0:
                if (!yg.f0.c(this, nk0Var.P)) {
                    super.invalidate();
                    nk0Var.P.invalidate();
                    break;
                }
                break;
            case 1:
                if (!yg.f0.c(this)) {
                    super.invalidate();
                    break;
                }
                break;
            default:
                super.invalidate();
                nk0Var.P.invalidate();
                break;
        }
    }
}
