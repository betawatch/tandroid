package ke;

import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnticipateOvershootInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
