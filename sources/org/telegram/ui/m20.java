package org.telegram.ui;

import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import java.util.ArrayList;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class m20 extends org.telegram.ui.Components.ei0 {
    public final /* synthetic */ b50 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m20(b50 b50Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.r = b50Var;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
        b50 b50Var = this.r;
        int i10 = b50Var.w3;
        accessibilityNodeInfo.setEnabled(i10 == 0 || i10 == 1);
        if (b50Var.w3 == 1) {
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, org.telegram.messenger.cd.L0(2131743319, null)));
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        b50 b50Var = this.r;
        t10 t10Var = b50Var.p4;
        ArrayList arrayList = b50Var.Q3;
        if (b50Var.t1()) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent.getAction() == 0 && b50Var.w3 == 0 && b50Var.R2 != null) {
            org.telegram.messenger.i0.h3(t10Var, 300L);
            b50Var.I3 = true;
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (b50Var.I3) {
                org.telegram.messenger.i0.r(t10Var);
                b50Var.I3 = false;
            } else if (b50Var.J3) {
                org.telegram.messenger.i0.r(b50Var.o4);
                b50Var.M1(0, true);
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setMicMute(true, true, false);
                    try {
                        b50Var.s1.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                arrayList.clear();
                arrayList.addAll(b50Var.P3);
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((org.telegram.ui.Components.voip.r) arrayList.get(i10)).j(true);
                }
                b50Var.J3 = false;
                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(obtain);
                obtain.recycle();
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
