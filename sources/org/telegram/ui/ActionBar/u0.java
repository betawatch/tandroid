package org.telegram.ui.ActionBar;

import android.content.Context;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import c8.l9;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class u0 extends v0 {
    public final t0 h0;
    public String i0;

    public u0(Context context, h6 h6Var) {
        super(context, h6Var);
        this.i0 = null;
        setFocusable(true);
        setFocusableInTouchMode(true);
        setImportantForAccessibility(1);
        t0 t0Var = new t0(this, 0);
        this.h0 = t0Var;
        setAccessibilityDelegate(t0Var);
    }

    @Override // org.telegram.ui.ActionBar.v0
    public final int c(float f10) {
        int i7 = m6.jk;
        h6 h6Var = this.y;
        return i0.a.f(l9.a((((f10 * 2.8f) + 0.2f) - 1.0f) / 1.0f, 0.0f, 1.0f), m6.w0(i7, h6Var), m6.w0(m6.kk, h6Var));
    }

    public final void e(boolean z10, float f10) {
        d(z10, (f10 - 0.2f) / 2.8f);
    }

    public float getSpeed() {
        return (getValue() * 2.8f) + 0.2f;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.h0.e(this, accessibilityNodeInfo);
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i7, Bundle bundle) {
        return super.performAccessibilityAction(i7, bundle) || this.h0.g(this, i7, bundle);
    }

    public void setLabel(String str) {
        this.i0 = str;
    }

    @Override // org.telegram.ui.ActionBar.v0
    public void setStops(float[] fArr) {
        for (int i7 = 0; i7 < fArr.length; i7++) {
            fArr[i7] = (fArr[i7] - 0.2f) / 2.8f;
        }
        super.setStops(fArr);
    }
}
