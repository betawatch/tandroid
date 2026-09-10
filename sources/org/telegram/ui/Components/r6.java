package org.telegram.ui.Components;

import android.view.animation.OvershootInterpolator;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public abstract class r6 {
    public static final OvershootInterpolator a = new OvershootInterpolator(1.9f);
    public static final p6 b = new p6("alpha", 0);
    public static final org.telegram.ui.Cells.u8 c;
    public static final p6 d;
    public static final p6 e;
    public static final org.telegram.ui.Cells.u8 f;
    public static final org.telegram.ui.Cells.u8 g;
    public static final org.telegram.ui.Cells.u8 h;

    static {
        new p6("color", 1);
        c = new org.telegram.ui.Cells.u8("currentAlpha", 4);
        d = new p6("alpha", 2);
        e = new p6("alpha", 3);
        f = new org.telegram.ui.Cells.u8("animationProgress", 5);
        g = new org.telegram.ui.Cells.u8("animationValue", 6);
        h = new org.telegram.ui.Cells.u8("clipProgress", 7);
    }
}
