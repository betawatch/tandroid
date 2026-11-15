package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.widget.FrameLayout;
import android.widget.ImageView;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class b9 extends FrameLayout {
    public final ImageView a;
    public final org.telegram.ui.ActionBar.j5 b;
    public final org.telegram.ui.ActionBar.e6 c;
    public boolean d;

    public b9(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.c = e6Var;
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.b = j5Var;
        org.telegram.ui.ActionBar.q6.X(j5Var, org.telegram.ui.ActionBar.j6.j5, e6Var);
        j5Var.setTextSize(16);
        j5Var.setGravity(19);
        addView(j5Var, c8.ja.d(-1, 48.0f, 16, 22.0f, 0.0f, 56.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        org.telegram.ui.ActionBar.q6.s(imageView, org.telegram.ui.ActionBar.j6.C6, e6Var, PorterDuff.Mode.SRC_IN);
        addView(imageView, c8.ja.d(24, 24.0f, 8388629, 0.0f, 0.0f, 16.0f, 0.0f));
        int i7 = org.telegram.ui.ActionBar.j6.h5;
        int i10 = org.telegram.ui.ActionBar.y5.a;
        int x02 = org.telegram.ui.ActionBar.j6.x0(null, i7, false);
        setBackground(org.telegram.ui.ActionBar.y5.d(x02, org.telegram.ui.ActionBar.y5.b(x02), new float[0]));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.d) {
            org.telegram.ui.ActionBar.e6 e6Var = this.c;
            Paint d = e6Var != null ? e6Var.d("paintDivider") : null;
            if (d == null) {
                d = org.telegram.ui.ActionBar.j6.k0;
            }
            canvas.drawLine(org.telegram.messenger.g0.L(22.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, d);
        }
    }

    public void setDivider(boolean z10) {
        this.d = z10;
    }
}
