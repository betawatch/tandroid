package org.telegram.ui.Components;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public abstract class u00 extends ro0 {
    public final boolean d;

    public u00(boolean z10) {
        this.d = z10;
    }

    @Override // org.telegram.ui.Components.ro0
    public final boolean a() {
        return k() > j();
    }

    @Override // org.telegram.ui.Components.ro0
    public final boolean b() {
        return k() < i();
    }

    @Override // org.telegram.ui.Components.ro0
    public final void c(boolean z10) {
        float h = h();
        if (z10) {
            h *= -1.0f;
        }
        l(Math.min(i(), Math.max(j(), k() + h)));
    }

    @Override // org.telegram.ui.Components.ro0
    public final void e(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.e(view, accessibilityNodeInfo);
        if (this.d) {
            accessibilityNodeInfo.addAction((AccessibilityNodeInfo.AccessibilityAction) s0.c.h.a);
            accessibilityNodeInfo.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, j(), i(), k()));
        }
    }

    @Override // org.telegram.ui.Components.ro0
    public final boolean g(View view, int i10, Bundle bundle) {
        if (super.g(view, i10, bundle)) {
            return true;
        }
        if (i10 != ((AccessibilityNodeInfo.AccessibilityAction) s0.c.h.a).getId()) {
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

    public abstract void l(float f7);
}
