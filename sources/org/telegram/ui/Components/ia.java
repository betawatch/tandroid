package org.telegram.ui.Components;

import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class ia {
    public final int a;
    public final ij0 b;
    public final org.telegram.ui.Cells.z c;
    public final TextPaint d;
    public final StaticLayout e;
    public final float f;
    public final float g;
    public final RectF h;
    public final z5 i;
    public final int j;
    public final int k;
    public boolean l;
    public int m;
    public final /* synthetic */ ea0 n;

    public ia(ea0 ea0Var, int i10, int i11, int i12, int i13, String str) {
        this.n = ea0Var;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        this.h = new RectF();
        this.i = new z5(ea0Var, 0L, 200L, pr.h);
        this.m = -1;
        this.a = i10;
        this.j = i12;
        this.k = i13;
        ij0 ij0Var = new ij0(i11, AndroidUtilities.dp(29.0f), l.d.j(i11, ""), AndroidUtilities.dp(29.0f));
        this.b = ij0Var;
        ij0Var.s0 = ea0Var;
        ij0Var.H(true);
        ij0Var.h = true;
        ij0Var.I(0);
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        int i14 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.g6 g6Var = ea0Var.a;
        textPaint.setColor(org.telegram.ui.ActionBar.k6.v0(i14, g6Var));
        StaticLayout staticLayout = new StaticLayout(str, textPaint, AndroidUtilities.displaySize.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.e = staticLayout;
        this.f = staticLayout.getLineCount() > 0 ? staticLayout.getLineWidth(0) : 0.0f;
        this.g = staticLayout.getLineCount() > 0 ? staticLayout.getLineLeft(0) : 0.0f;
        this.c = org.telegram.ui.ActionBar.k6.f0(org.telegram.ui.ActionBar.k6.l1(0.1f, org.telegram.ui.ActionBar.k6.v0(i14, g6Var)), 7, AndroidUtilities.dp(16.0f));
    }
}
