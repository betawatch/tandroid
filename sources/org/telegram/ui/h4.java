package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextPaint;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class h4 extends FrameLayout {
    public final org.telegram.ui.Components.ko0 a;
    public final int b;
    public final int c;
    public int d;
    public final TextPaint e;
    public final /* synthetic */ l4 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h4(l4 l4Var, Context context) {
        super(context);
        this.f = l4Var;
        this.b = 12;
        this.c = 30;
        setWillNotDraw(false);
        TextPaint textPaint = new TextPaint(1);
        this.e = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(16.0f));
        org.telegram.ui.Components.ko0 ko0Var = new org.telegram.ui.Components.ko0(context, null, false);
        this.a = ko0Var;
        ko0Var.setReportChanges(true);
        ko0Var.setSeparatorsCount(19);
        ko0Var.setDelegate(new h(this, 3));
        addView(ko0Var, k7.c6.d(-1, 38.0f, 51, 5.0f, 5.0f, 39.0f, 0.0f));
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        this.a.invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i10 = org.telegram.ui.ActionBar.k6.I6;
        this.f.getClass();
        int w02 = org.telegram.ui.ActionBar.k6.w0(null, i10, false);
        TextPaint textPaint = this.e;
        textPaint.setColor(w02);
        canvas.drawText("" + SharedConfig.ivFontSize, getMeasuredWidth() - AndroidUtilities.dp(39.0f), AndroidUtilities.dp(28.0f), textPaint);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int size = View.MeasureSpec.getSize(i10);
        if (this.d != size) {
            int i12 = SharedConfig.ivFontSize;
            int i13 = this.b;
            this.a.setProgress((i12 - i13) / (this.c - i13));
            this.d = size;
        }
    }
}
