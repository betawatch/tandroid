package org.telegram.ui;

import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class o30 extends org.telegram.ui.Components.aj0 {
    public final /* synthetic */ j60 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o30(j60 j60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.r = j60Var;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
        j60 j60Var = this.r;
        int i10 = j60Var.F1;
        accessibilityNodeInfo.setEnabled(i10 == 0 || i10 == 1);
        if (j60Var.F1 == 1) {
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, LocaleController.getString(R.string.VoipMute)));
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        j60 j60Var = this.r;
        v20 v20Var = j60Var.y2;
        ArrayList arrayList = j60Var.Z1;
        if (j60Var.r1()) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent.getAction() == 0 && j60Var.F1 == 0 && j60Var.a1 != null) {
            AndroidUtilities.runOnUIThread(v20Var, 300L);
            j60Var.R1 = true;
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (j60Var.R1) {
                AndroidUtilities.cancelRunOnUIThread(v20Var);
                j60Var.R1 = false;
            } else if (j60Var.S1) {
                AndroidUtilities.cancelRunOnUIThread(j60Var.x2);
                j60Var.J1(0, true);
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setMicMute(true, true, false);
                    try {
                        j60Var.w.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                arrayList.clear();
                arrayList.addAll(j60Var.Y1);
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((org.telegram.ui.Components.voip.t) arrayList.get(i10)).j(true);
                }
                j60Var.S1 = false;
                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(obtain);
                obtain.recycle();
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
