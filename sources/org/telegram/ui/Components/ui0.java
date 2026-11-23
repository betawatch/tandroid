package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class ui0 extends p9 {
    public final /* synthetic */ int H;
    public final /* synthetic */ vi0 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ui0(vi0 vi0Var, Context context, int i7) {
        super(context);
        this.H = i7;
        this.I = vi0Var;
    }

    @Override // org.telegram.ui.Components.p9
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
                if (this.a.C() != null && !vi0Var.F) {
                    this.a.C().start();
                }
                if (vi0Var.s && !vi0Var.w && this.a.C() != null && this.a.C().A() && ui0Var.a.C() != null && ui0Var.a.C().u()) {
                    vi0Var.w = true;
                    ui0Var.a.C().N(0, false, true);
                    ui0Var.setVisibility(0);
                    Runnable runnable = vi0Var.Q.Q0;
                    if (runnable != null) {
                        runnable.run();
                    }
                    org.telegram.messenger.g0.g3(new eb0(this, 14));
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

    @Override // org.telegram.ui.Components.p9, android.view.View
    public void onDraw(Canvas canvas) {
        switch (this.H) {
            case 1:
                this.I.b();
                super.onDraw(canvas);
                break;
            case 2:
                o5 o5Var = this.e;
                ImageReceiver imageReceiver = o5Var != null ? o5Var.k : this.a;
                if (imageReceiver != null && imageReceiver.C() != null) {
                    imageReceiver.C().start();
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
