package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class ui0 extends q9 {
    public final /* synthetic */ int H;
    public final /* synthetic */ vi0 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ui0(vi0 vi0Var, Context context, int i7) {
        super(context);
        this.H = i7;
        this.I = vi0Var;
    }

    @Override // org.telegram.ui.Components.q9
    public ImageReceiver c() {
        switch (this.H) {
            case 0:
                return new ti0(0, this);
            case 1:
                return new ti0(1, this);
            default:
                return super.c();
        }
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.H) {
            case 0:
                vi0 vi0Var = this.I;
                ui0 ui0Var = vi0Var.b;
                super.dispatchDraw(canvas);
                if (this.a.B() != null && !vi0Var.F) {
                    this.a.B().start();
                }
                if (vi0Var.s && !vi0Var.w && this.a.B() != null && this.a.B().A() && ui0Var.a.B() != null && ui0Var.a.B().u()) {
                    vi0Var.w = true;
                    ui0Var.a.B().N(0, false, true);
                    ui0Var.setVisibility(0);
                    Runnable runnable = vi0Var.Q.Q0;
                    if (runnable != null) {
                        runnable.run();
                    }
                    org.telegram.messenger.g0.g3(new hb0(this, 14));
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
                vi0 vi0Var = this.I;
                if (!ch.f0.c(this, vi0Var.Q)) {
                    super.invalidate(rect);
                    vi0Var.Q.invalidate();
                    break;
                }
                break;
            default:
                super.invalidate(rect);
                break;
        }
    }

    @Override // org.telegram.ui.Components.q9, android.view.View
    public void onDraw(Canvas canvas) {
        switch (this.H) {
            case 1:
                this.I.b();
                super.onDraw(canvas);
                break;
            case 2:
                p5 p5Var = this.e;
                ImageReceiver imageReceiver = p5Var != null ? p5Var.k : this.a;
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
        switch (this.H) {
            case 0:
                if (!ch.f0.c(this)) {
                    super.invalidate(i7, i10, i11, i12);
                    break;
                }
                break;
            case 1:
                if (!ch.f0.c(this)) {
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
        int i7 = this.H;
        vi0 vi0Var = this.I;
        switch (i7) {
            case 0:
                if (!ch.f0.c(this, vi0Var.Q)) {
                    super.invalidate();
                    vi0Var.Q.invalidate();
                    break;
                }
                break;
            case 1:
                if (!ch.f0.c(this)) {
                    super.invalidate();
                    break;
                }
                break;
            default:
                super.invalidate();
                vi0Var.Q.invalidate();
                break;
        }
    }
}
