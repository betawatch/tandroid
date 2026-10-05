package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class lw0 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ PopupNotificationActivity b;

    public /* synthetic */ lw0(PopupNotificationActivity popupNotificationActivity, int i10) {
        this.a = i10;
        this.b = popupNotificationActivity;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        switch (this.a) {
            case 0:
                PopupNotificationActivity popupNotificationActivity = this.b;
                FrameLayout frameLayout = popupNotificationActivity.f;
                if (frameLayout != null) {
                    frameLayout.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                int z10 = org.telegram.messenger.bi.z(48.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 2);
                FrameLayout frameLayout2 = popupNotificationActivity.f;
                frameLayout2.setPadding(frameLayout2.getPaddingLeft(), z10, popupNotificationActivity.f.getPaddingRight(), z10);
                break;
            default:
                PopupNotificationActivity popupNotificationActivity2 = this.b;
                popupNotificationActivity2.n.getViewTreeObserver().removeOnPreDrawListener(this);
                if (!popupNotificationActivity2.c() && !popupNotificationActivity2.X) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) popupNotificationActivity2.n.getLayoutParams();
                    marginLayoutParams.topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    marginLayoutParams.bottomMargin = AndroidUtilities.dp(48.0f);
                    marginLayoutParams.width = -1;
                    marginLayoutParams.height = -1;
                    popupNotificationActivity2.n.setLayoutParams(marginLayoutParams);
                    popupNotificationActivity2.a(0);
                    break;
                }
                break;
        }
        return true;
    }
}
