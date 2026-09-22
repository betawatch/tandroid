package org.telegram.ui.Components;

import android.text.TextPaint;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class v81 {
    public int a;
    public CharSequence b;
    public int c;

    public final int a(TextPaint textPaint) {
        int ceil = (int) Math.ceil(ci.f4.g(this.b, textPaint));
        this.c = ceil;
        return Math.max(0, ceil);
    }
}
