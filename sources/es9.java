// default package

import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class es9 extends FrameLayout {
    public iba a;

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.a.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
    }
}
