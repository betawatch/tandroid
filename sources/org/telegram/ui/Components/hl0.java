package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class hl0 extends y9 {
    public final /* synthetic */ int G;
    public final /* synthetic */ il0 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hl0(il0 il0Var, Context context, int i10) {
        super(context);
        this.G = i10;
        this.H = il0Var;
    }

    @Override // org.telegram.ui.Components.y9
    public ImageReceiver c() {
        switch (this.G) {
            case 0:
                return new gl0(0, this);
            case 1:
                return new gl0(1, this);
            default:
                return super.c();
        }
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.G) {
            case 0:
                il0 il0Var = this.H;
                hl0 hl0Var = il0Var.b;
                super.dispatchDraw(canvas);
                if (this.a.getLottieAnimation() != null && !il0Var.E) {
                    this.a.getLottieAnimation().start();
                }
                if (il0Var.s && !il0Var.v && this.a.getLottieAnimation() != null && this.a.getLottieAnimation().A() && hl0Var.a.getLottieAnimation() != null && hl0Var.a.getLottieAnimation().u()) {
                    il0Var.v = true;
                    hl0Var.a.getLottieAnimation().N(0, false, true);
                    hl0Var.setVisibility(0);
                    Runnable runnable = il0Var.P.P0;
                    if (runnable != null) {
                        runnable.run();
                    }
                    AndroidUtilities.runOnUIThread(new bd0(this, 17));
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
                il0 il0Var = this.H;
                if (!zg.d0.c(this, il0Var.P)) {
                    super.invalidate(rect);
                    il0Var.P.invalidate();
                    break;
                }
                break;
            default:
                super.invalidate(rect);
                break;
        }
    }

    @Override // org.telegram.ui.Components.y9, android.view.View
    public void onDraw(Canvas canvas) {
        switch (this.G) {
            case 1:
                this.H.b();
                super.onDraw(canvas);
                break;
            case 2:
                s5 s5Var = this.e;
                ImageReceiver imageReceiver = s5Var != null ? s5Var.k : this.a;
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
                if (!zg.d0.c(this)) {
                    super.invalidate(i10, i11, i12, i13);
                    break;
                }
                break;
            case 1:
                if (!zg.d0.c(this)) {
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
        il0 il0Var = this.H;
        switch (i10) {
            case 0:
                if (!zg.d0.c(this, il0Var.P)) {
                    super.invalidate();
                    il0Var.P.invalidate();
                    break;
                }
                break;
            case 1:
                if (!zg.d0.c(this)) {
                    super.invalidate();
                    break;
                }
                break;
            default:
                super.invalidate();
                il0Var.P.invalidate();
                break;
        }
    }
}
