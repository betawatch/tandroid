package org.telegram.ui;

import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class c91 {
    public final org.telegram.ui.Components.o00 a;
    public vf.f b;
    public final int c;
    public final /* synthetic */ d91 d;

    public c91(d91 d91Var, int i10) {
        this.d = d91Var;
        this.c = i10;
        org.telegram.ui.Components.o00 o00Var = new org.telegram.ui.Components.o00(d91Var.getContext());
        o00Var.c = true;
        TextPaint textPaint = new TextPaint(1);
        o00Var.e = textPaint;
        o00Var.f = new Paint(1);
        Paint paint = new Paint(1);
        o00Var.h = paint;
        Paint paint2 = new Paint(1);
        o00Var.n = paint2;
        o00Var.w = AndroidUtilities.dp(35.0f);
        o00Var.x = AndroidUtilities.dp(22.0f);
        o00Var.y = AndroidUtilities.dp(8.0f);
        o00Var.A = AndroidUtilities.dp(3.5f);
        o00Var.B = new RectF();
        o00Var.C = 0.0f;
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setTypeface(Typeface.create("sans-serif-medium", 0));
        paint.setStrokeWidth(AndroidUtilities.dpf2(1.5f));
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint2.setStyle(style);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
        this.a = o00Var;
        o00Var.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        d91Var.h.addView(o00Var);
        d91Var.n.add(this);
    }
}
