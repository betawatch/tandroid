package ih;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaDataController;
import org.telegram.ui.Components.pr;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
        f = j.i(new pr(0.7f, -0.6f, 0.4f, 1.0f), 0, 200, 560, false);
        g = j.i(new pr(0.7f, -0.6f, 0.4f, 1.0f), 200, 400, 560, true);
        h = j.i(new DecelerateInterpolator(), 0, ImageReceiver.DEFAULT_CROSSFADE_DURATION, 560, false);
        i = j.i(new DecelerateInterpolator(), 210, 425, 560, false);
        pr prVar = pr.h;
        j = j.i(prVar, 0, 320, 560, false);
        k = j.i(prVar, 40, 320, 560, false);
        l = j.i(new DecelerateInterpolator(), 0, MediaDataController.MAX_LINKS_COUNT, 560, false);
        m = j.i(prVar, 0, 460, 560, false);
        n = j.i(prVar, 0, 325, 560, false);
        o = j.i(new DecelerateInterpolator(), ImageReceiver.DEFAULT_CROSSFADE_DURATION, MediaDataController.MAX_LINKS_COUNT, 560, false);
        p = j.i(new DecelerateInterpolator(), 200, 480, 560, false);
        q = j.i(prVar, 60, 320, 560, false);
        r = j.i(prVar, 90, 380, 560, false);
        s = j.i(prVar, 110, 440, 560, false);
        t = j.i(new DecelerateInterpolator(), 200, 460, 560, false);
    }
}
