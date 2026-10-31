package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.widget.FrameLayout;
import android.widget.ImageView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class e9 extends FrameLayout {
    public final ImageView a;
    public final org.telegram.ui.ActionBar.u5 b;
    public final org.telegram.ui.ActionBar.p6 c;
    public boolean d;

    public e9(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.c = p6Var;
        org.telegram.ui.ActionBar.u5 u5Var = new org.telegram.ui.ActionBar.u5(context);
        this.b = u5Var;
        org.telegram.ui.ActionBar.a7.Y(u5Var, org.telegram.ui.ActionBar.t6.j5, p6Var);
        u5Var.setTextSize(16);
        u5Var.setGravity(19);
        addView(u5Var, w7.b6.d(-1, 48.0f, 16, 22.0f, 0.0f, 56.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        org.telegram.ui.ActionBar.a7.t(imageView, org.telegram.ui.ActionBar.t6.C6, p6Var, PorterDuff.Mode.SRC_IN);
        addView(imageView, w7.b6.d(24, 24.0f, 8388629, 0.0f, 0.0f, 16.0f, 0.0f));
        int i10 = org.telegram.ui.ActionBar.t6.h5;
        int i11 = org.telegram.ui.ActionBar.j6.a;
        int x02 = org.telegram.ui.ActionBar.t6.x0(null, i10, false);
        setBackground(org.telegram.ui.ActionBar.j6.d(x02, org.telegram.ui.ActionBar.j6.b(x02), new float[0]));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.d) {
            org.telegram.ui.ActionBar.p6 p6Var = this.c;
            Paint d = p6Var != null ? p6Var.d("paintDivider") : null;
            if (d == null) {
                d = org.telegram.ui.ActionBar.t6.k0;
            }
            canvas.drawLine(org.telegram.messenger.i0.L(22.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, d);
        }
    }

    public void setDivider(boolean z10) {
        this.d = z10;
    }
}
