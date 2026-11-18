package org.telegram.ui.ActionBar;

import android.content.Context;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import c8.l9;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class v0 extends w0 {
    public final u0 h0;
    public String i0;

    public v0(Context context, i6 i6Var) {
        super(context, i6Var);
        this.i0 = null;
        setFocusable(true);
        setFocusableInTouchMode(true);
        setImportantForAccessibility(1);
        u0 u0Var = new u0(this, 0);
        this.h0 = u0Var;
        setAccessibilityDelegate(u0Var);
    }

    @Override // org.telegram.ui.ActionBar.w0
    public final int c(float f10) {
        int i7 = n6.jk;
        i6 i6Var = this.y;
        return i0.a.f(l9.a((((f10 * 2.8f) + 0.2f) - 1.0f) / 1.0f, 0.0f, 1.0f), n6.w0(i7, i6Var), n6.w0(n6.kk, i6Var));
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

    @Override // org.telegram.ui.ActionBar.w0
    public void setStops(float[] fArr) {
        for (int i7 = 0; i7 < fArr.length; i7++) {
            fArr[i7] = (fArr[i7] - 0.2f) / 2.8f;
        }
        super.setStops(fArr);
    }
}
