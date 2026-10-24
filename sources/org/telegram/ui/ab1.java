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

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class ab1 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.Cells.ga a;
    public final org.telegram.ui.Components.hp0 b;
    public final int c;
    public final int d;
    public final TextPaint e;
    public int f;
    public int h;
    public final /* synthetic */ ThemeActivity n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ab1(ThemeActivity themeActivity, Context context) {
        super(context);
        org.telegram.ui.ActionBar.h5 h5Var;
        this.n = themeActivity;
        this.c = 12;
        this.d = 30;
        setWillNotDraw(false);
        TextPaint textPaint = new TextPaint(1);
        this.e = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(16.0f));
        org.telegram.ui.Components.hp0 hp0Var = new org.telegram.ui.Components.hp0(context);
        this.b = hp0Var;
        hp0Var.setReportChanges(true);
        hp0Var.setSeparatorsCount(19);
        hp0Var.setDelegate(new rv0(this, 4));
        hp0Var.setImportantForAccessibility(2);
        addView(hp0Var, w7.z5.d(-1, 38.0f, 51, 5.0f, 5.0f, 39.0f, 0.0f));
        h5Var = ((org.telegram.ui.ActionBar.o2) themeActivity).parentLayout;
        org.telegram.ui.Cells.ga gaVar = new org.telegram.ui.Cells.ga(context, h5Var, 0);
        this.a = gaVar;
        gaVar.setImportantForAccessibility(4);
        addView(gaVar, w7.z5.d(-1, -2.0f, 51, 0.0f, 53.0f, 0.0f, 0.0f));
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Vi));
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        this.a.invalidate();
        this.b.invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.I6, false);
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

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        org.telegram.ui.Components.hp0 hp0Var = this.b;
        if (hp0Var == null) {
            return;
        }
        try {
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Vi, false);
            if (x02 != this.h) {
                this.h = x02;
                hp0Var.setOuterColor(x02);
            }
            invalidate();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
