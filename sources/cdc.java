// default package

import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
