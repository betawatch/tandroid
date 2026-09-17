package org.telegram.ui.Components;

import android.text.TextPaint;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final class e81 {
    public int a;
    public CharSequence b;
    public int c;

    public final int a(TextPaint textPaint) {
        int ceil = (int) Math.ceil(di.f4.g(this.b, textPaint));
        this.c = ceil;
        return Math.max(0, ceil);
    }
}
