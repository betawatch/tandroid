package com.google.android.recaptcha.internal;

import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class zzmq {
    public static boolean zza(Collection collection, Iterator it) {
        it.getClass();
        boolean z4 = false;
        while (it.hasNext()) {
            z4 |= collection.add(it.next());
        }
        return z4;
    }
}
