package org.telegram.ui.Components;

import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import android.widget.Button;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class dg0 extends AccessibilityNodeProvider {
    public final /* synthetic */ int a = 0;
    public final Object b;

    public dg0(r2.y yVar) {
        this.b = yVar;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i10) {
        eg0 eg0Var;
        switch (this.a) {
            case 0:
                int[] iArr = {0, 0};
                hg0 hg0Var = (hg0) this.b;
                ArrayList arrayList = hg0Var.a;
                hg0Var.getLocationOnScreen(iArr);
                if (i10 == -1) {
                    AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(hg0Var);
                    hg0Var.onInitializeAccessibilityNodeInfo(obtain);
                    obtain.setEnabled(true);
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        obtain.addChild(hg0Var, ((eg0) arrayList.get(i11)).a);
                    }
                    return obtain;
                }
                int i12 = 0;
                while (true) {
                    if (i12 >= arrayList.size()) {
                        eg0Var = null;
                    } else if (((eg0) arrayList.get(i12)).a == i10) {
                        eg0Var = (eg0) arrayList.get(i12);
                    } else {
                        i12++;
                    }
                }
                if (eg0Var != null) {
                    RectF rectF = eg0Var.d;
                    if (!rectF.isEmpty()) {
                        AccessibilityNodeInfo obtain2 = AccessibilityNodeInfo.obtain();
                        obtain2.setSource(hg0Var, i10);
                        obtain2.setParent(hg0Var);
                        obtain2.setPackageName(hg0Var.getContext().getPackageName());
                        obtain2.addAction(16);
                        obtain2.addAction(64);
                        obtain2.setClickable(true);
                        obtain2.setFocusable(true);
                        obtain2.setEnabled(true);
                        obtain2.setVisibleToUser(true);
                        obtain2.setClassName(Button.class.getName());
                        obtain2.setText(eg0Var.l.j());
                        Rect rect = new Rect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                        obtain2.setBoundsInParent(rect);
                        rect.offset(iArr[0], iArr[1]);
                        obtain2.setBoundsInScreen(rect);
                        return obtain2;
                    }
                }
                return null;
            default:
                s0.c I = ((r2.y) this.b).I(i10);
                if (I == null) {
                    return null;
                }
                return I.a;
        }
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public List findAccessibilityNodeInfosByText(String str, int i10) {
        switch (this.a) {
            case 1:
                ((r2.y) this.b).getClass();
                return null;
            default:
                return super.findAccessibilityNodeInfosByText(str, i10);
        }
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public AccessibilityNodeInfo findFocus(int i10) {
        switch (this.a) {
            case 1:
                s0.c Q = ((r2.y) this.b).Q(i10);
                if (Q == null) {
                    return null;
                }
                return Q.a;
            default:
                return super.findFocus(i10);
        }
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i10, int i11, Bundle bundle) {
        eg0 eg0Var;
        switch (this.a) {
            case 0:
                hg0 hg0Var = (hg0) this.b;
                ArrayList arrayList = hg0Var.a;
                if (i10 == -1) {
                    return hg0Var.performAccessibilityAction(i11, bundle);
                }
                int i12 = 0;
                while (true) {
                    if (i12 >= arrayList.size()) {
                        eg0Var = null;
                    } else if (((eg0) arrayList.get(i12)).a == i10) {
                        eg0Var = (eg0) arrayList.get(i12);
                    } else {
                        i12++;
                    }
                }
                if (eg0Var != null) {
                    if (i11 == 64) {
                        if (((AccessibilityManager) hg0Var.getContext().getSystemService("accessibility")).isTouchExplorationEnabled()) {
                            AccessibilityEvent obtain = AccessibilityEvent.obtain(32768);
                            obtain.setPackageName(hg0Var.getContext().getPackageName());
                            obtain.setSource(hg0Var, i10);
                            if (hg0Var.getParent() != null) {
                                hg0Var.getParent().requestSendAccessibilityEvent(hg0Var, obtain);
                            }
                        }
                    } else if (i11 == 16) {
                        gg0 gg0Var = hg0Var.y;
                        if (gg0Var != null) {
                            ProfileActivity.l0(((org.telegram.ui.bv0) gg0Var).b, i10, 0.0f, 0.0f);
                        }
                    }
                    return true;
                }
                return false;
            default:
                return ((r2.y) this.b).a0(i10, i11, bundle);
        }
    }

    public dg0(hg0 hg0Var) {
        this.b = hg0Var;
    }
}
