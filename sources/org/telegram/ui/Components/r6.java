package org.telegram.ui.Components;

import android.view.animation.OvershootInterpolator;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public abstract class r6 {
    public static final OvershootInterpolator a = new OvershootInterpolator(1.9f);
    public static final p6 b = new p6("alpha", 0);
    public static final org.telegram.ui.Cells.p8 c;
    public static final p6 d;
    public static final p6 e;
    public static final org.telegram.ui.Cells.p8 f;
    public static final org.telegram.ui.Cells.p8 g;
    public static final org.telegram.ui.Cells.p8 h;

    static {
        new p6("color", 1);
        c = new org.telegram.ui.Cells.p8("currentAlpha", 4);
        d = new p6("alpha", 2);
        e = new p6("alpha", 3);
        f = new org.telegram.ui.Cells.p8("animationProgress", 5);
        g = new org.telegram.ui.Cells.p8("animationValue", 6);
        h = new org.telegram.ui.Cells.p8("clipProgress", 7);
    }
}
