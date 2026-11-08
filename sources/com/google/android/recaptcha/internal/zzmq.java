package com.google.android.recaptcha.internal;

import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class zzmq {
    public static boolean zza(Collection collection, Iterator it) {
        it.getClass();
        boolean z9 = false;
        while (it.hasNext()) {
            z9 |= collection.add(it.next());
        }
        return z9;
    }
}
