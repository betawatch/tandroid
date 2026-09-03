package org.telegram.ui.Components;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.ui.jd1;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class wl extends org.telegram.ui.ActionBar.w0 {
    public final /* synthetic */ int s0;
    public final /* synthetic */ Object t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wl(ei eiVar, Context context, org.telegram.ui.ActionBar.z zVar, org.telegram.ui.ActionBar.g6 g6Var, int i10) {
        super(context, zVar, 0, 0, false, g6Var);
        this.s0 = i10;
        this.t0 = eiVar;
    }

    @Override // org.telegram.ui.ActionBar.w0, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.s0) {
            case 0:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(((ChatAttachAlertPhotoLayout) this.t0).x.getText());
                break;
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(((pm) this.t0).x.getText());
                break;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(((jd1) this.t0).h.getText());
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wl(jd1 jd1Var, Context context, org.telegram.ui.ActionBar.z zVar) {
        super(context, zVar, 0, 0);
        this.s0 = 2;
        this.t0 = jd1Var;
    }
}
