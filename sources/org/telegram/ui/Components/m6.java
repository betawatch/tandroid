package org.telegram.ui.Components;

import android.view.animation.OvershootInterpolator;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public abstract class m6 {
    public static final OvershootInterpolator a = new OvershootInterpolator(1.9f);
    public static final k6 b = new k6("alpha", 0);
    public static final dh.g c;
    public static final k6 d;
    public static final k6 e;
    public static final dh.g f;
    public static final dh.g g;
    public static final dh.g h;

    static {
        new k6("color", 1);
        c = new dh.g("currentAlpha", 6);
        d = new k6("alpha", 2);
        e = new k6("alpha", 3);
        f = new dh.g("animationProgress", 7);
        g = new dh.g("animationValue", 8);
        h = new dh.g("clipProgress", 9);
    }
}
