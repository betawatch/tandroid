package org.telegram.ui;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class fs0 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ PopupNotificationActivity b;

    public /* synthetic */ fs0(PopupNotificationActivity popupNotificationActivity, int i7) {
        this.a = i7;
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
                int z10 = org.telegram.messenger.n10.z(48.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 2);
                FrameLayout frameLayout2 = popupNotificationActivity.f;
                frameLayout2.setPadding(frameLayout2.getPaddingLeft(), z10, popupNotificationActivity.f.getPaddingRight(), z10);
                break;
            default:
                PopupNotificationActivity popupNotificationActivity2 = this.b;
                popupNotificationActivity2.n.getViewTreeObserver().removeOnPreDrawListener(this);
                if (!popupNotificationActivity2.c() && !popupNotificationActivity2.Y) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) popupNotificationActivity2.n.getLayoutParams();
                    marginLayoutParams.topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    marginLayoutParams.bottomMargin = org.telegram.messenger.g0.L(48.0f);
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
