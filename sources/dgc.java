// default package

import android.app.Activity;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.voip.VoIPServiceState;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class dgc extends LinearLayout {
    public final /* synthetic */ hgc a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dgc(hgc hgcVar, Activity activity) {
        super(activity);
        this.a = hgcVar;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        VoIPServiceState sharedState = VoIPService.getSharedState();
        CharSequence text = this.a.F.getText();
        if (sharedState == null || TextUtils.isEmpty(text)) {
            return;
        }
        StringBuilder sb = new StringBuilder(text);
        sb.append(", ");
        if (sharedState.getPrivateCall() == null || !sharedState.getPrivateCall().video) {
            sb.append(k96.M0(2131743058, null));
        } else {
            sb.append(k96.M0(2131743055, null));
        }
        long callDuration = sharedState.getCallDuration();
        if (callDuration > 0) {
            sb.append(", ");
            sb.append(k96.z((int) (callDuration / 1000)));
        }
        accessibilityNodeInfo.setText(sb);
    }
}
