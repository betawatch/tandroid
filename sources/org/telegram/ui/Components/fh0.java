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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public class fh0 extends AccessibilityNodeProvider {
    public final /* synthetic */ int a = 1;
    public final Object b;

    public fh0(org.telegram.ui.Cells.f1 f1Var) {
        this.b = f1Var;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i10) {
        gh0 gh0Var;
        switch (this.a) {
            case 0:
                int[] iArr = {0, 0};
                jh0 jh0Var = (jh0) this.b;
                ArrayList arrayList = jh0Var.a;
                jh0Var.getLocationOnScreen(iArr);
                if (i10 == -1) {
                    AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(jh0Var);
                    jh0Var.onInitializeAccessibilityNodeInfo(obtain);
                    obtain.setEnabled(true);
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        obtain.addChild(jh0Var, ((gh0) arrayList.get(i11)).a);
                    }
                    return obtain;
                }
                int i12 = 0;
                while (true) {
                    if (i12 >= arrayList.size()) {
                        gh0Var = null;
                    } else if (((gh0) arrayList.get(i12)).a == i10) {
                        gh0Var = (gh0) arrayList.get(i12);
                    } else {
                        i12++;
                    }
                }
                if (gh0Var != null) {
                    RectF rectF = gh0Var.d;
                    if (!rectF.isEmpty()) {
                        AccessibilityNodeInfo obtain2 = AccessibilityNodeInfo.obtain();
                        obtain2.setSource(jh0Var, i10);
                        obtain2.setParent(jh0Var);
                        obtain2.setPackageName(jh0Var.getContext().getPackageName());
                        obtain2.addAction(16);
                        obtain2.addAction(64);
                        obtain2.setClickable(true);
                        obtain2.setFocusable(true);
                        obtain2.setEnabled(true);
                        obtain2.setVisibleToUser(true);
                        obtain2.setClassName(Button.class.getName());
                        obtain2.setText(gh0Var.l.k());
                        Rect rect = new Rect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                        obtain2.setBoundsInParent(rect);
                        rect.offset(iArr[0], iArr[1]);
                        obtain2.setBoundsInScreen(rect);
                        return obtain2;
                    }
                }
                return null;
            default:
                s0.e D = ((org.telegram.ui.Cells.f1) this.b).D(i10);
                if (D == null) {
                    return null;
                }
                return D.a;
        }
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public List findAccessibilityNodeInfosByText(String str, int i10) {
        switch (this.a) {
            case 1:
                ((org.telegram.ui.Cells.f1) this.b).getClass();
                return null;
            default:
                return super.findAccessibilityNodeInfosByText(str, i10);
        }
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public AccessibilityNodeInfo findFocus(int i10) {
        switch (this.a) {
            case 1:
                s0.e F = ((org.telegram.ui.Cells.f1) this.b).F(i10);
                if (F == null) {
                    return null;
                }
                return F.a;
            default:
                return super.findFocus(i10);
        }
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i10, int i11, Bundle bundle) {
        gh0 gh0Var;
        switch (this.a) {
            case 0:
                jh0 jh0Var = (jh0) this.b;
                ArrayList arrayList = jh0Var.a;
                if (i10 == -1) {
                    return jh0Var.performAccessibilityAction(i11, bundle);
                }
                int i12 = 0;
                while (true) {
                    if (i12 >= arrayList.size()) {
                        gh0Var = null;
                    } else if (((gh0) arrayList.get(i12)).a == i10) {
                        gh0Var = (gh0) arrayList.get(i12);
                    } else {
                        i12++;
                    }
                }
                if (gh0Var != null) {
                    if (i11 == 64) {
                        if (((AccessibilityManager) jh0Var.getContext().getSystemService("accessibility")).isTouchExplorationEnabled()) {
                            AccessibilityEvent obtain = AccessibilityEvent.obtain(32768);
                            obtain.setPackageName(jh0Var.getContext().getPackageName());
                            obtain.setSource(jh0Var, i10);
                            if (jh0Var.getParent() != null) {
                                jh0Var.getParent().requestSendAccessibilityEvent(jh0Var, obtain);
                            }
                        }
                    } else if (i11 == 16) {
                        ih0 ih0Var = jh0Var.C;
                        if (ih0Var != null) {
                            ProfileActivity.Y(((org.telegram.ui.px0) ih0Var).b, i10, 0.0f, 0.0f);
                        }
                    }
                    return true;
                }
                return false;
            default:
                return ((org.telegram.ui.Cells.f1) this.b).S(i10, i11, bundle);
        }
    }

    public fh0(jh0 jh0Var) {
        this.b = jh0Var;
    }
}
