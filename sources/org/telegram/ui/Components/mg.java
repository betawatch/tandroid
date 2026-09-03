package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class mg extends FrameLayout {
    public final org.telegram.ui.ActionBar.l5 a;
    public final RectF b;
    public final Paint c;
    public final Drawable d;
    public boolean e;

    public mg(Activity activity) {
        super(activity);
        this.b = new RectF();
        this.c = new Paint(1);
        this.e = false;
        org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(activity);
        this.a = l5Var;
        addView(l5Var, k7.c6.c(-1.0f, -1));
        setWillNotDraw(false);
        Drawable drawable = activity.getDrawable(R.drawable.msg_mini_close_tooltip);
        this.d = drawable;
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        setClipToPadding(false);
        setClipChildren(false);
        k7.e6.a(this);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (!(view instanceof org.telegram.ui.ActionBar.l5) || !this.e) {
            return super.drawChild(canvas, view, j10);
        }
        org.telegram.ui.ActionBar.l5 l5Var = (org.telegram.ui.ActionBar.l5) view;
        canvas.save();
        canvas.scale(0.8f, 0.8f);
        canvas.translate(-AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f));
        int color = l5Var.getTextPaint().getColor();
        l5Var.getTextPaint().setColor(-1);
        boolean drawChild = super.drawChild(canvas, view, j10);
        l5Var.getTextPaint().setColor(color);
        canvas.restore();
        return drawChild;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.e) {
            canvas.save();
            int dp = AndroidUtilities.dp(26.0f);
            canvas.translate(AndroidUtilities.dp(5.0f), (getMeasuredHeight() - dp) / 2.0f);
            float f10 = dp;
            RectF rectF = this.b;
            rectF.set(-AndroidUtilities.dp(5.0f), 0.0f, getMeasuredWidth() - getPaddingEnd(), f10);
            float f11 = f10 / 2.0f;
            canvas.drawRoundRect(rectF, f11, f11, this.c);
            int measuredWidth = (getMeasuredWidth() - getPaddingEnd()) - AndroidUtilities.dp(6.0f);
            Drawable drawable = this.d;
            canvas.translate(measuredWidth - drawable.getIntrinsicWidth(), AndroidUtilities.dp(5.0f));
            drawable.draw(canvas);
            canvas.restore();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        this.c.setShader(new LinearGradient(0.0f, 0.0f, getMeasuredWidth(), 0.0f, new int[]{-9071617, -5999873}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
    }
}
