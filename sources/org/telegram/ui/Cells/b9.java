package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.widget.FrameLayout;
import android.widget.ImageView;
import b8.mf;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class b9 extends FrameLayout {
    public final ImageView a;
    public final org.telegram.ui.ActionBar.k5 b;
    public final org.telegram.ui.ActionBar.e6 c;
    public boolean d;

    public b9(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.c = e6Var;
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.b = k5Var;
        org.telegram.ui.ActionBar.r6.Y(k5Var, org.telegram.ui.ActionBar.k6.j5, e6Var);
        k5Var.setTextSize(16);
        k5Var.setGravity(19);
        addView(k5Var, mf.d(-1, 48.0f, 16, 22.0f, 0.0f, 56.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.C6, e6Var, PorterDuff.Mode.SRC_IN);
        addView(imageView, mf.d(24, 24.0f, 8388629, 0.0f, 0.0f, 16.0f, 0.0f));
        int i3 = org.telegram.ui.ActionBar.k6.h5;
        int i10 = org.telegram.ui.ActionBar.y5.a;
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, i3, false);
        setBackground(org.telegram.ui.ActionBar.y5.d(x02, org.telegram.ui.ActionBar.y5.b(x02), new float[0]));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.d) {
            org.telegram.ui.ActionBar.e6 e6Var = this.c;
            Paint d = e6Var != null ? e6Var.d("paintDivider") : null;
            if (d == null) {
                d = org.telegram.ui.ActionBar.k6.k0;
            }
            canvas.drawLine(org.telegram.messenger.g0.L(22.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, d);
        }
    }

    public void setDivider(boolean z10) {
        this.d = z10;
    }
}
