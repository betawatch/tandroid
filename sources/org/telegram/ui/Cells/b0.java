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
import org.telegram.messenger.cd;
import org.telegram.messenger.zs;
import org.telegram.ui.Components.qz0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class b0 extends Drawable {
    public final RectF a = new RectF();
    public final int b;
    public final org.telegram.ui.ActionBar.p6 c;
    public final qz0 d;
    public final qz0 e;
    public final Drawable f;
    public final Drawable g;
    public int h;
    public int i;
    public final Paint j;

    public b0(int i10, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        Paint paint = new Paint(1);
        this.j = paint;
        this.b = i10;
        this.c = p6Var;
        qz0 qz0Var = new qz0(cd.L0(2131753068, null), 14.0f, org.telegram.messenger.i0.o());
        this.d = qz0Var;
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        qz0Var.a();
        qz0 qz0Var2 = new qz0("", 13.0f, null);
        this.e = qz0Var2;
        qz0Var2.m(4);
        qz0Var2.a();
        Drawable mutate = context.getResources().getDrawable(R.drawable.filled_topic_new_24).mutate();
        this.f = mutate;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, mode));
        Drawable mutate2 = context.getResources().getDrawable(R.drawable.arrow_more).mutate();
        this.g = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        mutate2.setAlpha(zs.j2);
        paint.setColor(-16777216);
        paint.setAlpha(30);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        org.telegram.ui.ActionBar.p6 p6Var = this.c;
        Paint W0 = org.telegram.ui.ActionBar.t6.W0("paintChatActionBackground", p6Var);
        float L = org.telegram.messenger.i0.L(16.0f);
        float L2 = org.telegram.messenger.i0.L(16.0f);
        RectF rectF = this.a;
        canvas.drawRoundRect(rectF, L, L2, W0);
        if (p6Var != null ? p6Var.g() : org.telegram.ui.ActionBar.t6.d1()) {
            canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.ui.ActionBar.t6.W0("paintChatActionBackgroundDarken", p6Var));
        }
        canvas.save();
        canvas.translate(0.0f, rectF.top + org.telegram.messenger.i0.L(17.0f));
        canvas.drawCircle(rectF.centerX(), org.telegram.messenger.i0.L(35.0f), org.telegram.messenger.i0.L(35.0f), this.j);
        int centerX = (int) (rectF.centerX() - org.telegram.messenger.i0.L(20.0f));
        int L3 = org.telegram.messenger.i0.L(15.0f);
        int L4 = org.telegram.messenger.i0.L(40.0f) + centerX;
        int L5 = org.telegram.messenger.i0.L(40.0f) + L3;
        Drawable drawable = this.f;
        drawable.setBounds(centerX, L3, L4, L5);
        drawable.draw(canvas);
        canvas.translate(0.0f, org.telegram.messenger.i0.L(70.0f));
        canvas.translate(0.0f, org.telegram.messenger.i0.L(14.0f));
        float centerX2 = rectF.centerX();
        qz0 qz0Var = this.d;
        this.d.c(centerX2 - (qz0Var.k() / 2.0f), qz0Var.i() / 2.0f, 1.0f, -1, canvas);
        canvas.translate(0.0f, qz0Var.i());
        canvas.translate(0.0f, org.telegram.messenger.i0.L(4.0f));
        float centerX3 = rectF.centerX();
        qz0 qz0Var2 = this.e;
        this.e.c(centerX3 - (qz0Var2.k() / 2.0f), 0.0f, 1.0f, -1, canvas);
        canvas.translate(0.0f, qz0Var2.i());
        canvas.translate(0.0f, org.telegram.messenger.i0.L(2.0f));
        int centerX4 = (int) (rectF.centerX() - org.telegram.messenger.i0.L(10.0f));
        int centerX5 = (int) (rectF.centerX() + org.telegram.messenger.i0.L(10.0f));
        int L6 = org.telegram.messenger.i0.L(20.0f);
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
    public final void setAlpha(int i10) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
