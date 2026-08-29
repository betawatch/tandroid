package org.telegram.ui.Components;

import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class na {
    public final int a;
    public final xi0 b;
    public final org.telegram.ui.Cells.z c;
    public final TextPaint d;
    public final StaticLayout e;
    public final float f;
    public final float g;
    public final RectF h;
    public final d6 i;
    public final int j;
    public final int k;
    public boolean l;
    public int m;
    public final /* synthetic */ x90 n;

    public na(x90 x90Var, int i10, int i11, int i12, int i13, String str) {
        this.n = x90Var;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        this.h = new RectF();
        this.i = new d6(x90Var, 0L, 200L, jr.h);
        this.m = -1;
        this.a = i10;
        this.j = i12;
        this.k = i13;
        xi0 xi0Var = new xi0(i11, AndroidUtilities.dp(29.0f), j7.l1.k(i11, ""), AndroidUtilities.dp(29.0f));
        this.b = xi0Var;
        xi0Var.r0 = x90Var;
        xi0Var.H(true);
        xi0Var.h = true;
        xi0Var.I(0);
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        int i14 = org.telegram.ui.ActionBar.g6.G6;
        org.telegram.ui.ActionBar.c6 c6Var = x90Var.a;
        textPaint.setColor(org.telegram.ui.ActionBar.g6.v0(i14, c6Var));
        StaticLayout staticLayout = new StaticLayout(str, textPaint, AndroidUtilities.displaySize.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.e = staticLayout;
        this.f = staticLayout.getLineCount() > 0 ? staticLayout.getLineWidth(0) : 0.0f;
        this.g = staticLayout.getLineCount() > 0 ? staticLayout.getLineLeft(0) : 0.0f;
        this.c = org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.l1(0.1f, org.telegram.ui.ActionBar.g6.v0(i14, c6Var)), 7, AndroidUtilities.dp(16.0f));
    }
}
