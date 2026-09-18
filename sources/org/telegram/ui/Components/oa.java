package org.telegram.ui.Components;

import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class oa {
    public final int a;
    public final yi0 b;
    public final org.telegram.ui.Cells.z c;
    public final TextPaint d;
    public final StaticLayout e;
    public final float f;
    public final float g;
    public final RectF h;
    public final c6 i;
    public final int j;
    public final int k;
    public boolean l;
    public int m;
    public final /* synthetic */ aa0 n;

    public oa(aa0 aa0Var, int i10, int i11, int i12, int i13, String str) {
        this.n = aa0Var;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        this.h = new RectF();
        this.i = new c6(aa0Var, 0L, 200L, qr.h);
        this.m = -1;
        this.a = i10;
        this.j = i12;
        this.k = i13;
        yi0 yi0Var = new yi0(i11, AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f));
        this.b = yi0Var;
        yi0Var.R(aa0Var);
        yi0Var.J(true);
        yi0Var.h = true;
        yi0Var.K(0);
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        int i14 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.f6 f6Var = aa0Var.a;
        textPaint.setColor(org.telegram.ui.ActionBar.j6.v0(i14, f6Var));
        StaticLayout staticLayout = new StaticLayout(str, textPaint, AndroidUtilities.displaySize.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.e = staticLayout;
        this.f = staticLayout.getLineCount() > 0 ? staticLayout.getLineWidth(0) : 0.0f;
        this.g = staticLayout.getLineCount() > 0 ? staticLayout.getLineLeft(0) : 0.0f;
        this.c = org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.l1(0.1f, org.telegram.ui.ActionBar.j6.v0(i14, f6Var)), 7, AndroidUtilities.dp(16.0f));
    }
}
