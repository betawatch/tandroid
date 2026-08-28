package org.telegram.ui.Components;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.HashMap;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public abstract class mn0 extends View.AccessibilityDelegate {
    public static final String c = "android.widget.SeekBar";
    public final HashMap a = new HashMap(4);
    public final af.b b = new af.b(this, 13);

    public abstract boolean a();

    public abstract boolean b();

    public abstract void c(boolean z10);

    public CharSequence d() {
        return null;
    }

    public void e(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        accessibilityNodeInfo.setClassName(c);
        CharSequence d = d();
        if (!TextUtils.isEmpty(d)) {
            accessibilityNodeInfo.setText(d);
        }
        if (a()) {
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
        }
        if (b()) {
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
        }
    }

    public final void f(AccessibilityNodeInfo accessibilityNodeInfo) {
        e(null, accessibilityNodeInfo);
    }

    public boolean g(View view, int i9, Bundle bundle) {
        if (i9 != 4096 && i9 != 8192) {
            return false;
        }
        c(i9 == 8192);
        if (view != null) {
            WeakHashMap weakHashMap = r0.j0.a;
            if (view.isAttachedToWindow()) {
                HashMap hashMap = this.a;
                Runnable runnable = (Runnable) hashMap.get(view);
                if (runnable == null) {
                    runnable = new jg0(8, this, view);
                    hashMap.put(view, runnable);
                    view.addOnAttachStateChangeListener(this.b);
                } else {
                    view.removeCallbacks(runnable);
                }
                view.postDelayed(runnable, 400L);
            }
        }
        return true;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        e(view, accessibilityNodeInfo);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean performAccessibilityAction(View view, int i9, Bundle bundle) {
        if (super.performAccessibilityAction(view, i9, bundle)) {
            return true;
        }
        return g(view, i9, bundle);
    }
}
