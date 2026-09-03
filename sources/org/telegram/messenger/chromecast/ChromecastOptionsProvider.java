package org.telegram.messenger.chromecast;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import q5.i;
import r5.b;
import r5.e;
import s5.a;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public class ChromecastOptionsProvider implements e {
    public static final b a;

    static {
        ArrayList arrayList = new ArrayList();
        i iVar = new i();
        ArrayList arrayList2 = new ArrayList();
        a aVar = b.F;
        if (aVar == null) {
            throw new NullPointerException("use Optional.orNull() instead of Optional.or(null)");
        }
        a = new b("CC1AD845", arrayList, false, iVar, true, aVar, true, 0.05000000074505806d, false, false, false, arrayList2, true, false, b.D, b.E);
    }

    @Override // r5.e
    public List<com.google.android.gms.internal.cast.e> getAdditionalSessionProviders(Context context) {
        return null;
    }

    @Override // r5.e
    public b getCastOptions(Context context) {
        return a;
    }
}
