package org.telegram.ui.Components;

import android.view.animation.OvershootInterpolator;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public abstract class m6 {
    public static final OvershootInterpolator a = new OvershootInterpolator(1.9f);
    public static final k6 b = new k6("alpha", 0);
    public static final org.telegram.ui.Cells.o8 c;
    public static final k6 d;
    public static final k6 e;
    public static final org.telegram.ui.Cells.o8 f;
    public static final org.telegram.ui.Cells.o8 g;
    public static final org.telegram.ui.Cells.o8 h;

    static {
        new k6("color", 1);
        c = new org.telegram.ui.Cells.o8("currentAlpha", 4);
        d = new k6("alpha", 2);
        e = new k6("alpha", 3);
        f = new org.telegram.ui.Cells.o8("animationProgress", 5);
        g = new org.telegram.ui.Cells.o8("animationValue", 6);
        h = new org.telegram.ui.Cells.o8("clipProgress", 7);
    }
}
