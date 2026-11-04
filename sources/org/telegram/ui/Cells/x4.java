package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.bd;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class x4 extends FrameLayout {
    public final org.telegram.ui.ActionBar.k5 a;
    public final org.telegram.ui.ActionBar.k5 b;
    public final ImageView c;
    public boolean d;
    public int e;

    public x4(Context context) {
        super(context);
        this.e = 0;
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.a = k5Var;
        org.telegram.ui.ActionBar.r6.Y(k5Var, org.telegram.ui.ActionBar.k6.G6, null);
        k5Var.setTextSize(16);
        k5Var.setGravity(bd.a0 ? 5 : 3);
        addView(k5Var);
        org.telegram.ui.ActionBar.k5 k5Var2 = new org.telegram.ui.ActionBar.k5(context);
        this.b = k5Var2;
        org.telegram.ui.ActionBar.r6.Y(k5Var2, org.telegram.ui.ActionBar.k6.I6, null);
        k5Var2.setTextSize(16);
        k5Var2.setGravity(bd.a0 ? 3 : 5);
        addView(k5Var2);
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.m6, null, PorterDuff.Mode.MULTIPLY);
        addView(imageView);
    }

    public final void a(int i3, int i10) {
        org.telegram.ui.ActionBar.k5 k5Var = this.a;
        org.telegram.ui.ActionBar.r6.Y(k5Var, i10, null);
        k5Var.setTag(Integer.valueOf(i10));
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        ImageView imageView = this.c;
        org.telegram.ui.ActionBar.r6.t(imageView, i3, null, mode);
        imageView.setTag(Integer.valueOf(i3));
    }

    public final void b(int i3, int i10, String str, boolean z10) {
        this.a.l(str, false);
        this.b.setVisibility(4);
        int L = org.telegram.messenger.g0.L(i10);
        ImageView imageView = this.c;
        imageView.setPadding(0, L, 0, 0);
        imageView.setImageResource(i3);
        this.d = z10;
        setWillNotDraw(!z10);
    }

    public int getFullHeight() {
        return org.telegram.messenger.g0.L(56.0f);
    }

    public org.telegram.ui.ActionBar.k5 getTextView() {
        return this.a;
    }

    public org.telegram.ui.ActionBar.k5 getValueTextView() {
        return this.b;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.d) {
            int i3 = this.e;
            if (i3 != 0) {
                org.telegram.ui.ActionBar.k6.l0.setColor(org.telegram.ui.ActionBar.k6.x0(null, i3, false));
            }
            canvas.drawLine(org.telegram.messenger.g0.L(71.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, this.e != 0 ? org.telegram.ui.ActionBar.k6.l0 : org.telegram.ui.ActionBar.k6.k0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        int i13 = i12 - i10;
        int i14 = i11 - i3;
        org.telegram.ui.ActionBar.k5 k5Var = this.b;
        int textHeight = (i13 - k5Var.getTextHeight()) / 2;
        int L = bd.a0 ? org.telegram.messenger.g0.L(24.0f) : 0;
        k5Var.layout(L, textHeight, k5Var.getMeasuredWidth() + L, k5Var.getMeasuredHeight() + textHeight);
        org.telegram.ui.ActionBar.k5 k5Var2 = this.a;
        int textHeight2 = (i13 - k5Var2.getTextHeight()) / 2;
        int L2 = !bd.a0 ? org.telegram.messenger.g0.L(71.0f) : org.telegram.messenger.g0.L(24.0f);
        k5Var2.layout(L2, textHeight2, k5Var2.getMeasuredWidth() + L2, k5Var2.getMeasuredHeight() + textHeight2);
        int L3 = org.telegram.messenger.g0.L(9.0f);
        boolean z11 = bd.a0;
        ImageView imageView = this.c;
        int L4 = !z11 ? org.telegram.messenger.g0.L(21.0f) : (i14 - imageView.getMeasuredWidth()) - org.telegram.messenger.g0.L(21.0f);
        imageView.layout(L4, L3, imageView.getMeasuredWidth() + L4, imageView.getMeasuredHeight() + L3);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        int size = View.MeasureSpec.getSize(i3);
        int L = org.telegram.messenger.g0.L(48.0f);
        this.b.measure(org.telegram.messenger.camera.q.c(24.0f, size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), TLObject.FLAG_30));
        this.a.measure(org.telegram.messenger.camera.q.c(95.0f, size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), TLObject.FLAG_30));
        this.c.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(L, TLObject.FLAG_31));
        setMeasuredDimension(size, getFullHeight() + (this.d ? 1 : 0));
    }

    public void setDividerColor(int i3) {
        this.e = i3;
    }

    public void setTextColor(int i3) {
        this.a.setTextColor(i3);
    }
}
