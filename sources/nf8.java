// default package

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.PopupNotificationActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class nf8 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ PopupNotificationActivity b;

    public /* synthetic */ nf8(PopupNotificationActivity popupNotificationActivity, byte b) {
        this.a = b;
        this.b = popupNotificationActivity;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        byte b = this.a;
        PopupNotificationActivity popupNotificationActivity = this.b;
        switch (b) {
            case 0:
                FrameLayout frameLayout = popupNotificationActivity.f;
                if (frameLayout != null) {
                    frameLayout.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                int D = ug8.D(48.0f, a.getCurrentActionBarHeight(), 2);
                FrameLayout frameLayout2 = popupNotificationActivity.f;
                frameLayout2.setPadding(frameLayout2.getPaddingLeft(), D, popupNotificationActivity.f.getPaddingRight(), D);
                break;
            default:
                popupNotificationActivity.n.getViewTreeObserver().removeOnPreDrawListener(this);
                if (!popupNotificationActivity.c() && !popupNotificationActivity.Y) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) popupNotificationActivity.n.getLayoutParams();
                    marginLayoutParams.topMargin = a.getCurrentActionBarHeight();
                    marginLayoutParams.bottomMargin = gl.L(48.0f);
                    marginLayoutParams.width = -1;
                    marginLayoutParams.height = -1;
                    popupNotificationActivity.n.setLayoutParams(marginLayoutParams);
                    popupNotificationActivity.a(0);
                    break;
                }
                break;
        }
        return true;
    }
}
