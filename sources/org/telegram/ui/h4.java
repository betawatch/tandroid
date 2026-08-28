package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextPaint;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class h4 extends FrameLayout {
    public final org.telegram.ui.Components.pn0 a;
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
        org.telegram.ui.Components.pn0 pn0Var = new org.telegram.ui.Components.pn0(context, null, false);
        this.a = pn0Var;
        pn0Var.setReportChanges(true);
        pn0Var.setSeparatorsCount(19);
        pn0Var.setDelegate(new g(this, 3));
        addView(pn0Var, g7.e6.d(-1, 38.0f, 51, 5.0f, 5.0f, 39.0f, 0.0f));
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        this.a.invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i9 = org.telegram.ui.ActionBar.f6.I6;
        this.f.getClass();
        int w02 = org.telegram.ui.ActionBar.f6.w0(null, i9, false);
        TextPaint textPaint = this.e;
        textPaint.setColor(w02);
        canvas.drawText("" + SharedConfig.ivFontSize, getMeasuredWidth() - AndroidUtilities.dp(39.0f), AndroidUtilities.dp(28.0f), textPaint);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        int size = View.MeasureSpec.getSize(i9);
        if (this.d != size) {
            int i11 = SharedConfig.ivFontSize;
            int i12 = this.b;
            this.a.setProgress((i11 - i12) / (this.c - i12));
            this.d = size;
        }
    }
}
