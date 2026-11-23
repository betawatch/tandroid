package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.widget.FrameLayout;
import android.widget.ImageView;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class d9 extends FrameLayout {
    public final ImageView a;
    public final org.telegram.ui.ActionBar.m5 b;
    public final org.telegram.ui.ActionBar.h6 c;
    public boolean d;

    public d9(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.c = h6Var;
        org.telegram.ui.ActionBar.m5 m5Var = new org.telegram.ui.ActionBar.m5(context);
        this.b = m5Var;
        org.telegram.ui.ActionBar.t6.X(m5Var, org.telegram.ui.ActionBar.m6.j5, h6Var);
        m5Var.setTextSize(16);
        m5Var.setGravity(19);
        addView(m5Var, c8.ma.d(-1, 48.0f, 16, 22.0f, 0.0f, 56.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        org.telegram.ui.ActionBar.t6.s(imageView, org.telegram.ui.ActionBar.m6.C6, h6Var, PorterDuff.Mode.SRC_IN);
        addView(imageView, c8.ma.d(24, 24.0f, 8388629, 0.0f, 0.0f, 16.0f, 0.0f));
        int i7 = org.telegram.ui.ActionBar.m6.h5;
        int i10 = org.telegram.ui.ActionBar.a6.a;
        int x02 = org.telegram.ui.ActionBar.m6.x0(null, i7, false);
        setBackground(org.telegram.ui.ActionBar.a6.d(x02, org.telegram.ui.ActionBar.a6.b(x02), new float[0]));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.d) {
            org.telegram.ui.ActionBar.h6 h6Var = this.c;
            Paint g10 = h6Var != null ? h6Var.g("paintDivider") : null;
            if (g10 == null) {
                g10 = org.telegram.ui.ActionBar.m6.k0;
            }
            canvas.drawLine(org.telegram.messenger.g0.L(22.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, g10);
        }
    }

    public void setDivider(boolean z10) {
        this.d = z10;
    }
}
