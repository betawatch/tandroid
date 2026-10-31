package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class u4 extends FrameLayout {
    public boolean a;
    public int b;
    public f6 c;
    public f6 d;

    public f6 getSubtitleTextView() {
        return this.d;
    }

    public f6 getTitle() {
        return this.c;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        f6 f6Var = this.d;
        f6 f6Var2 = this.c;
        int y3 = org.telegram.messenger.z20.y(42.0f, org.telegram.ui.ActionBar.l.getCurrentActionBarHeight(), 2) + (this.a ? org.telegram.messenger.i0.m : 0);
        int i14 = this.b;
        if (f6Var.getVisibility() != 8) {
            f6Var2.layout(i14, (org.telegram.messenger.i0.L(1.0f) + y3) - f6Var2.getPaddingTop(), f6Var2.getMeasuredWidth() + i14, f6Var2.getPaddingBottom() + ((org.telegram.messenger.i0.L(1.3f) + (f6Var2.getTextHeight() + y3)) - f6Var2.getPaddingTop()));
        } else {
            f6Var2.layout(i14, (org.telegram.messenger.i0.L(11.0f) + y3) - f6Var2.getPaddingTop(), f6Var2.getMeasuredWidth() + i14, f6Var2.getPaddingBottom() + ((org.telegram.messenger.i0.L(11.0f) + (f6Var2.getTextHeight() + y3)) - f6Var2.getPaddingTop()));
        }
        f6Var.layout(i14, org.telegram.messenger.i0.L(20.0f) + y3, f6Var.getMeasuredWidth() + i14, org.telegram.messenger.i0.L(24.0f) + f6Var.getTextHeight() + y3);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        f6 f6Var = this.c;
        int paddingRight = f6Var.getPaddingRight() + size;
        int L = paddingRight - org.telegram.messenger.i0.L(16.0f);
        f6Var.measure(View.MeasureSpec.makeMeasureSpec(L, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(f6Var.getPaddingRight() + org.telegram.messenger.i0.L(32.0f), TLObject.FLAG_31));
        this.d.measure(View.MeasureSpec.makeMeasureSpec(L, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(20.0f), TLObject.FLAG_31));
        setMeasuredDimension(paddingRight, View.MeasureSpec.getSize(i11));
    }
}
