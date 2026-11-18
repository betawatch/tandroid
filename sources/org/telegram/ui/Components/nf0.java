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

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public class nf0 extends AccessibilityNodeProvider {
    public final /* synthetic */ int a = 1;
    public final Object b;

    public nf0(org.telegram.ui.Cells.b5 b5Var) {
        this.b = b5Var;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i7) {
        of0 of0Var;
        switch (this.a) {
            case 0:
                int[] iArr = {0, 0};
                rf0 rf0Var = (rf0) this.b;
                ArrayList arrayList = rf0Var.a;
                rf0Var.getLocationOnScreen(iArr);
                if (i7 == -1) {
                    AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(rf0Var);
                    rf0Var.onInitializeAccessibilityNodeInfo(obtain);
                    obtain.setEnabled(true);
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        obtain.addChild(rf0Var, ((of0) arrayList.get(i10)).a);
                    }
                    return obtain;
                }
                int i11 = 0;
                while (true) {
                    if (i11 >= arrayList.size()) {
                        of0Var = null;
                    } else if (((of0) arrayList.get(i11)).a == i7) {
                        of0Var = (of0) arrayList.get(i11);
                    } else {
                        i11++;
                    }
                }
                if (of0Var != null) {
                    RectF rectF = of0Var.d;
                    if (!rectF.isEmpty()) {
                        AccessibilityNodeInfo obtain2 = AccessibilityNodeInfo.obtain();
                        obtain2.setSource(rf0Var, i7);
                        obtain2.setParent(rf0Var);
                        obtain2.setPackageName(rf0Var.getContext().getPackageName());
                        obtain2.addAction(16);
                        obtain2.addAction(64);
                        obtain2.setClickable(true);
                        obtain2.setFocusable(true);
                        obtain2.setEnabled(true);
                        obtain2.setVisibleToUser(true);
                        obtain2.setClassName(Button.class.getName());
                        obtain2.setText(of0Var.l.j());
                        Rect rect = new Rect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                        obtain2.setBoundsInParent(rect);
                        rect.offset(iArr[0], iArr[1]);
                        obtain2.setBoundsInScreen(rect);
                        return obtain2;
                    }
                }
                return null;
            default:
                s0.c t6 = ((org.telegram.ui.Cells.b5) this.b).t(i7);
                if (t6 == null) {
                    return null;
                }
                return t6.a;
        }
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public List findAccessibilityNodeInfosByText(String str, int i7) {
        switch (this.a) {
            case 1:
                ((org.telegram.ui.Cells.b5) this.b).getClass();
                return null;
            default:
                return super.findAccessibilityNodeInfosByText(str, i7);
        }
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public AccessibilityNodeInfo findFocus(int i7) {
        switch (this.a) {
            case 1:
                s0.c w10 = ((org.telegram.ui.Cells.b5) this.b).w(i7);
                if (w10 == null) {
                    return null;
                }
                return w10.a;
            default:
                return super.findFocus(i7);
        }
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i7, int i10, Bundle bundle) {
        of0 of0Var;
        switch (this.a) {
            case 0:
                rf0 rf0Var = (rf0) this.b;
                ArrayList arrayList = rf0Var.a;
                if (i7 == -1) {
                    return rf0Var.performAccessibilityAction(i10, bundle);
                }
                int i11 = 0;
                while (true) {
                    if (i11 >= arrayList.size()) {
                        of0Var = null;
                    } else if (((of0) arrayList.get(i11)).a == i7) {
                        of0Var = (of0) arrayList.get(i11);
                    } else {
                        i11++;
                    }
                }
                if (of0Var != null) {
                    if (i10 == 64) {
                        if (((AccessibilityManager) rf0Var.getContext().getSystemService("accessibility")).isTouchExplorationEnabled()) {
                            AccessibilityEvent obtain = AccessibilityEvent.obtain(32768);
                            obtain.setPackageName(rf0Var.getContext().getPackageName());
                            obtain.setSource(rf0Var, i7);
                            if (rf0Var.getParent() != null) {
                                rf0Var.getParent().requestSendAccessibilityEvent(rf0Var, obtain);
                            }
                        }
                    } else if (i10 == 16) {
                        qf0 qf0Var = rf0Var.y;
                        if (qf0Var != null) {
                            ProfileActivity.l0(((org.telegram.ui.tt0) qf0Var).b, i7, 0.0f, 0.0f);
                        }
                    }
                    return true;
                }
                return false;
            default:
                return ((org.telegram.ui.Cells.b5) this.b).z(i7, i10, bundle);
        }
    }

    public nf0(rf0 rf0Var) {
        this.b = rf0Var;
    }
}
