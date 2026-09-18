package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class nk0 extends w9 {
    public final /* synthetic */ int G;
    public final /* synthetic */ ok0 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nk0(ok0 ok0Var, Context context, int i10) {
        super(context);
        this.G = i10;
        this.H = ok0Var;
    }

    @Override // org.telegram.ui.Components.w9
    public ImageReceiver c() {
        switch (this.G) {
            case 0:
                return new mk0(0, this);
            case 1:
                return new mk0(1, this);
            default:
                return super.c();
        }
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.G) {
            case 0:
                ok0 ok0Var = this.H;
                nk0 nk0Var = ok0Var.b;
                super.dispatchDraw(canvas);
                if (this.a.getLottieAnimation() != null && !ok0Var.E) {
                    this.a.getLottieAnimation().start();
                }
                if (ok0Var.s && !ok0Var.v && this.a.getLottieAnimation() != null && this.a.getLottieAnimation().A() && nk0Var.a.getLottieAnimation() != null && nk0Var.a.getLottieAnimation().u()) {
                    ok0Var.v = true;
                    nk0Var.a.getLottieAnimation().N(0, false, true);
                    nk0Var.setVisibility(0);
                    Runnable runnable = ok0Var.P.P0;
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
                ok0 ok0Var = this.H;
                if (!zg.e0.c(this, ok0Var.P)) {
                    super.invalidate(rect);
                    ok0Var.P.invalidate();
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
                if (!zg.e0.c(this)) {
                    super.invalidate(i10, i11, i12, i13);
                    break;
                }
                break;
            case 1:
                if (!zg.e0.c(this)) {
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
        ok0 ok0Var = this.H;
        switch (i10) {
            case 0:
                if (!zg.e0.c(this, ok0Var.P)) {
                    super.invalidate();
                    ok0Var.P.invalidate();
                    break;
                }
                break;
            case 1:
                if (!zg.e0.c(this)) {
                    super.invalidate();
                    break;
                }
                break;
            default:
                super.invalidate();
                ok0Var.P.invalidate();
                break;
        }
    }
}
