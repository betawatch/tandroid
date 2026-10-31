package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import org.telegram.messenger.f8;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class p implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ActionBarLayout b;

    public /* synthetic */ p(ActionBarLayout actionBarLayout, int i10) {
        this.a = i10;
        this.b = actionBarLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        ActionBarLayout actionBarLayout = this.b;
        switch (i10) {
            case 0:
                actionBarLayout.invalidate();
                break;
            case 1:
                actionBarLayout.requestLayout();
                actionBarLayout.s.requestLayout();
                actionBarLayout.w.requestLayout();
                actionBarLayout.x.requestLayout();
                break;
            case 2:
                if (actionBarLayout.a && actionBarLayout.getLastFragment() != null && actionBarLayout.s.getChildCount() == 0) {
                    boolean z10 = org.telegram.messenger.v2.a;
                    f8.g(new RuntimeException(TextUtils.join(", ", actionBarLayout.o1)), true);
                    actionBarLayout.W(true, true);
                    break;
                }
                break;
            case 3:
                Drawable drawable = ActionBarLayout.v1;
                actionBarLayout.G(false);
                break;
            case 4:
                Drawable drawable2 = ActionBarLayout.v1;
                actionBarLayout.G(false);
                break;
            default:
                actionBarLayout.H0.setVisibility(8);
                break;
        }
    }
}
