package com.google.android.recaptcha.internal;

import java.util.Iterator;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
