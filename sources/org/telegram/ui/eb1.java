package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class eb1 extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
    public final org.telegram.ui.Cells.ka a;
    public final org.telegram.ui.Components.mp0 b;
    public final int c;
    public final int d;
    public final TextPaint e;
    public int f;
    public int h;
    public final /* synthetic */ ThemeActivity n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eb1(ThemeActivity themeActivity, Context context) {
        super(context);
        org.telegram.ui.ActionBar.j5 j5Var;
        this.n = themeActivity;
        this.c = 12;
        this.d = 30;
        setWillNotDraw(false);
        TextPaint textPaint = new TextPaint(1);
        this.e = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(16.0f));
        org.telegram.ui.Components.mp0 mp0Var = new org.telegram.ui.Components.mp0(context);
        this.b = mp0Var;
        mp0Var.setReportChanges(true);
        mp0Var.setSeparatorsCount(19);
        mp0Var.setDelegate(new wv0(this, 4));
        mp0Var.setImportantForAccessibility(2);
        addView(mp0Var, org.telegram.ui.Components.kb1.h(-1, 38.0f, 51, 5.0f, 5.0f, 39.0f, 0.0f));
        j5Var = ((org.telegram.ui.ActionBar.r2) themeActivity).parentLayout;
        org.telegram.ui.Cells.ka kaVar = new org.telegram.ui.Cells.ka(context, j5Var, 0);
        this.a = kaVar;
        kaVar.setImportantForAccessibility(4);
        addView(kaVar, org.telegram.ui.Components.kb1.h(-1, -2.0f, 51, 0.0f, 53.0f, 0.0f, 0.0f));
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Vi));
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        this.a.invalidate();
        this.b.invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.I6, false);
        TextPaint textPaint = this.e;
        textPaint.setColor(x02);
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

    @Override // org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        org.telegram.ui.Components.mp0 mp0Var = this.b;
        if (mp0Var == null) {
            return;
        }
        try {
            int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Vi, false);
            if (x02 != this.h) {
                this.h = x02;
                mp0Var.setOuterColor(x02);
            }
            invalidate();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
