package org.telegram.ui;

import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import java.util.ArrayList;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class i10 extends org.telegram.ui.Components.fh0 {
    public final /* synthetic */ x30 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i10(x30 x30Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.r = x30Var;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
        x30 x30Var = this.r;
        int i3 = x30Var.x3;
        accessibilityNodeInfo.setEnabled(i3 == 0 || i3 == 1);
        if (x30Var.x3 == 1) {
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, org.telegram.messenger.bd.M0(2131743303, null)));
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        x30 x30Var = this.r;
        p00 p00Var = x30Var.q4;
        ArrayList arrayList = x30Var.R3;
        if (x30Var.t1()) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent.getAction() == 0 && x30Var.x3 == 0 && x30Var.S2 != null) {
            org.telegram.messenger.g0.i3(p00Var, 300L);
            x30Var.J3 = true;
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (x30Var.J3) {
                org.telegram.messenger.g0.r(p00Var);
                x30Var.J3 = false;
            } else if (x30Var.K3) {
                org.telegram.messenger.g0.r(x30Var.p4);
                x30Var.M1(0, true);
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setMicMute(true, true, false);
                    try {
                        x30Var.t1.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                arrayList.clear();
                arrayList.addAll(x30Var.Q3);
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    ((org.telegram.ui.Components.voip.r) arrayList.get(i3)).j(true);
                }
                x30Var.K3 = false;
                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(obtain);
                obtain.recycle();
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
