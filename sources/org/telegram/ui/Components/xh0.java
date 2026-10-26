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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public class xh0 extends AccessibilityNodeProvider {
    public final /* synthetic */ int a = 1;
    public final Object b;

    public xh0(jg.i iVar) {
        this.b = iVar;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i10) {
        yh0 yh0Var;
        switch (this.a) {
            case 0:
                int[] iArr = {0, 0};
                bi0 bi0Var = (bi0) this.b;
                ArrayList arrayList = bi0Var.a;
                bi0Var.getLocationOnScreen(iArr);
                if (i10 == -1) {
                    AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(bi0Var);
                    bi0Var.onInitializeAccessibilityNodeInfo(obtain);
                    obtain.setEnabled(true);
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        obtain.addChild(bi0Var, ((yh0) arrayList.get(i11)).a);
                    }
                    return obtain;
                }
                int i12 = 0;
                while (true) {
                    if (i12 >= arrayList.size()) {
                        yh0Var = null;
                    } else if (((yh0) arrayList.get(i12)).a == i10) {
                        yh0Var = (yh0) arrayList.get(i12);
                    } else {
                        i12++;
                    }
                }
                if (yh0Var != null) {
                    RectF rectF = yh0Var.d;
                    if (!rectF.isEmpty()) {
                        AccessibilityNodeInfo obtain2 = AccessibilityNodeInfo.obtain();
                        obtain2.setSource(bi0Var, i10);
                        obtain2.setParent(bi0Var);
                        obtain2.setPackageName(bi0Var.getContext().getPackageName());
                        obtain2.addAction(16);
                        obtain2.addAction(64);
                        obtain2.setClickable(true);
                        obtain2.setFocusable(true);
                        obtain2.setEnabled(true);
                        obtain2.setVisibleToUser(true);
                        obtain2.setClassName(Button.class.getName());
                        obtain2.setText(yh0Var.l.k());
                        Rect rect = new Rect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                        obtain2.setBoundsInParent(rect);
                        rect.offset(iArr[0], iArr[1]);
                        obtain2.setBoundsInScreen(rect);
                        return obtain2;
                    }
                }
                return null;
            default:
                s0.d c02 = ((jg.i) this.b).c0(i10);
                if (c02 == null) {
                    return null;
                }
                return c02.a;
        }
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public List findAccessibilityNodeInfosByText(String str, int i10) {
        switch (this.a) {
            case 1:
                ((jg.i) this.b).getClass();
                return null;
            default:
                return super.findAccessibilityNodeInfosByText(str, i10);
        }
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public AccessibilityNodeInfo findFocus(int i10) {
        switch (this.a) {
            case 1:
                s0.d d02 = ((jg.i) this.b).d0(i10);
                if (d02 == null) {
                    return null;
                }
                return d02.a;
            default:
                return super.findFocus(i10);
        }
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i10, int i11, Bundle bundle) {
        yh0 yh0Var;
        switch (this.a) {
            case 0:
                bi0 bi0Var = (bi0) this.b;
                ArrayList arrayList = bi0Var.a;
                if (i10 == -1) {
                    return bi0Var.performAccessibilityAction(i11, bundle);
                }
                int i12 = 0;
                while (true) {
                    if (i12 >= arrayList.size()) {
                        yh0Var = null;
                    } else if (((yh0) arrayList.get(i12)).a == i10) {
                        yh0Var = (yh0) arrayList.get(i12);
                    } else {
                        i12++;
                    }
                }
                if (yh0Var != null) {
                    if (i11 == 64) {
                        if (((AccessibilityManager) bi0Var.getContext().getSystemService("accessibility")).isTouchExplorationEnabled()) {
                            AccessibilityEvent obtain = AccessibilityEvent.obtain(32768);
                            obtain.setPackageName(bi0Var.getContext().getPackageName());
                            obtain.setSource(bi0Var, i10);
                            if (bi0Var.getParent() != null) {
                                bi0Var.getParent().requestSendAccessibilityEvent(bi0Var, obtain);
                            }
                        }
                    } else if (i11 == 16) {
                        ai0 ai0Var = bi0Var.F;
                        if (ai0Var != null) {
                            ProfileActivity.e0(((org.telegram.ui.wx0) ai0Var).b, i10, 0.0f, 0.0f);
                        }
                    }
                    return true;
                }
                return false;
            default:
                return ((jg.i) this.b).h0(i10, i11, bundle);
        }
    }

    public xh0(bi0 bi0Var) {
        this.b = bi0Var;
    }
}
