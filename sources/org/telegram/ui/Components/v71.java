package org.telegram.ui.Components;

import android.text.TextPaint;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class v71 {
    public int a;
    public CharSequence b;
    public int c;

    public final int a(TextPaint textPaint) {
        int ceil = (int) Math.ceil(nh.t3.g(this.b, textPaint));
        this.c = ceil;
        return Math.max(0, ceil);
    }
}
