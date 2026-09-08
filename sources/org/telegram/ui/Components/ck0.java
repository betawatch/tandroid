package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class ck0 extends x9 {
    public final /* synthetic */ int G;
    public final /* synthetic */ dk0 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ck0(dk0 dk0Var, Context context, int i10) {
        super(context);
        this.G = i10;
        this.H = dk0Var;
    }

    @Override // org.telegram.ui.Components.x9
    public ImageReceiver c() {
        switch (this.G) {
            case 0:
                return new bk0(0, this);
            case 1:
                return new bk0(1, this);
            default:
                return super.c();
        }
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.G) {
            case 0:
                dk0 dk0Var = this.H;
                ck0 ck0Var = dk0Var.b;
                super.dispatchDraw(canvas);
                if (this.a.getLottieAnimation() != null && !dk0Var.E) {
                    this.a.getLottieAnimation().start();
                }
                if (dk0Var.s && !dk0Var.v && this.a.getLottieAnimation() != null && this.a.getLottieAnimation().y() && ck0Var.a.getLottieAnimation() != null && ck0Var.a.getLottieAnimation().s()) {
                    dk0Var.v = true;
                    ck0Var.a.getLottieAnimation().L(0, false, true);
                    ck0Var.setVisibility(0);
                    Runnable runnable = dk0Var.P.P0;
                    if (runnable != null) {
                        runnable.run();
                    }
                    AndroidUtilities.runOnUIThread(new cc0(this, 17));
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
                dk0 dk0Var = this.H;
                if (!ah.y0.c(this, dk0Var.P)) {
                    super.invalidate(rect);
                    dk0Var.P.invalidate();
                    break;
                }
                break;
            default:
                super.invalidate(rect);
                break;
        }
    }

    @Override // org.telegram.ui.Components.x9, android.view.View
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
                if (!ah.y0.c(this)) {
                    super.invalidate(i10, i11, i12, i13);
                    break;
                }
                break;
            case 1:
                if (!ah.y0.c(this)) {
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
        dk0 dk0Var = this.H;
        switch (i10) {
            case 0:
                if (!ah.y0.c(this, dk0Var.P)) {
                    super.invalidate();
                    dk0Var.P.invalidate();
                    break;
                }
                break;
            case 1:
                if (!ah.y0.c(this)) {
                    super.invalidate();
                    break;
                }
                break;
            default:
                super.invalidate();
                dk0Var.P.invalidate();
                break;
        }
    }
}
