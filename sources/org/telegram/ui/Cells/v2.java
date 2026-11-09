package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.id;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.RadioButton;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class v2 extends FrameLayout {
    public int a;
    public TextView b;
    public TextView c;
    public RadioButton d;
    public boolean e;
    public int f;

    public final void a(boolean z9, boolean z10) {
        RadioButton radioButton = this.d;
        TextView textView = this.c;
        TextView textView2 = this.b;
        setEnabled(z9);
        if (z10) {
            textView2.animate().alpha(z9 ? 1.0f : 0.5f).start();
            textView.animate().alpha(z9 ? 1.0f : 0.5f).start();
            radioButton.animate().alpha(z9 ? 1.0f : 0.5f).start();
        } else {
            textView2.setAlpha(z9 ? 1.0f : 0.5f);
            textView.setAlpha(z9 ? 1.0f : 0.5f);
            radioButton.setAlpha(z9 ? 1.0f : 0.5f);
        }
    }

    public final void b() {
        FrameLayout.LayoutParams d;
        FrameLayout.LayoutParams d2;
        TextView textView = this.b;
        TextView textView2 = this.c;
        if (textView2.getVisibility() == 0) {
            boolean z9 = id.a0;
            d = c8.ha.d(-1, -1.0f, (z9 ? 5 : 3) | 48, z9 ? this.f : 61.0f, 0.0f, z9 ? 61.0f : this.f, 0.0f);
        } else {
            boolean z10 = id.a0;
            d = c8.ha.d(-1, -1.0f, (z10 ? 5 : 3) | 48, z10 ? 61.0f : this.f, 0.0f, z10 ? this.f : 61.0f, 0.0f);
        }
        textView.setLayoutParams(d);
        RadioButton radioButton = this.d;
        if (textView2.getVisibility() == 0) {
            d2 = c8.ha.d(22, 22.0f, (id.a0 ? 5 : 3) | 48, 20.0f, 15.0f, 20.0f, 0.0f);
        } else {
            d2 = c8.ha.d(22, 22.0f, (id.a0 ? 3 : 5) | 48, 20.0f, 15.0f, 20.0f, 0.0f);
        }
        radioButton.setLayoutParams(d2);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.e) {
            canvas.drawLine(org.telegram.messenger.g0.L(id.a0 ? 0.0f : this.f), getHeight() - 1, getMeasuredWidth() - org.telegram.messenger.g0.L(id.a0 ? this.f : 0.0f), getHeight() - 1, org.telegram.ui.ActionBar.l6.k0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i7), org.telegram.messenger.g0.L(50.0f) + (this.e ? 1 : 0));
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        int i11 = this.f + 61;
        TextView textView = this.c;
        int L = measuredWidth - org.telegram.messenger.g0.L(i11 + (textView.getVisibility() == 0 ? 12 : 0));
        this.d.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(22.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(22.0f), TLObject.FLAG_30));
        if (textView.getVisibility() == 0) {
            textView.measure(View.MeasureSpec.makeMeasureSpec(L, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30));
            L = org.telegram.messenger.camera.q.w(12.0f, textView.getMeasuredWidth(), L);
        }
        this.b.measure(View.MeasureSpec.makeMeasureSpec(L, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30));
    }

    public void setHorizontalPadding(int i7) {
        TextView textView = this.c;
        if (this.f != i7) {
            this.f = i7;
            float f10 = i7;
            ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(f10);
            ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(f10);
            b();
        }
    }

    public void setTextColor(int i7) {
        this.b.setTextColor(i7);
    }
}
