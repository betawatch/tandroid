// default package

import android.app.Activity;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.voip.VoIPServiceState;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class ikc extends LinearLayout {
    public final /* synthetic */ mkc a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ikc(mkc mkcVar, Activity activity) {
        super(activity);
        this.a = mkcVar;
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
            sb.append(ob6.M0(2131742952, null));
        } else {
            sb.append(ob6.M0(2131742949, null));
        }
        long callDuration = sharedState.getCallDuration();
        if (callDuration > 0) {
            sb.append(", ");
            sb.append(ob6.z((int) (callDuration / 1000)));
        }
        accessibilityNodeInfo.setText(sb);
    }
}
