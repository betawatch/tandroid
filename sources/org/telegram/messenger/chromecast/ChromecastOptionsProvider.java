package org.telegram.messenger.chromecast;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public class ChromecastOptionsProvider {
    public static final ld1 a;

    static {
        ArrayList arrayList = new ArrayList();
        f26 f26Var = new f26();
        ArrayList arrayList2 = new ArrayList();
        jd1 jd1Var = ld1.J;
        if (jd1Var != null) {
            a = new ld1("CC1AD845", arrayList, false, f26Var, true, jd1Var, true, 0.05000000074505806d, false, false, false, arrayList2, true, false, ld1.H, ld1.I);
        } else {
            p3d.h("use Optional.orNull() instead of Optional.or(null)");
        }
    }

    public List<xbd> getAdditionalSessionProviders(Context context) {
        return null;
    }

    public ld1 getCastOptions(Context context) {
        return a;
    }
}
