package org.telegram.ui.Components;

import android.text.TextPaint;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class r61 {
    public int a;
    public CharSequence b;
    public int c;

    public final int a(TextPaint textPaint) {
        int ceil = (int) Math.ceil(fi.m3.h(this.b, textPaint));
        this.c = ceil;
        return Math.max(0, ceil);
    }
}
