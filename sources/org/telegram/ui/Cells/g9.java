package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class g9 extends FrameLayout {
    public final ImageView a;
    public final org.telegram.ui.ActionBar.j5 b;
    public final org.telegram.ui.ActionBar.d6 c;
    public boolean d;

    public g9(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.c = d6Var;
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.b = j5Var;
        j5Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.j5, d6Var));
        j5Var.setTextSize(16);
        j5Var.setGravity(19);
        addView(j5Var, w7.z5.d(-1, 48.0f, 16, 22.0f, 0.0f, 56.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.C6, d6Var), PorterDuff.Mode.SRC_IN));
        addView(imageView, w7.z5.d(24, 24.0f, 8388629, 0.0f, 0.0f, 16.0f, 0.0f));
        int i10 = org.telegram.ui.ActionBar.h6.h5;
        int i11 = org.telegram.ui.ActionBar.x5.a;
        int x02 = org.telegram.ui.ActionBar.h6.x0(null, i10, false);
        setBackground(org.telegram.ui.ActionBar.x5.d(new float[0], x02, org.telegram.ui.ActionBar.x5.b(x02)));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.d) {
            org.telegram.ui.ActionBar.d6 d6Var = this.c;
            Paint n10 = d6Var != null ? d6Var.n("paintDivider") : null;
            if (n10 == null) {
                n10 = org.telegram.ui.ActionBar.h6.k0;
            }
            canvas.drawLine(AndroidUtilities.dp(22.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, n10);
        }
    }

    public void setDivider(boolean z10) {
        this.d = z10;
    }
}
