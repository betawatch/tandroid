package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class d5 extends FrameLayout {
    public boolean a;
    public int b;
    public n6 c;
    public n6 d;

    public n6 getSubtitleTextView() {
        return this.d;
    }

    public n6 getTitle() {
        return this.c;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        n6 n6Var = this.d;
        n6 n6Var2 = this.c;
        int z11 = org.telegram.messenger.m10.z(42.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 2) + (this.a ? org.telegram.messenger.g0.m : 0);
        int i13 = this.b;
        if (n6Var.getVisibility() != 8) {
            n6Var2.layout(i13, (org.telegram.messenger.g0.L(1.0f) + z11) - n6Var2.getPaddingTop(), n6Var2.getMeasuredWidth() + i13, n6Var2.getPaddingBottom() + ((org.telegram.messenger.g0.L(1.3f) + (n6Var2.getTextHeight() + z11)) - n6Var2.getPaddingTop()));
        } else {
            n6Var2.layout(i13, (org.telegram.messenger.g0.L(11.0f) + z11) - n6Var2.getPaddingTop(), n6Var2.getMeasuredWidth() + i13, n6Var2.getPaddingBottom() + ((org.telegram.messenger.g0.L(11.0f) + (n6Var2.getTextHeight() + z11)) - n6Var2.getPaddingTop()));
        }
        n6Var.layout(i13, org.telegram.messenger.g0.L(20.0f) + z11, n6Var.getMeasuredWidth() + i13, org.telegram.messenger.g0.L(24.0f) + n6Var.getTextHeight() + z11);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        n6 n6Var = this.c;
        int paddingRight = n6Var.getPaddingRight() + size;
        int L = paddingRight - org.telegram.messenger.g0.L(16.0f);
        n6Var.measure(View.MeasureSpec.makeMeasureSpec(L, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(n6Var.getPaddingRight() + org.telegram.messenger.g0.L(32.0f), TLObject.FLAG_31));
        this.d.measure(View.MeasureSpec.makeMeasureSpec(L, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), TLObject.FLAG_31));
        setMeasuredDimension(paddingRight, View.MeasureSpec.getSize(i10));
    }
}
