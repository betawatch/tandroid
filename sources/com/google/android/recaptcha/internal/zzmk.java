package com.google.android.recaptcha.internal;

import java.util.Iterator;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
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
