package lh;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class e3 extends org.telegram.ui.ActionBar.v0 {
    public final /* synthetic */ p3 r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e3(p3 p3Var, Context context, org.telegram.ui.ActionBar.z zVar, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, zVar, 0, 0, false, c6Var);
        this.r0 = p3Var;
    }

    @Override // org.telegram.ui.ActionBar.v0, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setText(this.r0.y.getText());
    }
}
