package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class h9 extends FrameLayout {
    public final ImageView a;
    public final org.telegram.ui.ActionBar.i5 b;
    public final org.telegram.ui.ActionBar.d6 c;
    public boolean d;

    public h9(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.c = d6Var;
        org.telegram.ui.ActionBar.i5 i5Var = new org.telegram.ui.ActionBar.i5(context);
        this.b = i5Var;
        i5Var.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.j5, d6Var));
        i5Var.setTextSize(16);
        i5Var.setGravity(19);
        addView(i5Var, w7.z5.d(-1, 48.0f, 16, 22.0f, 0.0f, 56.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.C6, d6Var), PorterDuff.Mode.SRC_IN));
        addView(imageView, w7.z5.d(24, 24.0f, 8388629, 0.0f, 0.0f, 16.0f, 0.0f));
        int i10 = org.telegram.ui.ActionBar.i6.h5;
        int i11 = org.telegram.ui.ActionBar.x5.a;
        int w02 = org.telegram.ui.ActionBar.i6.w0(null, i10, false);
        setBackground(org.telegram.ui.ActionBar.x5.d(new float[0], w02, org.telegram.ui.ActionBar.x5.b(w02)));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.d) {
            org.telegram.ui.ActionBar.d6 d6Var = this.c;
            Paint H = d6Var != null ? d6Var.H("paintDivider") : null;
            if (H == null) {
                H = org.telegram.ui.ActionBar.i6.k0;
            }
            canvas.drawLine(AndroidUtilities.dp(22.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, H);
        }
    }

    public void setDivider(boolean z10) {
        this.d = z10;
    }
}
