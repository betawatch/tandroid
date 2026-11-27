// default package

import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public abstract class bhc {
    public static l2d a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        l2d h = l2d.h(null, rootWindowInsets);
        i2d i2dVar = h.a;
        i2dVar.r(h);
        i2dVar.d(view.getRootView());
        return h;
    }

    public static void b(View view, int i, int i2) {
        view.setScrollIndicators(i, i2);
    }
}
