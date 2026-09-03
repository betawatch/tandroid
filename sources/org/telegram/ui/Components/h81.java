package org.telegram.ui.Components;

import android.text.TextPaint;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class h81 {
    public int a;
    public CharSequence b;
    public int c;

    public final int a(TextPaint textPaint) {
        int ceil = (int) Math.ceil(qh.e3.g(this.b, textPaint));
        this.c = ceil;
        return Math.max(0, ceil);
    }
}
