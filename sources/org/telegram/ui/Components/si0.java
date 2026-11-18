package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class si0 extends q9 {
    public final /* synthetic */ int H;
    public final /* synthetic */ ti0 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ si0(ti0 ti0Var, Context context, int i7) {
        super(context);
        this.H = i7;
        this.I = ti0Var;
    }

    @Override // org.telegram.ui.Components.q9
    public ImageReceiver c() {
        switch (this.H) {
            case 0:
                return new ri0(0, this);
            case 1:
                return new ri0(1, this);
            default:
                return super.c();
        }
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.H) {
            case 0:
                ti0 ti0Var = this.I;
                si0 si0Var = ti0Var.b;
                super.dispatchDraw(canvas);
                if (this.a.B() != null && !ti0Var.F) {
                    this.a.B().start();
                }
                if (ti0Var.s && !ti0Var.w && this.a.B() != null && this.a.B().A() && si0Var.a.B() != null && si0Var.a.B().u()) {
                    ti0Var.w = true;
                    si0Var.a.B().N(0, false, true);
                    si0Var.setVisibility(0);
                    Runnable runnable = ti0Var.Q.Q0;
                    if (runnable != null) {
                        runnable.run();
                    }
                    org.telegram.messenger.g0.g3(new gb0(this, 14));
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
                ti0 ti0Var = this.I;
                if (!ch.f0.c(this, ti0Var.Q)) {
                    super.invalidate(rect);
                    ti0Var.Q.invalidate();
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
                o5 o5Var = this.e;
                ImageReceiver imageReceiver = o5Var != null ? o5Var.k : this.a;
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
        ti0 ti0Var = this.I;
        switch (i7) {
            case 0:
                if (!ch.f0.c(this, ti0Var.Q)) {
                    super.invalidate();
                    ti0Var.Q.invalidate();
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
                ti0Var.Q.invalidate();
                break;
        }
    }
}
