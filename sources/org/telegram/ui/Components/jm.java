package org.telegram.ui.Components;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.ui.qc1;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class jm extends org.telegram.ui.ActionBar.u0 {
    public final /* synthetic */ int x0;
    public final /* synthetic */ Object y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jm(li liVar, Context context, org.telegram.ui.ActionBar.y yVar, org.telegram.ui.ActionBar.g6 g6Var, int i10) {
        super(context, yVar, 0, 0, false, g6Var);
        this.x0 = i10;
        this.y0 = liVar;
    }

    @Override // org.telegram.ui.ActionBar.u0, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.x0) {
            case 0:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(((ChatAttachAlertPhotoLayout) this.y0).x.getText());
                break;
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(((bn) this.y0).x.getText());
                break;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(((qc1) this.y0).h.getText());
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jm(qc1 qc1Var, Context context, org.telegram.ui.ActionBar.y yVar) {
        super(context, yVar, 0, 0);
        this.x0 = 2;
        this.y0 = qc1Var;
    }
}
