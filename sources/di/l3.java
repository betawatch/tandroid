package di;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class l3 extends org.telegram.ui.ActionBar.v0 {
    public final /* synthetic */ x3 v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3(x3 x3Var, Context context, org.telegram.ui.ActionBar.z zVar, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, zVar, 0, 0, false, f6Var);
        this.v0 = x3Var;
    }

    @Override // org.telegram.ui.ActionBar.v0, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setText(this.v0.y.getText());
    }
}
