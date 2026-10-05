package com.google.android.recaptcha.internal;

import java.util.Iterator;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
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
