package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import b8.mf;
import org.telegram.messenger.bd;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.RadioButton;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class v2 extends FrameLayout {
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
            boolean z10 = bd.a0;
            d = mf.d(-1, -1.0f, (z10 ? 5 : 3) | 48, z10 ? this.f : 61.0f, 0.0f, z10 ? 61.0f : this.f, 0.0f);
        } else {
            boolean z11 = bd.a0;
            d = mf.d(-1, -1.0f, (z11 ? 5 : 3) | 48, z11 ? 61.0f : this.f, 0.0f, z11 ? this.f : 61.0f, 0.0f);
        }
        textView.setLayoutParams(d);
        RadioButton radioButton = this.d;
        if (textView2.getVisibility() == 0) {
            d10 = mf.d(22, 22.0f, (bd.a0 ? 5 : 3) | 48, 20.0f, 15.0f, 20.0f, 0.0f);
        } else {
            d10 = mf.d(22, 22.0f, (bd.a0 ? 3 : 5) | 48, 20.0f, 15.0f, 20.0f, 0.0f);
        }
        radioButton.setLayoutParams(d10);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.e) {
            canvas.drawLine(org.telegram.messenger.g0.L(bd.a0 ? 0.0f : this.f), getHeight() - 1, getMeasuredWidth() - org.telegram.messenger.g0.L(bd.a0 ? this.f : 0.0f), getHeight() - 1, org.telegram.ui.ActionBar.k6.k0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i3), org.telegram.messenger.g0.L(50.0f) + (this.e ? 1 : 0));
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

    public void setHorizontalPadding(int i3) {
        TextView textView = this.c;
        if (this.f != i3) {
            this.f = i3;
            float f10 = i3;
            ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).leftMargin = org.telegram.messenger.g0.L(f10);
            ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(f10);
            b();
        }
    }

    public void setTextColor(int i3) {
        this.b.setTextColor(i3);
    }
}
