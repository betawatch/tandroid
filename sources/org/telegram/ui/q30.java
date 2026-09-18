package org.telegram.ui;

import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class q30 extends org.telegram.ui.Components.bj0 {
    public final /* synthetic */ k60 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q30(k60 k60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.r = k60Var;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
        k60 k60Var = this.r;
        int i10 = k60Var.F1;
        accessibilityNodeInfo.setEnabled(i10 == 0 || i10 == 1);
        if (k60Var.F1 == 1) {
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, LocaleController.getString(R.string.VoipMute)));
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        k60 k60Var = this.r;
        x20 x20Var = k60Var.y2;
        ArrayList arrayList = k60Var.Z1;
        if (k60Var.r1()) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent.getAction() == 0 && k60Var.F1 == 0 && k60Var.a1 != null) {
            AndroidUtilities.runOnUIThread(x20Var, 300L);
            k60Var.R1 = true;
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (k60Var.R1) {
                AndroidUtilities.cancelRunOnUIThread(x20Var);
                k60Var.R1 = false;
            } else if (k60Var.S1) {
                AndroidUtilities.cancelRunOnUIThread(k60Var.x2);
                k60Var.J1(0, true);
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setMicMute(true, true, false);
                    try {
                        k60Var.w.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                arrayList.clear();
                arrayList.addAll(k60Var.Y1);
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((org.telegram.ui.Components.voip.u) arrayList.get(i10)).j(true);
                }
                k60Var.S1 = false;
                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(obtain);
                obtain.recycle();
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
