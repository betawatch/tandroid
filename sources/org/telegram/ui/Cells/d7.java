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
import org.telegram.messenger.R;
import org.telegram.ui.Components.hj0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class d7 extends Drawable {
    public final Paint a;
    public final hj0 b;
    public final Drawable c;
    public int d;

    public d7(Context context, org.telegram.ui.Components.p9 p9Var, boolean z4, org.telegram.ui.ActionBar.g6 g6Var) {
        this(context, p9Var, z4, R.drawable.large_repost_story, g6Var);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.save();
        canvas.translate(getBounds().left, getBounds().top);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getBounds().width(), getBounds().height());
        int i10 = this.d;
        Paint paint = this.a;
        paint.setAlpha(i10);
        float min = (this.d / 255.0f) * (Math.min(getBounds().width(), getBounds().height()) / 2.0f);
        canvas.drawRoundRect(rectF, min, min, paint);
        canvas.restore();
        Drawable drawable = this.b;
        int dp = AndroidUtilities.dp(drawable != null ? 20.0f : 15.0f);
        Rect rect = AndroidUtilities.rectTmp2;
        rect.set(getBounds().centerX() - dp, getBounds().centerY() - dp, getBounds().centerX() + dp, getBounds().centerY() + dp);
        if (drawable == null) {
            drawable = this.c;
        }
        if (drawable != null) {
            drawable.setBounds(rect);
            drawable.setAlpha(this.d);
            drawable.draw(canvas);
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
        this.d = i10;
    }

    public d7(Context context, View view, boolean z4, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        Paint paint = new Paint(1);
        this.a = paint;
        this.d = 255;
        paint.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f), new int[]{org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.hk, g6Var), org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.ik, g6Var)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
        if (!z4) {
            this.b = null;
            Drawable mutate = context.getResources().getDrawable(i10).mutate();
            this.c = mutate;
            mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            return;
        }
        hj0 hj0Var = new hj0(R.raw.story_repost, AndroidUtilities.dp(42.0f), AndroidUtilities.dp(42.0f), true, null);
        this.b = hj0Var;
        hj0Var.s0 = view;
        AndroidUtilities.runOnUIThread(new q0(hj0Var, 1), 450L);
        this.c = null;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
