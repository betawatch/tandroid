// default package

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.ActionMode;
import android.view.Menu;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class a94 extends qu3 {
    public final km e2;
    public int f2;
    public final ho g2;
    public final /* synthetic */ int h2;
    public final /* synthetic */ ylb i2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a94(Activity activity, ylb ylbVar, int i, ylb ylbVar2) {
        super(activity, ylbVar);
        this.h2 = i;
        this.i2 = ylbVar2;
        this.e2 = new km(this);
        ho hoVar = new ho(false, true, true);
        this.g2 = hoVar;
        hoVar.n(0.2f, 160L, d53.h);
        hoVar.w(gm.L(15.33f));
        hoVar.setCallback(this);
        hoVar.b = 5;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int a = this.e2.a(cmb.v0(this.f2 < 0 ? cmb.o7 : cmb.O5, this.i2), false);
        ho hoVar = this.g2;
        hoVar.u(a);
        hoVar.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
        hoVar.draw(canvas);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor
    public final void o(ActionMode actionMode, Menu menu) {
        if (menu.findItem(R.id.menu_bold) != null) {
            return;
        }
        menu.removeItem(android.R.id.shareText);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(jb6.M0(2131753636, null));
        spannableStringBuilder.setSpan(new z5c(gm.o()), 0, spannableStringBuilder.length(), 33);
        menu.add(R.id.menu_groupbolditalic, R.id.menu_bold, 6, spannableStringBuilder);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(jb6.M0(2131748844, null));
        spannableStringBuilder2.setSpan(new z5c(gm.n1("fonts/rmediumitalic.ttf")), 0, spannableStringBuilder2.length(), 33);
        menu.add(R.id.menu_groupbolditalic, R.id.menu_italic, 7, spannableStringBuilder2);
        menu.add(R.id.menu_groupbolditalic, R.id.menu_link, 8, jb6.M0(2131751681, null));
        menu.add(R.id.menu_groupbolditalic, R.id.menu_regular, 9, jb6.M0(2131746070, null));
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, vu3, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        ho hoVar = this.g2;
        if (hoVar != null) {
            this.f2 = this.h2 - charSequence.length();
            hoVar.a();
            hoVar.t(this.f2 > 4 ? "" : String.valueOf(this.f2), true, true);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.g2 || super.verifyDrawable(drawable);
    }
}
