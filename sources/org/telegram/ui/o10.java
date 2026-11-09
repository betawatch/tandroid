package org.telegram.ui;

import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import java.util.ArrayList;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class o10 extends org.telegram.ui.Components.dh0 {
    public final /* synthetic */ e40 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o10(e40 e40Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.r = e40Var;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
        e40 e40Var = this.r;
        int i7 = e40Var.w3;
        accessibilityNodeInfo.setEnabled(i7 == 0 || i7 == 1);
        if (e40Var.w3 == 1) {
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, org.telegram.messenger.id.M0(2131743293, null)));
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        e40 e40Var = this.r;
        u00 u00Var = e40Var.p4;
        ArrayList arrayList = e40Var.Q3;
        if (e40Var.u1()) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent.getAction() == 0 && e40Var.w3 == 0 && e40Var.R2 != null) {
            org.telegram.messenger.g0.i3(u00Var, 300L);
            e40Var.I3 = true;
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (e40Var.I3) {
                org.telegram.messenger.g0.r(u00Var);
                e40Var.I3 = false;
            } else if (e40Var.J3) {
                org.telegram.messenger.g0.r(e40Var.o4);
                e40Var.P1(0, true);
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setMicMute(true, true, false);
                    try {
                        e40Var.s1.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                arrayList.clear();
                arrayList.addAll(e40Var.P3);
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    ((org.telegram.ui.Components.voip.y) arrayList.get(i7)).j(true);
                }
                e40Var.J3 = false;
                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(obtain);
                obtain.recycle();
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
