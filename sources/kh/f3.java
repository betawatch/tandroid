package kh;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class f3 extends org.telegram.ui.ActionBar.w0 {
    public final /* synthetic */ q3 r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f3(q3 q3Var, Context context, org.telegram.ui.ActionBar.z zVar, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, zVar, 0, 0, false, b6Var);
        this.r0 = q3Var;
    }

    @Override // org.telegram.ui.ActionBar.w0, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setText(this.r0.y.getText());
    }
}
