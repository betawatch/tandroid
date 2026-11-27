// default package

import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class iq8 extends hr8 {
    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        nl nlVar;
        super.dispatchDraw(canvas);
        wl wlVar = this.e;
        if (wlVar == null || (nlVar = wlVar.k) == null) {
            return;
        }
        nlVar.w0(false);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (!getImageReceiver().E()) {
            accessibilityNodeInfo.setVisibleToUser(false);
            return;
        }
        accessibilityNodeInfo.setText(ob6.M0(2131754793, null));
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, ob6.M0(2131747544, null)));
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, ob6.M0(2131754813, null)));
    }
}
