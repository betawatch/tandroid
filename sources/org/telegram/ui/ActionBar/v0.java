package org.telegram.ui.ActionBar;

import android.content.Context;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import c8.j9;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class v0 extends w0 {
    public final u0 g0;
    public String h0;

    public v0(Context context, f6 f6Var) {
        super(context, f6Var);
        this.h0 = null;
        setFocusable(true);
        setFocusableInTouchMode(true);
        setImportantForAccessibility(1);
        u0 u0Var = new u0(this, 0);
        this.g0 = u0Var;
        setAccessibilityDelegate(u0Var);
    }

    @Override // org.telegram.ui.ActionBar.w0
    public final int c(float f10) {
        int i7 = k6.gk;
        f6 f6Var = this.y;
        return i0.a.f(j9.a((((f10 * 2.8f) + 0.2f) - 1.0f) / 1.0f, 0.0f, 1.0f), k6.w0(i7, f6Var), k6.w0(k6.hk, f6Var));
    }

    public final void e(boolean z9, float f10) {
        d(z9, (f10 - 0.2f) / 2.8f);
    }

    public float getSpeed() {
        return (getValue() * 2.8f) + 0.2f;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.g0.e(this, accessibilityNodeInfo);
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i7, Bundle bundle) {
        return super.performAccessibilityAction(i7, bundle) || this.g0.g(this, i7, bundle);
    }

    public void setLabel(String str) {
        this.h0 = str;
    }

    @Override // org.telegram.ui.ActionBar.w0
    public void setStops(float[] fArr) {
        for (int i7 = 0; i7 < fArr.length; i7++) {
            fArr[i7] = (fArr[i7] - 0.2f) / 2.8f;
        }
        super.setStops(fArr);
    }
}
