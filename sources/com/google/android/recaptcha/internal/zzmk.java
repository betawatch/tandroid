package com.google.android.recaptcha.internal;

import java.util.Iterator;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public abstract class zzmk implements Iterable {
    public final String toString() {
        Iterator it = iterator();
        StringBuilder sb2 = new StringBuilder("[");
        boolean z9 = true;
        while (it.hasNext()) {
            if (!z9) {
                sb2.append(", ");
            }
            sb2.append(it.next());
            z9 = false;
        }
        sb2.append(']');
        return sb2.toString();
    }
}
