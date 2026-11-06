package ch;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.qs;
import org.telegram.ui.Components.i5;
import org.telegram.ui.Components.l9;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class i0 extends l9 {
    public boolean G;
    public i5 H;
    public d I;
    public boolean J;
    public final /* synthetic */ k0 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(k0 k0Var, Context context) {
        super(context);
        this.K = k0Var;
        getImageReceiver().h0(3);
    }

    @Override // org.telegram.ui.Components.l9, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.J = true;
        i5 i5Var = this.H;
        if (i5Var != null) {
            i5Var.a(this);
        }
        d dVar = this.I;
        if (dVar != null) {
            dVar.f(this);
        }
    }

    @Override // org.telegram.ui.Components.l9, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.J = false;
        i5 i5Var = this.H;
        if (i5Var != null) {
            i5Var.n(this);
        }
        d dVar = this.I;
        if (dVar != null) {
            dVar.d(this);
        }
    }

    @Override // org.telegram.ui.Components.l9, android.view.View
    public final void onDraw(Canvas canvas) {
        i5 i5Var = this.H;
        if (i5Var != null) {
            i5Var.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            this.H.setAlpha(qs.e4);
            this.H.draw(canvas);
            this.G = true;
            return;
        }
        d dVar = this.I;
        if (dVar != null) {
            dVar.e(0, 0, getMeasuredWidth(), getMeasuredHeight());
            this.I.b(canvas);
            this.G = true;
            return;
        }
        if (getImageReceiver().B() != null && getImageReceiver().B().k0) {
            this.G = true;
        }
        if (!this.G && getImageReceiver().B() != null && !getImageReceiver().B().k0) {
            k0 k0Var = this.K;
            if (k0Var.a != 2 || k0Var.z) {
                getImageReceiver().B().N(0, false, false);
                getImageReceiver().B().start();
            } else {
                getImageReceiver().B().N(getImageReceiver().B().e[0] - 1, false, false);
            }
        }
        super.onDraw(canvas);
    }
}
