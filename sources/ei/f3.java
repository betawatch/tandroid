package ei;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes4.dex */
public final class f3 extends org.telegram.ui.ActionBar.u0 {
    public final /* synthetic */ q3 x0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f3(q3 q3Var, Context context, org.telegram.ui.ActionBar.y yVar, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, yVar, 0, 0, false, g6Var);
        this.x0 = q3Var;
    }

    @Override // org.telegram.ui.ActionBar.u0, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setText(this.x0.y.getText());
    }
}
