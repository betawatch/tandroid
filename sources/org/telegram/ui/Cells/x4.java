package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.id;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public class x4 extends FrameLayout {
    public final org.telegram.ui.ActionBar.m5 a;
    public final org.telegram.ui.ActionBar.m5 b;
    public final ImageView c;
    public boolean d;
    public int e;
    public int f;

    public x4(Context context) {
        super(context);
        this.e = 0;
        this.f = 71;
        org.telegram.ui.ActionBar.m5 m5Var = new org.telegram.ui.ActionBar.m5(context);
        this.a = m5Var;
        org.telegram.ui.ActionBar.t6.X(m5Var, org.telegram.ui.ActionBar.m6.G6, null);
        m5Var.setTextSize(16);
        m5Var.setGravity(id.a0 ? 5 : 3);
        addView(m5Var);
        org.telegram.ui.ActionBar.m5 m5Var2 = new org.telegram.ui.ActionBar.m5(context);
        this.b = m5Var2;
        org.telegram.ui.ActionBar.t6.X(m5Var2, org.telegram.ui.ActionBar.m6.I6, null);
        m5Var2.setTextSize(16);
        m5Var2.setGravity(id.a0 ? 3 : 5);
        addView(m5Var2);
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.t6.s(imageView, org.telegram.ui.ActionBar.m6.m6, null, PorterDuff.Mode.MULTIPLY);
        addView(imageView);
    }

    public final void a(int i7, int i10) {
        org.telegram.ui.ActionBar.m5 m5Var = this.a;
        org.telegram.ui.ActionBar.t6.X(m5Var, i10, null);
        m5Var.setTag(Integer.valueOf(i10));
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        ImageView imageView = this.c;
        org.telegram.ui.ActionBar.t6.s(imageView, i7, null, mode);
        imageView.setTag(Integer.valueOf(i7));
    }

    public final void b(int i7, int i10, String str, boolean z9) {
        this.a.l(str, false);
        this.b.setVisibility(4);
        int L = org.telegram.messenger.g0.L(i10);
        ImageView imageView = this.c;
        imageView.setPadding(0, L, 0, 0);
        imageView.setImageResource(i7);
        this.d = z9;
        setWillNotDraw(!z9);
    }

    public int getFullHeight() {
        return org.telegram.messenger.g0.L(56.0f);
    }

    public org.telegram.ui.ActionBar.m5 getTextView() {
        return this.a;
    }

    public org.telegram.ui.ActionBar.m5 getValueTextView() {
        return this.b;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.d) {
            int i7 = this.e;
            if (i7 != 0) {
                org.telegram.ui.ActionBar.m6.l0.setColor(org.telegram.ui.ActionBar.m6.x0(null, i7, false));
            }
            canvas.drawLine(org.telegram.messenger.g0.L(this.f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, this.e != 0 ? org.telegram.ui.ActionBar.m6.l0 : org.telegram.ui.ActionBar.m6.k0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int i13 = i12 - i10;
        int i14 = i11 - i7;
        org.telegram.ui.ActionBar.m5 m5Var = this.b;
        int textHeight = (i13 - m5Var.getTextHeight()) / 2;
        int L = id.a0 ? org.telegram.messenger.g0.L(24.0f) : 0;
        m5Var.layout(L, textHeight, m5Var.getMeasuredWidth() + L, m5Var.getMeasuredHeight() + textHeight);
        org.telegram.ui.ActionBar.m5 m5Var2 = this.a;
        int textHeight2 = (i13 - m5Var2.getTextHeight()) / 2;
        int L2 = !id.a0 ? org.telegram.messenger.g0.L(this.f) : org.telegram.messenger.g0.L(24.0f);
        m5Var2.layout(L2, textHeight2, m5Var2.getMeasuredWidth() + L2, m5Var2.getMeasuredHeight() + textHeight2);
        int L3 = org.telegram.messenger.g0.L(9.0f);
        boolean z10 = id.a0;
        ImageView imageView = this.c;
        int L4 = !z10 ? org.telegram.messenger.g0.L(21.0f) : (i14 - imageView.getMeasuredWidth()) - org.telegram.messenger.g0.L(21.0f);
        imageView.layout(L4, L3, imageView.getMeasuredWidth() + L4, imageView.getMeasuredHeight() + L3);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        int L = org.telegram.messenger.g0.L(48.0f);
        this.b.measure(org.telegram.messenger.camera.q.c(24.0f, size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), TLObject.FLAG_30));
        this.a.measure(org.telegram.messenger.camera.q.c(this.f + 24, size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), TLObject.FLAG_30));
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
