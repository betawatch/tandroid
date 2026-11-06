package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextPaint;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class c4 extends FrameLayout {
    public final org.telegram.ui.Components.mm0 a;
    public final int b;
    public final int c;
    public int d;
    public final TextPaint e;
    public final /* synthetic */ g4 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c4(g4 g4Var, Context context) {
        super(context);
        this.f = g4Var;
        this.b = 12;
        this.c = 30;
        setWillNotDraw(false);
        TextPaint textPaint = new TextPaint(1);
        this.e = textPaint;
        textPaint.setTextSize(org.telegram.messenger.g0.L(16.0f));
        org.telegram.ui.Components.mm0 mm0Var = new org.telegram.ui.Components.mm0(context, null, false);
        this.a = mm0Var;
        mm0Var.setReportChanges(true);
        mm0Var.setSeparatorsCount(19);
        mm0Var.setDelegate(new f(this, 3));
        addView(mm0Var, c8.ha.d(-1, 38.0f, 51, 5.0f, 5.0f, 39.0f, 0.0f));
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        this.a.invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i7 = org.telegram.ui.ActionBar.k6.I6;
        this.f.getClass();
        int v02 = org.telegram.ui.ActionBar.k6.v0(i7);
        TextPaint textPaint = this.e;
        textPaint.setColor(v02);
        canvas.drawText("" + org.telegram.messenger.iz.Z0, getMeasuredWidth() - org.telegram.messenger.g0.L(39.0f), org.telegram.messenger.g0.L(28.0f), textPaint);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        int size = View.MeasureSpec.getSize(i7);
        if (this.d != size) {
            int i11 = org.telegram.messenger.iz.Z0;
            int i12 = this.b;
            this.a.setProgress((i11 - i12) / (this.c - i12));
            this.d = size;
        }
    }
}
