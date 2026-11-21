package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class e5 extends FrameLayout {
    public boolean a;
    public int b;
    public o6 c;
    public o6 d;

    public o6 getSubtitleTextView() {
        return this.d;
    }

    public o6 getTitle() {
        return this.c;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        o6 o6Var = this.d;
        o6 o6Var2 = this.c;
        int z11 = org.telegram.messenger.n10.z(42.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 2) + (this.a ? org.telegram.messenger.g0.m : 0);
        int i13 = this.b;
        if (o6Var.getVisibility() != 8) {
            o6Var2.layout(i13, (org.telegram.messenger.g0.L(1.0f) + z11) - o6Var2.getPaddingTop(), o6Var2.getMeasuredWidth() + i13, o6Var2.getPaddingBottom() + ((org.telegram.messenger.g0.L(1.3f) + (o6Var2.getTextHeight() + z11)) - o6Var2.getPaddingTop()));
        } else {
            o6Var2.layout(i13, (org.telegram.messenger.g0.L(11.0f) + z11) - o6Var2.getPaddingTop(), o6Var2.getMeasuredWidth() + i13, o6Var2.getPaddingBottom() + ((org.telegram.messenger.g0.L(11.0f) + (o6Var2.getTextHeight() + z11)) - o6Var2.getPaddingTop()));
        }
        o6Var.layout(i13, org.telegram.messenger.g0.L(20.0f) + z11, o6Var.getMeasuredWidth() + i13, org.telegram.messenger.g0.L(24.0f) + o6Var.getTextHeight() + z11);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        o6 o6Var = this.c;
        int paddingRight = o6Var.getPaddingRight() + size;
        int L = paddingRight - org.telegram.messenger.g0.L(16.0f);
        o6Var.measure(View.MeasureSpec.makeMeasureSpec(L, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(o6Var.getPaddingRight() + org.telegram.messenger.g0.L(32.0f), TLObject.FLAG_31));
        this.d.measure(View.MeasureSpec.makeMeasureSpec(L, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), TLObject.FLAG_31));
        setMeasuredDimension(paddingRight, View.MeasureSpec.getSize(i10));
    }
}
