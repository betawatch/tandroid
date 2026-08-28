package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.TextPaint;
import android.view.animation.OvershootInterpolator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class fl extends org.telegram.ui.Components.uz0 {
    public final /* synthetic */ qn G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fl(Activity activity, org.telegram.ui.ActionBar.b6 b6Var, qn qnVar) {
        super(activity);
        this.G = qnVar;
        TextPaint textPaint = new TextPaint(1);
        this.b = textPaint;
        Paint paint = new Paint(1);
        this.c = paint;
        this.d = AndroidUtilities.dp(24.0f);
        this.e = new OvershootInterpolator();
        this.D = new org.telegram.ui.Components.tp0(this, 14);
        this.F = new Path();
        int v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Hi, b6Var);
        int alpha = Color.alpha(v02);
        textPaint.setTextSize(AndroidUtilities.dp(15.0f));
        textPaint.setColor(v02);
        paint.setColor(v02);
        paint.setAlpha((int) (alpha * 0.14d));
        setBackground(org.telegram.ui.ActionBar.f6.b0(AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Fi, b6Var)));
    }

    public final void d() {
        int i9 = -(AndroidUtilities.dp(16.0f) + getMeasuredHeight());
        qn qnVar = this.G;
        setTranslationY((qnVar.U.getTop() - qnVar.T0.getMeasuredHeight()) - ((1.0f - getPrepareProgress()) * (r2 + i9)));
    }

    @Override // org.telegram.ui.Components.uz0, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        d();
    }

    @Override // org.telegram.ui.Components.uz0, android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        d();
    }
}
