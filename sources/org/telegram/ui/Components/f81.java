package org.telegram.ui.Components;

import android.text.TextPaint;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class f81 {
    public int a;
    public CharSequence b;
    public int c;

    public final int a(TextPaint textPaint) {
        int ceil = (int) Math.ceil(ci.f4.g(this.b, textPaint));
        this.c = ceil;
        return Math.max(0, ceil);
    }
}
