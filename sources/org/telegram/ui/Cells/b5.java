package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.cd;
import org.telegram.messenger.z20;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class b5 extends FrameLayout {
    public final org.telegram.ui.ActionBar.u5 a;
    public final org.telegram.ui.ActionBar.u5 b;
    public final ImageView c;
    public boolean d;
    public int e;

    public b5(Context context) {
        super(context);
        this.e = 0;
        org.telegram.ui.ActionBar.u5 u5Var = new org.telegram.ui.ActionBar.u5(context);
        this.a = u5Var;
        org.telegram.ui.ActionBar.a7.Y(u5Var, org.telegram.ui.ActionBar.t6.G6, null);
        u5Var.setTextSize(16);
        u5Var.setGravity(cd.X ? 5 : 3);
        addView(u5Var);
        org.telegram.ui.ActionBar.u5 u5Var2 = new org.telegram.ui.ActionBar.u5(context);
        this.b = u5Var2;
        org.telegram.ui.ActionBar.a7.Y(u5Var2, org.telegram.ui.ActionBar.t6.I6, null);
        u5Var2.setTextSize(16);
        u5Var2.setGravity(cd.X ? 3 : 5);
        addView(u5Var2);
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.a7.t(imageView, org.telegram.ui.ActionBar.t6.m6, null, PorterDuff.Mode.MULTIPLY);
        addView(imageView);
    }

    public final void a(int i10, int i11) {
        org.telegram.ui.ActionBar.u5 u5Var = this.a;
        org.telegram.ui.ActionBar.a7.Y(u5Var, i11, null);
        u5Var.setTag(Integer.valueOf(i11));
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        ImageView imageView = this.c;
        org.telegram.ui.ActionBar.a7.t(imageView, i10, null, mode);
        imageView.setTag(Integer.valueOf(i10));
    }

    public final void b(int i10, int i11, String str, boolean z10) {
        this.a.l(str, false);
        this.b.setVisibility(4);
        int L = org.telegram.messenger.i0.L(i11);
        ImageView imageView = this.c;
        imageView.setPadding(0, L, 0, 0);
        imageView.setImageResource(i10);
        this.d = z10;
        setWillNotDraw(!z10);
    }

    public int getFullHeight() {
        return org.telegram.messenger.i0.L(56.0f);
    }

    public org.telegram.ui.ActionBar.u5 getTextView() {
        return this.a;
    }

    public org.telegram.ui.ActionBar.u5 getValueTextView() {
        return this.b;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.d) {
            int i10 = this.e;
            if (i10 != 0) {
                org.telegram.ui.ActionBar.t6.l0.setColor(org.telegram.ui.ActionBar.t6.x0(null, i10, false));
            }
            canvas.drawLine(org.telegram.messenger.i0.L(71.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, this.e != 0 ? org.telegram.ui.ActionBar.t6.l0 : org.telegram.ui.ActionBar.t6.k0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = i13 - i11;
        int i15 = i12 - i10;
        org.telegram.ui.ActionBar.u5 u5Var = this.b;
        int textHeight = (i14 - u5Var.getTextHeight()) / 2;
        int L = cd.X ? org.telegram.messenger.i0.L(24.0f) : 0;
        u5Var.layout(L, textHeight, u5Var.getMeasuredWidth() + L, u5Var.getMeasuredHeight() + textHeight);
        org.telegram.ui.ActionBar.u5 u5Var2 = this.a;
        int textHeight2 = (i14 - u5Var2.getTextHeight()) / 2;
        int L2 = !cd.X ? org.telegram.messenger.i0.L(71.0f) : org.telegram.messenger.i0.L(24.0f);
        u5Var2.layout(L2, textHeight2, u5Var2.getMeasuredWidth() + L2, u5Var2.getMeasuredHeight() + textHeight2);
        int L3 = org.telegram.messenger.i0.L(9.0f);
        boolean z11 = cd.X;
        ImageView imageView = this.c;
        int L4 = !z11 ? org.telegram.messenger.i0.L(21.0f) : (i15 - imageView.getMeasuredWidth()) - org.telegram.messenger.i0.L(21.0f);
        imageView.layout(L4, L3, imageView.getMeasuredWidth() + L4, imageView.getMeasuredHeight() + L3);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int L = org.telegram.messenger.i0.L(48.0f);
        this.b.measure(z20.c(24.0f, size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(20.0f), TLObject.FLAG_30));
        this.a.measure(z20.c(95.0f, size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(20.0f), TLObject.FLAG_30));
        this.c.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(L, TLObject.FLAG_31));
        setMeasuredDimension(size, getFullHeight() + (this.d ? 1 : 0));
    }

    public void setDividerColor(int i10) {
        this.e = i10;
    }

    public void setTextColor(int i10) {
        this.a.setTextColor(i10);
    }
}
