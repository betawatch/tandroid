package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
import org.telegram.ui.Components.yj0;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class f7 extends Drawable {
    public final Paint a;
    public final yj0 b;
    public final Drawable c;
    public final org.telegram.ui.ActionBar.g6 d;
    public int e;
    public int f;
    public int g;

    public f7(Context context, org.telegram.ui.Components.w9 w9Var, boolean z10, org.telegram.ui.ActionBar.g6 g6Var) {
        this(context, w9Var, z10, R.drawable.large_repost_story, g6Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a3  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void draw(Canvas canvas) {
        Drawable drawable;
        int w02;
        int w03;
        Paint paint = this.a;
        org.telegram.ui.ActionBar.g6 g6Var = this.d;
        try {
            w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.hk, g6Var);
            w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.ik, g6Var);
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (w02 == this.e) {
            if (w03 != this.f) {
            }
            canvas.save();
            canvas.translate(getBounds().left, getBounds().top);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, getBounds().width(), getBounds().height());
            paint.setAlpha(this.g);
            float min = (this.g / 255.0f) * (Math.min(getBounds().width(), getBounds().height()) / 2.0f);
            canvas.drawRoundRect(rectF, min, min, paint);
            canvas.restore();
            drawable = this.b;
            int dp = AndroidUtilities.dp(drawable == null ? 20.0f : 15.0f);
            Rect rect = AndroidUtilities.rectTmp2;
            rect.set(getBounds().centerX() - dp, getBounds().centerY() - dp, getBounds().centerX() + dp, getBounds().centerY() + dp);
            if (drawable == null) {
                drawable = this.c;
            }
            if (drawable == null) {
                drawable.setBounds(rect);
                drawable.setAlpha(this.g);
                drawable.draw(canvas);
                return;
            }
            return;
        }
        this.e = w02;
        this.f = w03;
        paint.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f), new int[]{w02, w03}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.translate(getBounds().left, getBounds().top);
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(0.0f, 0.0f, getBounds().width(), getBounds().height());
        paint.setAlpha(this.g);
        float min2 = (this.g / 255.0f) * (Math.min(getBounds().width(), getBounds().height()) / 2.0f);
        canvas.drawRoundRect(rectF2, min2, min2, paint);
        canvas.restore();
        drawable = this.b;
        int dp2 = AndroidUtilities.dp(drawable == null ? 20.0f : 15.0f);
        Rect rect2 = AndroidUtilities.rectTmp2;
        rect2.set(getBounds().centerX() - dp2, getBounds().centerY() - dp2, getBounds().centerX() + dp2, getBounds().centerY() + dp2);
        if (drawable == null) {
        }
        if (drawable == null) {
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return AndroidUtilities.dp(56.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return AndroidUtilities.dp(56.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.g = i10;
    }

    public f7(Context context, View view, boolean z10, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        Paint paint = new Paint(1);
        this.a = paint;
        this.g = 255;
        this.d = g6Var;
        this.e = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.hk, g6Var);
        this.f = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.ik, g6Var);
        paint.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f), new int[]{this.e, this.f}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
        if (!z10) {
            this.b = null;
            Drawable mutate = context.getResources().getDrawable(i10).mutate();
            this.c = mutate;
            mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            return;
        }
        yj0 yj0Var = new yj0(R.raw.story_repost, AndroidUtilities.dp(42.0f), AndroidUtilities.dp(42.0f), true, null);
        this.b = yj0Var;
        yj0Var.R(view);
        AndroidUtilities.runOnUIThread(new q0(yj0Var, 1), 450L);
        this.c = null;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
