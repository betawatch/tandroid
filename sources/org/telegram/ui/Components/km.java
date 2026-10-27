package org.telegram.ui.Components;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.ui.vc1;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class km extends org.telegram.ui.ActionBar.w0 {
    public final /* synthetic */ int x0;
    public final /* synthetic */ Object y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ km(li liVar, Context context, org.telegram.ui.ActionBar.z zVar, org.telegram.ui.ActionBar.u6 u6Var, int i10) {
        super(context, zVar, 0, 0, false, u6Var);
        this.x0 = i10;
        this.y0 = liVar;
    }

    @Override // org.telegram.ui.ActionBar.w0, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.x0) {
            case 0:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(((ChatAttachAlertPhotoLayout) this.y0).x.getText());
                break;
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(((cn) this.y0).x.getText());
                break;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(((vc1) this.y0).h.getText());
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public km(vc1 vc1Var, Context context, org.telegram.ui.ActionBar.z zVar) {
        super(context, zVar, 0);
        this.x0 = 2;
        this.y0 = vc1Var;
    }
}
