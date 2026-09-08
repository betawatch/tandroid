package org.telegram.ui.ActionBar;

import android.content.Context;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class b1 extends c1 {
    public final a1 e0;
    public String f0;

    public b1(Context context, f6 f6Var) {
        super(context, f6Var);
        this.f0 = null;
        setFocusable(true);
        setFocusableInTouchMode(true);
        setImportantForAccessibility(1);
        a1 a1Var = new a1(this);
        this.e0 = a1Var;
        setAccessibilityDelegate(a1Var);
    }

    public final void d(float f7, boolean z10) {
        c((f7 - 0.2f) / 2.8f, z10);
    }

    public float getSpeed() {
        return (getValue() * 2.8f) + 0.2f;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.e0.e(this, accessibilityNodeInfo);
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        return super.performAccessibilityAction(i10, bundle) || this.e0.g(this, i10, bundle);
    }

    public void setLabel(String str) {
        this.f0 = str;
    }

    @Override // org.telegram.ui.ActionBar.c1
    public void setStops(float[] fArr) {
        for (int i10 = 0; i10 < fArr.length; i10++) {
            fArr[i10] = (fArr[i10] - 0.2f) / 2.8f;
        }
        super.setStops(fArr);
    }
}
