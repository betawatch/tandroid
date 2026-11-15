package org.telegram.ui;

import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import java.util.ArrayList;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class m10 extends org.telegram.ui.Components.fh0 {
    public final /* synthetic */ c40 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m10(c40 c40Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.r = c40Var;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
        c40 c40Var = this.r;
        int i7 = c40Var.E3;
        accessibilityNodeInfo.setEnabled(i7 == 0 || i7 == 1);
        if (c40Var.E3 == 1) {
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, org.telegram.messenger.hd.M0(2131743293, null)));
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        c40 c40Var = this.r;
        s00 s00Var = c40Var.x4;
        ArrayList arrayList = c40Var.Y3;
        if (c40Var.u1()) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent.getAction() == 0 && c40Var.E3 == 0 && c40Var.V2 != null) {
            org.telegram.messenger.g0.i3(s00Var, 300L);
            c40Var.Q3 = true;
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (c40Var.Q3) {
                org.telegram.messenger.g0.r(s00Var);
                c40Var.Q3 = false;
            } else if (c40Var.R3) {
                org.telegram.messenger.g0.r(c40Var.w4);
                c40Var.R1(0, true);
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setMicMute(true, true, false);
                    try {
                        c40Var.w1.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                arrayList.clear();
                arrayList.addAll(c40Var.X3);
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    ((org.telegram.ui.Components.voip.z) arrayList.get(i7)).j(true);
                }
                c40Var.R3 = false;
                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(obtain);
                obtain.recycle();
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
