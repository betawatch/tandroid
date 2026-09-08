package org.telegram.ui.Components;

import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class qa {
    public final int a;
    public final xi0 b;
    public final org.telegram.ui.Cells.z c;
    public final TextPaint d;
    public final StaticLayout e;
    public final float f;
    public final float g;
    public final RectF h;
    public final e6 i;
    public final int j;
    public final int k;
    public boolean l;
    public int m;
    public final /* synthetic */ ba0 n;

    public qa(ba0 ba0Var, int i10, int i11, int i12, int i13, String str) {
        this.n = ba0Var;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        this.h = new RectF();
        this.i = new e6(ba0Var, 0L, 200L, pr.h);
        this.m = -1;
        this.a = i10;
        this.j = i12;
        this.k = i13;
        xi0 xi0Var = new xi0(i11, AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f));
        this.b = xi0Var;
        xi0Var.v0 = ba0Var;
        xi0Var.H(true);
        xi0Var.h = true;
        xi0Var.I(0);
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        int i14 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.f6 f6Var = ba0Var.a;
        textPaint.setColor(org.telegram.ui.ActionBar.j6.v0(i14, f6Var));
        StaticLayout staticLayout = new StaticLayout(str, textPaint, AndroidUtilities.displaySize.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.e = staticLayout;
        this.f = staticLayout.getLineCount() > 0 ? staticLayout.getLineWidth(0) : 0.0f;
        this.g = staticLayout.getLineCount() > 0 ? staticLayout.getLineLeft(0) : 0.0f;
        this.c = org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.l1(0.1f, org.telegram.ui.ActionBar.j6.v0(i14, f6Var)), 7, AndroidUtilities.dp(16.0f));
    }
}
