package org.telegram.ui;

import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class l30 extends org.telegram.ui.Components.bj0 {
    public final /* synthetic */ f60 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l30(f60 f60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.r = f60Var;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
        f60 f60Var = this.r;
        int i10 = f60Var.F1;
        accessibilityNodeInfo.setEnabled(i10 == 0 || i10 == 1);
        if (f60Var.F1 == 1) {
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, LocaleController.getString(R.string.VoipMute)));
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        f60 f60Var = this.r;
        s20 s20Var = f60Var.y2;
        ArrayList arrayList = f60Var.Z1;
        if (f60Var.r1()) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent.getAction() == 0 && f60Var.F1 == 0 && f60Var.a1 != null) {
            AndroidUtilities.runOnUIThread(s20Var, 300L);
            f60Var.R1 = true;
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (f60Var.R1) {
                AndroidUtilities.cancelRunOnUIThread(s20Var);
                f60Var.R1 = false;
            } else if (f60Var.S1) {
                AndroidUtilities.cancelRunOnUIThread(f60Var.x2);
                f60Var.J1(0, true);
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setMicMute(true, true, false);
                    try {
                        f60Var.w.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                arrayList.clear();
                arrayList.addAll(f60Var.Y1);
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((org.telegram.ui.Components.voip.u) arrayList.get(i10)).j(true);
                }
                f60Var.S1 = false;
                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(obtain);
                obtain.recycle();
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
