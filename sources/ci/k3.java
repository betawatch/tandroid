package ci;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes4.dex */
public final class k3 extends org.telegram.ui.ActionBar.v0 {
    public final /* synthetic */ w3 v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3(w3 w3Var, Context context, org.telegram.ui.ActionBar.z zVar, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, zVar, 0, 0, false, d6Var);
        this.v0 = w3Var;
    }

    @Override // org.telegram.ui.ActionBar.v0, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setText(this.v0.y.getText());
    }
}
