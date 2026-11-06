package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.voip.VoIPServiceState;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class ac1 extends LinearLayout {
    public final /* synthetic */ ec1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ac1(ec1 ec1Var, Activity activity) {
        super(activity);
        this.a = ec1Var;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        VoIPServiceState sharedState = VoIPService.getSharedState();
        CharSequence text = this.a.E.getText();
        if (sharedState == null || TextUtils.isEmpty(text)) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(text);
        sb2.append(", ");
        if (sharedState.getPrivateCall() == null || !sharedState.getPrivateCall().video) {
            sb2.append(org.telegram.messenger.hd.M0(2131743301, null));
        } else {
            sb2.append(org.telegram.messenger.hd.M0(2131743298, null));
        }
        long callDuration = sharedState.getCallDuration();
        if (callDuration > 0) {
            sb2.append(", ");
            sb2.append(org.telegram.messenger.hd.z((int) (callDuration / 1000)));
        }
        accessibilityNodeInfo.setText(sb2);
    }
}
