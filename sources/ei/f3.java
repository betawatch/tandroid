package ei;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final class f3 extends org.telegram.ui.ActionBar.u0 {
    public final /* synthetic */ q3 v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f3(q3 q3Var, Context context, org.telegram.ui.ActionBar.y yVar, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, yVar, 0, 0, false, d6Var);
        this.v0 = q3Var;
    }

    @Override // org.telegram.ui.ActionBar.u0, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setText(this.v0.y.getText());
    }
}
