package ke;

import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnticipateOvershootInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
