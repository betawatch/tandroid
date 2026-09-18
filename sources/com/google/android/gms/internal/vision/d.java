package com.google.android.gms.internal.vision;

import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
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
