package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.voip.VoIPServiceState;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class ei1 extends LinearLayout {
    public final /* synthetic */ ii1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ei1(ii1 ii1Var, Activity activity) {
        super(activity);
        this.a = ii1Var;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        VoIPServiceState sharedState = VoIPService.getSharedState();
        CharSequence text = this.a.B.getText();
        if (sharedState == null || TextUtils.isEmpty(text)) {
            return;
        }
        StringBuilder sb = new StringBuilder(text);
        sb.append(", ");
        if (sharedState.getPrivateCall() == null || !sharedState.getPrivateCall().video) {
            sb.append(LocaleController.getString(R.string.VoipInCallBranding));
        } else {
            sb.append(LocaleController.getString(R.string.VoipInVideoCallBranding));
        }
        long callDuration = sharedState.getCallDuration();
        if (callDuration > 0) {
            sb.append(", ");
            sb.append(LocaleController.formatDuration((int) (callDuration / 1000)));
        }
        accessibilityNodeInfo.setText(sb);
    }
}
