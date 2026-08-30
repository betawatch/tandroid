package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class mk0 extends p9 {
    public final /* synthetic */ int D;
    public final /* synthetic */ nk0 E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mk0(nk0 nk0Var, Context context, int i10) {
        super(context);
        this.D = i10;
        this.E = nk0Var;
    }

    @Override // org.telegram.ui.Components.p9
    public ImageReceiver c() {
        switch (this.D) {
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
        switch (this.D) {
            case 0:
                nk0 nk0Var = this.E;
                mk0 mk0Var = nk0Var.b;
                super.dispatchDraw(canvas);
                if (this.a.getLottieAnimation() != null && !nk0Var.B) {
                    this.a.getLottieAnimation().start();
                }
                if (nk0Var.s && !nk0Var.v && this.a.getLottieAnimation() != null && this.a.getLottieAnimation().y() && mk0Var.a.getLottieAnimation() != null && mk0Var.a.getLottieAnimation().s()) {
                    nk0Var.v = true;
                    mk0Var.a.getLottieAnimation().L(0, false, true);
                    mk0Var.setVisibility(0);
                    Runnable runnable = nk0Var.M.M0;
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
        switch (this.D) {
            case 0:
                nk0 nk0Var = this.E;
                if (!mg.g0.c(this, nk0Var.M)) {
                    super.invalidate(rect);
                    nk0Var.M.invalidate();
                    break;
                }
                break;
            default:
                super.invalidate(rect);
                break;
        }
    }

    @Override // org.telegram.ui.Components.p9, android.view.View
    public void onDraw(Canvas canvas) {
        switch (this.D) {
            case 1:
                this.E.b();
                super.onDraw(canvas);
                break;
            case 2:
                l5 l5Var = this.e;
                ImageReceiver imageReceiver = l5Var != null ? l5Var.k : this.a;
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
        switch (this.D) {
            case 0:
                if (!mg.g0.c(this)) {
                    super.invalidate(i10, i11, i12, i13);
                    break;
                }
                break;
            case 1:
                if (!mg.g0.c(this)) {
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
        int i10 = this.D;
        nk0 nk0Var = this.E;
        switch (i10) {
            case 0:
                if (!mg.g0.c(this, nk0Var.M)) {
                    super.invalidate();
                    nk0Var.M.invalidate();
                    break;
                }
                break;
            case 1:
                if (!mg.g0.c(this)) {
                    super.invalidate();
                    break;
                }
                break;
            default:
                super.invalidate();
                nk0Var.M.invalidate();
                break;
        }
    }
}
