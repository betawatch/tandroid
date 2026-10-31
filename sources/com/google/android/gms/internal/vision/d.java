package com.google.android.gms.internal.vision;

import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class d extends WeakReference {
    public final int a;

    public d(Exception exc) {
        super(exc, null);
        this.a = System.identityHashCode(exc);
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == d.class) {
            if (this == obj) {
                return true;
            }
            d dVar = (d) obj;
            if (this.a == dVar.a && get() == dVar.get()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }
}
