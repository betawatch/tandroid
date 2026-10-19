package ig;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.i5;
import org.telegram.ui.Components.p6;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class q1 extends EditTextBoldCursor {
    public final i5 b;
    public int c;
    public final p6 d;
    public final /* synthetic */ d6 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(Context context, d6 d6Var) {
        super(context);
        this.e = d6Var;
        this.b = new i5(this);
        p6 p6Var = new p6(false, true, true);
        this.d = p6Var;
        p6Var.n(0.2f, 160L, bs.h);
        p6Var.w(AndroidUtilities.dp(15.33f));
        p6Var.setCallback(this);
        p6Var.b = 5;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int a2 = this.b.a(h6.w0(this.c < 0 ? h6.p7 : h6.P5, this.e), false);
        p6 p6Var = this.d;
        p6Var.u(a2);
        p6Var.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
        p6Var.draw(canvas);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(36.0f), TLObject.FLAG_30));
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.ku, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        p6 p6Var = this.d;
        if (p6Var != null) {
            this.c = 32 - charSequence.length();
            p6Var.a();
            String str = "";
            if (this.c <= 4) {
                str = "" + this.c;
            }
            p6Var.t(str, true, true);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.d || super.verifyDrawable(drawable);
    }
}
