package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.cd;
import org.telegram.messenger.z20;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class i2 extends FrameLayout {
    public final org.telegram.ui.ActionBar.u5 a;
    public final ImageView b;
    public boolean c;
    public int d;

    public i2(int i10, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.d = i10;
        org.telegram.ui.ActionBar.u5 u5Var = new org.telegram.ui.ActionBar.u5(context);
        this.a = u5Var;
        u5Var.setTextSize(16);
        u5Var.setGravity(cd.X ? 5 : 3);
        int i11 = org.telegram.ui.ActionBar.t6.o6;
        org.telegram.ui.ActionBar.a7.Y(u5Var, i11, p6Var);
        u5Var.setTag(Integer.valueOf(i11));
        addView(u5Var);
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
            canvas.drawLine(org.telegram.messenger.i0.L(this.d), getMeasuredHeight() - 1, org.telegram.messenger.i0.L(23.0f) + getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.t6.k0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int L;
        int i14 = i12 - i10;
        org.telegram.ui.ActionBar.u5 u5Var = this.a;
        int textHeight = ((i13 - i11) - u5Var.getTextHeight()) / 2;
        boolean z11 = cd.X;
        ImageView imageView = this.b;
        if (z11) {
            L = (getMeasuredWidth() - u5Var.getMeasuredWidth()) - org.telegram.messenger.i0.L(imageView.getVisibility() == 0 ? this.d : 25.0f);
        } else {
            L = org.telegram.messenger.i0.L(imageView.getVisibility() == 0 ? this.d : 25.0f);
        }
        u5Var.layout(L, textHeight, u5Var.getMeasuredWidth() + L, u5Var.getMeasuredHeight() + textHeight);
        int L2 = !cd.X ? (org.telegram.messenger.i0.L(this.d) - imageView.getMeasuredWidth()) / 2 : (i14 - imageView.getMeasuredWidth()) - org.telegram.messenger.i0.L(25.0f);
        imageView.layout(L2, 0, imageView.getMeasuredWidth() + L2, imageView.getMeasuredHeight());
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        org.telegram.messenger.i0.L(48.0f);
        this.a.measure(z20.c(94.0f, size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(20.0f), TLObject.FLAG_30));
        this.b.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(50.0f), TLObject.FLAG_30));
        setMeasuredDimension(size, org.telegram.messenger.i0.L(50.0f));
    }
}
