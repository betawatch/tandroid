package org.telegram.ui.Components;

import android.text.TextPaint;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class r91 {
    public int a;
    public CharSequence b;
    public int c;

    public final int a(TextPaint textPaint) {
        int ceil = (int) Math.ceil(fi.v3.g(this.b, textPaint));
        this.c = ceil;
        return Math.max(0, ceil);
    }
}
