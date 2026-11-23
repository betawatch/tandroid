package org.telegram.ui.Components;

import android.text.TextPaint;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class g71 {
    public int a;
    public CharSequence b;
    public int c;

    public final int a(TextPaint textPaint) {
        int ceil = (int) Math.ceil(hi.u3.h(this.b, textPaint));
        this.c = ceil;
        return Math.max(0, ceil);
    }
}
