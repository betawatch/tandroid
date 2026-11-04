package org.telegram.ui.Components;

import android.text.TextPaint;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class j61 {
    public int a;
    public CharSequence b;
    public int c;

    public final int a(TextPaint textPaint) {
        int ceil = (int) Math.ceil(gi.l3.h(this.b, textPaint));
        this.c = ceil;
        return Math.max(0, ceil);
    }
}
