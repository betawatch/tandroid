package ke;

import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnticipateOvershootInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public abstract class a {
    public static final DecelerateInterpolator a;

    static {
        new AnticipateOvershootInterpolator();
        a = new DecelerateInterpolator();
        new AccelerateInterpolator();
        new DecelerateInterpolator(1.78f);
        new LinearInterpolator();
        new OvershootInterpolator(3.2f);
        new AccelerateDecelerateInterpolator();
    }
}
