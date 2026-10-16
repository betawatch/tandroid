package org.telegram.ui;

import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class qa1 {
    public final org.telegram.ui.Components.e10 a;
    public lg.f b;
    public final int c;
    public final /* synthetic */ ra1 d;

    public qa1(ra1 ra1Var, int i10) {
        this.d = ra1Var;
        this.c = i10;
        org.telegram.ui.Components.e10 e10Var = new org.telegram.ui.Components.e10(ra1Var.getContext());
        e10Var.c = true;
        TextPaint textPaint = new TextPaint(1);
        e10Var.e = textPaint;
        e10Var.f = new Paint(1);
        Paint paint = new Paint(1);
        e10Var.h = paint;
        Paint paint2 = new Paint(1);
        e10Var.n = paint2;
        e10Var.w = AndroidUtilities.dp(35.0f);
        e10Var.x = AndroidUtilities.dp(22.0f);
        e10Var.y = AndroidUtilities.dp(8.0f);
        e10Var.E = AndroidUtilities.dp(3.5f);
        e10Var.F = new RectF();
        e10Var.G = 0.0f;
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setTypeface(Typeface.create("sans-serif-medium", 0));
        paint.setStrokeWidth(AndroidUtilities.dpf2(1.5f));
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint2.setStyle(style);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
        this.a = e10Var;
        e10Var.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        ra1Var.h.addView(e10Var);
        ra1Var.n.add(this);
    }
}
