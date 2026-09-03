package com.google.android.recaptcha.internal;

import java.util.Iterator;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public abstract class zzmk implements Iterable {
    public final String toString() {
        Iterator it = iterator();
        StringBuilder sb = new StringBuilder("[");
        boolean z4 = true;
        while (it.hasNext()) {
            if (!z4) {
                sb.append(", ");
            }
            sb.append(it.next());
            z4 = false;
        }
        sb.append(']');
        return sb.toString();
    }
}
