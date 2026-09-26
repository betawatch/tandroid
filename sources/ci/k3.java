package ci;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes4.dex */
public final class k3 extends org.telegram.ui.ActionBar.u0 {
    public final /* synthetic */ w3 v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3(w3 w3Var, Context context, org.telegram.ui.ActionBar.y yVar, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, yVar, 0, 0, false, d6Var);
        this.v0 = w3Var;
    }

    @Override // org.telegram.ui.ActionBar.u0, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setText(this.v0.y.getText());
    }
}
