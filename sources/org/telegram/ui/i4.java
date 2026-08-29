package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextPaint;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class i4 extends FrameLayout {
    public final org.telegram.ui.Components.ao0 a;
    public final int b;
    public final int c;
    public int d;
    public final TextPaint e;
    public final /* synthetic */ m4 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i4(m4 m4Var, Context context) {
        super(context);
        this.f = m4Var;
        this.b = 12;
        this.c = 30;
        setWillNotDraw(false);
        TextPaint textPaint = new TextPaint(1);
        this.e = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(16.0f));
        org.telegram.ui.Components.ao0 ao0Var = new org.telegram.ui.Components.ao0(context, null, false);
        this.a = ao0Var;
        ao0Var.setReportChanges(true);
        ao0Var.setSeparatorsCount(19);
        ao0Var.setDelegate(new h(this, 3));
        addView(ao0Var, i7.f6.d(-1, 38.0f, 51, 5.0f, 5.0f, 39.0f, 0.0f));
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        this.a.invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i10 = org.telegram.ui.ActionBar.g6.I6;
        this.f.getClass();
        int w02 = org.telegram.ui.ActionBar.g6.w0(null, i10, false);
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
