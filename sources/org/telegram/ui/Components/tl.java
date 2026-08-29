package org.telegram.ui.Components;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.ui.qc1;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class tl extends org.telegram.ui.ActionBar.w0 {
    public final /* synthetic */ int r0;
    public final /* synthetic */ Object s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tl(fi fiVar, Context context, org.telegram.ui.ActionBar.a0 a0Var, org.telegram.ui.ActionBar.c6 c6Var, int i10) {
        super(context, a0Var, 0, 0, false, c6Var);
        this.r0 = i10;
        this.s0 = fiVar;
    }

    @Override // org.telegram.ui.ActionBar.w0, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.r0) {
            case 0:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(((ChatAttachAlertPhotoLayout) this.s0).x.getText());
                break;
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(((lm) this.s0).x.getText());
                break;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(((qc1) this.s0).h.getText());
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tl(qc1 qc1Var, Context context, org.telegram.ui.ActionBar.a0 a0Var) {
        super(context, a0Var, 0, 0);
        this.r0 = 2;
        this.s0 = qc1Var;
    }
}
