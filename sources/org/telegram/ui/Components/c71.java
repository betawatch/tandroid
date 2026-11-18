package org.telegram.ui.Components;

import android.text.TextPaint;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class c71 {
    public int a;
    public CharSequence b;
    public int c;

    public final int a(TextPaint textPaint) {
        int ceil = (int) Math.ceil(hi.m3.h(this.b, textPaint));
        this.c = ceil;
        return Math.max(0, ceil);
    }
}
