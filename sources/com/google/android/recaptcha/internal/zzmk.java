package com.google.android.recaptcha.internal;

import java.util.Iterator;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
