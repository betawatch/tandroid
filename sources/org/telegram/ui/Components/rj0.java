package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class rj0 extends o9 {
    public final /* synthetic */ int C;
    public final /* synthetic */ sj0 D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rj0(sj0 sj0Var, Context context, int i9) {
        super(context);
        this.C = i9;
        this.D = sj0Var;
    }

    @Override // org.telegram.ui.Components.o9
    public ImageReceiver c() {
        switch (this.C) {
            case 0:
                return new qj0(0, this);
            case 1:
                return new qj0(1, this);
            default:
                return super.c();
        }
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.C) {
            case 0:
                sj0 sj0Var = this.D;
                rj0 rj0Var = sj0Var.b;
                super.dispatchDraw(canvas);
                if (this.a.getLottieAnimation() != null && !sj0Var.A) {
                    this.a.getLottieAnimation().start();
                }
                if (sj0Var.s && !sj0Var.v && this.a.getLottieAnimation() != null && this.a.getLottieAnimation().y() && rj0Var.a.getLottieAnimation() != null && rj0Var.a.getLottieAnimation().s()) {
                    sj0Var.v = true;
                    rj0Var.a.getLottieAnimation().L(0, false, true);
                    rj0Var.setVisibility(0);
                    Runnable runnable = sj0Var.L.L0;
                    if (runnable != null) {
                        runnable.run();
                    }
                    AndroidUtilities.runOnUIThread(new ib0(this, 17));
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
        switch (this.C) {
            case 0:
                sj0 sj0Var = this.D;
                if (!hg.h0.c(this, sj0Var.L)) {
                    super.invalidate(rect);
                    sj0Var.L.invalidate();
                    break;
                }
                break;
            default:
                super.invalidate(rect);
                break;
        }
    }

    @Override // org.telegram.ui.Components.o9, android.view.View
    public void onDraw(Canvas canvas) {
        switch (this.C) {
            case 1:
                this.D.b();
                super.onDraw(canvas);
                break;
            case 2:
                k5 k5Var = this.e;
                ImageReceiver imageReceiver = k5Var != null ? k5Var.k : this.a;
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
    public void invalidate(int i9, int i10, int i11, int i12) {
        switch (this.C) {
            case 0:
                if (!hg.h0.c(this)) {
                    super.invalidate(i9, i10, i11, i12);
                    break;
                }
                break;
            case 1:
                if (!hg.h0.c(this)) {
                    super.invalidate(i9, i10, i11, i12);
                    break;
                }
                break;
            default:
                super.invalidate(i9, i10, i11, i12);
                break;
        }
    }

    @Override // android.view.View
    public final void invalidate() {
        int i9 = this.C;
        sj0 sj0Var = this.D;
        switch (i9) {
            case 0:
                if (!hg.h0.c(this, sj0Var.L)) {
                    super.invalidate();
                    sj0Var.L.invalidate();
                    break;
                }
                break;
            case 1:
                if (!hg.h0.c(this)) {
                    super.invalidate();
                    break;
                }
                break;
            default:
                super.invalidate();
                sj0Var.L.invalidate();
                break;
        }
    }
}
