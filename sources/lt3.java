// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.ActionMode;
import android.view.Menu;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class lt3 extends iu3 {
    public final /* synthetic */ vnb W;
    public final /* synthetic */ boolean a0;
    public final /* synthetic */ ot3 b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lt3(ot3 ot3Var, Context context, wma wmaVar, vnb vnbVar, boolean z) {
        super(context, wmaVar, null, 4, true, null);
        this.b0 = ot3Var;
        this.W = vnbVar;
        this.a0 = z;
    }

    @Override // iu3
    public final boolean a() {
        return this.b0.r && super.a();
    }

    @Override // iu3
    public final boolean b() {
        return this.b0.s;
    }

    @Override // iu3
    public final int h() {
        return this.b0.a();
    }

    @Override // iu3
    public final void i(ActionMode actionMode, Menu menu) {
        if (menu.findItem(R.id.menu_bold) != null) {
            return;
        }
        menu.removeItem(android.R.id.shareText);
        menu.add(R.id.menu_groupbolditalic, R.id.menu_spoiler, 6, ob6.M0(2131744919, null));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(ob6.M0(2131753664, null));
        spannableStringBuilder.setSpan(new y7c(hl.o()), 0, spannableStringBuilder.length(), 33);
        menu.add(R.id.menu_groupbolditalic, R.id.menu_bold, 7, spannableStringBuilder);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(ob6.M0(2131748841, null));
        spannableStringBuilder2.setSpan(new y7c(hl.n1("fonts/rmediumitalic.ttf")), 0, spannableStringBuilder2.length(), 33);
        menu.add(R.id.menu_groupbolditalic, R.id.menu_italic, 8, spannableStringBuilder2);
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(ob6.M0(2131744090, null));
        rmb rmbVar = new rmb();
        rmbVar.a |= 8;
        spannableStringBuilder3.setSpan(new smb(rmbVar, 0), 0, spannableStringBuilder3.length(), 33);
        menu.add(R.id.menu_groupbolditalic, R.id.menu_strike, 9, spannableStringBuilder3);
        menu.add(R.id.menu_groupbolditalic, R.id.menu_regular, 10, ob6.M0(2131746064, null));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.save();
        canvas.clipRect(getPaddingLeft() + getScrollX(), 0, (getWidth() + getScrollX()) - getPaddingRight(), getHeight());
        super.onDraw(canvas);
        canvas.restore();
        ot3 ot3Var = this.b0;
        hn hnVar = ot3Var.y;
        ll llVar = ot3Var.w;
        if (llVar != null) {
            hnVar.u(llVar.a(aob.v0(ot3Var.x <= 0 ? aob.p7 : aob.P5, this.W), false));
        }
        int min = Math.min(hl.L(48.0f), getHeight());
        boolean z = this.a0;
        float f = z ? 0.0f : -hl.L(1.0f);
        hnVar.o(getScrollX(), (getHeight() + f) - min, (getWidth() + getScrollX()) - hl.L((z ? 0 : 44) + 12), f + getHeight());
        hnVar.draw(canvas);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.b0.y || super.verifyDrawable(drawable);
    }
}
