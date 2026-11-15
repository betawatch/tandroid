package ch;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.ns;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.i9;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class j0 extends i9 {
    public boolean H;
    public g5 I;
    public d J;
    public boolean K;
    public final /* synthetic */ l0 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(l0 l0Var, Context context) {
        super(context);
        this.L = l0Var;
        getImageReceiver().h0(3);
    }

    @Override // org.telegram.ui.Components.i9, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.K = true;
        g5 g5Var = this.I;
        if (g5Var != null) {
            g5Var.a(this);
        }
        d dVar = this.J;
        if (dVar != null) {
            dVar.f(this);
        }
    }

    @Override // org.telegram.ui.Components.i9, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.K = false;
        g5 g5Var = this.I;
        if (g5Var != null) {
            g5Var.n(this);
        }
        d dVar = this.J;
        if (dVar != null) {
            dVar.d(this);
        }
    }

    @Override // org.telegram.ui.Components.i9, android.view.View
    public final void onDraw(Canvas canvas) {
        g5 g5Var = this.I;
        if (g5Var != null) {
            g5Var.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            this.I.setAlpha(ns.e4);
            this.I.draw(canvas);
            this.H = true;
            return;
        }
        d dVar = this.J;
        if (dVar != null) {
            dVar.e(0, 0, getMeasuredWidth(), getMeasuredHeight());
            this.J.b(canvas);
            this.H = true;
            return;
        }
        if (getImageReceiver().B() != null && getImageReceiver().B().l0) {
            this.H = true;
        }
        if (!this.H && getImageReceiver().B() != null && !getImageReceiver().B().l0) {
            l0 l0Var = this.L;
            if (l0Var.a != 2 || l0Var.z) {
                getImageReceiver().B().N(0, false, false);
                getImageReceiver().B().start();
            } else {
                getImageReceiver().B().N(getImageReceiver().B().e[0] - 1, false, false);
            }
        }
        super.onDraw(canvas);
    }
}
