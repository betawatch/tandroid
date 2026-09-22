package com.google.android.recaptcha.internal;

import java.util.Iterator;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public abstract class zzmk implements Iterable {
    public final String toString() {
        Iterator it = iterator();
        StringBuilder sb2 = new StringBuilder("[");
        boolean z10 = true;
        while (it.hasNext()) {
            if (!z10) {
                sb2.append(", ");
            }
            sb2.append(it.next());
            z10 = false;
        }
        sb2.append(']');
        return sb2.toString();
    }
}
