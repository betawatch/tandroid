package org.telegram.ui.Components;

import android.view.animation.OvershootInterpolator;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public abstract class i6 {
    public static final OvershootInterpolator a = new OvershootInterpolator(1.9f);
    public static final g6 b = new g6("alpha", 0);
    public static final mh.g c;
    public static final g6 d;
    public static final g6 e;
    public static final mh.g f;
    public static final mh.g g;
    public static final mh.g h;

    static {
        new g6("color", 1);
        c = new mh.g("currentAlpha", 6);
        d = new g6("alpha", 2);
        e = new g6("alpha", 3);
        f = new mh.g("animationProgress", 7);
        g = new mh.g("animationValue", 8);
        h = new mh.g("clipProgress", 9);
    }
}
