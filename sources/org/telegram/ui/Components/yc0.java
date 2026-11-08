package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class yc0 extends FrameLayout {
    public TextView a;
    public TextView b;
    public ImageView c;
    public Switch d;
    public boolean e;

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        Switch r02 = this.d;
        if (r02 != null) {
            r02.invalidate();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.e) {
            canvas.drawLine(org.telegram.messenger.id.a0 ? 0.0f : org.telegram.messenger.g0.L(70.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (org.telegram.messenger.id.a0 ? org.telegram.messenger.g0.L(70.0f) : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.k0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        int L = org.telegram.messenger.g0.L(13.0f) + this.a.getMeasuredHeight();
        TextView textView = this.b;
        textView.layout(textView.getLeft(), L, textView.getRight(), textView.getMeasuredHeight() + L);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        TextView textView = this.a;
        measureChildWithMargins(textView, i7, 0, i10, 0);
        TextView textView2 = this.b;
        measureChildWithMargins(textView2, i7, 0, i10, 0);
        measureChildWithMargins(this.c, i7, 0, i10, 0);
        Switch r72 = this.d;
        if (r72 != null) {
            measureChildWithMargins(r72, i7, 0, i10, 0);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i7), org.telegram.messenger.k5.b(20.0f, textView2.getMeasuredHeight() + textView.getMeasuredHeight(), org.telegram.messenger.g0.L(64.0f)) + (this.e ? 1 : 0));
    }

    public void setChecked(boolean z9) {
        Switch r02 = this.d;
        if (r02 != null) {
            r02.c(z9, true);
        }
    }
}
