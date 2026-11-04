package org.telegram.ui.Components.voip;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.StaticLayout;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import android.widget.Button;
import org.telegram.ui.xb1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class c extends AccessibilityNodeProvider {
    public final e a;
    public final AccessibilityManager d;
    public final Rect c = new Rect();
    public int e = -1;
    public final int b = 2;

    public c(e eVar) {
        this.a = eVar;
        this.d = (AccessibilityManager) eVar.getContext().getSystemService(AccessibilityManager.class);
    }

    public final void a(int i3) {
        View view;
        ViewParent parent;
        if (!this.d.isTouchExplorationEnabled() || (parent = (view = this.a).getParent()) == null) {
            return;
        }
        AccessibilityEvent obtain = AccessibilityEvent.obtain(32768);
        obtain.setPackageName(view.getContext().getPackageName());
        obtain.setSource(view, i3);
        parent.requestSendAccessibilityEvent(view, obtain);
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i3) {
        StaticLayout staticLayout;
        CharSequence text;
        e eVar = this.a;
        if (i3 == -1) {
            AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(eVar);
            obtain.setPackageName(eVar.getContext().getPackageName());
            for (int i10 = 0; i10 < this.b; i10++) {
                obtain.addChild(eVar, i10);
            }
            return obtain;
        }
        AccessibilityNodeInfo obtain2 = AccessibilityNodeInfo.obtain(eVar, i3);
        obtain2.setPackageName(eVar.getContext().getPackageName());
        int i11 = Build.VERSION.SDK_INT;
        obtain2.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_CLICK);
        b bVar = (b) this;
        e eVar2 = bVar.g;
        if (i3 != 0) {
            if (i3 == 1 && (staticLayout = eVar2.f) != null) {
                text = staticLayout.getText();
            }
            text = null;
        } else if (eVar2.S) {
            StaticLayout staticLayout2 = eVar2.h;
            if (staticLayout2 != null) {
                text = staticLayout2.getText();
            }
            text = null;
        } else {
            StaticLayout staticLayout3 = eVar2.e;
            if (staticLayout3 != null) {
                text = staticLayout3.getText();
            }
            text = null;
        }
        obtain2.setText(text);
        obtain2.setClassName(Button.class.getName());
        if (i11 >= 24) {
            obtain2.setImportantForAccessibility(true);
        }
        obtain2.setVisibleToUser(true);
        obtain2.setClickable(true);
        obtain2.setEnabled(true);
        obtain2.setParent(eVar);
        Rect rect = this.c;
        if (i3 == 0) {
            rect.set(eVar2.N);
        } else if (i3 == 1) {
            rect.set(eVar2.O);
        } else {
            rect.setEmpty();
        }
        int[] iArr = bVar.f;
        eVar2.getLocationOnScreen(iArr);
        rect.offset(iArr[0], iArr[1]);
        obtain2.setBoundsInScreen(rect);
        return obtain2;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i3, int i10, Bundle bundle) {
        if (i3 == -1) {
            return this.a.performAccessibilityAction(i10, bundle);
        }
        if (i10 == 64) {
            a(i3);
            return false;
        }
        if (i10 != 16) {
            return false;
        }
        d dVar = ((b) this).g.R;
        if (dVar != null) {
            if (i3 == 0) {
                ((xb1) dVar).a();
                return true;
            }
            if (i3 == 1) {
                ((xb1) dVar).b();
            }
        }
        return true;
    }
}
