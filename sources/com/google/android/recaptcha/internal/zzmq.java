package com.google.android.recaptcha.internal;

import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
