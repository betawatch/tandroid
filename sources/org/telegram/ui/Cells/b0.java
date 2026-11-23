package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.ls;
import org.telegram.ui.Components.xy0;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class b0 extends Drawable {
    public final RectF a = new RectF();
    public final int b;
    public final org.telegram.ui.ActionBar.h6 c;
    public final xy0 d;
    public final xy0 e;
    public final Drawable f;
    public final Drawable g;
    public int h;
    public int i;
    public final Paint j;
    public int k;

    public b0(int i7, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        Paint paint = new Paint(1);
        this.j = paint;
        this.b = i7;
        this.c = h6Var;
        xy0 xy0Var = new xy0(hd.N0(2131753065, null), 14.0f, org.telegram.messenger.g0.o());
        this.d = xy0Var;
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        xy0Var.a();
        xy0 xy0Var2 = new xy0("", 13.0f, null);
        this.e = xy0Var2;
        xy0Var2.m(4);
        xy0Var2.a();
        this.f = context.getResources().getDrawable(R.drawable.filled_topic_new_24).mutate();
        Drawable g10 = i5.c.g(context, R.drawable.arrow_more);
        this.g = g10;
        g10.setAlpha(ls.j2);
        paint.setColor(-16777216);
        paint.setAlpha(30);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        org.telegram.ui.ActionBar.h6 h6Var = this.c;
        boolean i12 = org.telegram.ui.ActionBar.m6.i1(h6Var);
        int w02 = i12 ? org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Fa, h6Var) : -1;
        int w03 = i12 ? org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Ga, h6Var) : -1;
        int i7 = this.k;
        Drawable drawable = this.g;
        Drawable drawable2 = this.f;
        if (i7 != w03 || drawable2.getColorFilter() == null) {
            this.k = w03;
            int i10 = this.k;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            drawable2.setColorFilter(new PorterDuffColorFilter(i10, mode));
            drawable.setColorFilter(new PorterDuffColorFilter(this.k, mode));
        }
        Paint W0 = org.telegram.ui.ActionBar.m6.W0("paintChatActionBackground", h6Var);
        float L = org.telegram.messenger.g0.L(16.0f);
        float L2 = org.telegram.messenger.g0.L(16.0f);
        RectF rectF = this.a;
        canvas.drawRoundRect(rectF, L, L2, W0);
        if (h6Var != null ? h6Var.j() : org.telegram.ui.ActionBar.m6.d1()) {
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.ui.ActionBar.m6.W0("paintChatActionBackgroundDarken", h6Var));
        }
        canvas.save();
        canvas.translate(0.0f, rectF.top + org.telegram.messenger.g0.L(17.0f));
        canvas.drawCircle(rectF.centerX(), org.telegram.messenger.g0.L(35.0f), org.telegram.messenger.g0.L(35.0f), this.j);
        int centerX = (int) (rectF.centerX() - org.telegram.messenger.g0.L(20.0f));
        int L3 = org.telegram.messenger.g0.L(15.0f);
        drawable2.setBounds(centerX, L3, org.telegram.messenger.g0.L(40.0f) + centerX, org.telegram.messenger.g0.L(40.0f) + L3);
        drawable2.draw(canvas);
        canvas.translate(0.0f, org.telegram.messenger.g0.L(70.0f));
        canvas.translate(0.0f, org.telegram.messenger.g0.L(14.0f));
        float centerX2 = rectF.centerX();
        xy0 xy0Var = this.d;
        this.d.c(centerX2 - (xy0Var.k() / 2.0f), xy0Var.i() / 2.0f, 1.0f, w02, canvas);
        canvas.translate(0.0f, xy0Var.i());
        canvas.translate(0.0f, org.telegram.messenger.g0.L(4.0f));
        float centerX3 = rectF.centerX();
        xy0 xy0Var2 = this.e;
        this.e.c(centerX3 - (xy0Var2.k() / 2.0f), 0.0f, 1.0f, w02, canvas);
        canvas.translate(0.0f, xy0Var2.i());
        canvas.translate(0.0f, org.telegram.messenger.g0.L(2.0f));
        drawable.setBounds((int) (rectF.centerX() - org.telegram.messenger.g0.L(10.0f)), 0, (int) (rectF.centerX() + org.telegram.messenger.g0.L(10.0f)), org.telegram.messenger.g0.L(20.0f));
        drawable.draw(canvas);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.a.set(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
