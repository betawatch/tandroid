// default package

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public abstract class h19 {
    public static final DecelerateInterpolator a = new DecelerateInterpolator();
    public static final LinearInterpolator b;
    public static final g19 c;
    public static final g19 d;
    public static final g19 e;
    public static final g19 f;
    public static final g19 g;
    public static final g19 h;
    public static final g19 i;
    public static final g19 j;
    public static final g19 k;
    public static final g19 l;
    public static final g19 m;
    public static final g19 n;
    public static final g19 o;
    public static final g19 p;
    public static final g19 q;
    public static final g19 r;
    public static final g19 s;
    public static final g19 t;

    static {
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        b = linearInterpolator;
        c = i19.i(new DecelerateInterpolator(), 0, jn7.O3, jn7.O3, false);
        d = i19.i(linearInterpolator, 0, jn7.O3, jn7.O3, false);
        e = i19.i(new DecelerateInterpolator(), jn7.w3, jn7.O3, jn7.O3, false);
        f = i19.i(new k43(0.7f, -0.6f, 0.4f, 1.0f), 0, jn7.d3, 560, false);
        g = i19.i(new k43(0.7f, -0.6f, 0.4f, 1.0f), jn7.d3, 400, 560, true);
        h = i19.i(new DecelerateInterpolator(), 0, jn7.f2, 560, false);
        i = i19.i(new DecelerateInterpolator(), jn7.n3, 425, 560, false);
        k43 k43Var = k43.h;
        j = i19.i(k43Var, 0, jn7.q5, 560, false);
        k = i19.i(k43Var, 40, jn7.q5, 560, false);
        l = i19.i(new DecelerateInterpolator(), 0, jn7.Y3, 560, false);
        m = i19.i(k43Var, 0, 460, 560, false);
        n = i19.i(k43Var, 0, jn7.v5, 560, false);
        o = i19.i(new DecelerateInterpolator(), jn7.f2, jn7.Y3, 560, false);
        p = i19.i(new DecelerateInterpolator(), jn7.d3, 480, 560, false);
        q = i19.i(k43Var, 60, jn7.q5, 560, false);
        r = i19.i(k43Var, 90, 380, 560, false);
        s = i19.i(k43Var, jn7.u1, 440, 560, false);
        t = i19.i(new DecelerateInterpolator(), jn7.d3, 460, 560, false);
    }
}
