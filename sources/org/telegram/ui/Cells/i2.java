package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.id;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class i2 extends FrameLayout {
    public final org.telegram.ui.ActionBar.m5 a;
    public final ImageView b;
    public boolean c;
    public int d;

    public i2(int i7, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.d = i7;
        org.telegram.ui.ActionBar.m5 m5Var = new org.telegram.ui.ActionBar.m5(context);
        this.a = m5Var;
        m5Var.setTextSize(16);
        m5Var.setGravity(id.a0 ? 5 : 3);
        int i10 = org.telegram.ui.ActionBar.m6.o6;
        org.telegram.ui.ActionBar.t6.X(m5Var, i10, h6Var);
        m5Var.setTag(Integer.valueOf(i10));
        addView(m5Var);
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
            canvas.drawLine(org.telegram.messenger.g0.L(this.d), getMeasuredHeight() - 1, org.telegram.messenger.g0.L(23.0f) + getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.m6.k0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int L;
        int i13 = i11 - i7;
        org.telegram.ui.ActionBar.m5 m5Var = this.a;
        int textHeight = ((i12 - i10) - m5Var.getTextHeight()) / 2;
        boolean z10 = id.a0;
        ImageView imageView = this.b;
        if (z10) {
            L = (getMeasuredWidth() - m5Var.getMeasuredWidth()) - org.telegram.messenger.g0.L(imageView.getVisibility() == 0 ? this.d : 25.0f);
        } else {
            L = org.telegram.messenger.g0.L(imageView.getVisibility() == 0 ? this.d : 25.0f);
        }
        m5Var.layout(L, textHeight, m5Var.getMeasuredWidth() + L, m5Var.getMeasuredHeight() + textHeight);
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
