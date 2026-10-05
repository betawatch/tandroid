package org.telegram.ui.Components;

import android.text.TextPaint;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class d91 {
    public int a;
    public CharSequence b;
    public int c;

    public final int a(TextPaint textPaint) {
        int ceil = (int) Math.ceil(ci.e4.g(this.b, textPaint));
        this.c = ceil;
        return Math.max(0, ceil);
    }
}
