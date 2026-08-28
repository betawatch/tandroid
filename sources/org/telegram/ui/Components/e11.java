package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class e11 extends TextView {
    public View a;
    public ViewPropertyAnimator b;
    public boolean c;
    public tp0 d;

    public final void a() {
        if (this.a == null) {
            return;
        }
        View view = (View) getParent();
        int i9 = 0;
        int i10 = 0;
        for (View view2 = this.a; view2 != view; view2 = (View) view2.getParent()) {
            i10 += view2.getTop();
            i9 += view2.getLeft();
        }
        int width = ((this.a.getWidth() / 2) + i9) - (getMeasuredWidth() / 2);
        setTranslationX(width >= 0 ? getMeasuredWidth() + width > view.getMeasuredWidth() ? (view.getMeasuredWidth() - getMeasuredWidth()) - AndroidUtilities.dp(16.0f) : width : 0);
        setTranslationY(i10 - getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        a();
    }
}
