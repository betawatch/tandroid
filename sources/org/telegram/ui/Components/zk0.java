package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class zk0 extends w9 {
    public final /* synthetic */ int G;
    public final /* synthetic */ al0 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zk0(al0 al0Var, Context context, int i10) {
        super(context);
        this.G = i10;
        this.H = al0Var;
    }

    @Override // org.telegram.ui.Components.w9
    public ImageReceiver c() {
        switch (this.G) {
            case 0:
                return new yk0(0, this);
            case 1:
                return new yk0(1, this);
            default:
                return super.c();
        }
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.G) {
            case 0:
                al0 al0Var = this.H;
                zk0 zk0Var = al0Var.b;
                super.dispatchDraw(canvas);
                if (this.a.getLottieAnimation() != null && !al0Var.E) {
                    this.a.getLottieAnimation().start();
                }
                if (al0Var.s && !al0Var.v && this.a.getLottieAnimation() != null && this.a.getLottieAnimation().A() && zk0Var.a.getLottieAnimation() != null && zk0Var.a.getLottieAnimation().u()) {
                    al0Var.v = true;
                    zk0Var.a.getLottieAnimation().N(0, false, true);
                    zk0Var.setVisibility(0);
                    Runnable runnable = al0Var.P.P0;
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
                al0 al0Var = this.H;
                if (!ah.x0.c(this, al0Var.P)) {
                    super.invalidate(rect);
                    al0Var.P.invalidate();
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
        al0 al0Var = this.H;
        switch (i10) {
            case 0:
                if (!ah.x0.c(this, al0Var.P)) {
                    super.invalidate();
                    al0Var.P.invalidate();
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
                al0Var.P.invalidate();
                break;
        }
    }
}
