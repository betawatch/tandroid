package org.telegram.ui;

import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class oa1 {
    public final org.telegram.ui.Components.z00 a;
    public jg.f b;
    public final int c;
    public final /* synthetic */ pa1 d;

    public oa1(pa1 pa1Var, int i10) {
        this.d = pa1Var;
        this.c = i10;
        org.telegram.ui.Components.z00 z00Var = new org.telegram.ui.Components.z00(pa1Var.getContext());
        z00Var.c = true;
        TextPaint textPaint = new TextPaint(1);
        z00Var.e = textPaint;
        z00Var.f = new Paint(1);
        Paint paint = new Paint(1);
        z00Var.h = paint;
        Paint paint2 = new Paint(1);
        z00Var.n = paint2;
        z00Var.w = AndroidUtilities.dp(35.0f);
        z00Var.x = AndroidUtilities.dp(22.0f);
        z00Var.y = AndroidUtilities.dp(8.0f);
        z00Var.E = AndroidUtilities.dp(3.5f);
        z00Var.F = new RectF();
        z00Var.G = 0.0f;
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setTypeface(Typeface.create("sans-serif-medium", 0));
        paint.setStrokeWidth(AndroidUtilities.dpf2(1.5f));
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint2.setStyle(style);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
        this.a = z00Var;
        z00Var.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        pa1Var.h.addView(z00Var);
        pa1Var.n.add(this);
    }
}
