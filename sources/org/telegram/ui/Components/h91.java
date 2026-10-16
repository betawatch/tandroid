package org.telegram.ui.Components;

import android.text.TextPaint;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class h91 {
    public int a;
    public CharSequence b;
    public int c;

    public final int a(TextPaint textPaint) {
        int ceil = (int) Math.ceil(di.d4.g(this.b, textPaint));
        this.c = ceil;
        return Math.max(0, ceil);
    }
}
