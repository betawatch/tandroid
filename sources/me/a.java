package me;

import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnticipateOvershootInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
