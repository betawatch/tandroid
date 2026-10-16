package di;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class j3 extends org.telegram.ui.ActionBar.u0 {
    public final /* synthetic */ v3 v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j3(v3 v3Var, Context context, org.telegram.ui.ActionBar.y yVar, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, yVar, 0, 0, false, c6Var);
        this.v0 = v3Var;
    }

    @Override // org.telegram.ui.ActionBar.u0, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setText(this.v0.y.getText());
    }
}
