package org.telegram.ui.Components;

import android.text.TextPaint;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class j71 {
    public int a;
    public CharSequence b;
    public int c;

    public final int a(TextPaint textPaint) {
        int ceil = (int) Math.ceil(kh.x3.g(this.b, textPaint));
        this.c = ceil;
        return Math.max(0, ceil);
    }
}
