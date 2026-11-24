// default package

import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class cdc {
    public static vxc a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        vxc h = vxc.h(null, rootWindowInsets);
        sxc sxcVar = h.a;
        sxcVar.r(h);
        sxcVar.d(view.getRootView());
        return h;
    }

    public static void b(View view, int i, int i2) {
        view.setScrollIndicators(i, i2);
    }
}
