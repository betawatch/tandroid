package com.google.android.recaptcha.internal;

import java.util.Iterator;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
