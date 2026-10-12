package org.telegram.ui.Components;

import android.text.TextPaint;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class g91 {
    public int a;
    public CharSequence b;
    public int c;

    public final int a(TextPaint textPaint) {
        int ceil = (int) Math.ceil(di.d4.g(this.b, textPaint));
        this.c = ceil;
        return Math.max(0, ceil);
    }
}
