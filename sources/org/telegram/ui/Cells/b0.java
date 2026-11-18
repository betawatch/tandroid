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
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.ui.Components.vy0;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class b0 extends Drawable {
    public final RectF a = new RectF();
    public final int b;
    public final org.telegram.ui.ActionBar.i6 c;
    public final vy0 d;
    public final vy0 e;
    public final Drawable f;
    public final Drawable g;
    public int h;
    public int i;
    public final Paint j;
    public int k;

    public b0(int i7, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        Paint paint = new Paint(1);
        this.j = paint;
        this.b = i7;
        this.c = i6Var;
        vy0 vy0Var = new vy0(gd.M0(2131753066, null), 14.0f, org.telegram.messenger.g0.o());
        this.d = vy0Var;
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        vy0Var.a();
        vy0 vy0Var2 = new vy0("", 13.0f, null);
        this.e = vy0Var2;
        vy0Var2.m(4);
        vy0Var2.a();
        this.f = context.getResources().getDrawable(R.drawable.filled_topic_new_24).mutate();
        Drawable g10 = i5.c.g(context, R.drawable.arrow_more);
        this.g = g10;
        g10.setAlpha(ks.j2);
        paint.setColor(-16777216);
        paint.setAlpha(30);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        org.telegram.ui.ActionBar.i6 i6Var = this.c;
        boolean i12 = org.telegram.ui.ActionBar.n6.i1(i6Var);
        int w02 = i12 ? org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Fa, i6Var) : -1;
        int w03 = i12 ? org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Ga, i6Var) : -1;
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
        Paint W0 = org.telegram.ui.ActionBar.n6.W0("paintChatActionBackground", i6Var);
        float L = org.telegram.messenger.g0.L(16.0f);
        float L2 = org.telegram.messenger.g0.L(16.0f);
        RectF rectF = this.a;
        canvas.drawRoundRect(rectF, L, L2, W0);
        if (i6Var != null ? i6Var.j() : org.telegram.ui.ActionBar.n6.d1()) {
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.ui.ActionBar.n6.W0("paintChatActionBackgroundDarken", i6Var));
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
        vy0 vy0Var = this.d;
        this.d.c(centerX2 - (vy0Var.k() / 2.0f), vy0Var.i() / 2.0f, 1.0f, w02, canvas);
        canvas.translate(0.0f, vy0Var.i());
        canvas.translate(0.0f, org.telegram.messenger.g0.L(4.0f));
        float centerX3 = rectF.centerX();
        vy0 vy0Var2 = this.e;
        this.e.c(centerX3 - (vy0Var2.k() / 2.0f), 0.0f, 1.0f, w02, canvas);
        canvas.translate(0.0f, vy0Var2.i());
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
