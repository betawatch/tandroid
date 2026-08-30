package org.telegram.ui.Components;

import android.text.TextPaint;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class h81 {
    public int a;
    public CharSequence b;
    public int c;

    public final int a(TextPaint textPaint) {
        int ceil = (int) Math.ceil(ph.f3.g(this.b, textPaint));
        this.c = ceil;
        return Math.max(0, ceil);
    }
}
