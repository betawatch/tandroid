package org.telegram.ui.Components;

import android.view.animation.OvershootInterpolator;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public abstract class s6 {
    public static final OvershootInterpolator a = new OvershootInterpolator(1.9f);
    public static final q6 b = new q6("alpha", 0);
    public static final org.telegram.ui.Cells.u8 c;
    public static final q6 d;
    public static final q6 e;
    public static final org.telegram.ui.Cells.u8 f;
    public static final org.telegram.ui.Cells.u8 g;
    public static final org.telegram.ui.Cells.u8 h;

    static {
        new q6("color", 1);
        c = new org.telegram.ui.Cells.u8("currentAlpha", 4);
        d = new q6("alpha", 2);
        e = new q6("alpha", 3);
        f = new org.telegram.ui.Cells.u8("animationProgress", 5);
        g = new org.telegram.ui.Cells.u8("animationValue", 6);
        h = new org.telegram.ui.Cells.u8("clipProgress", 7);
    }
}
