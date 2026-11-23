package org.telegram.ui.Components;

import android.text.TextPaint;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class f71 {
    public int a;
    public CharSequence b;
    public int c;

    public final int a(TextPaint textPaint) {
        int ceil = (int) Math.ceil(hi.l3.h(this.b, textPaint));
        this.c = ceil;
        return Math.max(0, ceil);
    }
}
