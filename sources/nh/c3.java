package nh;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class c3 extends org.telegram.ui.ActionBar.w0 {
    public final /* synthetic */ n3 r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3(n3 n3Var, Context context, org.telegram.ui.ActionBar.a0 a0Var, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, a0Var, 0, 0, false, c6Var);
        this.r0 = n3Var;
    }

    @Override // org.telegram.ui.ActionBar.w0, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setText(this.r0.y.getText());
    }
}
