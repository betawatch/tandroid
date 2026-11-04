package org.telegram.ui.Components;

import android.view.animation.OvershootInterpolator;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class k6 {
    public static final OvershootInterpolator a = new OvershootInterpolator(1.9f);
    public static final i6 b = new i6("alpha", 0);
    public static final org.telegram.ui.Cells.n8 c;
    public static final i6 d;
    public static final i6 e;
    public static final org.telegram.ui.Cells.n8 f;
    public static final org.telegram.ui.Cells.n8 g;
    public static final org.telegram.ui.Cells.n8 h;

    static {
        new i6("color", 1);
        c = new org.telegram.ui.Cells.n8("currentAlpha", 4);
        d = new i6("alpha", 2);
        e = new i6("alpha", 3);
        f = new org.telegram.ui.Cells.n8("animationProgress", 5);
        g = new org.telegram.ui.Cells.n8("animationValue", 6);
        h = new org.telegram.ui.Cells.n8("clipProgress", 7);
    }
}
