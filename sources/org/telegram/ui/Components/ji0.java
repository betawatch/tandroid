package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class ji0 extends i9 {
    public final /* synthetic */ int H;
    public final /* synthetic */ ki0 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ji0(ki0 ki0Var, Context context, int i7) {
        super(context);
        this.H = i7;
        this.I = ki0Var;
    }

    @Override // org.telegram.ui.Components.i9
    public ImageReceiver c() {
        switch (this.H) {
            case 0:
                return new ii0(0, this);
            case 1:
                return new ii0(1, this);
            default:
                return super.c();
        }
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.H) {
            case 0:
                ki0 ki0Var = this.I;
                ji0 ji0Var = ki0Var.b;
                super.dispatchDraw(canvas);
                if (this.a.B() != null && !ki0Var.F) {
                    this.a.B().start();
                }
                if (ki0Var.s && !ki0Var.w && this.a.B() != null && this.a.B().A() && ji0Var.a.B() != null && ji0Var.a.B().u()) {
                    ki0Var.w = true;
                    ji0Var.a.B().N(0, false, true);
                    ji0Var.setVisibility(0);
                    Runnable runnable = ki0Var.Q.Q0;
                    if (runnable != null) {
                        runnable.run();
                    }
                    org.telegram.messenger.g0.h3(new wa0(this, 14));
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
                ki0 ki0Var = this.I;
                if (!ch.f0.c(this, ki0Var.Q)) {
                    super.invalidate(rect);
                    ki0Var.Q.invalidate();
                    break;
                }
                break;
            default:
                super.invalidate(rect);
                break;
        }
    }

    @Override // org.telegram.ui.Components.i9, android.view.View
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
        ki0 ki0Var = this.I;
        switch (i7) {
            case 0:
                if (!ch.f0.c(this, ki0Var.Q)) {
                    super.invalidate();
                    ki0Var.Q.invalidate();
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
                ki0Var.Q.invalidate();
                break;
        }
    }
}
