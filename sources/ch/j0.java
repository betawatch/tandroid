package ch;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.ks;
import org.telegram.ui.Components.o5;
import org.telegram.ui.Components.p9;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class j0 extends p9 {
    public boolean H;
    public o5 I;
    public d J;
    public boolean K;
    public final /* synthetic */ l0 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(l0 l0Var, Context context) {
        super(context);
        this.L = l0Var;
        getImageReceiver().i0(3);
    }

    @Override // org.telegram.ui.Components.p9, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.K = true;
        o5 o5Var = this.I;
        if (o5Var != null) {
            o5Var.a(this);
        }
        d dVar = this.J;
        if (dVar != null) {
            dVar.f(this);
        }
    }

    @Override // org.telegram.ui.Components.p9, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.K = false;
        o5 o5Var = this.I;
        if (o5Var != null) {
            o5Var.n(this);
        }
        d dVar = this.J;
        if (dVar != null) {
            dVar.d(this);
        }
    }

    @Override // org.telegram.ui.Components.p9, android.view.View
    public final void onDraw(Canvas canvas) {
        o5 o5Var = this.I;
        if (o5Var != null) {
            o5Var.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            this.I.setAlpha(ks.e4);
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
        if (getImageReceiver().C() != null && getImageReceiver().C().l0) {
            this.H = true;
        }
        if (!this.H && getImageReceiver().C() != null && !getImageReceiver().C().l0) {
            l0 l0Var = this.L;
            if (l0Var.a != 2 || l0Var.z) {
                getImageReceiver().C().N(0, false, false);
                getImageReceiver().C().start();
            } else {
                getImageReceiver().C().N(getImageReceiver().C().e[0] - 1, false, false);
            }
        }
        super.onDraw(canvas);
    }
}
