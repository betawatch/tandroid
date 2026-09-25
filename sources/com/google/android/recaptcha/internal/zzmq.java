package com.google.android.recaptcha.internal;

import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public final class zzmq {
    public static boolean zza(Collection collection, Iterator it) {
        it.getClass();
        boolean z10 = false;
        while (it.hasNext()) {
            z10 |= collection.add(it.next());
        }
        return z10;
    }
}
