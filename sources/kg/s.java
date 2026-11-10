package kg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.h6;
import org.telegram.ui.Components.wq;
import org.telegram.ui.Components.y4;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class s extends EditTextBoldCursor {
    public final y4 G1;
    public int H1;
    public final h6 I1;
    public final /* synthetic */ org.telegram.ui.ActionBar.h6 J1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.J1 = h6Var;
        this.G1 = new y4(this);
        h6 h6Var2 = new h6(false, true, true);
        this.I1 = h6Var2;
        h6Var2.n(0.2f, 160L, wq.h);
        h6Var2.w(org.telegram.messenger.g0.L(15.33f));
        h6Var2.setCallback(this);
        h6Var2.b = 5;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int a10 = this.G1.a(m6.w0(this.H1 < 0 ? m6.p7 : m6.P5, this.J1), false);
        h6 h6Var = this.I1;
        h6Var.u(a10);
        h6Var.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
        h6Var.draw(canvas);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(36.0f), TLObject.FLAG_30));
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.ct, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        super.onTextChanged(charSequence, i7, i10, i11);
        h6 h6Var = this.I1;
        if (h6Var != null) {
            this.H1 = 32 - charSequence.length();
            h6Var.a();
            String str = "";
            if (this.H1 <= 4) {
                str = "" + this.H1;
            }
            h6Var.t(str, true, true);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.I1 || super.verifyDrawable(drawable);
    }
}
