package org.telegram.ui.Components;

import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ia {
    public final int a;
    public final mi0 b;
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
    public final /* synthetic */ j90 n;

    public ia(j90 j90Var, int i9, int i10, int i11, int i12, String str) {
        this.n = j90Var;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        this.h = new RectF();
        this.i = new y5(j90Var, 0L, 200L, gr.h);
        this.m = -1;
        this.a = i9;
        this.j = i11;
        this.k = i12;
        mi0 mi0Var = new mi0(i10, AndroidUtilities.dp(29.0f), j3.r0.l(i10, ""), AndroidUtilities.dp(29.0f));
        this.b = mi0Var;
        mi0Var.r0 = j90Var;
        mi0Var.H(true);
        mi0Var.h = true;
        mi0Var.I(0);
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        int i13 = org.telegram.ui.ActionBar.f6.G6;
        org.telegram.ui.ActionBar.b6 b6Var = j90Var.a;
        textPaint.setColor(org.telegram.ui.ActionBar.f6.v0(i13, b6Var));
        StaticLayout staticLayout = new StaticLayout(str, textPaint, AndroidUtilities.displaySize.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.e = staticLayout;
        this.f = staticLayout.getLineCount() > 0 ? staticLayout.getLineWidth(0) : 0.0f;
        this.g = staticLayout.getLineCount() > 0 ? staticLayout.getLineLeft(0) : 0.0f;
        this.c = org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.l1(0.1f, org.telegram.ui.ActionBar.f6.v0(i13, b6Var)), 7, AndroidUtilities.dp(16.0f));
    }
}
