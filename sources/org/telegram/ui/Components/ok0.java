package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class ok0 extends p9 {
    public final /* synthetic */ int D;
    public final /* synthetic */ pk0 E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ok0(pk0 pk0Var, Context context, int i10) {
        super(context);
        this.D = i10;
        this.E = pk0Var;
    }

    @Override // org.telegram.ui.Components.p9
    public ImageReceiver c() {
        switch (this.D) {
            case 0:
                return new nk0(0, this);
            case 1:
                return new nk0(1, this);
            default:
                return super.c();
        }
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.D) {
            case 0:
                pk0 pk0Var = this.E;
                ok0 ok0Var = pk0Var.b;
                super.dispatchDraw(canvas);
                if (this.a.getLottieAnimation() != null && !pk0Var.B) {
                    this.a.getLottieAnimation().start();
                }
                if (pk0Var.s && !pk0Var.v && this.a.getLottieAnimation() != null && this.a.getLottieAnimation().y() && ok0Var.a.getLottieAnimation() != null && ok0Var.a.getLottieAnimation().s()) {
                    pk0Var.v = true;
                    ok0Var.a.getLottieAnimation().L(0, false, true);
                    ok0Var.setVisibility(0);
                    Runnable runnable = pk0Var.M.M0;
                    if (runnable != null) {
                        runnable.run();
                    }
                    AndroidUtilities.runOnUIThread(new ec0(this, 17));
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
        switch (this.D) {
            case 0:
                pk0 pk0Var = this.E;
                if (!ng.g0.c(this, pk0Var.M)) {
                    super.invalidate(rect);
                    pk0Var.M.invalidate();
                    break;
                }
                break;
            default:
                super.invalidate(rect);
                break;
        }
    }

    @Override // org.telegram.ui.Components.p9, android.view.View
    public void onDraw(Canvas canvas) {
        switch (this.D) {
            case 1:
                this.E.b();
                super.onDraw(canvas);
                break;
            case 2:
                l5 l5Var = this.e;
                ImageReceiver imageReceiver = l5Var != null ? l5Var.k : this.a;
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
        switch (this.D) {
            case 0:
                if (!ng.g0.c(this)) {
                    super.invalidate(i10, i11, i12, i13);
                    break;
                }
                break;
            case 1:
                if (!ng.g0.c(this)) {
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
        int i10 = this.D;
        pk0 pk0Var = this.E;
        switch (i10) {
            case 0:
                if (!ng.g0.c(this, pk0Var.M)) {
                    super.invalidate();
                    pk0Var.M.invalidate();
                    break;
                }
                break;
            case 1:
                if (!ng.g0.c(this)) {
                    super.invalidate();
                    break;
                }
                break;
            default:
                super.invalidate();
                pk0Var.M.invalidate();
                break;
        }
    }
}
