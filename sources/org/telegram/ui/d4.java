package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextPaint;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class d4 extends FrameLayout {
    public final org.telegram.ui.Components.nn0 a;
    public final int b;
    public final int c;
    public int d;
    public final TextPaint e;
    public final /* synthetic */ h4 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d4(h4 h4Var, Context context) {
        super(context);
        this.f = h4Var;
        this.b = 12;
        this.c = 30;
        setWillNotDraw(false);
        TextPaint textPaint = new TextPaint(1);
        this.e = textPaint;
        textPaint.setTextSize(org.telegram.messenger.i0.L(16.0f));
        org.telegram.ui.Components.nn0 nn0Var = new org.telegram.ui.Components.nn0(context, null, false);
        this.a = nn0Var;
        nn0Var.setReportChanges(true);
        nn0Var.setSeparatorsCount(19);
        nn0Var.setDelegate(new e(this, 3));
        addView(nn0Var, w7.b6.d(-1, 38.0f, 51, 5.0f, 5.0f, 39.0f, 0.0f));
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        this.a.invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i10 = org.telegram.ui.ActionBar.t6.I6;
        this.f.getClass();
        int v02 = org.telegram.ui.ActionBar.t6.v0(i10);
        TextPaint textPaint = this.e;
        textPaint.setColor(v02);
        canvas.drawText("" + org.telegram.messenger.tz.Z0, getMeasuredWidth() - org.telegram.messenger.i0.L(39.0f), org.telegram.messenger.i0.L(28.0f), textPaint);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int size = View.MeasureSpec.getSize(i10);
        if (this.d != size) {
            int i12 = org.telegram.messenger.tz.Z0;
            int i13 = this.b;
            this.a.setProgress((i12 - i13) / (this.c - i13));
            this.d = size;
        }
    }
}
