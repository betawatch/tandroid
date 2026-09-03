package org.telegram.ui.Components;

import android.text.TextPaint;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class h81 {
    public int a;
    public CharSequence b;
    public int c;

    public final int a(TextPaint textPaint) {
        int ceil = (int) Math.ceil(ph.f3.g(this.b, textPaint));
        this.c = ceil;
        return Math.max(0, ceil);
    }
}
