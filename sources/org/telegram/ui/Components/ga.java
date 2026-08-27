package org.telegram.ui.Components;

import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class ga {
    public final int a;
    public final oi0 b;
    public final org.telegram.ui.Cells.z c;
    public final TextPaint d;
    public final StaticLayout e;
    public final float f;
    public final float g;
    public final RectF h;
    public final y5 i;
    public final int j;
    public final int k;
    public boolean l;
    public int m;
    public final /* synthetic */ n90 n;

    public ga(n90 n90Var, int i10, int i11, int i12, int i13, String str) {
        this.n = n90Var;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        this.h = new RectF();
        this.i = new y5(n90Var, 0L, 200L, er.h);
        this.m = -1;
        this.a = i10;
        this.j = i12;
        this.k = i13;
        oi0 oi0Var = new oi0(i11, AndroidUtilities.dp(29.0f), i0.a.k(i11, ""), AndroidUtilities.dp(29.0f));
        this.b = oi0Var;
        oi0Var.r0 = n90Var;
        oi0Var.H(true);
        oi0Var.h = true;
        oi0Var.I(0);
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        int i14 = org.telegram.ui.ActionBar.g6.G6;
        org.telegram.ui.ActionBar.c6 c6Var = n90Var.a;
        textPaint.setColor(org.telegram.ui.ActionBar.g6.v0(i14, c6Var));
        StaticLayout staticLayout = new StaticLayout(str, textPaint, AndroidUtilities.displaySize.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.e = staticLayout;
        this.f = staticLayout.getLineCount() > 0 ? staticLayout.getLineWidth(0) : 0.0f;
        this.g = staticLayout.getLineCount() > 0 ? staticLayout.getLineLeft(0) : 0.0f;
        this.c = org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.l1(0.1f, org.telegram.ui.ActionBar.g6.v0(i14, c6Var)), 7, AndroidUtilities.dp(16.0f));
    }
}
