// default package

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class k41 extends EditTextBoldCursor {
    public final ll N1;
    public int O1;
    public final hn P1;
    public final /* synthetic */ vnb Q1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k41(Activity activity, vnb vnbVar) {
        super(activity);
        this.Q1 = vnbVar;
        this.N1 = new ll(this);
        hn hnVar = new hn(false, true, true);
        this.P1 = hnVar;
        hnVar.n(0.2f, 160L, k43.h);
        hnVar.w(hl.L(15.33f));
        hnVar.setCallback(this);
        hnVar.b = 5;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int a = this.N1.a(aob.v0(this.O1 < 0 ? aob.p7 : aob.P5, this.Q1), false);
        hn hnVar = this.P1;
        hnVar.u(a);
        hnVar.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
        hnVar.draw(canvas);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(hl.L(36.0f), TLObject.FLAG_30));
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, cu3, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        hn hnVar = this.P1;
        if (hnVar != null) {
            this.O1 = 32 - charSequence.length();
            hnVar.a();
            hnVar.t(this.O1 > 4 ? "" : String.valueOf(this.O1), true, true);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.P1 || super.verifyDrawable(drawable);
    }
}
