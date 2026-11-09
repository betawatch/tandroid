package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class gi0 extends l9 {
    public final /* synthetic */ int G;
    public final /* synthetic */ hi0 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gi0(hi0 hi0Var, Context context, int i7) {
        super(context);
        this.G = i7;
        this.H = hi0Var;
    }

    @Override // org.telegram.ui.Components.l9
    public ImageReceiver c() {
        switch (this.G) {
            case 0:
                return new fi0(0, this);
            case 1:
                return new fi0(1, this);
            default:
                return super.c();
        }
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.G) {
            case 0:
                hi0 hi0Var = this.H;
                gi0 gi0Var = hi0Var.b;
                super.dispatchDraw(canvas);
                if (this.a.B() != null && !hi0Var.E) {
                    this.a.B().start();
                }
                if (hi0Var.s && !hi0Var.w && this.a.B() != null && this.a.B().A() && gi0Var.a.B() != null && gi0Var.a.B().u()) {
                    hi0Var.w = true;
                    gi0Var.a.B().N(0, false, true);
                    gi0Var.setVisibility(0);
                    Runnable runnable = hi0Var.P.P0;
                    if (runnable != null) {
                        runnable.run();
                    }
                    org.telegram.messenger.g0.h3(new pb0(this, 12));
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
                hi0 hi0Var = this.H;
                if (!ch.e0.c(this, hi0Var.P)) {
                    super.invalidate(rect);
                    hi0Var.P.invalidate();
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
        hi0 hi0Var = this.H;
        switch (i7) {
            case 0:
                if (!ch.e0.c(this, hi0Var.P)) {
                    super.invalidate();
                    hi0Var.P.invalidate();
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
                hi0Var.P.invalidate();
                break;
        }
    }
}
