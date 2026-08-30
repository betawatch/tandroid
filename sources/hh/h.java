package hh;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaDataController;
import org.telegram.ui.Components.nr;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
        c = j.i(new DecelerateInterpolator(), 0, 240, 240, false);
        d = j.i(linearInterpolator, 0, 240, 240, false);
        e = j.i(new DecelerateInterpolator(), 220, 240, 240, false);
        f = j.i(new nr(0.7f, -0.6f, 0.4f, 1.0f), 0, 200, 560, false);
        g = j.i(new nr(0.7f, -0.6f, 0.4f, 1.0f), 200, 400, 560, true);
        h = j.i(new DecelerateInterpolator(), 0, ImageReceiver.DEFAULT_CROSSFADE_DURATION, 560, false);
        i = j.i(new DecelerateInterpolator(), 210, 425, 560, false);
        nr nrVar = nr.h;
        j = j.i(nrVar, 0, 320, 560, false);
        k = j.i(nrVar, 40, 320, 560, false);
        l = j.i(new DecelerateInterpolator(), 0, MediaDataController.MAX_LINKS_COUNT, 560, false);
        m = j.i(nrVar, 0, 460, 560, false);
        n = j.i(nrVar, 0, 325, 560, false);
        o = j.i(new DecelerateInterpolator(), ImageReceiver.DEFAULT_CROSSFADE_DURATION, MediaDataController.MAX_LINKS_COUNT, 560, false);
        p = j.i(new DecelerateInterpolator(), 200, 480, 560, false);
        q = j.i(nrVar, 60, 320, 560, false);
        r = j.i(nrVar, 90, 380, 560, false);
        s = j.i(nrVar, 110, 440, 560, false);
        t = j.i(new DecelerateInterpolator(), 200, 460, 560, false);
    }
}
