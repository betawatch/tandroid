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

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public class ai0 extends AccessibilityNodeProvider {
    public final /* synthetic */ int a = 1;
    public final Object b;

    public ai0(ji.w4 w4Var) {
        this.b = w4Var;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i10) {
        bi0 bi0Var;
        switch (this.a) {
            case 0:
                int[] iArr = {0, 0};
                ei0 ei0Var = (ei0) this.b;
                ArrayList arrayList = ei0Var.a;
                ei0Var.getLocationOnScreen(iArr);
                if (i10 == -1) {
                    AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(ei0Var);
                    ei0Var.onInitializeAccessibilityNodeInfo(obtain);
                    obtain.setEnabled(true);
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        obtain.addChild(ei0Var, ((bi0) arrayList.get(i11)).a);
                    }
                    return obtain;
                }
                int i12 = 0;
                while (true) {
                    if (i12 >= arrayList.size()) {
                        bi0Var = null;
                    } else if (((bi0) arrayList.get(i12)).a == i10) {
                        bi0Var = (bi0) arrayList.get(i12);
                    } else {
                        i12++;
                    }
                }
                if (bi0Var != null) {
                    RectF rectF = bi0Var.d;
                    if (!rectF.isEmpty()) {
                        AccessibilityNodeInfo obtain2 = AccessibilityNodeInfo.obtain();
                        obtain2.setSource(ei0Var, i10);
                        obtain2.setParent(ei0Var);
                        obtain2.setPackageName(ei0Var.getContext().getPackageName());
                        obtain2.addAction(16);
                        obtain2.addAction(64);
                        obtain2.setClickable(true);
                        obtain2.setFocusable(true);
                        obtain2.setEnabled(true);
                        obtain2.setVisibleToUser(true);
                        obtain2.setClassName(Button.class.getName());
                        obtain2.setText(bi0Var.l.k());
                        Rect rect = new Rect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                        obtain2.setBoundsInParent(rect);
                        rect.offset(iArr[0], iArr[1]);
                        obtain2.setBoundsInScreen(rect);
                        return obtain2;
                    }
                }
                return null;
            default:
                s0.c I = ((ji.w4) this.b).I(i10);
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
                ((ji.w4) this.b).getClass();
                return null;
            default:
                return super.findAccessibilityNodeInfosByText(str, i10);
        }
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public AccessibilityNodeInfo findFocus(int i10) {
        switch (this.a) {
            case 1:
                s0.c P = ((ji.w4) this.b).P(i10);
                if (P == null) {
                    return null;
                }
                return P.a;
            default:
                return super.findFocus(i10);
        }
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i10, int i11, Bundle bundle) {
        bi0 bi0Var;
        switch (this.a) {
            case 0:
                ei0 ei0Var = (ei0) this.b;
                ArrayList arrayList = ei0Var.a;
                if (i10 == -1) {
                    return ei0Var.performAccessibilityAction(i11, bundle);
                }
                int i12 = 0;
                while (true) {
                    if (i12 >= arrayList.size()) {
                        bi0Var = null;
                    } else if (((bi0) arrayList.get(i12)).a == i10) {
                        bi0Var = (bi0) arrayList.get(i12);
                    } else {
                        i12++;
                    }
                }
                if (bi0Var != null) {
                    if (i11 == 64) {
                        if (((AccessibilityManager) ei0Var.getContext().getSystemService("accessibility")).isTouchExplorationEnabled()) {
                            AccessibilityEvent obtain = AccessibilityEvent.obtain(32768);
                            obtain.setPackageName(ei0Var.getContext().getPackageName());
                            obtain.setSource(ei0Var, i10);
                            if (ei0Var.getParent() != null) {
                                ei0Var.getParent().requestSendAccessibilityEvent(ei0Var, obtain);
                            }
                        }
                    } else if (i11 == 16) {
                        di0 di0Var = ei0Var.F;
                        if (di0Var != null) {
                            ProfileActivity.Y(((org.telegram.ui.py0) di0Var).b, i10, 0.0f, 0.0f);
                        }
                    }
                    return true;
                }
                return false;
            default:
                return ((ji.w4) this.b).U(i10, i11, bundle);
        }
    }

    public ai0(ei0 ei0Var) {
        this.b = ei0Var;
    }
}
