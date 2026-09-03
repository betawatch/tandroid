package org.telegram.ui.Components;

import android.view.animation.OvershootInterpolator;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public abstract class n6 {
    public static final OvershootInterpolator a = new OvershootInterpolator(1.9f);
    public static final l6 b = new l6("alpha", 0);
    public static final ih.g c;
    public static final l6 d;
    public static final l6 e;
    public static final ih.g f;
    public static final ih.g g;
    public static final ih.g h;

    static {
        new l6("color", 1);
        c = new ih.g("currentAlpha", 6);
        d = new l6("alpha", 2);
        e = new l6("alpha", 3);
        f = new ih.g("animationProgress", 7);
        g = new ih.g("animationValue", 8);
        h = new ih.g("clipProgress", 9);
    }
}
