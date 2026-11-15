package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import org.telegram.messenger.a8;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class o implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ActionBarLayout b;

    public /* synthetic */ o(ActionBarLayout actionBarLayout, int i7) {
        this.a = i7;
        this.b = actionBarLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        ActionBarLayout actionBarLayout = this.b;
        switch (i7) {
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
