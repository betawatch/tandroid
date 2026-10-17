package org.telegram.ui.Components;

import android.view.animation.OvershootInterpolator;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public abstract class t6 {
    public static final OvershootInterpolator a = new OvershootInterpolator(1.9f);
    public static final r6 b = new r6("alpha", 0);
    public static final org.telegram.ui.Cells.s8 c;
    public static final r6 d;
    public static final r6 e;
    public static final org.telegram.ui.Cells.s8 f;
    public static final org.telegram.ui.Cells.s8 g;
    public static final org.telegram.ui.Cells.s8 h;

    static {
        new r6("color", 1);
        c = new org.telegram.ui.Cells.s8("currentAlpha", 4);
        d = new r6("alpha", 2);
        e = new r6("alpha", 3);
        f = new org.telegram.ui.Cells.s8("animationProgress", 5);
        g = new org.telegram.ui.Cells.s8("animationValue", 6);
        h = new org.telegram.ui.Cells.s8("clipProgress", 7);
    }
}
