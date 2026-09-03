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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public class gh0 extends AccessibilityNodeProvider {
    public final /* synthetic */ int a = 0;
    public final Object b;

    public gh0(zz zzVar) {
        this.b = zzVar;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i10) {
        hh0 hh0Var;
        switch (this.a) {
            case 0:
                int[] iArr = {0, 0};
                kh0 kh0Var = (kh0) this.b;
                ArrayList arrayList = kh0Var.a;
                kh0Var.getLocationOnScreen(iArr);
                if (i10 == -1) {
                    AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(kh0Var);
                    kh0Var.onInitializeAccessibilityNodeInfo(obtain);
                    obtain.setEnabled(true);
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        obtain.addChild(kh0Var, ((hh0) arrayList.get(i11)).a);
                    }
                    return obtain;
                }
                int i12 = 0;
                while (true) {
                    if (i12 >= arrayList.size()) {
                        hh0Var = null;
                    } else if (((hh0) arrayList.get(i12)).a == i10) {
                        hh0Var = (hh0) arrayList.get(i12);
                    } else {
                        i12++;
                    }
                }
                if (hh0Var != null) {
                    RectF rectF = hh0Var.d;
                    if (!rectF.isEmpty()) {
                        AccessibilityNodeInfo obtain2 = AccessibilityNodeInfo.obtain();
                        obtain2.setSource(kh0Var, i10);
                        obtain2.setParent(kh0Var);
                        obtain2.setPackageName(kh0Var.getContext().getPackageName());
                        obtain2.addAction(16);
                        obtain2.addAction(64);
                        obtain2.setClickable(true);
                        obtain2.setFocusable(true);
                        obtain2.setEnabled(true);
                        obtain2.setVisibleToUser(true);
                        obtain2.setClassName(Button.class.getName());
                        obtain2.setText(hh0Var.l.k());
                        Rect rect = new Rect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                        obtain2.setBoundsInParent(rect);
                        rect.offset(iArr[0], iArr[1]);
                        obtain2.setBoundsInScreen(rect);
                        return obtain2;
                    }
                }
                return null;
            default:
                s0.d g10 = ((zz) this.b).g(i10);
                if (g10 == null) {
                    return null;
                }
                return g10.a;
        }
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public List findAccessibilityNodeInfosByText(String str, int i10) {
        switch (this.a) {
            case 1:
                ((zz) this.b).getClass();
                return null;
            default:
                return super.findAccessibilityNodeInfosByText(str, i10);
        }
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public AccessibilityNodeInfo findFocus(int i10) {
        switch (this.a) {
            case 1:
                s0.d i11 = ((zz) this.b).i(i10);
                if (i11 == null) {
                    return null;
                }
                return i11.a;
            default:
                return super.findFocus(i10);
        }
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i10, int i11, Bundle bundle) {
        hh0 hh0Var;
        switch (this.a) {
            case 0:
                kh0 kh0Var = (kh0) this.b;
                ArrayList arrayList = kh0Var.a;
                if (i10 == -1) {
                    return kh0Var.performAccessibilityAction(i11, bundle);
                }
                int i12 = 0;
                while (true) {
                    if (i12 >= arrayList.size()) {
                        hh0Var = null;
                    } else if (((hh0) arrayList.get(i12)).a == i10) {
                        hh0Var = (hh0) arrayList.get(i12);
                    } else {
                        i12++;
                    }
                }
                if (hh0Var != null) {
                    if (i11 == 64) {
                        if (((AccessibilityManager) kh0Var.getContext().getSystemService("accessibility")).isTouchExplorationEnabled()) {
                            AccessibilityEvent obtain = AccessibilityEvent.obtain(32768);
                            obtain.setPackageName(kh0Var.getContext().getPackageName());
                            obtain.setSource(kh0Var, i10);
                            if (kh0Var.getParent() != null) {
                                kh0Var.getParent().requestSendAccessibilityEvent(kh0Var, obtain);
                            }
                        }
                    } else if (i11 == 16) {
                        jh0 jh0Var = kh0Var.C;
                        if (jh0Var != null) {
                            ProfileActivity.Y(((org.telegram.ui.wx0) jh0Var).b, i10, 0.0f, 0.0f);
                        }
                    }
                    return true;
                }
                return false;
            default:
                return ((zz) this.b).G(i10, i11, bundle);
        }
    }

    public gh0(kh0 kh0Var) {
        this.b = kh0Var;
    }
}
