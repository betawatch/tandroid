package org.telegram.ui.Components;

import android.text.TextPaint;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class d81 {
    public int a;
    public CharSequence b;
    public int c;

    public final int a(TextPaint textPaint) {
        int ceil = (int) Math.ceil(ci.e4.g(this.b, textPaint));
        this.c = ceil;
        return Math.max(0, ceil);
    }
}
