package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class al0 extends w9 {
    public final /* synthetic */ int G;
    public final /* synthetic */ bl0 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ al0(bl0 bl0Var, Context context, int i10) {
        super(context);
        this.G = i10;
        this.H = bl0Var;
    }

    @Override // org.telegram.ui.Components.w9
    public ImageReceiver c() {
        switch (this.G) {
            case 0:
                return new zk0(0, this);
            case 1:
                return new zk0(1, this);
            default:
                return super.c();
        }
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.G) {
            case 0:
                bl0 bl0Var = this.H;
                al0 al0Var = bl0Var.b;
                super.dispatchDraw(canvas);
                if (this.a.getLottieAnimation() != null && !bl0Var.E) {
                    this.a.getLottieAnimation().start();
                }
                if (bl0Var.s && !bl0Var.v && this.a.getLottieAnimation() != null && this.a.getLottieAnimation().A() && al0Var.a.getLottieAnimation() != null && al0Var.a.getLottieAnimation().u()) {
                    bl0Var.v = true;
                    al0Var.a.getLottieAnimation().N(0, false, true);
                    al0Var.setVisibility(0);
                    Runnable runnable = bl0Var.P.P0;
                    if (runnable != null) {
                        runnable.run();
                    }
                    AndroidUtilities.runOnUIThread(new rc0(this, 17));
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
                bl0 bl0Var = this.H;
                if (!ah.x0.c(this, bl0Var.P)) {
                    super.invalidate(rect);
                    bl0Var.P.invalidate();
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
                r5 r5Var = this.e;
                ImageReceiver imageReceiver = r5Var != null ? r5Var.k : this.a;
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
                if (!ah.x0.c(this)) {
                    super.invalidate(i10, i11, i12, i13);
                    break;
                }
                break;
            case 1:
                if (!ah.x0.c(this)) {
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
        bl0 bl0Var = this.H;
        switch (i10) {
            case 0:
                if (!ah.x0.c(this, bl0Var.P)) {
                    super.invalidate();
                    bl0Var.P.invalidate();
                    break;
                }
                break;
            case 1:
                if (!ah.x0.c(this)) {
                    super.invalidate();
                    break;
                }
                break;
            default:
                super.invalidate();
                bl0Var.P.invalidate();
                break;
        }
    }
}
