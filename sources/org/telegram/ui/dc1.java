package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.voip.VoIPServiceState;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
