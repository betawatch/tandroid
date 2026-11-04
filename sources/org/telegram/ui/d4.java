package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextPaint;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class d4 extends FrameLayout {
    public final org.telegram.ui.Components.pm0 a;
    public final int b;
    public final int c;
    public int d;
    public final TextPaint e;
    public final /* synthetic */ i4 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d4(i4 i4Var, Context context) {
        super(context);
        this.f = i4Var;
        this.b = 12;
        this.c = 30;
        setWillNotDraw(false);
        TextPaint textPaint = new TextPaint(1);
        this.e = textPaint;
        textPaint.setTextSize(org.telegram.messenger.g0.L(16.0f));
        org.telegram.ui.Components.pm0 pm0Var = new org.telegram.ui.Components.pm0(context, null, false);
        this.a = pm0Var;
        pm0Var.setReportChanges(true);
        pm0Var.setSeparatorsCount(19);
        pm0Var.setDelegate(new f(this, 3));
        addView(pm0Var, b8.mf.d(-1, 38.0f, 51, 5.0f, 5.0f, 39.0f, 0.0f));
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        this.a.invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i3 = org.telegram.ui.ActionBar.k6.I6;
        this.f.getClass();
        int v02 = org.telegram.ui.ActionBar.k6.v0(i3);
        TextPaint textPaint = this.e;
        textPaint.setColor(v02);
        canvas.drawText("" + org.telegram.messenger.az.Z0, getMeasuredWidth() - org.telegram.messenger.g0.L(39.0f), org.telegram.messenger.g0.L(28.0f), textPaint);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, i10);
        int size = View.MeasureSpec.getSize(i3);
        if (this.d != size) {
            int i11 = org.telegram.messenger.az.Z0;
            int i12 = this.b;
            this.a.setProgress((i11 - i12) / (this.c - i12));
            this.d = size;
        }
    }
}
