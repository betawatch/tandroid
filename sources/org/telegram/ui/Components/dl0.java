package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class dl0 extends w9 {
    public final /* synthetic */ int G;
    public final /* synthetic */ el0 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dl0(el0 el0Var, Context context, int i10) {
        super(context);
        this.G = i10;
        this.H = el0Var;
    }

    @Override // org.telegram.ui.Components.w9
    public ImageReceiver c() {
        switch (this.G) {
            case 0:
                return new cl0(0, this);
            case 1:
                return new cl0(1, this);
            default:
                return super.c();
        }
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.G) {
            case 0:
                el0 el0Var = this.H;
                dl0 dl0Var = el0Var.b;
                super.dispatchDraw(canvas);
                if (this.a.getLottieAnimation() != null && !el0Var.E) {
                    this.a.getLottieAnimation().start();
                }
                if (el0Var.s && !el0Var.v && this.a.getLottieAnimation() != null && this.a.getLottieAnimation().A() && dl0Var.a.getLottieAnimation() != null && dl0Var.a.getLottieAnimation().u()) {
                    el0Var.v = true;
                    dl0Var.a.getLottieAnimation().N(0, false, true);
                    dl0Var.setVisibility(0);
                    Runnable runnable = el0Var.P.P0;
                    if (runnable != null) {
                        runnable.run();
                    }
                    AndroidUtilities.runOnUIThread(new yb0(this, 18));
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
                el0 el0Var = this.H;
                if (!ah.x0.c(this, el0Var.P)) {
                    super.invalidate(rect);
                    el0Var.P.invalidate();
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
        el0 el0Var = this.H;
        switch (i10) {
            case 0:
                if (!ah.x0.c(this, el0Var.P)) {
                    super.invalidate();
                    el0Var.P.invalidate();
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
                el0Var.P.invalidate();
                break;
        }
    }
}
