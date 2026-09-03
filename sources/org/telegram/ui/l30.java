package org.telegram.ui;

import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class l30 extends org.telegram.ui.Components.jj0 {
    public final /* synthetic */ e60 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l30(e60 e60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.r = e60Var;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
        e60 e60Var = this.r;
        int i10 = e60Var.C1;
        accessibilityNodeInfo.setEnabled(i10 == 0 || i10 == 1);
        if (e60Var.C1 == 1) {
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, LocaleController.getString(R.string.VoipMute)));
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        e60 e60Var = this.r;
        r20 r20Var = e60Var.v2;
        ArrayList arrayList = e60Var.W1;
        if (e60Var.r1()) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent.getAction() == 0 && e60Var.C1 == 0 && e60Var.X0 != null) {
            AndroidUtilities.runOnUIThread(r20Var, 300L);
            e60Var.O1 = true;
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (e60Var.O1) {
                AndroidUtilities.cancelRunOnUIThread(r20Var);
                e60Var.O1 = false;
            } else if (e60Var.P1) {
                AndroidUtilities.cancelRunOnUIThread(e60Var.u2);
                e60Var.J1(0, true);
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setMicMute(true, true, false);
                    try {
                        e60Var.w.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                arrayList.clear();
                arrayList.addAll(e60Var.V1);
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((org.telegram.ui.Components.voip.t) arrayList.get(i10)).j(true);
                }
                e60Var.P1 = false;
                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(obtain);
                obtain.recycle();
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
