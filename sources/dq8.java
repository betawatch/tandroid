// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class dq8 extends gt3 {
    public final kl e2;
    public int f2;
    public final gn g2;
    public final /* synthetic */ tq8 h2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dq8(tq8 tq8Var, Context context, wjb wjbVar) {
        super(context, wjbVar);
        this.h2 = tq8Var;
        this.e2 = new kl(this);
        gn gnVar = new gn(false, true, true);
        this.g2 = gnVar;
        gnVar.n(0.2f, 160L, s33.h);
        gnVar.w(gl.L(15.33f));
        gnVar.setCallback(this);
        gnVar.b = 5;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int a = this.e2.a(bkb.v0(this.f2 < 0 ? bkb.o7 : bkb.O5, this.h2.f), false);
        gn gnVar = this.g2;
        gnVar.u(a);
        gnVar.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
        gnVar.draw(canvas);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, lt3, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        gn gnVar = this.g2;
        if (gnVar != null) {
            this.f2 = 12 - charSequence.length();
            gnVar.a();
            gnVar.t(this.f2 > 4 ? "" : String.valueOf(this.f2), true, true);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.g2 || super.verifyDrawable(drawable);
    }
}
