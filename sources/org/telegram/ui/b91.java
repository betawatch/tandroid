package org.telegram.ui;

import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class b91 {
    public final org.telegram.ui.Components.d00 a;
    public sf.f b;
    public final int c;
    public final /* synthetic */ c91 d;

    public b91(c91 c91Var, int i9) {
        this.d = c91Var;
        this.c = i9;
        org.telegram.ui.Components.d00 d00Var = new org.telegram.ui.Components.d00(c91Var.getContext());
        d00Var.c = true;
        TextPaint textPaint = new TextPaint(1);
        d00Var.e = textPaint;
        d00Var.f = new Paint(1);
        Paint paint = new Paint(1);
        d00Var.h = paint;
        Paint paint2 = new Paint(1);
        d00Var.n = paint2;
        d00Var.w = AndroidUtilities.dp(35.0f);
        d00Var.x = AndroidUtilities.dp(22.0f);
        d00Var.y = AndroidUtilities.dp(8.0f);
        d00Var.A = AndroidUtilities.dp(3.5f);
        d00Var.B = new RectF();
        d00Var.C = 0.0f;
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setTypeface(Typeface.create("sans-serif-medium", 0));
        paint.setStrokeWidth(AndroidUtilities.dpf2(1.5f));
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint2.setStyle(style);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
        this.a = d00Var;
        d00Var.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        c91Var.h.addView(d00Var);
        c91Var.n.add(this);
    }
}
