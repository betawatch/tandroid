package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class x11 extends TextView {
    public View a;
    public ViewPropertyAnimator b;
    public boolean c;
    public jq0 d;

    public final void a() {
        if (this.a == null) {
            return;
        }
        View view = (View) getParent();
        int i10 = 0;
        int i11 = 0;
        for (View view2 = this.a; view2 != view; view2 = (View) view2.getParent()) {
            i11 += view2.getTop();
            i10 += view2.getLeft();
        }
        int width = ((this.a.getWidth() / 2) + i10) - (getMeasuredWidth() / 2);
        setTranslationX(width >= 0 ? getMeasuredWidth() + width > view.getMeasuredWidth() ? (view.getMeasuredWidth() - getMeasuredWidth()) - AndroidUtilities.dp(16.0f) : width : 0);
        setTranslationY(i11 - getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        a();
    }
}
