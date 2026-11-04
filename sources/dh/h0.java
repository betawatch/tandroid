package dh;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.hs;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.k9;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class h0 extends k9 {
    public boolean H;
    public g5 I;
    public d J;
    public boolean K;
    public final /* synthetic */ j0 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(j0 j0Var, Context context) {
        super(context);
        this.L = j0Var;
        getImageReceiver().h0(3);
    }

    @Override // org.telegram.ui.Components.k9, android.view.View
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

    @Override // org.telegram.ui.Components.k9, android.view.View
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

    @Override // org.telegram.ui.Components.k9, android.view.View
    public final void onDraw(Canvas canvas) {
        g5 g5Var = this.I;
        if (g5Var != null) {
            g5Var.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            this.I.setAlpha(hs.e4);
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
            j0 j0Var = this.L;
            if (j0Var.a != 2 || j0Var.z) {
                getImageReceiver().B().N(0, false, false);
                getImageReceiver().B().start();
            } else {
                getImageReceiver().B().N(getImageReceiver().B().e[0] - 1, false, false);
            }
        }
        super.onDraw(canvas);
    }
}
