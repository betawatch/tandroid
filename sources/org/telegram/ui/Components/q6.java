package org.telegram.ui.Components;

import android.view.animation.OvershootInterpolator;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public abstract class q6 {
    public static final OvershootInterpolator a = new OvershootInterpolator(1.9f);
    public static final o6 b = new o6("alpha", 0);
    public static final org.telegram.ui.Cells.t8 c;
    public static final o6 d;
    public static final o6 e;
    public static final org.telegram.ui.Cells.t8 f;
    public static final org.telegram.ui.Cells.t8 g;
    public static final org.telegram.ui.Cells.t8 h;

    static {
        new o6("color", 1);
        c = new org.telegram.ui.Cells.t8("currentAlpha", 4);
        d = new o6("alpha", 2);
        e = new o6("alpha", 3);
        f = new org.telegram.ui.Cells.t8("animationProgress", 5);
        g = new org.telegram.ui.Cells.t8("animationValue", 6);
        h = new org.telegram.ui.Cells.t8("clipProgress", 7);
    }
}
