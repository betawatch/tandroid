package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class h9 extends FrameLayout {
    public final ImageView a;
    public final org.telegram.ui.ActionBar.n5 b;
    public final org.telegram.ui.ActionBar.g6 c;
    public boolean d;

    public h9(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.c = g6Var;
        org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(context);
        this.b = n5Var;
        org.telegram.ui.ActionBar.r6.Z(n5Var, org.telegram.ui.ActionBar.k6.j5, g6Var);
        n5Var.setTextSize(16);
        n5Var.setGravity(19);
        addView(n5Var, w7.z5.d(-1, 48.0f, 16, 22.0f, 0.0f, 56.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.C6, g6Var, PorterDuff.Mode.SRC_IN);
        addView(imageView, w7.z5.d(24, 24.0f, 8388629, 0.0f, 0.0f, 16.0f, 0.0f));
        int i10 = org.telegram.ui.ActionBar.k6.h5;
        int i11 = org.telegram.ui.ActionBar.a6.a;
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, i10, false);
        setBackground(org.telegram.ui.ActionBar.a6.d(new float[0], x02, org.telegram.ui.ActionBar.a6.b(x02)));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.d) {
            org.telegram.ui.ActionBar.g6 g6Var = this.c;
            Paint d = g6Var != null ? g6Var.d("paintDivider") : null;
            if (d == null) {
                d = org.telegram.ui.ActionBar.k6.k0;
            }
            canvas.drawLine(AndroidUtilities.dp(22.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, d);
        }
    }

    public void setDivider(boolean z10) {
        this.d = z10;
    }
}
