package org.telegram.ui.Components;

import android.text.TextPaint;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class i81 {
    public int a;
    public CharSequence b;
    public int c;

    public final int a(TextPaint textPaint) {
        int ceil = (int) Math.ceil(qh.f3.g(this.b, textPaint));
        this.c = ceil;
        return Math.max(0, ceil);
    }
}
