package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.HashSet;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class h61 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public final org.telegram.ui.Cells.ba a;
    public final org.telegram.ui.Components.ym0 b;
    public final org.telegram.ui.Cells.s8 c;
    public final int d;
    public final int e;
    public final TextPaint f;
    public int h;
    public int n;
    public final /* synthetic */ ThemeActivity r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h61(ThemeActivity themeActivity, Context context) {
        super(context);
        org.telegram.ui.ActionBar.s4 s4Var;
        this.r = themeActivity;
        this.d = 12;
        this.e = 30;
        setWillNotDraw(false);
        TextPaint textPaint = new TextPaint(1);
        this.f = textPaint;
        textPaint.setTextSize(org.telegram.messenger.g0.L(16.0f));
        org.telegram.ui.Components.ym0 ym0Var = new org.telegram.ui.Components.ym0(context);
        this.b = ym0Var;
        ym0Var.setReportChanges(true);
        ym0Var.setSeparatorsCount(19);
        ym0Var.setDelegate(new xr0(this, 4));
        ym0Var.setImportantForAccessibility(2);
        addView(ym0Var, c8.ma.d(-1, 38.0f, 51, 5.0f, 5.0f, 39.0f, 0.0f));
        boolean z10 = org.telegram.messenger.s2.a;
        org.telegram.ui.Cells.s8 s8Var = new org.telegram.ui.Cells.s8(context);
        this.c = s8Var;
        s8Var.setBackground(org.telegram.ui.ActionBar.n6.N0(false));
        s8Var.f(org.telegram.messenger.gd.M0(2131751821, null), org.telegram.messenger.bz.H0, false);
        s8Var.setOnClickListener(new oy0(this, 7));
        s4Var = ((org.telegram.ui.ActionBar.h2) themeActivity).parentLayout;
        org.telegram.ui.Cells.ba baVar = new org.telegram.ui.Cells.ba(context, s4Var, 0);
        this.a = baVar;
        baVar.setImportantForAccessibility(4);
        addView(baVar, c8.ma.d(-1, -2.0f, 51, 0.0f, 53, 0.0f, 0.0f));
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Mj));
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        this.a.invalidate();
        this.b.invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.I6, false);
        TextPaint textPaint = this.f;
        textPaint.setColor(x02);
        canvas.drawText("" + org.telegram.messenger.bz.W0, getMeasuredWidth() - org.telegram.messenger.g0.L(39.0f), org.telegram.messenger.g0.L(28.0f), textPaint);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.b.getSeekBarAccessibilityDelegate().e(this, accessibilityNodeInfo);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        int size = View.MeasureSpec.getSize(i7);
        if (this.h != size) {
            int i11 = org.telegram.messenger.bz.W0;
            int i12 = this.d;
            this.b.setProgress((i11 - i12) / (this.e - i12));
            this.h = size;
        }
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i7, Bundle bundle) {
        return super.performAccessibilityAction(i7, bundle) || this.b.getSeekBarAccessibilityDelegate().g(this, i7, bundle);
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        org.telegram.ui.Components.ym0 ym0Var = this.b;
        if (ym0Var == null) {
            return;
        }
        try {
            int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Mj, false);
            if (x02 != this.n) {
                this.n = x02;
                ym0Var.setOuterColor(x02);
            }
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
