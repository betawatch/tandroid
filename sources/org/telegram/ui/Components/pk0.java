package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class pk0 extends v9 {
    public final /* synthetic */ int G;
    public final /* synthetic */ qk0 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pk0(qk0 qk0Var, Context context, int i10) {
        super(context);
        this.G = i10;
        this.H = qk0Var;
    }

    @Override // org.telegram.ui.Components.v9
    public ImageReceiver c() {
        switch (this.G) {
            case 0:
                return new ok0(0, this);
            case 1:
                return new ok0(1, this);
            default:
                return super.c();
        }
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.G) {
            case 0:
                qk0 qk0Var = this.H;
                pk0 pk0Var = qk0Var.b;
                super.dispatchDraw(canvas);
                if (this.a.getLottieAnimation() != null && !qk0Var.E) {
                    this.a.getLottieAnimation().start();
                }
                if (qk0Var.s && !qk0Var.v && this.a.getLottieAnimation() != null && this.a.getLottieAnimation().A() && pk0Var.a.getLottieAnimation() != null && pk0Var.a.getLottieAnimation().u()) {
                    qk0Var.v = true;
                    pk0Var.a.getLottieAnimation().N(0, false, true);
                    pk0Var.setVisibility(0);
                    Runnable runnable = qk0Var.P.P0;
                    if (runnable != null) {
                        runnable.run();
                    }
                    AndroidUtilities.runOnUIThread(new jc0(this, 18));
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
                qk0 qk0Var = this.H;
                if (!zg.f0.c(this, qk0Var.P)) {
                    super.invalidate(rect);
                    qk0Var.P.invalidate();
                    break;
                }
                break;
            default:
                super.invalidate(rect);
                break;
        }
    }

    @Override // org.telegram.ui.Components.v9, android.view.View
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
                if (!zg.f0.c(this)) {
                    super.invalidate(i10, i11, i12, i13);
                    break;
                }
                break;
            case 1:
                if (!zg.f0.c(this)) {
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
        qk0 qk0Var = this.H;
        switch (i10) {
            case 0:
                if (!zg.f0.c(this, qk0Var.P)) {
                    super.invalidate();
                    qk0Var.P.invalidate();
                    break;
                }
                break;
            case 1:
                if (!zg.f0.c(this)) {
                    super.invalidate();
                    break;
                }
                break;
            default:
                super.invalidate();
                qk0Var.P.invalidate();
                break;
        }
    }
}
