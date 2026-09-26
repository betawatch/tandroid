package org.telegram.ui.ActionBar;

import android.content.Context;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class a1 extends b1 {
    public final z0 e0;
    public String f0;

    public a1(Context context, d6 d6Var) {
        super(context, d6Var);
        this.f0 = null;
        setFocusable(true);
        setFocusableInTouchMode(true);
        setImportantForAccessibility(1);
        z0 z0Var = new z0(this);
        this.e0 = z0Var;
        setAccessibilityDelegate(z0Var);
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

    @Override // org.telegram.ui.ActionBar.b1
    public void setStops(float[] fArr) {
        for (int i10 = 0; i10 < fArr.length; i10++) {
            fArr[i10] = (fArr[i10] - 0.2f) / 2.8f;
        }
        super.setStops(fArr);
    }
}
