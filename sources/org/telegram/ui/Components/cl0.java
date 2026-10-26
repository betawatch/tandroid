package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class cl0 extends y9 {
    public final /* synthetic */ int G;
    public final /* synthetic */ dl0 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cl0(dl0 dl0Var, Context context, int i10) {
        super(context);
        this.G = i10;
        this.H = dl0Var;
    }

    @Override // org.telegram.ui.Components.y9
    public ImageReceiver c() {
        switch (this.G) {
            case 0:
                return new bl0(0, this);
            case 1:
                return new bl0(1, this);
            default:
                return super.c();
        }
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.G) {
            case 0:
                dl0 dl0Var = this.H;
                cl0 cl0Var = dl0Var.b;
                super.dispatchDraw(canvas);
                if (this.a.getLottieAnimation() != null && !dl0Var.E) {
                    this.a.getLottieAnimation().start();
                }
                if (dl0Var.s && !dl0Var.v && this.a.getLottieAnimation() != null && this.a.getLottieAnimation().A() && cl0Var.a.getLottieAnimation() != null && cl0Var.a.getLottieAnimation().u()) {
                    dl0Var.v = true;
                    cl0Var.a.getLottieAnimation().N(0, false, true);
                    cl0Var.setVisibility(0);
                    Runnable runnable = dl0Var.P.P0;
                    if (runnable != null) {
                        runnable.run();
                    }
                    AndroidUtilities.runOnUIThread(new wa0(this, 19));
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
                dl0 dl0Var = this.H;
                if (!bh.m0.c(this, dl0Var.P)) {
                    super.invalidate(rect);
                    dl0Var.P.invalidate();
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
                t5 t5Var = this.e;
                ImageReceiver imageReceiver = t5Var != null ? t5Var.k : this.a;
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
                if (!bh.m0.c(this)) {
                    super.invalidate(i10, i11, i12, i13);
                    break;
                }
                break;
            case 1:
                if (!bh.m0.c(this)) {
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
        dl0 dl0Var = this.H;
        switch (i10) {
            case 0:
                if (!bh.m0.c(this, dl0Var.P)) {
                    super.invalidate();
                    dl0Var.P.invalidate();
                    break;
                }
                break;
            case 1:
                if (!bh.m0.c(this)) {
                    super.invalidate();
                    break;
                }
                break;
            default:
                super.invalidate();
                dl0Var.P.invalidate();
                break;
        }
    }
}
