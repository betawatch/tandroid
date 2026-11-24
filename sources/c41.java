// default package

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class c41 extends EditTextBoldCursor {
    public final kl M1;
    public int N1;
    public final gn O1;
    public final /* synthetic */ wjb P1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c41(Activity activity, wjb wjbVar) {
        super(activity);
        this.P1 = wjbVar;
        this.M1 = new kl(this);
        gn gnVar = new gn(false, true, true);
        this.O1 = gnVar;
        gnVar.n(0.2f, 160L, s33.h);
        gnVar.w(gl.L(15.33f));
        gnVar.setCallback(this);
        gnVar.b = 5;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int a = this.M1.a(bkb.v0(this.N1 < 0 ? bkb.o7 : bkb.O5, this.P1), false);
        gn gnVar = this.O1;
        gnVar.u(a);
        gnVar.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
        gnVar.draw(canvas);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gl.L(36.0f), TLObject.FLAG_30));
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, lt3, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        gn gnVar = this.O1;
        if (gnVar != null) {
            this.N1 = 32 - charSequence.length();
            gnVar.a();
            gnVar.t(this.N1 > 4 ? "" : String.valueOf(this.N1), true, true);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.O1 || super.verifyDrawable(drawable);
    }
}
