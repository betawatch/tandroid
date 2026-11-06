package org.telegram.ui.Components;

import android.text.TextPaint;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
