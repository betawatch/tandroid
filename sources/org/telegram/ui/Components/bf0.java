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

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public class bf0 extends AccessibilityNodeProvider {
    public final /* synthetic */ int a = 0;
    public final Object b;

    public bf0(n nVar) {
        this.b = nVar;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i7) {
        cf0 cf0Var;
        switch (this.a) {
            case 0:
                int[] iArr = {0, 0};
                ff0 ff0Var = (ff0) this.b;
                ArrayList arrayList = ff0Var.a;
                ff0Var.getLocationOnScreen(iArr);
                if (i7 == -1) {
                    AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(ff0Var);
                    ff0Var.onInitializeAccessibilityNodeInfo(obtain);
                    obtain.setEnabled(true);
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        obtain.addChild(ff0Var, ((cf0) arrayList.get(i10)).a);
                    }
                    return obtain;
                }
                int i11 = 0;
                while (true) {
                    if (i11 >= arrayList.size()) {
                        cf0Var = null;
                    } else if (((cf0) arrayList.get(i11)).a == i7) {
                        cf0Var = (cf0) arrayList.get(i11);
                    } else {
                        i11++;
                    }
                }
                if (cf0Var != null) {
                    RectF rectF = cf0Var.d;
                    if (!rectF.isEmpty()) {
                        AccessibilityNodeInfo obtain2 = AccessibilityNodeInfo.obtain();
                        obtain2.setSource(ff0Var, i7);
                        obtain2.setParent(ff0Var);
                        obtain2.setPackageName(ff0Var.getContext().getPackageName());
                        obtain2.addAction(16);
                        obtain2.addAction(64);
                        obtain2.setClickable(true);
                        obtain2.setFocusable(true);
                        obtain2.setEnabled(true);
                        obtain2.setVisibleToUser(true);
                        obtain2.setClassName(Button.class.getName());
                        obtain2.setText(cf0Var.l.j());
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
        cf0 cf0Var;
        switch (this.a) {
            case 0:
                ff0 ff0Var = (ff0) this.b;
                ArrayList arrayList = ff0Var.a;
                if (i7 == -1) {
                    return ff0Var.performAccessibilityAction(i10, bundle);
                }
                int i11 = 0;
                while (true) {
                    if (i11 >= arrayList.size()) {
                        cf0Var = null;
                    } else if (((cf0) arrayList.get(i11)).a == i7) {
                        cf0Var = (cf0) arrayList.get(i11);
                    } else {
                        i11++;
                    }
                }
                if (cf0Var != null) {
                    if (i10 == 64) {
                        if (((AccessibilityManager) ff0Var.getContext().getSystemService("accessibility")).isTouchExplorationEnabled()) {
                            AccessibilityEvent obtain = AccessibilityEvent.obtain(32768);
                            obtain.setPackageName(ff0Var.getContext().getPackageName());
                            obtain.setSource(ff0Var, i7);
                            if (ff0Var.getParent() != null) {
                                ff0Var.getParent().requestSendAccessibilityEvent(ff0Var, obtain);
                            }
                        }
                    } else if (i10 == 16) {
                        ef0 ef0Var = ff0Var.y;
                        if (ef0Var != null) {
                            ProfileActivity.l0(((org.telegram.ui.vt0) ef0Var).b, i7, 0.0f, 0.0f);
                        }
                    }
                    return true;
                }
                return false;
            default:
                return ((n) this.b).z(i7, i10, bundle);
        }
    }

    public bf0(ff0 ff0Var) {
        this.b = ff0Var;
    }
}
