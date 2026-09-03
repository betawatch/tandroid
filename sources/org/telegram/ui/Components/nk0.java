package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class nk0 extends p9 {
    public final /* synthetic */ int D;
    public final /* synthetic */ ok0 E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nk0(ok0 ok0Var, Context context, int i10) {
        super(context);
        this.D = i10;
        this.E = ok0Var;
    }

    @Override // org.telegram.ui.Components.p9
    public ImageReceiver c() {
        switch (this.D) {
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
        switch (this.D) {
            case 0:
                ok0 ok0Var = this.E;
                nk0 nk0Var = ok0Var.b;
                super.dispatchDraw(canvas);
                if (this.a.getLottieAnimation() != null && !ok0Var.B) {
                    this.a.getLottieAnimation().start();
                }
                if (ok0Var.s && !ok0Var.v && this.a.getLottieAnimation() != null && this.a.getLottieAnimation().y() && nk0Var.a.getLottieAnimation() != null && nk0Var.a.getLottieAnimation().s()) {
                    ok0Var.v = true;
                    nk0Var.a.getLottieAnimation().L(0, false, true);
                    nk0Var.setVisibility(0);
                    Runnable runnable = ok0Var.M.M0;
                    if (runnable != null) {
                        runnable.run();
                    }
                    AndroidUtilities.runOnUIThread(new ec0(this, 17));
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
                ok0 ok0Var = this.E;
                if (!ng.g0.c(this, ok0Var.M)) {
                    super.invalidate(rect);
                    ok0Var.M.invalidate();
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
                if (!ng.g0.c(this)) {
                    super.invalidate(i10, i11, i12, i13);
                    break;
                }
                break;
            case 1:
                if (!ng.g0.c(this)) {
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
        ok0 ok0Var = this.E;
        switch (i10) {
            case 0:
                if (!ng.g0.c(this, ok0Var.M)) {
                    super.invalidate();
                    ok0Var.M.invalidate();
                    break;
                }
                break;
            case 1:
                if (!ng.g0.c(this)) {
                    super.invalidate();
                    break;
                }
                break;
            default:
                super.invalidate();
                ok0Var.M.invalidate();
                break;
        }
    }
}
