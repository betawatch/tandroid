// default package

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.ActionMode;
import android.view.Menu;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class m84 extends xt3 {
    public final ll f2;
    public int g2;
    public final hn h2;
    public final /* synthetic */ int i2;
    public final /* synthetic */ vnb j2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m84(Activity activity, vnb vnbVar, int i, vnb vnbVar2) {
        super(activity, vnbVar);
        this.i2 = i;
        this.j2 = vnbVar2;
        this.f2 = new ll(this);
        hn hnVar = new hn(false, true, true);
        this.h2 = hnVar;
        hnVar.n(0.2f, 160L, k43.h);
        hnVar.w(hl.L(15.33f));
        hnVar.setCallback(this);
        hnVar.b = 5;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int a = this.f2.a(aob.v0(this.g2 < 0 ? aob.p7 : aob.P5, this.j2), false);
        hn hnVar = this.h2;
        hnVar.u(a);
        hnVar.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
        hnVar.draw(canvas);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor
    public final void o(ActionMode actionMode, Menu menu) {
        if (menu.findItem(R.id.menu_bold) != null) {
            return;
        }
        menu.removeItem(android.R.id.shareText);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(ob6.M0(2131753664, null));
        spannableStringBuilder.setSpan(new y7c(hl.o()), 0, spannableStringBuilder.length(), 33);
        menu.add(R.id.menu_groupbolditalic, R.id.menu_bold, 6, spannableStringBuilder);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(ob6.M0(2131748841, null));
        spannableStringBuilder2.setSpan(new y7c(hl.n1("fonts/rmediumitalic.ttf")), 0, spannableStringBuilder2.length(), 33);
        menu.add(R.id.menu_groupbolditalic, R.id.menu_italic, 7, spannableStringBuilder2);
        menu.add(R.id.menu_groupbolditalic, R.id.menu_link, 8, ob6.M0(2131751709, null));
        menu.add(R.id.menu_groupbolditalic, R.id.menu_regular, 9, ob6.M0(2131746064, null));
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, cu3, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        hn hnVar = this.h2;
        if (hnVar != null) {
            this.g2 = this.i2 - charSequence.length();
            hnVar.a();
            hnVar.t(this.g2 > 4 ? "" : String.valueOf(this.g2), true, true);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.h2 || super.verifyDrawable(drawable);
    }
}
