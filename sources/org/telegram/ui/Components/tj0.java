package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class tj0 extends n9 {
    public final /* synthetic */ int C;
    public final /* synthetic */ uj0 D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tj0(uj0 uj0Var, Context context, int i10) {
        super(context);
        this.C = i10;
        this.D = uj0Var;
    }

    @Override // org.telegram.ui.Components.n9
    public ImageReceiver c() {
        switch (this.C) {
            case 0:
                return new sj0(0, this);
            case 1:
                return new sj0(1, this);
            default:
                return super.c();
        }
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.C) {
            case 0:
                uj0 uj0Var = this.D;
                tj0 tj0Var = uj0Var.b;
                super.dispatchDraw(canvas);
                if (this.a.getLottieAnimation() != null && !uj0Var.A) {
                    this.a.getLottieAnimation().start();
                }
                if (uj0Var.s && !uj0Var.v && this.a.getLottieAnimation() != null && this.a.getLottieAnimation().y() && tj0Var.a.getLottieAnimation() != null && tj0Var.a.getLottieAnimation().s()) {
                    uj0Var.v = true;
                    tj0Var.a.getLottieAnimation().L(0, false, true);
                    tj0Var.setVisibility(0);
                    Runnable runnable = uj0Var.L.L0;
                    if (runnable != null) {
                        runnable.run();
                    }
                    AndroidUtilities.runOnUIThread(new mb0(this, 17));
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
                uj0 uj0Var = this.D;
                if (!ig.g0.c(this, uj0Var.L)) {
                    super.invalidate(rect);
                    uj0Var.L.invalidate();
                    break;
                }
                break;
            default:
                super.invalidate(rect);
                break;
        }
    }

    @Override // org.telegram.ui.Components.n9, android.view.View
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
    public void invalidate(int i10, int i11, int i12, int i13) {
        switch (this.C) {
            case 0:
                if (!ig.g0.c(this)) {
                    super.invalidate(i10, i11, i12, i13);
                    break;
                }
                break;
            case 1:
                if (!ig.g0.c(this)) {
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
        uj0 uj0Var = this.D;
        switch (i10) {
            case 0:
                if (!ig.g0.c(this, uj0Var.L)) {
                    super.invalidate();
                    uj0Var.L.invalidate();
                    break;
                }
                break;
            case 1:
                if (!ig.g0.c(this)) {
                    super.invalidate();
                    break;
                }
                break;
            default:
                super.invalidate();
                uj0Var.L.invalidate();
                break;
        }
    }
}
