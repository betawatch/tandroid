package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class v4 extends FrameLayout {
    public boolean a;
    public int b;
    public h6 c;
    public h6 d;

    public h6 getSubtitleTextView() {
        return this.d;
    }

    public h6 getTitle() {
        return this.c;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        h6 h6Var = this.d;
        h6 h6Var2 = this.c;
        int y9 = org.telegram.messenger.camera.q.y(42.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 2) + (this.a ? org.telegram.messenger.g0.m : 0);
        int i13 = this.b;
        if (h6Var.getVisibility() != 8) {
            h6Var2.layout(i13, (org.telegram.messenger.g0.L(1.0f) + y9) - h6Var2.getPaddingTop(), h6Var2.getMeasuredWidth() + i13, h6Var2.getPaddingBottom() + ((org.telegram.messenger.g0.L(1.3f) + (h6Var2.getTextHeight() + y9)) - h6Var2.getPaddingTop()));
        } else {
            h6Var2.layout(i13, (org.telegram.messenger.g0.L(11.0f) + y9) - h6Var2.getPaddingTop(), h6Var2.getMeasuredWidth() + i13, h6Var2.getPaddingBottom() + ((org.telegram.messenger.g0.L(11.0f) + (h6Var2.getTextHeight() + y9)) - h6Var2.getPaddingTop()));
        }
        h6Var.layout(i13, org.telegram.messenger.g0.L(20.0f) + y9, h6Var.getMeasuredWidth() + i13, org.telegram.messenger.g0.L(24.0f) + h6Var.getTextHeight() + y9);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        int size = View.MeasureSpec.getSize(i3);
        h6 h6Var = this.c;
        int paddingRight = h6Var.getPaddingRight() + size;
        int L = paddingRight - org.telegram.messenger.g0.L(16.0f);
        h6Var.measure(View.MeasureSpec.makeMeasureSpec(L, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(h6Var.getPaddingRight() + org.telegram.messenger.g0.L(32.0f), TLObject.FLAG_31));
        this.d.measure(View.MeasureSpec.makeMeasureSpec(L, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), TLObject.FLAG_31));
        setMeasuredDimension(paddingRight, View.MeasureSpec.getSize(i10));
    }
}
