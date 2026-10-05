package org.telegram.ui;

import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class o30 extends org.telegram.ui.Components.nj0 {
    public final /* synthetic */ h60 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o30(h60 h60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.r = h60Var;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
        h60 h60Var = this.r;
        int i10 = h60Var.F1;
        accessibilityNodeInfo.setEnabled(i10 == 0 || i10 == 1);
        if (h60Var.F1 == 1) {
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, LocaleController.getString(R.string.VoipMute)));
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        h60 h60Var = this.r;
        v20 v20Var = h60Var.y2;
        ArrayList arrayList = h60Var.Z1;
        if (h60Var.r1()) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent.getAction() == 0 && h60Var.F1 == 0 && h60Var.a1 != null) {
            AndroidUtilities.runOnUIThread(v20Var, 300L);
            h60Var.R1 = true;
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (h60Var.R1) {
                AndroidUtilities.cancelRunOnUIThread(v20Var);
                h60Var.R1 = false;
            } else if (h60Var.S1) {
                AndroidUtilities.cancelRunOnUIThread(h60Var.x2);
                h60Var.J1(0, true);
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setMicMute(true, true, false);
                    try {
                        h60Var.w.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                arrayList.clear();
                arrayList.addAll(h60Var.Y1);
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((org.telegram.ui.Components.voip.u) arrayList.get(i10)).j(true);
                }
                h60Var.S1 = false;
                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(obtain);
                obtain.recycle();
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
