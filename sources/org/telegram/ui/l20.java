package org.telegram.ui;

import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import java.util.ArrayList;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class l20 extends org.telegram.ui.Components.fi0 {
    public final /* synthetic */ a50 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l20(a50 a50Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.r = a50Var;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
        a50 a50Var = this.r;
        int i10 = a50Var.w3;
        accessibilityNodeInfo.setEnabled(i10 == 0 || i10 == 1);
        if (a50Var.w3 == 1) {
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, org.telegram.messenger.dd.L0(2131743319, null)));
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        a50 a50Var = this.r;
        s10 s10Var = a50Var.p4;
        ArrayList arrayList = a50Var.Q3;
        if (a50Var.t1()) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent.getAction() == 0 && a50Var.w3 == 0 && a50Var.R2 != null) {
            org.telegram.messenger.i0.h3(s10Var, 300L);
            a50Var.I3 = true;
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (a50Var.I3) {
                org.telegram.messenger.i0.r(s10Var);
                a50Var.I3 = false;
            } else if (a50Var.J3) {
                org.telegram.messenger.i0.r(a50Var.o4);
                a50Var.M1(0, true);
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setMicMute(true, true, false);
                    try {
                        a50Var.s1.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                arrayList.clear();
                arrayList.addAll(a50Var.P3);
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((org.telegram.ui.Components.voip.r) arrayList.get(i10)).j(true);
                }
                a50Var.J3 = false;
                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(obtain);
                obtain.recycle();
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
