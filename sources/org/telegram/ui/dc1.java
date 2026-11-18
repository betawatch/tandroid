package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.voip.VoIPServiceState;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class dc1 extends LinearLayout {
    public final /* synthetic */ hc1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dc1(hc1 hc1Var, Activity activity) {
        super(activity);
        this.a = hc1Var;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        VoIPServiceState sharedState = VoIPService.getSharedState();
        CharSequence text = this.a.F.getText();
        if (sharedState == null || TextUtils.isEmpty(text)) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(text);
        sb2.append(", ");
        if (sharedState.getPrivateCall() == null || !sharedState.getPrivateCall().video) {
            sb2.append(org.telegram.messenger.gd.M0(2131743063, null));
        } else {
            sb2.append(org.telegram.messenger.gd.M0(2131743060, null));
        }
        long callDuration = sharedState.getCallDuration();
        if (callDuration > 0) {
            sb2.append(", ");
            sb2.append(org.telegram.messenger.gd.z((int) (callDuration / 1000)));
        }
        accessibilityNodeInfo.setText(sb2);
    }
}
