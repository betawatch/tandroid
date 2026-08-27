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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public class ng0 extends AccessibilityNodeProvider {
    public final /* synthetic */ int a = 1;
    public final Object b;

    public ng0(m5.o oVar) {
        this.b = oVar;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i10) {
        og0 og0Var;
        switch (this.a) {
            case 0:
                int[] iArr = {0, 0};
                rg0 rg0Var = (rg0) this.b;
                ArrayList arrayList = rg0Var.a;
                rg0Var.getLocationOnScreen(iArr);
                if (i10 == -1) {
                    AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(rg0Var);
                    rg0Var.onInitializeAccessibilityNodeInfo(obtain);
                    obtain.setEnabled(true);
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        obtain.addChild(rg0Var, ((og0) arrayList.get(i11)).a);
                    }
                    return obtain;
                }
                int i12 = 0;
                while (true) {
                    if (i12 >= arrayList.size()) {
                        og0Var = null;
                    } else if (((og0) arrayList.get(i12)).a == i10) {
                        og0Var = (og0) arrayList.get(i12);
                    } else {
                        i12++;
                    }
                }
                if (og0Var != null) {
                    RectF rectF = og0Var.d;
                    if (!rectF.isEmpty()) {
                        AccessibilityNodeInfo obtain2 = AccessibilityNodeInfo.obtain();
                        obtain2.setSource(rg0Var, i10);
                        obtain2.setParent(rg0Var);
                        obtain2.setPackageName(rg0Var.getContext().getPackageName());
                        obtain2.addAction(16);
                        obtain2.addAction(64);
                        obtain2.setClickable(true);
                        obtain2.setFocusable(true);
                        obtain2.setEnabled(true);
                        obtain2.setVisibleToUser(true);
                        obtain2.setClassName(Button.class.getName());
                        obtain2.setText(og0Var.l.k());
                        Rect rect = new Rect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                        obtain2.setBoundsInParent(rect);
                        rect.offset(iArr[0], iArr[1]);
                        obtain2.setBoundsInScreen(rect);
                        return obtain2;
                    }
                }
                return null;
            default:
                s0.c u10 = ((m5.o) this.b).u(i10);
                if (u10 == null) {
                    return null;
                }
                return u10.a;
        }
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public List findAccessibilityNodeInfosByText(String str, int i10) {
        switch (this.a) {
            case 1:
                ((m5.o) this.b).getClass();
                return null;
            default:
                return super.findAccessibilityNodeInfosByText(str, i10);
        }
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public AccessibilityNodeInfo findFocus(int i10) {
        switch (this.a) {
            case 1:
                s0.c w10 = ((m5.o) this.b).w(i10);
                if (w10 == null) {
                    return null;
                }
                return w10.a;
            default:
                return super.findFocus(i10);
        }
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i10, int i11, Bundle bundle) {
        og0 og0Var;
        switch (this.a) {
            case 0:
                rg0 rg0Var = (rg0) this.b;
                ArrayList arrayList = rg0Var.a;
                if (i10 == -1) {
                    return rg0Var.performAccessibilityAction(i11, bundle);
                }
                int i12 = 0;
                while (true) {
                    if (i12 >= arrayList.size()) {
                        og0Var = null;
                    } else if (((og0) arrayList.get(i12)).a == i10) {
                        og0Var = (og0) arrayList.get(i12);
                    } else {
                        i12++;
                    }
                }
                if (og0Var != null) {
                    if (i11 == 64) {
                        if (((AccessibilityManager) rg0Var.getContext().getSystemService("accessibility")).isTouchExplorationEnabled()) {
                            AccessibilityEvent obtain = AccessibilityEvent.obtain(32768);
                            obtain.setPackageName(rg0Var.getContext().getPackageName());
                            obtain.setSource(rg0Var, i10);
                            if (rg0Var.getParent() != null) {
                                rg0Var.getParent().requestSendAccessibilityEvent(rg0Var, obtain);
                            }
                        }
                    } else if (i11 == 16) {
                        qg0 qg0Var = rg0Var.B;
                        if (qg0Var != null) {
                            ProfileActivity.Y(((org.telegram.ui.gx0) qg0Var).b, i10, 0.0f, 0.0f);
                        }
                    }
                    return true;
                }
                return false;
            default:
                return ((m5.o) this.b).y(i10, i11, bundle);
        }
    }

    public ng0(rg0 rg0Var) {
        this.b = rg0Var;
    }
}
