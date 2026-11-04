package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class c01 extends TextView {
    public View a;
    public ViewPropertyAnimator b;
    public boolean c;
    public sp0 d;

    public final void a() {
        if (this.a == null) {
            return;
        }
        View view = (View) getParent();
        int i3 = 0;
        int i10 = 0;
        for (View view2 = this.a; view2 != view; view2 = (View) view2.getParent()) {
            i10 += view2.getTop();
            i3 += view2.getLeft();
        }
        int width = ((this.a.getWidth() / 2) + i3) - (getMeasuredWidth() / 2);
        setTranslationX(width >= 0 ? getMeasuredWidth() + width > view.getMeasuredWidth() ? (view.getMeasuredWidth() - getMeasuredWidth()) - org.telegram.messenger.g0.L(16.0f) : width : 0);
        setTranslationY(i10 - getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        a();
    }
}
