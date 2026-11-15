package org.telegram.ui.Components;

import android.text.TextPaint;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class s61 {
    public int a;
    public CharSequence b;
    public int c;

    public final int a(TextPaint textPaint) {
        int ceil = (int) Math.ceil(hi.l3.h(this.b, textPaint));
        this.c = ceil;
        return Math.max(0, ceil);
    }
}
