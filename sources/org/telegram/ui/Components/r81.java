package org.telegram.ui.Components;

import android.text.TextPaint;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class r81 {
    public int a;
    public CharSequence b;
    public int c;

    public final int a(TextPaint textPaint) {
        int ceil = (int) Math.ceil(bi.x4.g(this.b, textPaint));
        this.c = ceil;
        return Math.max(0, ceil);
    }
}
