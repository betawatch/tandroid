package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ck0 extends t9 {
    public final /* synthetic */ int C;
    public final /* synthetic */ dk0 D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ck0(dk0 dk0Var, Context context, int i10) {
        super(context);
        this.C = i10;
        this.D = dk0Var;
    }

    @Override // org.telegram.ui.Components.t9
    public ImageReceiver c() {
        switch (this.C) {
            case 0:
                return new bk0(0, this);
            case 1:
                return new bk0(1, this);
            default:
                return super.c();
        }
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.C) {
            case 0:
                dk0 dk0Var = this.D;
                ck0 ck0Var = dk0Var.b;
                super.dispatchDraw(canvas);
                if (this.a.getLottieAnimation() != null && !dk0Var.A) {
                    this.a.getLottieAnimation().start();
                }
                if (dk0Var.s && !dk0Var.v && this.a.getLottieAnimation() != null && this.a.getLottieAnimation().y() && ck0Var.a.getLottieAnimation() != null && ck0Var.a.getLottieAnimation().s()) {
                    dk0Var.v = true;
                    ck0Var.a.getLottieAnimation().L(0, false, true);
                    ck0Var.setVisibility(0);
                    Runnable runnable = dk0Var.L.L0;
                    if (runnable != null) {
                        runnable.run();
                    }
                    AndroidUtilities.runOnUIThread(new xb0(this, 17));
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
                dk0 dk0Var = this.D;
                if (!kg.g0.c(this, dk0Var.L)) {
                    super.invalidate(rect);
                    dk0Var.L.invalidate();
                    break;
                }
                break;
            default:
                super.invalidate(rect);
                break;
        }
    }

    @Override // org.telegram.ui.Components.t9, android.view.View
    public void onDraw(Canvas canvas) {
        switch (this.C) {
            case 1:
                this.D.b();
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
        switch (this.C) {
            case 0:
                if (!kg.g0.c(this)) {
                    super.invalidate(i10, i11, i12, i13);
                    break;
                }
                break;
            case 1:
                if (!kg.g0.c(this)) {
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
        int i10 = this.C;
        dk0 dk0Var = this.D;
        switch (i10) {
            case 0:
                if (!kg.g0.c(this, dk0Var.L)) {
                    super.invalidate();
                    dk0Var.L.invalidate();
                    break;
                }
                break;
            case 1:
                if (!kg.g0.c(this)) {
                    super.invalidate();
                    break;
                }
                break;
            default:
                super.invalidate();
                dk0Var.L.invalidate();
                break;
        }
    }
}
