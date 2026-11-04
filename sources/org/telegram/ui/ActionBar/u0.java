package org.telegram.ui.ActionBar;

import android.content.Context;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import b8.be;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class u0 extends v0 {
    public final t0 h0;
    public String i0;

    public u0(Context context, e6 e6Var) {
        super(context, e6Var);
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
        int i3 = k6.gk;
        e6 e6Var = this.y;
        return i0.a.f(be.a((((f10 * 2.8f) + 0.2f) - 1.0f) / 1.0f, 0.0f, 1.0f), k6.w0(i3, e6Var), k6.w0(k6.hk, e6Var));
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
    public final boolean performAccessibilityAction(int i3, Bundle bundle) {
        return super.performAccessibilityAction(i3, bundle) || this.h0.g(this, i3, bundle);
    }

    public void setLabel(String str) {
        this.i0 = str;
    }

    @Override // org.telegram.ui.ActionBar.v0
    public void setStops(float[] fArr) {
        for (int i3 = 0; i3 < fArr.length; i3++) {
            fArr[i3] = (fArr[i3] - 0.2f) / 2.8f;
        }
        super.setStops(fArr);
    }
}
