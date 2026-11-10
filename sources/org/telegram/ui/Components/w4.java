package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class w4 extends FrameLayout {
    public boolean a;
    public int b;
    public i6 c;
    public i6 d;

    public i6 getSubtitleTextView() {
        return this.d;
    }

    public i6 getTitle() {
        return this.c;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        i6 i6Var = this.d;
        i6 i6Var2 = this.c;
        int y10 = org.telegram.messenger.camera.q.y(42.0f, org.telegram.ui.ActionBar.l.getCurrentActionBarHeight(), 2) + (this.a ? org.telegram.messenger.g0.m : 0);
        int i13 = this.b;
        if (i6Var.getVisibility() != 8) {
            i6Var2.layout(i13, (org.telegram.messenger.g0.L(1.0f) + y10) - i6Var2.getPaddingTop(), i6Var2.getMeasuredWidth() + i13, i6Var2.getPaddingBottom() + ((org.telegram.messenger.g0.L(1.3f) + (i6Var2.getTextHeight() + y10)) - i6Var2.getPaddingTop()));
        } else {
            i6Var2.layout(i13, (org.telegram.messenger.g0.L(11.0f) + y10) - i6Var2.getPaddingTop(), i6Var2.getMeasuredWidth() + i13, i6Var2.getPaddingBottom() + ((org.telegram.messenger.g0.L(11.0f) + (i6Var2.getTextHeight() + y10)) - i6Var2.getPaddingTop()));
        }
        i6Var.layout(i13, org.telegram.messenger.g0.L(20.0f) + y10, i6Var.getMeasuredWidth() + i13, org.telegram.messenger.g0.L(24.0f) + i6Var.getTextHeight() + y10);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        i6 i6Var = this.c;
        int paddingRight = i6Var.getPaddingRight() + size;
        int L = paddingRight - org.telegram.messenger.g0.L(16.0f);
        i6Var.measure(View.MeasureSpec.makeMeasureSpec(L, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(i6Var.getPaddingRight() + org.telegram.messenger.g0.L(32.0f), TLObject.FLAG_31));
        this.d.measure(View.MeasureSpec.makeMeasureSpec(L, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), TLObject.FLAG_31));
        setMeasuredDimension(paddingRight, View.MeasureSpec.getSize(i10));
    }
}
