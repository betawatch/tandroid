package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class jj0 extends g9 {
    public final /* synthetic */ int G;
    public final /* synthetic */ kj0 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jj0(kj0 kj0Var, Context context, int i10) {
        super(context);
        this.G = i10;
        this.H = kj0Var;
    }

    @Override // org.telegram.ui.Components.g9
    public ImageReceiver c() {
        switch (this.G) {
            case 0:
                return new ij0(0, this);
            case 1:
                return new ij0(1, this);
            default:
                return super.c();
        }
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.G) {
            case 0:
                kj0 kj0Var = this.H;
                jj0 jj0Var = kj0Var.b;
                super.dispatchDraw(canvas);
                if (this.a.B() != null && !kj0Var.E) {
                    this.a.B().start();
                }
                if (kj0Var.s && !kj0Var.w && this.a.B() != null && this.a.B().A() && jj0Var.a.B() != null && jj0Var.a.B().u()) {
                    kj0Var.w = true;
                    jj0Var.a.B().N(0, false, true);
                    jj0Var.setVisibility(0);
                    Runnable runnable = kj0Var.P.P0;
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
                kj0 kj0Var = this.H;
                if (!sg.e0.c(this, kj0Var.P)) {
                    super.invalidate(rect);
                    kj0Var.P.invalidate();
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
        kj0 kj0Var = this.H;
        switch (i10) {
            case 0:
                if (!sg.e0.c(this, kj0Var.P)) {
                    super.invalidate();
                    kj0Var.P.invalidate();
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
                kj0Var.P.invalidate();
                break;
        }
    }
}
