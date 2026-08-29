package org.telegram.messenger.chromecast;

import android.content.Context;
import com.google.android.gms.internal.cast.f;
import java.util.ArrayList;
import java.util.List;
import o5.i;
import p5.b;
import p5.e;
import q5.a;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public class ChromecastOptionsProvider implements e {
    public static final b a;

    static {
        ArrayList arrayList = new ArrayList();
        i iVar = new i();
        ArrayList arrayList2 = new ArrayList();
        a aVar = b.E;
        if (aVar == null) {
            throw new NullPointerException("use Optional.orNull() instead of Optional.or(null)");
        }
        a = new b("CC1AD845", arrayList, false, iVar, true, aVar, true, 0.05000000074505806d, false, false, false, arrayList2, true, false, b.C, b.D);
    }

    @Override // p5.e
    public List<f> getAdditionalSessionProviders(Context context) {
        return null;
    }

    @Override // p5.e
    public b getCastOptions(Context context) {
        return a;
    }
}
