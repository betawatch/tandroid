package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class kj0 extends g9 {
    public final /* synthetic */ int G;
    public final /* synthetic */ lj0 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kj0(lj0 lj0Var, Context context, int i10) {
        super(context);
        this.G = i10;
        this.H = lj0Var;
    }

    @Override // org.telegram.ui.Components.g9
    public ImageReceiver c() {
        switch (this.G) {
            case 0:
                return new jj0(0, this);
            case 1:
                return new jj0(1, this);
            default:
                return super.c();
        }
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.G) {
            case 0:
                lj0 lj0Var = this.H;
                kj0 kj0Var = lj0Var.b;
                super.dispatchDraw(canvas);
                if (this.a.B() != null && !lj0Var.E) {
                    this.a.B().start();
                }
                if (lj0Var.s && !lj0Var.w && this.a.B() != null && this.a.B().A() && kj0Var.a.B() != null && kj0Var.a.B().u()) {
                    lj0Var.w = true;
                    kj0Var.a.B().N(0, false, true);
                    kj0Var.setVisibility(0);
                    Runnable runnable = lj0Var.P.P0;
                    if (runnable != null) {
                        runnable.run();
                    }
                    org.telegram.messenger.i0.g3(new eb0(this, 17));
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
                lj0 lj0Var = this.H;
                if (!sg.e0.c(this, lj0Var.P)) {
                    super.invalidate(rect);
                    lj0Var.P.invalidate();
                    break;
                }
                break;
            default:
                super.invalidate(rect);
                break;
        }
    }

    @Override // org.telegram.ui.Components.g9, android.view.View
    public void onDraw(Canvas canvas) {
        switch (this.G) {
            case 1:
                this.H.b();
                super.onDraw(canvas);
                break;
            case 2:
                f5 f5Var = this.e;
                ImageReceiver imageReceiver = f5Var != null ? f5Var.k : this.a;
                if (imageReceiver != null && imageReceiver.B() != null) {
                    imageReceiver.B().start();
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
                if (!sg.e0.c(this)) {
                    super.invalidate(i10, i11, i12, i13);
                    break;
                }
                break;
            case 1:
                if (!sg.e0.c(this)) {
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
        lj0 lj0Var = this.H;
        switch (i10) {
            case 0:
                if (!sg.e0.c(this, lj0Var.P)) {
                    super.invalidate();
                    lj0Var.P.invalidate();
                    break;
                }
                break;
            case 1:
                if (!sg.e0.c(this)) {
                    super.invalidate();
                    break;
                }
                break;
            default:
                super.invalidate();
                lj0Var.P.invalidate();
                break;
        }
    }
}
