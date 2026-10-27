package org.telegram.ui;

import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class h91 {
    public final org.telegram.ui.Components.a10 a;
    public mg.f b;
    public final int c;
    public final /* synthetic */ i91 d;

    public h91(i91 i91Var, int i10) {
        this.d = i91Var;
        this.c = i10;
        org.telegram.ui.Components.a10 a10Var = new org.telegram.ui.Components.a10(i91Var.getContext());
        a10Var.c = true;
        TextPaint textPaint = new TextPaint(1);
        a10Var.e = textPaint;
        a10Var.f = new Paint(1);
        Paint paint = new Paint(1);
        a10Var.h = paint;
        Paint paint2 = new Paint(1);
        a10Var.n = paint2;
        a10Var.w = AndroidUtilities.dp(35.0f);
        a10Var.x = AndroidUtilities.dp(22.0f);
        a10Var.y = AndroidUtilities.dp(8.0f);
        a10Var.E = AndroidUtilities.dp(3.5f);
        a10Var.F = new RectF();
        a10Var.G = 0.0f;
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setTypeface(Typeface.create("sans-serif-medium", 0));
        paint.setStrokeWidth(AndroidUtilities.dpf2(1.5f));
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint2.setStyle(style);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
        this.a = a10Var;
        a10Var.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        i91Var.h.addView(a10Var);
        i91Var.n.add(this);
    }
}
