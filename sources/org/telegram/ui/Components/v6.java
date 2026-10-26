package org.telegram.ui.Components;

import android.view.animation.OvershootInterpolator;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public abstract class v6 {
    public static final OvershootInterpolator a = new OvershootInterpolator(1.9f);
    public static final t6 b = new t6("alpha", 0);
    public static final org.telegram.ui.Cells.x8 c;
    public static final t6 d;
    public static final t6 e;
    public static final org.telegram.ui.Cells.x8 f;
    public static final org.telegram.ui.Cells.x8 g;
    public static final org.telegram.ui.Cells.x8 h;

    static {
        new t6("color", 1);
        c = new org.telegram.ui.Cells.x8("currentAlpha", 4);
        d = new t6("alpha", 2);
        e = new t6("alpha", 3);
        f = new org.telegram.ui.Cells.x8("animationProgress", 5);
        g = new org.telegram.ui.Cells.x8("animationValue", 6);
        h = new org.telegram.ui.Cells.x8("clipProgress", 7);
    }
}
