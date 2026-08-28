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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.nz0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class c0 extends Drawable {
    public final RectF a = new RectF();
    public final int b;
    public final org.telegram.ui.ActionBar.b6 c;
    public final nz0 d;
    public final nz0 e;
    public final Drawable f;
    public final Drawable g;
    public int h;
    public int i;
    public final Paint j;

    public c0(Context context, int i9, org.telegram.ui.ActionBar.b6 b6Var) {
        Paint paint = new Paint(1);
        this.j = paint;
        this.b = i9;
        this.c = b6Var;
        nz0 nz0Var = new nz0(LocaleController.getString(R.string.BotForumAskForStartNewChatTitle), 14.0f, AndroidUtilities.bold());
        this.d = nz0Var;
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        nz0Var.a();
        nz0 nz0Var2 = new nz0("", 13.0f, null);
        this.e = nz0Var2;
        nz0Var2.n(4);
        nz0Var2.a();
        Drawable mutate = context.getResources().getDrawable(R.drawable.filled_topic_new_24).mutate();
        this.f = mutate;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, mode));
        Drawable mutate2 = context.getResources().getDrawable(R.drawable.arrow_more).mutate();
        this.g = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        mutate2.setAlpha(153);
        paint.setColor(-16777216);
        paint.setAlpha(30);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        org.telegram.ui.ActionBar.b6 b6Var = this.c;
        Paint T0 = org.telegram.ui.ActionBar.f6.T0("paintChatActionBackground", b6Var);
        float dp = AndroidUtilities.dp(16.0f);
        float dp2 = AndroidUtilities.dp(16.0f);
        RectF rectF = this.a;
        canvas.drawRoundRect(rectF, dp, dp2, T0);
        if (b6Var != null ? b6Var.t0() : org.telegram.ui.ActionBar.f6.a1()) {
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), org.telegram.ui.ActionBar.f6.T0("paintChatActionBackgroundDarken", b6Var));
        }
        canvas.save();
        canvas.translate(0.0f, rectF.top + AndroidUtilities.dp(17.0f));
        canvas.drawCircle(rectF.centerX(), AndroidUtilities.dp(35.0f), AndroidUtilities.dp(35.0f), this.j);
        int centerX = (int) (rectF.centerX() - AndroidUtilities.dp(20.0f));
        int dp3 = AndroidUtilities.dp(15.0f);
        int dp4 = AndroidUtilities.dp(40.0f) + centerX;
        int dp5 = AndroidUtilities.dp(40.0f) + dp3;
        Drawable drawable = this.f;
        drawable.setBounds(centerX, dp3, dp4, dp5);
        drawable.draw(canvas);
        canvas.translate(0.0f, AndroidUtilities.dp(70.0f));
        canvas.translate(0.0f, AndroidUtilities.dp(14.0f));
        float centerX2 = rectF.centerX();
        nz0 nz0Var = this.d;
        this.d.c(centerX2 - (nz0Var.l() / 2.0f), nz0Var.j() / 2.0f, 1.0f, -1, canvas);
        canvas.translate(0.0f, nz0Var.j());
        canvas.translate(0.0f, AndroidUtilities.dp(4.0f));
        float centerX3 = rectF.centerX();
        nz0 nz0Var2 = this.e;
        this.e.c(centerX3 - (nz0Var2.l() / 2.0f), 0.0f, 1.0f, -1, canvas);
        canvas.translate(0.0f, nz0Var2.j());
        canvas.translate(0.0f, AndroidUtilities.dp(2.0f));
        int centerX4 = (int) (rectF.centerX() - AndroidUtilities.dp(10.0f));
        int centerX5 = (int) (rectF.centerX() + AndroidUtilities.dp(10.0f));
        int dp6 = AndroidUtilities.dp(20.0f);
        Drawable drawable2 = this.g;
        drawable2.setBounds(centerX4, 0, centerX5, dp6);
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
    public final void setAlpha(int i9) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
