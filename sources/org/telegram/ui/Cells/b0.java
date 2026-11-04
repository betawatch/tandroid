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
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hs;
import org.telegram.ui.Components.ly0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class b0 extends Drawable {
    public final RectF a = new RectF();
    public final int b;
    public final org.telegram.ui.ActionBar.e6 c;
    public final ly0 d;
    public final ly0 e;
    public final Drawable f;
    public final Drawable g;
    public int h;
    public int i;
    public final Paint j;

    public b0(int i3, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        Paint paint = new Paint(1);
        this.j = paint;
        this.b = i3;
        this.c = e6Var;
        ly0 ly0Var = new ly0(bd.M0(2131753068, null), 14.0f, org.telegram.messenger.g0.o());
        this.d = ly0Var;
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        ly0Var.a();
        ly0 ly0Var2 = new ly0("", 13.0f, null);
        this.e = ly0Var2;
        ly0Var2.m(4);
        ly0Var2.a();
        Drawable mutate = context.getResources().getDrawable(R.drawable.filled_topic_new_24).mutate();
        this.f = mutate;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, mode));
        Drawable mutate2 = context.getResources().getDrawable(R.drawable.arrow_more).mutate();
        this.g = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        mutate2.setAlpha(hs.j2);
        paint.setColor(-16777216);
        paint.setAlpha(30);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        org.telegram.ui.ActionBar.e6 e6Var = this.c;
        Paint W0 = org.telegram.ui.ActionBar.k6.W0("paintChatActionBackground", e6Var);
        float L = org.telegram.messenger.g0.L(16.0f);
        float L2 = org.telegram.messenger.g0.L(16.0f);
        RectF rectF = this.a;
        canvas.drawRoundRect(rectF, L, L2, W0);
        if (e6Var != null ? e6Var.g() : org.telegram.ui.ActionBar.k6.d1()) {
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.ui.ActionBar.k6.W0("paintChatActionBackgroundDarken", e6Var));
        }
        canvas.save();
        canvas.translate(0.0f, rectF.top + org.telegram.messenger.g0.L(17.0f));
        canvas.drawCircle(rectF.centerX(), org.telegram.messenger.g0.L(35.0f), org.telegram.messenger.g0.L(35.0f), this.j);
        int centerX = (int) (rectF.centerX() - org.telegram.messenger.g0.L(20.0f));
        int L3 = org.telegram.messenger.g0.L(15.0f);
        int L4 = org.telegram.messenger.g0.L(40.0f) + centerX;
        int L5 = org.telegram.messenger.g0.L(40.0f) + L3;
        Drawable drawable = this.f;
        drawable.setBounds(centerX, L3, L4, L5);
        drawable.draw(canvas);
        canvas.translate(0.0f, org.telegram.messenger.g0.L(70.0f));
        canvas.translate(0.0f, org.telegram.messenger.g0.L(14.0f));
        float centerX2 = rectF.centerX();
        ly0 ly0Var = this.d;
        this.d.c(centerX2 - (ly0Var.k() / 2.0f), ly0Var.i() / 2.0f, 1.0f, -1, canvas);
        canvas.translate(0.0f, ly0Var.i());
        canvas.translate(0.0f, org.telegram.messenger.g0.L(4.0f));
        float centerX3 = rectF.centerX();
        ly0 ly0Var2 = this.e;
        this.e.c(centerX3 - (ly0Var2.k() / 2.0f), 0.0f, 1.0f, -1, canvas);
        canvas.translate(0.0f, ly0Var2.i());
        canvas.translate(0.0f, org.telegram.messenger.g0.L(2.0f));
        int centerX4 = (int) (rectF.centerX() - org.telegram.messenger.g0.L(10.0f));
        int centerX5 = (int) (rectF.centerX() + org.telegram.messenger.g0.L(10.0f));
        int L6 = org.telegram.messenger.g0.L(20.0f);
        Drawable drawable2 = this.g;
        drawable2.setBounds(centerX4, 0, centerX5, L6);
        drawable2.draw(canvas);
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
    public final void setAlpha(int i3) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
