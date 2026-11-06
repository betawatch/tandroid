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

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public class af0 extends AccessibilityNodeProvider {
    public final /* synthetic */ int a = 0;
    public final Object b;

    public af0(n nVar) {
        this.b = nVar;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i7) {
        bf0 bf0Var;
        switch (this.a) {
            case 0:
                int[] iArr = {0, 0};
                ef0 ef0Var = (ef0) this.b;
                ArrayList arrayList = ef0Var.a;
                ef0Var.getLocationOnScreen(iArr);
                if (i7 == -1) {
                    AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(ef0Var);
                    ef0Var.onInitializeAccessibilityNodeInfo(obtain);
                    obtain.setEnabled(true);
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        obtain.addChild(ef0Var, ((bf0) arrayList.get(i10)).a);
                    }
                    return obtain;
                }
                int i11 = 0;
                while (true) {
                    if (i11 >= arrayList.size()) {
                        bf0Var = null;
                    } else if (((bf0) arrayList.get(i11)).a == i7) {
                        bf0Var = (bf0) arrayList.get(i11);
                    } else {
                        i11++;
                    }
                }
                if (bf0Var != null) {
                    RectF rectF = bf0Var.d;
                    if (!rectF.isEmpty()) {
                        AccessibilityNodeInfo obtain2 = AccessibilityNodeInfo.obtain();
                        obtain2.setSource(ef0Var, i7);
                        obtain2.setParent(ef0Var);
                        obtain2.setPackageName(ef0Var.getContext().getPackageName());
                        obtain2.addAction(16);
                        obtain2.addAction(64);
                        obtain2.setClickable(true);
                        obtain2.setFocusable(true);
                        obtain2.setEnabled(true);
                        obtain2.setVisibleToUser(true);
                        obtain2.setClassName(Button.class.getName());
                        obtain2.setText(bf0Var.l.j());
                        Rect rect = new Rect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                        obtain2.setBoundsInParent(rect);
                        rect.offset(iArr[0], iArr[1]);
                        obtain2.setBoundsInScreen(rect);
                        return obtain2;
                    }
                }
                return null;
            default:
                s0.d s5 = ((n) this.b).s(i7);
                if (s5 == null) {
                    return null;
                }
                return s5.a;
        }
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public List findAccessibilityNodeInfosByText(String str, int i7) {
        switch (this.a) {
            case 1:
                ((n) this.b).getClass();
                return null;
            default:
                return super.findAccessibilityNodeInfosByText(str, i7);
        }
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public AccessibilityNodeInfo findFocus(int i7) {
        switch (this.a) {
            case 1:
                s0.d v = ((n) this.b).v(i7);
                if (v == null) {
                    return null;
                }
                return v.a;
            default:
                return super.findFocus(i7);
        }
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i7, int i10, Bundle bundle) {
        bf0 bf0Var;
        switch (this.a) {
            case 0:
                ef0 ef0Var = (ef0) this.b;
                ArrayList arrayList = ef0Var.a;
                if (i7 == -1) {
                    return ef0Var.performAccessibilityAction(i10, bundle);
                }
                int i11 = 0;
                while (true) {
                    if (i11 >= arrayList.size()) {
                        bf0Var = null;
                    } else if (((bf0) arrayList.get(i11)).a == i7) {
                        bf0Var = (bf0) arrayList.get(i11);
                    } else {
                        i11++;
                    }
                }
                if (bf0Var != null) {
                    if (i10 == 64) {
                        if (((AccessibilityManager) ef0Var.getContext().getSystemService("accessibility")).isTouchExplorationEnabled()) {
                            AccessibilityEvent obtain = AccessibilityEvent.obtain(32768);
                            obtain.setPackageName(ef0Var.getContext().getPackageName());
                            obtain.setSource(ef0Var, i7);
                            if (ef0Var.getParent() != null) {
                                ef0Var.getParent().requestSendAccessibilityEvent(ef0Var, obtain);
                            }
                        }
                    } else if (i10 == 16) {
                        df0 df0Var = ef0Var.y;
                        if (df0Var != null) {
                            ProfileActivity.m0(((org.telegram.ui.tt0) df0Var).b, i7, 0.0f, 0.0f);
                        }
                    }
                    return true;
                }
                return false;
            default:
                return ((n) this.b).z(i7, i10, bundle);
        }
    }

    public af0(ef0 ef0Var) {
        this.b = ef0Var;
    }
}
