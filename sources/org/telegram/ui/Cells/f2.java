package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.wl;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class f2 extends FrameLayout {
    public final org.telegram.ui.ActionBar.j5 a;
    public final ImageView b;
    public boolean c;
    public int d;

    public f2(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.d = i10;
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.a = j5Var;
        j5Var.setTextSize(16);
        j5Var.setGravity(LocaleController.isRTL ? 5 : 3);
        int i11 = org.telegram.ui.ActionBar.j6.o6;
        j5Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        j5Var.setTag(Integer.valueOf(i11));
        addView(j5Var);
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView);
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.c) {
            canvas.drawLine(AndroidUtilities.dp(this.d), getMeasuredHeight() - 1, AndroidUtilities.dp(23.0f) + getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.j6.k0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int dp;
        int i14 = i12 - i10;
        org.telegram.ui.ActionBar.j5 j5Var = this.a;
        int textHeight = ((i13 - i11) - j5Var.getTextHeight()) / 2;
        boolean z11 = LocaleController.isRTL;
        ImageView imageView = this.b;
        if (z11) {
            dp = (getMeasuredWidth() - j5Var.getMeasuredWidth()) - AndroidUtilities.dp(imageView.getVisibility() == 0 ? this.d : 25.0f);
        } else {
            dp = AndroidUtilities.dp(imageView.getVisibility() == 0 ? this.d : 25.0f);
        }
        j5Var.layout(dp, textHeight, j5Var.getMeasuredWidth() + dp, j5Var.getMeasuredHeight() + textHeight);
        int dp2 = !LocaleController.isRTL ? (AndroidUtilities.dp(this.d) - imageView.getMeasuredWidth()) / 2 : (i14 - imageView.getMeasuredWidth()) - AndroidUtilities.dp(25.0f);
        imageView.layout(dp2, 0, imageView.getMeasuredWidth() + dp2, imageView.getMeasuredHeight());
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        AndroidUtilities.dp(48.0f);
        this.a.measure(wl.d(94.0f, size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), TLObject.FLAG_30));
        this.b.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), TLObject.FLAG_30));
        setMeasuredDimension(size, AndroidUtilities.dp(50.0f));
    }
}
