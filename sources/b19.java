// default package

import android.content.Context;
import android.graphics.Canvas;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class b19 extends be0 {
    public boolean H;
    public vl I;
    public xl J;
    public boolean K;
    public final /* synthetic */ d19 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b19(d19 d19Var, Context context) {
        super(context);
        this.L = d19Var;
        getImageReceiver().T(3);
    }

    @Override // be0, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.K = true;
        vl vlVar = this.I;
        if (vlVar != null) {
            vlVar.b(this);
        }
        xl xlVar = this.J;
        if (xlVar != null) {
            xlVar.f(this);
        }
    }

    @Override // be0, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.K = false;
        vl vlVar = this.I;
        if (vlVar != null) {
            vlVar.o(this);
        }
        xl xlVar = this.J;
        if (xlVar != null) {
            xlVar.d(this);
        }
    }

    @Override // be0, android.view.View
    public final void onDraw(Canvas canvas) {
        vl vlVar = this.I;
        if (vlVar != null) {
            vlVar.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            this.I.setAlpha(kk7.d4);
            this.I.draw(canvas);
            this.H = true;
            return;
        }
        xl xlVar = this.J;
        if (xlVar != null) {
            xlVar.e(0, 0, getMeasuredWidth(), getMeasuredHeight());
            this.J.b(canvas);
            this.H = true;
            return;
        }
        if (getImageReceiver().y() != null && getImageReceiver().y().l0) {
            this.H = true;
        }
        if (!this.H && getImageReceiver().y() != null && !getImageReceiver().y().l0) {
            d19 d19Var = this.L;
            if (d19Var.a != 2 || d19Var.z) {
                getImageReceiver().y().I(0, false, false);
                getImageReceiver().y().start();
            } else {
                getImageReceiver().y().I(getImageReceiver().y().e[0] - 1, false, false);
            }
        }
        super.onDraw(canvas);
    }
}
