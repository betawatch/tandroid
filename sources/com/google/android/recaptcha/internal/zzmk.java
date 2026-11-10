package com.google.android.recaptcha.internal;

import java.util.Iterator;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
