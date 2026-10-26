package org.telegram.ui.Components;

import android.text.TextPaint;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class q91 {
    public int a;
    public CharSequence b;
    public int c;

    public final int a(TextPaint textPaint) {
        int ceil = (int) Math.ceil(fi.v3.g(this.b, textPaint));
        this.c = ceil;
        return Math.max(0, ceil);
    }
}
