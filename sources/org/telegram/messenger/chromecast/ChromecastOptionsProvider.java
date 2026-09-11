package org.telegram.messenger.chromecast;

import android.content.Context;
import c6.i;
import com.google.android.gms.internal.cast.f;
import d6.b;
import d6.e;
import e6.a;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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

    @Override // d6.e
    public List<f> getAdditionalSessionProviders(Context context) {
        return null;
    }

    @Override // d6.e
    public b getCastOptions(Context context) {
        return a;
    }
}
