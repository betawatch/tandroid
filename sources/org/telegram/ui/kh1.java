package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.voip.VoIPServiceState;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class kh1 extends LinearLayout {
    public final /* synthetic */ oh1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kh1(oh1 oh1Var, Activity activity) {
        super(activity);
        this.a = oh1Var;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        VoIPServiceState sharedState = VoIPService.getSharedState();
        CharSequence text = this.a.A.getText();
        if (sharedState == null || TextUtils.isEmpty(text)) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(text);
        sb2.append(", ");
        if (sharedState.getPrivateCall() == null || !sharedState.getPrivateCall().video) {
            sb2.append(LocaleController.getString(R.string.VoipInCallBranding));
        } else {
            sb2.append(LocaleController.getString(R.string.VoipInVideoCallBranding));
        }
        long callDuration = sharedState.getCallDuration();
        if (callDuration > 0) {
            sb2.append(", ");
            sb2.append(LocaleController.formatDuration((int) (callDuration / 1000)));
        }
        accessibilityNodeInfo.setText(sb2);
    }
}
