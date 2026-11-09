package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.id;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class i2 extends FrameLayout {
    public final org.telegram.ui.ActionBar.l5 a;
    public final ImageView b;
    public boolean c;
    public int d;

    public i2(int i7, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.d = i7;
        org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(context);
        this.a = l5Var;
        l5Var.setTextSize(16);
        l5Var.setGravity(id.a0 ? 5 : 3);
        int i10 = org.telegram.ui.ActionBar.l6.o6;
        org.telegram.ui.ActionBar.s6.X(l5Var, i10, g6Var);
        l5Var.setTag(Integer.valueOf(i10));
        addView(l5Var);
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
            canvas.drawLine(org.telegram.messenger.g0.L(this.d), getMeasuredHeight() - 1, org.telegram.messenger.g0.L(23.0f) + getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.l6.k0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int L;
        int i13 = i11 - i7;
        org.telegram.ui.ActionBar.l5 l5Var = this.a;
        int textHeight = ((i12 - i10) - l5Var.getTextHeight()) / 2;
        boolean z10 = id.a0;
        ImageView imageView = this.b;
        if (z10) {
            L = (getMeasuredWidth() - l5Var.getMeasuredWidth()) - org.telegram.messenger.g0.L(imageView.getVisibility() == 0 ? this.d : 25.0f);
        } else {
            L = org.telegram.messenger.g0.L(imageView.getVisibility() == 0 ? this.d : 25.0f);
        }
        l5Var.layout(L, textHeight, l5Var.getMeasuredWidth() + L, l5Var.getMeasuredHeight() + textHeight);
        int L2 = !id.a0 ? (org.telegram.messenger.g0.L(this.d) - imageView.getMeasuredWidth()) / 2 : (i13 - imageView.getMeasuredWidth()) - org.telegram.messenger.g0.L(25.0f);
        imageView.layout(L2, 0, imageView.getMeasuredWidth() + L2, imageView.getMeasuredHeight());
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        org.telegram.messenger.g0.L(48.0f);
        this.a.measure(org.telegram.messenger.camera.q.c(94.0f, size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), TLObject.FLAG_30));
        this.b.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f), TLObject.FLAG_30));
        setMeasuredDimension(size, org.telegram.messenger.g0.L(50.0f));
    }
}
