// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.ActionMode;
import android.view.Menu;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class du3 extends cv3 {
    public final /* synthetic */ ylb W;
    public final /* synthetic */ boolean a0;
    public final /* synthetic */ gu3 b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public du3(gu3 gu3Var, Context context, ela elaVar, ylb ylbVar, boolean z) {
        super(context, elaVar, null, 4, true, null);
        this.b0 = gu3Var;
        this.W = ylbVar;
        this.a0 = z;
    }

    @Override // cv3
    public final boolean a() {
        return this.b0.r && super.a();
    }

    @Override // cv3
    public final boolean b() {
        return this.b0.s;
    }

    @Override // cv3
    public final int h() {
        return this.b0.a();
    }

    @Override // cv3
    public final void i(ActionMode actionMode, Menu menu) {
        if (menu.findItem(R.id.menu_bold) != null) {
            return;
        }
        menu.removeItem(android.R.id.shareText);
        menu.add(R.id.menu_groupbolditalic, R.id.menu_spoiler, 6, jb6.M0(2131744951, null));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(jb6.M0(2131753636, null));
        spannableStringBuilder.setSpan(new z5c(gm.o()), 0, spannableStringBuilder.length(), 33);
        menu.add(R.id.menu_groupbolditalic, R.id.menu_bold, 7, spannableStringBuilder);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(jb6.M0(2131748844, null));
        spannableStringBuilder2.setSpan(new z5c(gm.n1("fonts/rmediumitalic.ttf")), 0, spannableStringBuilder2.length(), 33);
        menu.add(R.id.menu_groupbolditalic, R.id.menu_italic, 8, spannableStringBuilder2);
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(jb6.M0(2131744122, null));
        wkb wkbVar = new wkb();
        wkbVar.a |= 8;
        spannableStringBuilder3.setSpan(new xkb(wkbVar, 0), 0, spannableStringBuilder3.length(), 33);
        menu.add(R.id.menu_groupbolditalic, R.id.menu_strike, 9, spannableStringBuilder3);
        menu.add(R.id.menu_groupbolditalic, R.id.menu_regular, 10, jb6.M0(2131746070, null));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.save();
        canvas.clipRect(getPaddingLeft() + getScrollX(), 0, (getWidth() + getScrollX()) - getPaddingRight(), getHeight());
        super.onDraw(canvas);
        canvas.restore();
        gu3 gu3Var = this.b0;
        ho hoVar = gu3Var.y;
        km kmVar = gu3Var.w;
        if (kmVar != null) {
            hoVar.u(kmVar.a(cmb.v0(gu3Var.x <= 0 ? cmb.o7 : cmb.O5, this.W), false));
        }
        int min = Math.min(gm.L(48.0f), getHeight());
        boolean z = this.a0;
        float f = z ? 0.0f : -gm.L(1.0f);
        hoVar.o(getScrollX(), (getHeight() + f) - min, (getWidth() + getScrollX()) - gm.L((z ? 0 : 44) + 12), f + getHeight());
        hoVar.draw(canvas);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.b0.y || super.verifyDrawable(drawable);
    }
}
