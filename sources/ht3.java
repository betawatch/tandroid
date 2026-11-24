// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.ActionMode;
import android.view.Menu;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class ht3 extends gt3 {
    public final /* synthetic */ int e2;
    public final /* synthetic */ wjb f2;
    public final /* synthetic */ boolean g2;
    public final /* synthetic */ it3 h2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ht3(it3 it3Var, Context context, wjb wjbVar, int i, wjb wjbVar2, boolean z) {
        super(context, wjbVar);
        this.h2 = it3Var;
        this.e2 = i;
        this.f2 = wjbVar2;
        this.g2 = z;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        it3 it3Var = this.h2;
        gn gnVar = it3Var.y;
        gnVar.u(it3Var.w.a(bkb.v0(it3Var.x <= 0 ? bkb.o7 : bkb.O5, this.f2), false));
        gnVar.setBounds(getScrollX(), getHeight() - Math.min(gl.L(52.0f), getHeight()), gl.L(42.0f) + ((getWidth() + getScrollX()) - getPaddingRight()), getHeight());
        gnVar.draw(canvas);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor
    public final void o(ActionMode actionMode, Menu menu) {
        if (this.g2 && menu.findItem(R.id.menu_bold) == null) {
            menu.removeItem(android.R.id.shareText);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(k96.M0(2131753668, null));
            spannableStringBuilder.setSpan(new z3c(gl.o()), 0, spannableStringBuilder.length(), 33);
            menu.add(R.id.menu_groupbolditalic, R.id.menu_bold, 6, spannableStringBuilder);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(k96.M0(2131748895, null));
            spannableStringBuilder2.setSpan(new z3c(gl.n1("fonts/rmediumitalic.ttf")), 0, spannableStringBuilder2.length(), 33);
            menu.add(R.id.menu_groupbolditalic, R.id.menu_italic, 7, spannableStringBuilder2);
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(k96.M0(2131744196, null));
            vib vibVar = new vib();
            vibVar.a |= 8;
            spannableStringBuilder3.setSpan(new wib(vibVar, 0), 0, spannableStringBuilder3.length(), 33);
            menu.add(R.id.menu_groupbolditalic, R.id.menu_strike, 8, spannableStringBuilder3);
            menu.add(R.id.menu_groupbolditalic, R.id.menu_regular, 9, k96.M0(2131746144, null));
        }
    }

    @Override // gt3, org.telegram.ui.Components.EditTextBoldCursor, lt3, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.save();
        canvas.clipRect(getPaddingLeft() + getScrollX(), getScrollY(), (getWidth() + getScrollX()) - getPaddingRight(), getHeight() + getScrollY());
        super.onDraw(canvas);
        canvas.restore();
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, lt3, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        it3 it3Var = this.h2;
        gn gnVar = it3Var.y;
        if (gnVar == null || this.e2 <= 0) {
            return;
        }
        gnVar.a();
        it3Var.c();
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.h2.y || super.verifyDrawable(drawable);
    }
}
