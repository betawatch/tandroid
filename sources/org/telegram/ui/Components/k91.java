package org.telegram.ui.Components;

import android.text.TextPaint;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class k91 {
    public int a;
    public CharSequence b;
    public int c;

    public final int a(TextPaint textPaint) {
        int ceil = (int) Math.ceil(ci.d4.g(this.b, textPaint));
        this.c = ceil;
        return Math.max(0, ceil);
    }
}
