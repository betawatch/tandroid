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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class cf0 extends AccessibilityNodeProvider {
    public final /* synthetic */ int a = 0;
    public final Object b;

    public cf0(nh nhVar) {
        this.b = nhVar;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i3) {
        df0 df0Var;
        switch (this.a) {
            case 0:
                int[] iArr = {0, 0};
                gf0 gf0Var = (gf0) this.b;
                ArrayList arrayList = gf0Var.a;
                gf0Var.getLocationOnScreen(iArr);
                if (i3 == -1) {
                    AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(gf0Var);
                    gf0Var.onInitializeAccessibilityNodeInfo(obtain);
                    obtain.setEnabled(true);
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        obtain.addChild(gf0Var, ((df0) arrayList.get(i10)).a);
                    }
                    return obtain;
                }
                int i11 = 0;
                while (true) {
                    if (i11 >= arrayList.size()) {
                        df0Var = null;
                    } else if (((df0) arrayList.get(i11)).a == i3) {
                        df0Var = (df0) arrayList.get(i11);
                    } else {
                        i11++;
                    }
                }
                if (df0Var != null) {
                    RectF rectF = df0Var.d;
                    if (!rectF.isEmpty()) {
                        AccessibilityNodeInfo obtain2 = AccessibilityNodeInfo.obtain();
                        obtain2.setSource(gf0Var, i3);
                        obtain2.setParent(gf0Var);
                        obtain2.setPackageName(gf0Var.getContext().getPackageName());
                        obtain2.addAction(16);
                        obtain2.addAction(64);
                        obtain2.setClickable(true);
                        obtain2.setFocusable(true);
                        obtain2.setEnabled(true);
                        obtain2.setVisibleToUser(true);
                        obtain2.setClassName(Button.class.getName());
                        obtain2.setText(df0Var.l.j());
                        Rect rect = new Rect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                        obtain2.setBoundsInParent(rect);
                        rect.offset(iArr[0], iArr[1]);
                        obtain2.setBoundsInScreen(rect);
                        return obtain2;
                    }
                }
                return null;
            default:
                s0.d y9 = ((nh) this.b).y(i3);
                if (y9 == null) {
                    return null;
                }
                return y9.a;
        }
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public List findAccessibilityNodeInfosByText(String str, int i3) {
        switch (this.a) {
            case 1:
                ((nh) this.b).getClass();
                return null;
            default:
                return super.findAccessibilityNodeInfosByText(str, i3);
        }
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public AccessibilityNodeInfo findFocus(int i3) {
        switch (this.a) {
            case 1:
                s0.d A = ((nh) this.b).A(i3);
                if (A == null) {
                    return null;
                }
                return A.a;
            default:
                return super.findFocus(i3);
        }
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i3, int i10, Bundle bundle) {
        df0 df0Var;
        switch (this.a) {
            case 0:
                gf0 gf0Var = (gf0) this.b;
                ArrayList arrayList = gf0Var.a;
                if (i3 == -1) {
                    return gf0Var.performAccessibilityAction(i10, bundle);
                }
                int i11 = 0;
                while (true) {
                    if (i11 >= arrayList.size()) {
                        df0Var = null;
                    } else if (((df0) arrayList.get(i11)).a == i3) {
                        df0Var = (df0) arrayList.get(i11);
                    } else {
                        i11++;
                    }
                }
                if (df0Var != null) {
                    if (i10 == 64) {
                        if (((AccessibilityManager) gf0Var.getContext().getSystemService("accessibility")).isTouchExplorationEnabled()) {
                            AccessibilityEvent obtain = AccessibilityEvent.obtain(32768);
                            obtain.setPackageName(gf0Var.getContext().getPackageName());
                            obtain.setSource(gf0Var, i3);
                            if (gf0Var.getParent() != null) {
                                gf0Var.getParent().requestSendAccessibilityEvent(gf0Var, obtain);
                            }
                        }
                    } else if (i10 == 16) {
                        ff0 ff0Var = gf0Var.y;
                        if (ff0Var != null) {
                            ProfileActivity.m0(((org.telegram.ui.jt0) ff0Var).b, i3, 0.0f, 0.0f);
                        }
                    }
                    return true;
                }
                return false;
            default:
                return ((nh) this.b).D(i3, i10, bundle);
        }
    }

    public cf0(gf0 gf0Var) {
        this.b = gf0Var;
    }
}
