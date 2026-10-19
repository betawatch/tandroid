package org.telegram.ui.Components;

import android.text.TextPaint;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class z81 {
    public int a;
    public CharSequence b;
    public int c;

    public final int a(TextPaint textPaint) {
        int ceil = (int) Math.ceil(ei.x3.g(this.b, textPaint));
        this.c = ceil;
        return Math.max(0, ceil);
    }
}
