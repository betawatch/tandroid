package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class d01 extends TextView {
    public View a;
    public ViewPropertyAnimator b;
    public boolean c;
    public ir0 d;

    public final void a() {
        if (this.a == null) {
            return;
        }
        View view = (View) getParent();
        int i7 = 0;
        int i10 = 0;
        for (View view2 = this.a; view2 != view; view2 = (View) view2.getParent()) {
            i10 += view2.getTop();
            i7 += view2.getLeft();
        }
        int width = ((this.a.getWidth() / 2) + i7) - (getMeasuredWidth() / 2);
        setTranslationX(width >= 0 ? getMeasuredWidth() + width > view.getMeasuredWidth() ? (view.getMeasuredWidth() - getMeasuredWidth()) - org.telegram.messenger.g0.L(16.0f) : width : 0);
        setTranslationY(i10 - getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        a();
    }
}
