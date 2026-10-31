package org.telegram.ui.Components;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import org.telegram.ui.m91;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class tl extends org.telegram.ui.ActionBar.t0 {
    public final /* synthetic */ Object A0;
    public final /* synthetic */ int z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tl(FrameLayout frameLayout, Context context, org.telegram.ui.ActionBar.y yVar, org.telegram.ui.ActionBar.p6 p6Var, int i10) {
        super(context, yVar, 0, 0, false, p6Var);
        this.z0 = i10;
        this.A0 = frameLayout;
    }

    @Override // org.telegram.ui.ActionBar.t0, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.z0) {
            case 0:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(((ChatAttachAlertPhotoLayout) this.A0).y.getText());
                break;
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(((jm) this.A0).y.getText());
                break;
            case 2:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(((m91) this.A0).h.getText());
                break;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(((vh.k2) this.A0).D.getText());
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tl(m91 m91Var, Context context, org.telegram.ui.ActionBar.y yVar) {
        super(context, yVar, 0);
        this.z0 = 2;
        this.A0 = m91Var;
    }
}
