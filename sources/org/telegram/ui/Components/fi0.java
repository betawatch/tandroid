package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class fi0 extends l9 {
    public final /* synthetic */ int G;
    public final /* synthetic */ gi0 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fi0(gi0 gi0Var, Context context, int i7) {
        super(context);
        this.G = i7;
        this.H = gi0Var;
    }

    @Override // org.telegram.ui.Components.l9
    public ImageReceiver c() {
        switch (this.G) {
            case 0:
                return new ei0(0, this);
            case 1:
                return new ei0(1, this);
            default:
                return super.c();
        }
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.G) {
            case 0:
                gi0 gi0Var = this.H;
                fi0 fi0Var = gi0Var.b;
                super.dispatchDraw(canvas);
                if (this.a.B() != null && !gi0Var.E) {
                    this.a.B().start();
                }
                if (gi0Var.s && !gi0Var.w && this.a.B() != null && this.a.B().A() && fi0Var.a.B() != null && fi0Var.a.B().u()) {
                    gi0Var.w = true;
                    fi0Var.a.B().N(0, false, true);
                    fi0Var.setVisibility(0);
                    Runnable runnable = gi0Var.P.P0;
                    if (runnable != null) {
                        runnable.run();
                    }
                    org.telegram.messenger.g0.h3(new ob0(this, 12));
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
                gi0 gi0Var = this.H;
                if (!ch.e0.c(this, gi0Var.P)) {
                    super.invalidate(rect);
                    gi0Var.P.invalidate();
                    break;
                }
                break;
            default:
                super.invalidate(rect);
                break;
        }
    }

    @Override // org.telegram.ui.Components.l9, android.view.View
    public void onDraw(Canvas canvas) {
        switch (this.G) {
            case 1:
                this.H.b();
                super.onDraw(canvas);
                break;
            case 2:
                i5 i5Var = this.e;
                ImageReceiver imageReceiver = i5Var != null ? i5Var.k : this.a;
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
    public void invalidate(int i7, int i10, int i11, int i12) {
        switch (this.G) {
            case 0:
                if (!ch.e0.c(this)) {
                    super.invalidate(i7, i10, i11, i12);
                    break;
                }
                break;
            case 1:
                if (!ch.e0.c(this)) {
                    super.invalidate(i7, i10, i11, i12);
                    break;
                }
                break;
            default:
                super.invalidate(i7, i10, i11, i12);
                break;
        }
    }

    @Override // android.view.View
    public final void invalidate() {
        int i7 = this.G;
        gi0 gi0Var = this.H;
        switch (i7) {
            case 0:
                if (!ch.e0.c(this, gi0Var.P)) {
                    super.invalidate();
                    gi0Var.P.invalidate();
                    break;
                }
                break;
            case 1:
                if (!ch.e0.c(this)) {
                    super.invalidate();
                    break;
                }
                break;
            default:
                super.invalidate();
                gi0Var.P.invalidate();
                break;
        }
    }
}
