package kg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.g6;
import org.telegram.ui.Components.x4;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class s extends EditTextBoldCursor {
    public final x4 M1;
    public int N1;
    public final g6 O1;
    public final /* synthetic */ e6 P1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(Context context, e6 e6Var) {
        super(context);
        this.P1 = e6Var;
        this.M1 = new x4(this);
        g6 g6Var = new g6(false, true, true);
        this.O1 = g6Var;
        g6Var.n(0.2f, 160L, er.h);
        g6Var.w(org.telegram.messenger.g0.L(15.33f));
        g6Var.setCallback(this);
        g6Var.b = 5;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int a10 = this.M1.a(j6.w0(this.N1 < 0 ? j6.p7 : j6.P5, this.P1), false);
        g6 g6Var = this.O1;
        g6Var.u(a10);
        g6Var.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
        g6Var.draw(canvas);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(36.0f), TLObject.FLAG_30));
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.kt, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        super.onTextChanged(charSequence, i7, i10, i11);
        g6 g6Var = this.O1;
        if (g6Var != null) {
            this.N1 = 32 - charSequence.length();
            g6Var.a();
            String str = "";
            if (this.N1 <= 4) {
                str = "" + this.N1;
            }
            g6Var.t(str, true, true);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.O1 || super.verifyDrawable(drawable);
    }
}
