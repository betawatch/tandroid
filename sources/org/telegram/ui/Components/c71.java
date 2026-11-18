package org.telegram.ui.Components;

import android.text.TextPaint;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class c71 {
    public int a;
    public CharSequence b;
    public int c;

    public final int a(TextPaint textPaint) {
        int ceil = (int) Math.ceil(hi.m3.h(this.b, textPaint));
        this.c = ceil;
        return Math.max(0, ceil);
    }
}
