package mh;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import org.telegram.messenger.zs;
import org.telegram.ui.Components.gr;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public abstract class h {
    public static final DecelerateInterpolator a = new DecelerateInterpolator();
    public static final LinearInterpolator b;
    public static final e c;
    public static final e d;
    public static final e e;
    public static final e f;
    public static final e g;
    public static final e h;
    public static final e i;
    public static final e j;
    public static final e k;
    public static final e l;
    public static final e m;
    public static final e n;
    public static final e o;
    public static final e p;
    public static final e q;
    public static final e r;
    public static final e s;
    public static final e t;

    static {
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        b = linearInterpolator;
        c = j.i(new DecelerateInterpolator(), 0, zs.P3, zs.P3, false);
        d = j.i(linearInterpolator, 0, zs.P3, zs.P3, false);
        e = j.i(new DecelerateInterpolator(), zs.x3, zs.P3, zs.P3, false);
        f = j.i(new gr(0.7f, -0.6f, 0.4f, 1.0f), 0, zs.e3, 560, false);
        g = j.i(new gr(0.7f, -0.6f, 0.4f, 1.0f), zs.e3, 400, 560, true);
        h = j.i(new DecelerateInterpolator(), 0, zs.g2, 560, false);
        i = j.i(new DecelerateInterpolator(), zs.n3, 425, 560, false);
        gr grVar = gr.h;
        j = j.i(grVar, 0, zs.r5, 560, false);
        k = j.i(grVar, 40, zs.r5, 560, false);
        l = j.i(new DecelerateInterpolator(), 0, zs.Z3, 560, false);
        m = j.i(grVar, 0, 460, 560, false);
        n = j.i(grVar, 0, zs.w5, 560, false);
        o = j.i(new DecelerateInterpolator(), zs.g2, zs.Z3, 560, false);
        p = j.i(new DecelerateInterpolator(), zs.e3, 480, 560, false);
        q = j.i(grVar, 60, zs.r5, 560, false);
        r = j.i(grVar, 90, 380, 560, false);
        s = j.i(grVar, zs.v1, 440, 560, false);
        t = j.i(new DecelerateInterpolator(), zs.e3, 460, 560, false);
    }
}
