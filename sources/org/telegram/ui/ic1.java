package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class ic1 extends FrameLayout {
    public final org.telegram.ui.Cells.ja a;
    public final org.telegram.ui.Components.uo0 b;
    public final int c;
    public final int d;
    public final TextPaint e;
    public int f;
    public final /* synthetic */ ThemeActivity h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ic1(ThemeActivity themeActivity, Context context) {
        super(context);
        org.telegram.ui.ActionBar.d5 d5Var;
        this.h = themeActivity;
        this.c = 12;
        this.d = 30;
        setWillNotDraw(false);
        TextPaint textPaint = new TextPaint(1);
        this.e = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(16.0f));
        org.telegram.ui.Components.uo0 uo0Var = new org.telegram.ui.Components.uo0(context);
        this.b = uo0Var;
        uo0Var.setReportChanges(true);
        uo0Var.setSeparatorsCount(19);
        uo0Var.setDelegate(new jw0(this, 4));
        uo0Var.setImportantForAccessibility(2);
        addView(uo0Var, w7.y5.d(-1, 38.0f, 51, 5.0f, 5.0f, 39.0f, 0.0f));
        d5Var = ((org.telegram.ui.ActionBar.n2) themeActivity).parentLayout;
        org.telegram.ui.Cells.ja jaVar = new org.telegram.ui.Cells.ja(context, d5Var, 0);
        this.a = jaVar;
        jaVar.setImportantForAccessibility(4);
        addView(jaVar, w7.y5.d(-1, -2.0f, 51, 0.0f, 53.0f, 0.0f, 0.0f));
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        this.a.invalidate();
        this.b.invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.I6, false);
        TextPaint textPaint = this.e;
        textPaint.setColor(w02);
        canvas.drawText("" + SharedConfig.fontSize, getMeasuredWidth() - AndroidUtilities.dp(39.0f), AndroidUtilities.dp(28.0f), textPaint);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.b.getSeekBarAccessibilityDelegate().e(this, accessibilityNodeInfo);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int size = View.MeasureSpec.getSize(i10);
        if (this.f != size) {
            int i12 = SharedConfig.fontSize;
            int i13 = this.c;
            this.b.setProgress((i12 - i13) / (this.d - i13));
            this.f = size;
        }
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        return super.performAccessibilityAction(i10, bundle) || this.b.getSeekBarAccessibilityDelegate().g(this, i10, bundle);
    }
}
