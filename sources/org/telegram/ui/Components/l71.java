package org.telegram.ui.Components;

import android.text.TextPaint;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class l71 {
    public int a;
    public CharSequence b;
    public int c;

    public final int a(TextPaint textPaint) {
        int ceil = (int) Math.ceil(lh.w3.g(this.b, textPaint));
        this.c = ceil;
        return Math.max(0, ceil);
    }
}
