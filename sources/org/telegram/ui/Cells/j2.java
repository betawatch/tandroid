package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.gd;
import org.telegram.messenger.m10;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class j2 extends FrameLayout {
    public final org.telegram.ui.ActionBar.n5 a;
    public final ImageView b;
    public boolean c;
    public int d;

    public j2(int i7, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.d = i7;
        org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(context);
        this.a = n5Var;
        n5Var.setTextSize(16);
        n5Var.setGravity(gd.a0 ? 5 : 3);
        int i10 = org.telegram.ui.ActionBar.n6.o6;
        org.telegram.ui.ActionBar.u6.X(n5Var, i10, i6Var);
        n5Var.setTag(Integer.valueOf(i10));
        addView(n5Var);
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
            canvas.drawLine(org.telegram.messenger.g0.L(this.d), getMeasuredHeight() - 1, org.telegram.messenger.g0.L(23.0f) + getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.n6.k0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int L;
        int i13 = i11 - i7;
        org.telegram.ui.ActionBar.n5 n5Var = this.a;
        int textHeight = ((i12 - i10) - n5Var.getTextHeight()) / 2;
        boolean z11 = gd.a0;
        ImageView imageView = this.b;
        if (z11) {
            L = (getMeasuredWidth() - n5Var.getMeasuredWidth()) - org.telegram.messenger.g0.L(imageView.getVisibility() == 0 ? this.d : 25.0f);
        } else {
            L = org.telegram.messenger.g0.L(imageView.getVisibility() == 0 ? this.d : 25.0f);
        }
        n5Var.layout(L, textHeight, n5Var.getMeasuredWidth() + L, n5Var.getMeasuredHeight() + textHeight);
        int L2 = !gd.a0 ? (org.telegram.messenger.g0.L(this.d) - imageView.getMeasuredWidth()) / 2 : (i13 - imageView.getMeasuredWidth()) - org.telegram.messenger.g0.L(25.0f);
        imageView.layout(L2, 0, imageView.getMeasuredWidth() + L2, imageView.getMeasuredHeight());
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        org.telegram.messenger.g0.L(48.0f);
        this.a.measure(m10.c(94.0f, size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), TLObject.FLAG_30));
        this.b.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f), TLObject.FLAG_30));
        setMeasuredDimension(size, org.telegram.messenger.g0.L(50.0f));
    }
}
