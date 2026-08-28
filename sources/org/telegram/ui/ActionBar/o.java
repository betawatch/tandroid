package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ActionBarLayout b;

    public /* synthetic */ o(ActionBarLayout actionBarLayout, int i9) {
        this.a = i9;
        this.b = actionBarLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i9 = this.a;
        ActionBarLayout actionBarLayout = this.b;
        switch (i9) {
            case 0:
                actionBarLayout.invalidate();
                break;
            case 1:
                actionBarLayout.requestLayout();
                actionBarLayout.s.requestLayout();
                actionBarLayout.v.requestLayout();
                actionBarLayout.w.requestLayout();
                break;
            case 2:
                if (actionBarLayout.a && actionBarLayout.getLastFragment() != null && actionBarLayout.s.getChildCount() == 0) {
                    if (BuildVars.DEBUG_VERSION) {
                        FileLog.e(new RuntimeException(TextUtils.join(", ", actionBarLayout.e1)));
                    }
                    actionBarLayout.U(true, true);
                    break;
                }
                break;
            case 3:
                Drawable drawable = ActionBarLayout.l1;
                actionBarLayout.F(false);
                break;
            case 4:
                Drawable drawable2 = ActionBarLayout.l1;
                actionBarLayout.F(false);
                break;
            default:
                actionBarLayout.x0.setVisibility(8);
                break;
        }
    }
}
