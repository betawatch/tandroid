package org.telegram.ui.Components;

import android.view.animation.OvershootInterpolator;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public abstract class m6 {
    public static final OvershootInterpolator a = new OvershootInterpolator(1.9f);
    public static final k6 b = new k6("alpha", 0);
    public static final ch.g c;
    public static final k6 d;
    public static final k6 e;
    public static final ch.g f;
    public static final ch.g g;
    public static final ch.g h;

    static {
        new k6("color", 1);
        c = new ch.g("currentAlpha", 6);
        d = new k6("alpha", 2);
        e = new k6("alpha", 3);
        f = new ch.g("animationProgress", 7);
        g = new ch.g("animationValue", 8);
        h = new ch.g("clipProgress", 9);
    }
}
