package org.telegram.ui;

import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class j30 extends org.telegram.ui.Components.jj0 {
    public final /* synthetic */ c60 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j30(c60 c60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.r = c60Var;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
        c60 c60Var = this.r;
        int i10 = c60Var.C1;
        accessibilityNodeInfo.setEnabled(i10 == 0 || i10 == 1);
        if (c60Var.C1 == 1) {
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, LocaleController.getString(R.string.VoipMute)));
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        c60 c60Var = this.r;
        p20 p20Var = c60Var.v2;
        ArrayList arrayList = c60Var.W1;
        if (c60Var.r1()) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent.getAction() == 0 && c60Var.C1 == 0 && c60Var.X0 != null) {
            AndroidUtilities.runOnUIThread(p20Var, 300L);
            c60Var.O1 = true;
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (c60Var.O1) {
                AndroidUtilities.cancelRunOnUIThread(p20Var);
                c60Var.O1 = false;
            } else if (c60Var.P1) {
                AndroidUtilities.cancelRunOnUIThread(c60Var.u2);
                c60Var.J1(0, true);
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setMicMute(true, true, false);
                    try {
                        c60Var.w.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                arrayList.clear();
                arrayList.addAll(c60Var.V1);
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((org.telegram.ui.Components.voip.t) arrayList.get(i10)).j(true);
                }
                c60Var.P1 = false;
                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(obtain);
                obtain.recycle();
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
