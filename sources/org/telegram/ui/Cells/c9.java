package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.widget.FrameLayout;
import android.widget.ImageView;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class c9 extends FrameLayout {
    public final ImageView a;
    public final org.telegram.ui.ActionBar.n5 b;
    public final org.telegram.ui.ActionBar.i6 c;
    public boolean d;

    public c9(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.c = i6Var;
        org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(context);
        this.b = n5Var;
        org.telegram.ui.ActionBar.u6.X(n5Var, org.telegram.ui.ActionBar.n6.j5, i6Var);
        n5Var.setTextSize(16);
        n5Var.setGravity(19);
        addView(n5Var, c8.na.d(-1, 48.0f, 16, 22.0f, 0.0f, 56.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        org.telegram.ui.ActionBar.u6.s(imageView, org.telegram.ui.ActionBar.n6.C6, i6Var, PorterDuff.Mode.SRC_IN);
        addView(imageView, c8.na.d(24, 24.0f, 8388629, 0.0f, 0.0f, 16.0f, 0.0f));
        int i7 = org.telegram.ui.ActionBar.n6.h5;
        int i10 = org.telegram.ui.ActionBar.b6.a;
        int x02 = org.telegram.ui.ActionBar.n6.x0(null, i7, false);
        setBackground(org.telegram.ui.ActionBar.b6.d(x02, org.telegram.ui.ActionBar.b6.b(x02), new float[0]));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.d) {
            org.telegram.ui.ActionBar.i6 i6Var = this.c;
            Paint e10 = i6Var != null ? i6Var.e("paintDivider") : null;
            if (e10 == null) {
                e10 = org.telegram.ui.ActionBar.n6.k0;
            }
            canvas.drawLine(org.telegram.messenger.g0.L(22.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, e10);
        }
    }

    public void setDivider(boolean z10) {
        this.d = z10;
    }
}
