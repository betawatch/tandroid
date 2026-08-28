package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.ll;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class f2 extends FrameLayout {
    public final org.telegram.ui.ActionBar.h5 a;
    public final ImageView b;
    public boolean c;
    public int d;

    public f2(Context context, int i9, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.d = i9;
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.a = h5Var;
        h5Var.setTextSize(16);
        h5Var.setGravity(LocaleController.isRTL ? 5 : 3);
        int i10 = org.telegram.ui.ActionBar.f6.o6;
        h5Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(i10, b6Var));
        h5Var.setTag(Integer.valueOf(i10));
        addView(h5Var);
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
            canvas.drawLine(AndroidUtilities.dp(this.d), getMeasuredHeight() - 1, AndroidUtilities.dp(23.0f) + getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.f6.k0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        int dp;
        int i13 = i11 - i9;
        org.telegram.ui.ActionBar.h5 h5Var = this.a;
        int textHeight = ((i12 - i10) - h5Var.getTextHeight()) / 2;
        boolean z11 = LocaleController.isRTL;
        ImageView imageView = this.b;
        if (z11) {
            dp = (getMeasuredWidth() - h5Var.getMeasuredWidth()) - AndroidUtilities.dp(imageView.getVisibility() == 0 ? this.d : 25.0f);
        } else {
            dp = AndroidUtilities.dp(imageView.getVisibility() == 0 ? this.d : 25.0f);
        }
        h5Var.layout(dp, textHeight, h5Var.getMeasuredWidth() + dp, h5Var.getMeasuredHeight() + textHeight);
        int dp2 = !LocaleController.isRTL ? (AndroidUtilities.dp(this.d) - imageView.getMeasuredWidth()) / 2 : (i13 - imageView.getMeasuredWidth()) - AndroidUtilities.dp(25.0f);
        imageView.layout(dp2, 0, imageView.getMeasuredWidth() + dp2, imageView.getMeasuredHeight());
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        int size = View.MeasureSpec.getSize(i9);
        AndroidUtilities.dp(48.0f);
        this.a.measure(ll.d(94.0f, size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), TLObject.FLAG_30));
        this.b.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), TLObject.FLAG_30));
        setMeasuredDimension(size, AndroidUtilities.dp(50.0f));
    }
}
