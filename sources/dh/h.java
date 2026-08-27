package dh;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaDataController;
import org.telegram.ui.Components.er;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
        f = j.i(new er(0.7f, -0.6f, 0.4f, 1.0f), 0, 200, 560, false);
        g = j.i(new er(0.7f, -0.6f, 0.4f, 1.0f), 200, 400, 560, true);
        h = j.i(new DecelerateInterpolator(), 0, ImageReceiver.DEFAULT_CROSSFADE_DURATION, 560, false);
        i = j.i(new DecelerateInterpolator(), 210, 425, 560, false);
        er erVar = er.h;
        j = j.i(erVar, 0, 320, 560, false);
        k = j.i(erVar, 40, 320, 560, false);
        l = j.i(new DecelerateInterpolator(), 0, MediaDataController.MAX_LINKS_COUNT, 560, false);
        m = j.i(erVar, 0, 460, 560, false);
        n = j.i(erVar, 0, 325, 560, false);
        o = j.i(new DecelerateInterpolator(), ImageReceiver.DEFAULT_CROSSFADE_DURATION, MediaDataController.MAX_LINKS_COUNT, 560, false);
        p = j.i(new DecelerateInterpolator(), 200, 480, 560, false);
        q = j.i(erVar, 60, 320, 560, false);
        r = j.i(erVar, 90, 380, 560, false);
        s = j.i(erVar, 110, 440, 560, false);
        t = j.i(new DecelerateInterpolator(), 200, 460, 560, false);
    }
}
