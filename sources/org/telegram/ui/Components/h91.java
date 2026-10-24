package org.telegram.ui.Components;

import android.text.TextPaint;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class h91 {
    public int a;
    public CharSequence b;
    public int c;

    public final int a(TextPaint textPaint) {
        int ceil = (int) Math.ceil(ei.x3.g(this.b, textPaint));
        this.c = ceil;
        return Math.max(0, ceil);
    }
}
