package org.telegram.ui.ActionBar;

import android.content.Context;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class a1 extends b1 {
    public final z0 g0;
    public String h0;

    public a1(Context context, g6 g6Var) {
        super(context, g6Var);
        this.h0 = null;
        setFocusable(true);
        setFocusableInTouchMode(true);
        setImportantForAccessibility(1);
        z0 z0Var = new z0(this);
        this.g0 = z0Var;
        setAccessibilityDelegate(z0Var);
    }

    @Override // org.telegram.ui.ActionBar.b1
    public final int c(float f7) {
        int i10 = k6.sj;
        g6 g6Var = this.x;
        return i0.a.f(w7.r.a((((f7 * 2.8f) + 0.2f) - 1.0f) / 1.0f, 0.0f, 1.0f), k6.w0(i10, g6Var), k6.w0(k6.tj, g6Var));
    }

    public final void e(float f7, boolean z10) {
        d((f7 - 0.2f) / 2.8f, z10);
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
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        return super.performAccessibilityAction(i10, bundle) || this.g0.g(this, i10, bundle);
    }

    public void setLabel(String str) {
        this.h0 = str;
    }

    @Override // org.telegram.ui.ActionBar.b1
    public void setStops(float[] fArr) {
        for (int i10 = 0; i10 < fArr.length; i10++) {
            fArr[i10] = (fArr[i10] - 0.2f) / 2.8f;
        }
        super.setStops(fArr);
    }
}
