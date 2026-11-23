package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.gd;
import org.telegram.messenger.m10;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public class y4 extends FrameLayout {
    public final org.telegram.ui.ActionBar.n5 a;
    public final org.telegram.ui.ActionBar.n5 b;
    public final ImageView c;
    public boolean d;
    public int e;
    public int f;

    public y4(Context context) {
        super(context);
        this.e = 0;
        this.f = 71;
        org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(context);
        this.a = n5Var;
        org.telegram.ui.ActionBar.u6.X(n5Var, org.telegram.ui.ActionBar.n6.G6, null);
        n5Var.setTextSize(16);
        n5Var.setGravity(gd.a0 ? 5 : 3);
        addView(n5Var);
        org.telegram.ui.ActionBar.n5 n5Var2 = new org.telegram.ui.ActionBar.n5(context);
        this.b = n5Var2;
        org.telegram.ui.ActionBar.u6.X(n5Var2, org.telegram.ui.ActionBar.n6.I6, null);
        n5Var2.setTextSize(16);
        n5Var2.setGravity(gd.a0 ? 3 : 5);
        addView(n5Var2);
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.u6.s(imageView, org.telegram.ui.ActionBar.n6.m6, null, PorterDuff.Mode.MULTIPLY);
        addView(imageView);
    }

    public final void a(int i7, int i10) {
        org.telegram.ui.ActionBar.n5 n5Var = this.a;
        org.telegram.ui.ActionBar.u6.X(n5Var, i10, null);
        n5Var.setTag(Integer.valueOf(i10));
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        ImageView imageView = this.c;
        org.telegram.ui.ActionBar.u6.s(imageView, i7, null, mode);
        imageView.setTag(Integer.valueOf(i7));
    }

    public final void b(int i7, int i10, String str, boolean z10) {
        this.a.l(str, false);
        this.b.setVisibility(4);
        int L = org.telegram.messenger.g0.L(i10);
        ImageView imageView = this.c;
        imageView.setPadding(0, L, 0, 0);
        imageView.setImageResource(i7);
        this.d = z10;
        setWillNotDraw(!z10);
    }

    public int getFullHeight() {
        return org.telegram.messenger.g0.L(56.0f);
    }

    public org.telegram.ui.ActionBar.n5 getTextView() {
        return this.a;
    }

    public org.telegram.ui.ActionBar.n5 getValueTextView() {
        return this.b;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.d) {
            int i7 = this.e;
            if (i7 != 0) {
                org.telegram.ui.ActionBar.n6.l0.setColor(org.telegram.ui.ActionBar.n6.x0(null, i7, false));
            }
            canvas.drawLine(org.telegram.messenger.g0.L(this.f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, this.e != 0 ? org.telegram.ui.ActionBar.n6.l0 : org.telegram.ui.ActionBar.n6.k0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int i13 = i12 - i10;
        int i14 = i11 - i7;
        org.telegram.ui.ActionBar.n5 n5Var = this.b;
        int textHeight = (i13 - n5Var.getTextHeight()) / 2;
        int L = gd.a0 ? org.telegram.messenger.g0.L(24.0f) : 0;
        n5Var.layout(L, textHeight, n5Var.getMeasuredWidth() + L, n5Var.getMeasuredHeight() + textHeight);
        org.telegram.ui.ActionBar.n5 n5Var2 = this.a;
        int textHeight2 = (i13 - n5Var2.getTextHeight()) / 2;
        int L2 = !gd.a0 ? org.telegram.messenger.g0.L(this.f) : org.telegram.messenger.g0.L(24.0f);
        n5Var2.layout(L2, textHeight2, n5Var2.getMeasuredWidth() + L2, n5Var2.getMeasuredHeight() + textHeight2);
        int L3 = org.telegram.messenger.g0.L(9.0f);
        boolean z11 = gd.a0;
        ImageView imageView = this.c;
        int L4 = !z11 ? org.telegram.messenger.g0.L(21.0f) : (i14 - imageView.getMeasuredWidth()) - org.telegram.messenger.g0.L(21.0f);
        imageView.layout(L4, L3, imageView.getMeasuredWidth() + L4, imageView.getMeasuredHeight() + L3);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        int L = org.telegram.messenger.g0.L(48.0f);
        this.b.measure(m10.c(24.0f, size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), TLObject.FLAG_30));
        this.a.measure(m10.c(this.f + 24, size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), TLObject.FLAG_30));
        this.c.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(L, TLObject.FLAG_31));
        setMeasuredDimension(size, getFullHeight() + (this.d ? 1 : 0));
    }

    public void setDividerColor(int i7) {
        this.e = i7;
    }

    public void setTextColor(int i7) {
        this.a.setTextColor(i7);
    }

    public void setTextLeft(int i7) {
        this.f = i7;
        requestLayout();
    }
}
