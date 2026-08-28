package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class lo0 extends Drawable {
    public final org.telegram.ui.Components.nz0 a;
    public final Drawable b;
    public final zf.z0 c;

    public lo0(int i9, Context context, org.telegram.ui.ActionBar.b6 b6Var, boolean z10) {
        this.a = new org.telegram.ui.Components.nz0(LocaleController.formatPluralString(z10 ? "BoostLevelPlus" : "BoostLevel", i9, new Object[0]), 12.0f, AndroidUtilities.bold());
        Drawable mutate = context.getResources().getDrawable(R.drawable.mini_switch_lock).mutate();
        this.b = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        this.c = new zf.z0(org.telegram.ui.ActionBar.f6.Lj, org.telegram.ui.ActionBar.f6.Mj, -1, -1, b6Var);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i9 = getBounds().left;
        int centerY = getBounds().centerY();
        RectF rectF = AndroidUtilities.rectTmp;
        float f10 = centerY;
        rectF.set(i9, f10 - (AndroidUtilities.dp(18.33f) / 2.0f), getIntrinsicWidth() + i9, (AndroidUtilities.dp(18.33f) / 2.0f) + f10);
        zf.z0 z0Var = this.c;
        z0Var.e(rectF);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), z0Var.f);
        int dp = AndroidUtilities.dp(3.33f) + i9;
        Drawable drawable = this.b;
        drawable.setBounds(dp, (int) (f10 - ((drawable.getIntrinsicHeight() * 0.875f) / 2.0f)), (int) ((drawable.getIntrinsicWidth() * 0.875f) + AndroidUtilities.dp(3.33f) + i9), (int) aa.d.d(drawable.getIntrinsicHeight(), 0.875f, 2.0f, f10));
        drawable.draw(canvas);
        this.a.c((drawable.getIntrinsicWidth() * 0.875f) + AndroidUtilities.dp(3.66f) + i9, f10, 1.0f, -1, canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return AndroidUtilities.dp(18.33f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return (int) (this.a.l() + (this.b.getIntrinsicWidth() * 0.875f) + AndroidUtilities.dp(9.66f));
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i9) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
