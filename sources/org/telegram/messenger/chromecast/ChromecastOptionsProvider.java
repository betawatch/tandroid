package org.telegram.messenger.chromecast;

import android.content.Context;
import f6.i;
import g6.b;
import g6.e;
import h6.a;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public class ChromecastOptionsProvider implements e {
    public static final b a;

    static {
        ArrayList arrayList = new ArrayList();
        i iVar = new i();
        ArrayList arrayList2 = new ArrayList();
        a aVar = b.I;
        if (aVar == null) {
            throw new NullPointerException("use Optional.orNull() instead of Optional.or(null)");
        }
        a = new b("CC1AD845", arrayList, false, iVar, true, aVar, true, 0.05000000074505806d, false, false, false, arrayList2, true, false, b.G, b.H);
    }

    @Override // g6.e
    public List<com.google.android.gms.internal.cast.e> getAdditionalSessionProviders(Context context) {
        return null;
    }

    @Override // g6.e
    public b getCastOptions(Context context) {
        return a;
    }
}
