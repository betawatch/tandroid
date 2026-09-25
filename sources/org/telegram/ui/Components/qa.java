package org.telegram.ui.Components;

import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class qa {
    public final int a;
    public final ij0 b;
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
    public final /* synthetic */ ma0 n;

    public qa(ma0 ma0Var, int i10, int i11, int i12, int i13, String str) {
        this.n = ma0Var;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        this.h = new RectF();
        this.i = new e6(ma0Var, 0L, 200L, rr.h);
        this.m = -1;
        this.a = i10;
        this.j = i12;
        this.k = i13;
        ij0 ij0Var = new ij0(i11, AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f));
        this.b = ij0Var;
        ij0Var.R(ma0Var);
        ij0Var.J(true);
        ij0Var.h = true;
        ij0Var.K(0);
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        int i14 = org.telegram.ui.ActionBar.h6.G6;
        org.telegram.ui.ActionBar.d6 d6Var = ma0Var.a;
        textPaint.setColor(org.telegram.ui.ActionBar.h6.v0(i14, d6Var));
        StaticLayout staticLayout = new StaticLayout(str, textPaint, AndroidUtilities.displaySize.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.e = staticLayout;
        this.f = staticLayout.getLineCount() > 0 ? staticLayout.getLineWidth(0) : 0.0f;
        this.g = staticLayout.getLineCount() > 0 ? staticLayout.getLineLeft(0) : 0.0f;
        this.c = org.telegram.ui.ActionBar.h6.f0(org.telegram.ui.ActionBar.h6.l1(0.1f, org.telegram.ui.ActionBar.h6.v0(i14, d6Var)), 7, AndroidUtilities.dp(16.0f));
    }
}
