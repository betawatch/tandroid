package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.cd;
import org.telegram.messenger.z20;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.RadioButton;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class x2 extends FrameLayout {
    public int a;
    public TextView b;
    public TextView c;
    public RadioButton d;
    public boolean e;
    public int f;

    public final void a(boolean z10, boolean z11) {
        RadioButton radioButton = this.d;
        TextView textView = this.c;
        TextView textView2 = this.b;
        setEnabled(z10);
        if (z11) {
            textView2.animate().alpha(z10 ? 1.0f : 0.5f).start();
            textView.animate().alpha(z10 ? 1.0f : 0.5f).start();
            radioButton.animate().alpha(z10 ? 1.0f : 0.5f).start();
        } else {
            textView2.setAlpha(z10 ? 1.0f : 0.5f);
            textView.setAlpha(z10 ? 1.0f : 0.5f);
            radioButton.setAlpha(z10 ? 1.0f : 0.5f);
        }
    }

    public final void b() {
        FrameLayout.LayoutParams d;
        FrameLayout.LayoutParams d10;
        TextView textView = this.b;
        TextView textView2 = this.c;
        if (textView2.getVisibility() == 0) {
            boolean z10 = cd.X;
            d = w7.b6.d(-1, -1.0f, (z10 ? 5 : 3) | 48, z10 ? this.f : 61.0f, 0.0f, z10 ? 61.0f : this.f, 0.0f);
        } else {
            boolean z11 = cd.X;
            d = w7.b6.d(-1, -1.0f, (z11 ? 5 : 3) | 48, z11 ? 61.0f : this.f, 0.0f, z11 ? this.f : 61.0f, 0.0f);
        }
        textView.setLayoutParams(d);
        RadioButton radioButton = this.d;
        if (textView2.getVisibility() == 0) {
            d10 = w7.b6.d(22, 22.0f, (cd.X ? 5 : 3) | 48, 20.0f, 15.0f, 20.0f, 0.0f);
        } else {
            d10 = w7.b6.d(22, 22.0f, (cd.X ? 3 : 5) | 48, 20.0f, 15.0f, 20.0f, 0.0f);
        }
        radioButton.setLayoutParams(d10);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.e) {
            canvas.drawLine(org.telegram.messenger.i0.L(cd.X ? 0.0f : this.f), getHeight() - 1, getMeasuredWidth() - org.telegram.messenger.i0.L(cd.X ? this.f : 0.0f), getHeight() - 1, org.telegram.ui.ActionBar.t6.k0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), org.telegram.messenger.i0.L(50.0f) + (this.e ? 1 : 0));
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        int i12 = this.f + 61;
        TextView textView = this.c;
        int L = measuredWidth - org.telegram.messenger.i0.L(i12 + (textView.getVisibility() == 0 ? 12 : 0));
        this.d.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(22.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(22.0f), TLObject.FLAG_30));
        if (textView.getVisibility() == 0) {
            textView.measure(View.MeasureSpec.makeMeasureSpec(L, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30));
            L = z20.w(12.0f, textView.getMeasuredWidth(), L);
        }
        this.b.measure(View.MeasureSpec.makeMeasureSpec(L, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30));
    }

    public void setHorizontalPadding(int i10) {
        TextView textView = this.c;
        if (this.f != i10) {
            this.f = i10;
            float f7 = i10;
            ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).leftMargin = org.telegram.messenger.i0.L(f7);
            ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).rightMargin = org.telegram.messenger.i0.L(f7);
            b();
        }
    }

    public void setTextColor(int i10) {
        this.b.setTextColor(i10);
    }
}
