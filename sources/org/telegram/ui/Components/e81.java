package org.telegram.ui.Components;

import android.text.TextPaint;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
