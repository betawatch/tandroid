package org.telegram.ui.Components;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class qe extends View.AccessibilityDelegate {
    public final /* synthetic */ int a;

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.a) {
            case 0:
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName("android.widget.ImageButton");
                accessibilityNodeInfo.setClickable(true);
                accessibilityNodeInfo.setLongClickable(true);
                break;
            default:
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                if (view.isEnabled()) {
                    accessibilityNodeInfo.addAction(16);
                    break;
                }
                break;
        }
    }
}
