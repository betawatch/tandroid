package ci;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final class l3 extends org.telegram.ui.ActionBar.w0 {
    public final /* synthetic */ x3 v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3(x3 x3Var, Context context, org.telegram.ui.ActionBar.a0 a0Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, a0Var, 0, 0, false, f6Var);
        this.v0 = x3Var;
    }

    @Override // org.telegram.ui.ActionBar.w0, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setText(this.v0.y.getText());
    }
}
