package org.telegram.ui.Components;

import android.text.TextPaint;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class s81 {
    public int a;
    public CharSequence b;
    public int c;

    public final int a(TextPaint textPaint) {
        int ceil = (int) Math.ceil(ci.e4.g(this.b, textPaint));
        this.c = ceil;
        return Math.max(0, ceil);
    }
}
