package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import org.telegram.messenger.a8;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ActionBarLayout b;

    public /* synthetic */ o(ActionBarLayout actionBarLayout, int i3) {
        this.a = i3;
        this.b = actionBarLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.a;
        ActionBarLayout actionBarLayout = this.b;
        switch (i3) {
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
                    boolean z10 = org.telegram.messenger.r2.a;
                    a8.g(new RuntimeException(TextUtils.join(", ", actionBarLayout.p1)), true);
                    actionBarLayout.X(true, true);
                    break;
                }
                break;
            case 3:
                Drawable drawable = ActionBarLayout.w1;
                actionBarLayout.H(false);
                break;
            case 4:
                Drawable drawable2 = ActionBarLayout.w1;
                actionBarLayout.H(false);
                break;
            default:
                actionBarLayout.I0.setVisibility(8);
                break;
        }
    }
}
