package org.telegram.ui;

import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class d91 {
    public final org.telegram.ui.Components.a10 a;
    public lg.f b;
    public final int c;
    public final /* synthetic */ e91 d;

    public d91(e91 e91Var, int i10) {
        this.d = e91Var;
        this.c = i10;
        org.telegram.ui.Components.a10 a10Var = new org.telegram.ui.Components.a10(e91Var.getContext());
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
        e91Var.h.addView(a10Var);
        e91Var.n.add(this);
    }
}
