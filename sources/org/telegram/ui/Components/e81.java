package org.telegram.ui.Components;

import android.text.TextPaint;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class e81 {
    public int a;
    public CharSequence b;
    public int c;

    public final int a(TextPaint textPaint) {
        int ceil = (int) Math.ceil(ci.f4.g(this.b, textPaint));
        this.c = ceil;
        return Math.max(0, ceil);
    }
}
