package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class i9 extends FrameLayout {
    public final ImageView a;
    public final org.telegram.ui.ActionBar.i5 b;
    public final org.telegram.ui.ActionBar.d6 c;
    public boolean d;

    public i9(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.c = d6Var;
        org.telegram.ui.ActionBar.i5 i5Var = new org.telegram.ui.ActionBar.i5(context);
        this.b = i5Var;
        i5Var.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.j5, d6Var));
        i5Var.setTextSize(16);
        i5Var.setGravity(19);
        addView(i5Var, w7.x5.d(-1, 48.0f, 16, 22.0f, 0.0f, 56.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.C6, d6Var), PorterDuff.Mode.SRC_IN));
        addView(imageView, w7.x5.d(24, 24.0f, 8388629, 0.0f, 0.0f, 16.0f, 0.0f));
        int i10 = org.telegram.ui.ActionBar.h6.h5;
        int i11 = org.telegram.ui.ActionBar.x5.a;
        int w02 = org.telegram.ui.ActionBar.h6.w0(null, i10, false);
        setBackground(org.telegram.ui.ActionBar.x5.d(new float[0], w02, org.telegram.ui.ActionBar.x5.b(w02)));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.d) {
            org.telegram.ui.ActionBar.d6 d6Var = this.c;
            Paint G = d6Var != null ? d6Var.G("paintDivider") : null;
            if (G == null) {
                G = org.telegram.ui.ActionBar.h6.k0;
            }
            canvas.drawLine(AndroidUtilities.dp(22.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, G);
        }
    }

    public void setDivider(boolean z10) {
        this.d = z10;
    }
}
