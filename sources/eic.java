// default package

import android.app.Activity;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.voip.VoIPServiceState;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class eic extends LinearLayout {
    public final /* synthetic */ iic a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eic(iic iicVar, Activity activity) {
        super(activity);
        this.a = iicVar;
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
            sb.append(jb6.M0(2131742984, null));
        } else {
            sb.append(jb6.M0(2131742981, null));
        }
        long callDuration = sharedState.getCallDuration();
        if (callDuration > 0) {
            sb.append(", ");
            sb.append(jb6.z((int) (callDuration / 1000)));
        }
        accessibilityNodeInfo.setText(sb);
    }
}
