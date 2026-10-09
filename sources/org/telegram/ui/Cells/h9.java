package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class h9 extends FrameLayout {
    public final ImageView a;
    public final org.telegram.ui.ActionBar.j5 b;
    public final org.telegram.ui.ActionBar.e6 c;
    public boolean d;

    public h9(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.c = e6Var;
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.b = j5Var;
        j5Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.j5, e6Var));
        j5Var.setTextSize(16);
        j5Var.setGravity(19);
        addView(j5Var, w7.x5.a(48.0f, 22.0f, 0.0f, 56.0f, 0.0f, -1, 16));
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.C6, e6Var), PorterDuff.Mode.SRC_IN));
        addView(imageView, w7.x5.a(24.0f, 0.0f, 0.0f, 16.0f, 0.0f, 24, 8388629));
        int i10 = org.telegram.ui.ActionBar.i6.h5;
        int i11 = org.telegram.ui.ActionBar.y5.a;
        int x02 = org.telegram.ui.ActionBar.i6.x0(null, i10, false);
        setBackground(org.telegram.ui.ActionBar.y5.d(new float[0], x02, org.telegram.ui.ActionBar.y5.b(x02)));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.d) {
            org.telegram.ui.ActionBar.e6 e6Var = this.c;
            Paint F = e6Var != null ? e6Var.F("paintDivider") : null;
            if (F == null) {
                F = org.telegram.ui.ActionBar.i6.k0;
            }
            canvas.drawLine(AndroidUtilities.dp(22.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, F);
        }
    }

    public void setDivider(boolean z10) {
        this.d = z10;
    }
}
