package org.telegram.ui.Components;

import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class qa {
    public final int a;
    public final yj0 b;
    public final org.telegram.ui.Cells.y c;
    public final TextPaint d;
    public final StaticLayout e;
    public final float f;
    public final float g;
    public final RectF h;
    public final f6 i;
    public final int j;
    public final int k;
    public int l;
    public boolean m;
    public int n;
    public final /* synthetic */ wa0 o;

    public qa(wa0 wa0Var, int i10, int i11, int i12, int i13, String str) {
        this.o = wa0Var;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        this.h = new RectF();
        this.i = new f6(wa0Var, 0L, 200L, bs.h);
        this.n = -1;
        this.a = i10;
        this.j = i12;
        this.k = i13;
        yj0 yj0Var = new yj0(i11, AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f));
        this.b = yj0Var;
        yj0Var.R(wa0Var);
        yj0Var.J(true);
        yj0Var.h = true;
        yj0Var.K(0);
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        int i14 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.g6 g6Var = wa0Var.a;
        textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(i14, g6Var));
        StaticLayout staticLayout = new StaticLayout(str, textPaint, AndroidUtilities.displaySize.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.e = staticLayout;
        this.f = staticLayout.getLineCount() > 0 ? staticLayout.getLineWidth(0) : 0.0f;
        this.g = staticLayout.getLineCount() > 0 ? staticLayout.getLineLeft(0) : 0.0f;
        int o12 = org.telegram.ui.ActionBar.k6.o1(0.1f, org.telegram.ui.ActionBar.k6.w0(i14, g6Var));
        this.l = o12;
        this.c = org.telegram.ui.ActionBar.k6.g0(o12, 7, AndroidUtilities.dp(16.0f));
    }
}
