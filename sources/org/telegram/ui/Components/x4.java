package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class x4 extends FrameLayout {
    public boolean a;
    public int b;
    public j6 c;
    public j6 d;

    public j6 getSubtitleTextView() {
        return this.d;
    }

    public j6 getTitle() {
        return this.c;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        j6 j6Var = this.d;
        j6 j6Var2 = this.c;
        int y10 = org.telegram.messenger.camera.q.y(42.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 2) + (this.a ? org.telegram.messenger.g0.m : 0);
        int i13 = this.b;
        if (j6Var.getVisibility() != 8) {
            j6Var2.layout(i13, (org.telegram.messenger.g0.L(1.0f) + y10) - j6Var2.getPaddingTop(), j6Var2.getMeasuredWidth() + i13, j6Var2.getPaddingBottom() + ((org.telegram.messenger.g0.L(1.3f) + (j6Var2.getTextHeight() + y10)) - j6Var2.getPaddingTop()));
        } else {
            j6Var2.layout(i13, (org.telegram.messenger.g0.L(11.0f) + y10) - j6Var2.getPaddingTop(), j6Var2.getMeasuredWidth() + i13, j6Var2.getPaddingBottom() + ((org.telegram.messenger.g0.L(11.0f) + (j6Var2.getTextHeight() + y10)) - j6Var2.getPaddingTop()));
        }
        j6Var.layout(i13, org.telegram.messenger.g0.L(20.0f) + y10, j6Var.getMeasuredWidth() + i13, org.telegram.messenger.g0.L(24.0f) + j6Var.getTextHeight() + y10);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        j6 j6Var = this.c;
        int paddingRight = j6Var.getPaddingRight() + size;
        int L = paddingRight - org.telegram.messenger.g0.L(16.0f);
        j6Var.measure(View.MeasureSpec.makeMeasureSpec(L, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(j6Var.getPaddingRight() + org.telegram.messenger.g0.L(32.0f), TLObject.FLAG_31));
        this.d.measure(View.MeasureSpec.makeMeasureSpec(L, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), TLObject.FLAG_31));
        setMeasuredDimension(paddingRight, View.MeasureSpec.getSize(i10));
    }
}
