package org.telegram.ui.Components;

import android.view.animation.OvershootInterpolator;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public abstract class l6 {
    public static final OvershootInterpolator a = new OvershootInterpolator(1.9f);
    public static final j6 b = new j6("alpha", 0);
    public static final org.telegram.ui.Cells.o8 c;
    public static final j6 d;
    public static final j6 e;
    public static final org.telegram.ui.Cells.o8 f;
    public static final org.telegram.ui.Cells.o8 g;
    public static final org.telegram.ui.Cells.o8 h;

    static {
        new j6("color", 1);
        c = new org.telegram.ui.Cells.o8("currentAlpha", 4);
        d = new j6("alpha", 2);
        e = new j6("alpha", 3);
        f = new org.telegram.ui.Cells.o8("animationProgress", 5);
        g = new org.telegram.ui.Cells.o8("animationValue", 6);
        h = new org.telegram.ui.Cells.o8("clipProgress", 7);
    }
}
