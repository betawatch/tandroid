package org.telegram.ui.Components;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public abstract class mz extends km0 {
    public final boolean d;

    public mz(boolean z9) {
        this.d = z9;
    }

    @Override // org.telegram.ui.Components.km0
    public final boolean a() {
        return k() > j();
    }

    @Override // org.telegram.ui.Components.km0
    public final boolean b() {
        return k() < i();
    }

    @Override // org.telegram.ui.Components.km0
    public final void c(boolean z9) {
        float h = h();
        if (z9) {
            h *= -1.0f;
        }
        l(Math.min(i(), Math.max(j(), k() + h)));
    }

    @Override // org.telegram.ui.Components.km0
    public final void e(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.e(view, accessibilityNodeInfo);
        if (this.d) {
            accessibilityNodeInfo.addAction((AccessibilityNodeInfo.AccessibilityAction) s0.c.h.a);
            accessibilityNodeInfo.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, j(), i(), k()));
        }
    }

    @Override // org.telegram.ui.Components.km0
    public final boolean g(View view, int i7, Bundle bundle) {
        if (super.g(view, i7, bundle)) {
            return true;
        }
        if (i7 != ((AccessibilityNodeInfo.AccessibilityAction) s0.c.h.a).getId()) {
            return false;
        }
        l(bundle.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE"));
        return true;
    }

    public float h() {
        return 0.05f;
    }

    public float i() {
        return 1.0f;
    }

    public float j() {
        return 0.0f;
    }

    public abstract float k();

    public abstract void l(float f10);
}
