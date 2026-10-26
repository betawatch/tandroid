package fi;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class d3 extends org.telegram.ui.ActionBar.w0 {
    public final /* synthetic */ o3 x0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d3(o3 o3Var, Context context, org.telegram.ui.ActionBar.z zVar, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, zVar, 0, 0, false, u6Var);
        this.x0 = o3Var;
    }

    @Override // org.telegram.ui.ActionBar.w0, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setText(this.x0.y.getText());
    }
}
