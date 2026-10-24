package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ActionBarLayout b;

    public /* synthetic */ o(ActionBarLayout actionBarLayout, int i10) {
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
                actionBarLayout.v.requestLayout();
                actionBarLayout.w.requestLayout();
                break;
            case 2:
                if (actionBarLayout.a && actionBarLayout.getLastFragment() != null && actionBarLayout.s.getChildCount() == 0) {
                    if (BuildVars.DEBUG_VERSION) {
                        FileLog.e(new RuntimeException(TextUtils.join(", ", actionBarLayout.o1)));
                    }
                    actionBarLayout.V(true, true);
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
