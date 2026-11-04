package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ii0 extends k9 {
    public final /* synthetic */ int H;
    public final /* synthetic */ ji0 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ii0(ji0 ji0Var, Context context, int i3) {
        super(context);
        this.H = i3;
        this.I = ji0Var;
    }

    @Override // org.telegram.ui.Components.k9
    public ImageReceiver c() {
        switch (this.H) {
            case 0:
                return new hi0(0, this);
            case 1:
                return new hi0(1, this);
            default:
                return super.c();
        }
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.H) {
            case 0:
                ji0 ji0Var = this.I;
                ii0 ii0Var = ji0Var.b;
                super.dispatchDraw(canvas);
                if (this.a.B() != null && !ji0Var.F) {
                    this.a.B().start();
                }
                if (ji0Var.s && !ji0Var.w && this.a.B() != null && this.a.B().A() && ii0Var.a.B() != null && ii0Var.a.B().u()) {
                    ji0Var.w = true;
                    ii0Var.a.B().N(0, false, true);
                    ii0Var.setVisibility(0);
                    Runnable runnable = ji0Var.Q.Q0;
                    if (runnable != null) {
                        runnable.run();
                    }
                    org.telegram.messenger.g0.h3(new jb0(this, 14));
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
        switch (this.H) {
            case 0:
                ji0 ji0Var = this.I;
                if (!dh.d0.c(this, ji0Var.Q)) {
                    super.invalidate(rect);
                    ji0Var.Q.invalidate();
                    break;
                }
                break;
            default:
                super.invalidate(rect);
                break;
        }
    }

    @Override // org.telegram.ui.Components.k9, android.view.View
    public void onDraw(Canvas canvas) {
        switch (this.H) {
            case 1:
                this.I.b();
                super.onDraw(canvas);
                break;
            case 2:
                g5 g5Var = this.e;
                ImageReceiver imageReceiver = g5Var != null ? g5Var.k : this.a;
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
    public void invalidate(int i3, int i10, int i11, int i12) {
        switch (this.H) {
            case 0:
                if (!dh.d0.c(this)) {
                    super.invalidate(i3, i10, i11, i12);
                    break;
                }
                break;
            case 1:
                if (!dh.d0.c(this)) {
                    super.invalidate(i3, i10, i11, i12);
                    break;
                }
                break;
            default:
                super.invalidate(i3, i10, i11, i12);
                break;
        }
    }

    @Override // android.view.View
    public final void invalidate() {
        int i3 = this.H;
        ji0 ji0Var = this.I;
        switch (i3) {
            case 0:
                if (!dh.d0.c(this, ji0Var.Q)) {
                    super.invalidate();
                    ji0Var.Q.invalidate();
                    break;
                }
                break;
            case 1:
                if (!dh.d0.c(this)) {
                    super.invalidate();
                    break;
                }
                break;
            default:
                super.invalidate();
                ji0Var.Q.invalidate();
                break;
        }
    }
}
