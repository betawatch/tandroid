package org.telegram.ui.Components;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.ui.oc1;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class pl extends org.telegram.ui.ActionBar.w0 {
    public final /* synthetic */ int r0;
    public final /* synthetic */ Object s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pl(ci ciVar, Context context, org.telegram.ui.ActionBar.z zVar, org.telegram.ui.ActionBar.b6 b6Var, int i9) {
        super(context, zVar, 0, 0, false, b6Var);
        this.r0 = i9;
        this.s0 = ciVar;
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
                accessibilityNodeInfo.setText(((hm) this.s0).x.getText());
                break;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(((oc1) this.s0).h.getText());
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pl(oc1 oc1Var, Context context, org.telegram.ui.ActionBar.z zVar) {
        super(context, zVar, 0, 0);
        this.r0 = 2;
        this.s0 = oc1Var;
    }
}
