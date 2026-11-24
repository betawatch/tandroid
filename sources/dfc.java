// default package

import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class dfc {
    public static wzc a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        wzc h = wzc.h(null, rootWindowInsets);
        tzc tzcVar = h.a;
        tzcVar.r(h);
        tzcVar.d(view.getRootView());
        return h;
    }

    public static void b(View view, int i, int i2) {
        view.setScrollIndicators(i, i2);
    }
}
