package org.telegram.ui;

import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class c30 extends org.telegram.ui.Components.bk0 {
    public final /* synthetic */ x50 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c30(x50 x50Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.r = x50Var;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
        x50 x50Var = this.r;
        int i10 = x50Var.F1;
        accessibilityNodeInfo.setEnabled(i10 == 0 || i10 == 1);
        if (x50Var.F1 == 1) {
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, LocaleController.getString(R.string.VoipMute)));
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        x50 x50Var = this.r;
        j20 j20Var = x50Var.y2;
        ArrayList arrayList = x50Var.Z1;
        if (x50Var.r1()) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent.getAction() == 0 && x50Var.F1 == 0 && x50Var.a1 != null) {
            AndroidUtilities.runOnUIThread(j20Var, 300L);
            x50Var.R1 = true;
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (x50Var.R1) {
                AndroidUtilities.cancelRunOnUIThread(j20Var);
                x50Var.R1 = false;
            } else if (x50Var.S1) {
                AndroidUtilities.cancelRunOnUIThread(x50Var.x2);
                x50Var.K1(0, true);
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setMicMute(true, true, false);
                    try {
                        x50Var.w.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                arrayList.clear();
                arrayList.addAll(x50Var.Y1);
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((org.telegram.ui.Components.voip.t) arrayList.get(i10)).j(true);
                }
                x50Var.S1 = false;
                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(obtain);
                obtain.recycle();
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
