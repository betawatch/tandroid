package org.telegram.ui.ActionBar;

import android.content.Context;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class c1 extends d1 {
    public final b1 a0;
    public String b0;

    public c1(Context context, b6 b6Var) {
        super(context, b6Var);
        this.b0 = null;
        setFocusable(true);
        setFocusableInTouchMode(true);
        setImportantForAccessibility(1);
        b1 b1Var = new b1(this);
        this.a0 = b1Var;
        setAccessibilityDelegate(b1Var);
    }

    public final void d(float f10, boolean z10) {
        c((f10 - 0.2f) / 2.8f, z10);
    }

    public float getSpeed() {
        return (getValue() * 2.8f) + 0.2f;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.a0.e(this, accessibilityNodeInfo);
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i9, Bundle bundle) {
        return super.performAccessibilityAction(i9, bundle) || this.a0.g(this, i9, bundle);
    }

    public void setLabel(String str) {
        this.b0 = str;
    }

    @Override // org.telegram.ui.ActionBar.d1
    public void setStops(float[] fArr) {
        for (int i9 = 0; i9 < fArr.length; i9++) {
            fArr[i9] = (fArr[i9] - 0.2f) / 2.8f;
        }
        super.setStops(fArr);
    }
}
